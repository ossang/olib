package com.olib.app.admin.api.naverad.service;

import org.apache.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.olib.app.admin.api.naverad.domain.ApiException;
import com.olib.app.admin.api.naverad.util.JsonUtil;

@Service
public class ApiExceptionService {

//------------------------------------------------------------------------------
// 예외 정보 	
//------------------------------------------------------------------------------	
	public String getMessage(ApiException e){
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(e.getTransactionId()).append("]");
		sb.append("[").append(e.getStatus()).append("]");
		sb.append("[").append(e.getStatusText()).append("]");
		sb.append("[").append(e.getCode()).append("]");
		sb.append("[").append(e.getMessage()).append("]");
		sb.append("[").append(e.getResponseBody()).append("]");
		
		return sb.toString();
	}
	
//------------------------------------------------------------------------------
// api 예외 발생시 종류에 따라 처리하는 핸들러 (response body 테스트 필요)	
// 예외처리가 완려되면 true 리턴
//------------------------------------------------------------------------------
	public boolean exceptionHandler(Exception e){
		e.printStackTrace();
		
		if(e.getClass().equals(ApiException.class)){
			ApiException ae = (ApiException) e;
			if(isTooManyRequests(ae)){
				try {Thread.sleep(500);} catch (InterruptedException e1) {}
				return true;
			}
		}
		return false;
	}
//------------------------------------------------------------------------------
// 예외의 종류가 라이센스 권한관련 일경우 true 리턴	
//------------------------------------------------------------------------------	
	public boolean isLicenseError(ApiException e){
		String status = JsonUtil.getValue(e.getResponseBody(), ApiException.STATUS);
		String title = JsonUtil.getValue(e.getResponseBody(), ApiException.MESSAGE).toLowerCase();
		boolean authErrorTitle = title.indexOf("auth") >= 0?true:false;
		
		if(HttpStatus.SC_INTERNAL_SERVER_ERROR == e.getStatus()
			&& "403".equals(status)
			&& ("invalid api-key".equals(title) || authErrorTitle)){
			
			return true;
		}else if(HttpStatus.SC_FORBIDDEN == e.getStatus()
			&& "403".equals(status)
			&& authErrorTitle){
			
			return true;
		}
		
		return false;
	}
//------------------------------------------------------------------------------
// too many requests error	
//------------------------------------------------------------------------------
	public boolean isTooManyRequests(ApiException ae){
		if(org.springframework.http.HttpStatus.TOO_MANY_REQUESTS.value() == ae.getStatus()){
			return true;
		}

		return false;
	}
//------------------------------------------------------------------------------
// time stamp error	
//------------------------------------------------------------------------------
	public boolean isTimeStampError(ApiException e){
		if(e == null || e.getResponseBody() == null || "".equals(e.getResponseBody())) return false;
		
		String status = JsonUtil.getValue(e.getResponseBody(), ApiException.STATUS);
		String title = JsonUtil.getValue(e.getResponseBody(), ApiException.MESSAGE).toLowerCase();
		boolean timestampErrorTitle = title.indexOf("timestamp") >= 0?true:false;
		
		if(HttpStatus.SC_FORBIDDEN == e.getStatus() 
			&& "403".equals(status)
			&& timestampErrorTitle){
			
			return true;
		}
		
		return false;
	}
	
	
	
}

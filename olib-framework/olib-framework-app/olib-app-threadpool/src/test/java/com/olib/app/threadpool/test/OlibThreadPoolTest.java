package com.olib.app.threadpool.test;

import com.olib.app.threadpool.service.OlibThreadPoolService;

public class OlibThreadPoolTest {

	public static void main(String[] args) {
		
		String poolName = "test-pool";
		int maxThreadSize = 2;
		OlibThreadPoolService service = new OlibThreadPoolService(poolName, maxThreadSize);

		String key = "testThread";
		int threadCount = 5;
		for(int i=0; i<threadCount; i++){
			TestThread thread = new TestThread();
			service.start(thread , key+i);
		}
	}

}

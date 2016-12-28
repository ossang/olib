# Olibrary

OLibrary 는 java 프로젝트를 진행할 경우 유용하게 쓰일 수 있는 참고용 라이브러리 모음 입니다.

## Features

* Thread pool service (java 1.8+)
* exception, json, net utils

## Thread Pool Service Example

```java
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
```


```java
public class TestThread extends Thread{
	public TestThread(){}
	
	public void run(){
		System.out.println("start : "+this.currentThread().getName());
		try {Thread.sleep(5000);} catch (InterruptedException e) {}
		System.out.println("end : "+this.currentThread().getName());
	}
}
```

```java
start : test-pool-testThread0-0
start : test-pool-testThread1-0
end : test-pool-testThread0-0
end : test-pool-testThread1-0
start : test-pool-testThread2-0
start : test-pool-testThread3-0
end : test-pool-testThread2-0
end : test-pool-testThread3-0
start : test-pool-testThread4-0
end : test-pool-testThread4-0
```

## Utils dependency


### With Maven
```xml
<dependency>
		<groupId>com.googlecode.json-simple</groupId>
		<artifactId>json-simple</artifactId>
		<version>1.1.1</version>
</dependency>
<dependency>
		<groupId>javax.servlet</groupId>
		<artifactId>javax.servlet-api</artifactId>
		<version>3.1.0</version>
</dependency>
<dependency>
		<groupId>org.apache.httpcomponents</groupId>
		<artifactId>httpclient</artifactId>
		<version>4.5.2</version>
</dependency>
```

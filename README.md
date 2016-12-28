# Olib

OLib 는 java 프로젝트를 진행할 경우 유용하게 쓰일 수 있는 Tool 및 Library 입니다.

## Features

* Api Testing Tools
* Server Agent Management Tools
* System Log Search Tools
* Thread pool service (java 1.8+)
* exception, json, net utils

## Api Testing Tools DEMO
![api tool](https://cloud.githubusercontent.com/assets/8652687/21512017/78661c64-cceb-11e6-9883-9262769fd419.png)

## Server Agent Management Tools DEMO
![agentmanager](https://cloud.githubusercontent.com/assets/8652687/21512026/89b4d08c-cceb-11e6-9d6e-1886a09e132b.jpg)

## System Log Search Tools DEMO
![log tool](https://cloud.githubusercontent.com/assets/8652687/21512008/58e7a92a-cceb-11e6-9f15-b46245b6046d.png)

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

## dependencies

* spring-boot
* gentelella
* angularjs
* jquery
* bootstrap
* font-awesome
* json-simple
* httpclient
* reflections
* paranamer
* unirest
* axis2
* h2

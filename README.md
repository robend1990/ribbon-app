## Very simple Client side load balancing application with Spring Cloud Ribbon.

**To run it:**

1. Install Java JDK 8+
2. Run Service discovery server app [Eureka Service Discovery server](https://github.com/robend1990/eureka-discovery-server).
3. Run 2 instances of [Service](https://github.com/robend1990/eureka-discovery-server) application. One with parameter service.instance.name set to service1 and seconds with service2.
4. Run this ribbon application and in browser go to localhost:8080.
5. Note that with first call the message will be returned from service1 and with second call message will be returned from service2.
This proofs that client side load balancing works fine. App uses default ribbon load balancing algorithm, which is round robin


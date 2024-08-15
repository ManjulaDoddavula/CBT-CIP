# BankyApplication

BankyApplication is a simple banking system built using Spring Boot. This application allows users to create bank accounts, deposit and withdraw funds, and transfer funds between accounts. It also includes a Swagger UI for easy API testing and documentation.

## Features

- **Create a new bank account:** Users can create a bank account with an initial deposit.
- **Deposit funds:** Users can deposit funds into their bank accounts.
- **Withdraw funds:** Users can withdraw funds from their bank accounts, provided they maintain a minimum balance of 500.
- **Transfer funds:** Users can transfer funds between different bank accounts.
- **View all accounts:** Retrieve a list of all bank accounts.
- **View account by ID:** Retrieve the details of a specific bank account by its ID.

## Technologies Used

- **Spring Boot:** Framework for building the application.
- **Spring Data JPA:** For database operations.
- **MySQL:** Database for persisting data.
- **Swagger/OpenAPI:** For API documentation and testing.
- **Jakarta Validation:** For validating inputs such as the minimum balance.

## Setup and Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/BankyApplication.git
   cd BankyApplication

2. **Database Configuration:**

Make sure you have MySQL installed and running. Update the database configuration in src/main/resources/application.properties:
	spring.datasource.url=jdbc:mysql://localhost:3306/bankapp
	spring.datasource.username=root
	spring.datasource.password=root
Ensure that the database bankapp exists in your MySQL server.

3. **Build and Run the Application:**

Use Maven to build and run the application:

	mvn clean install
	mvn spring-boot:run

4. **Access the Application:**

API Documentation: The Swagger UI is available at http://localhost:8085/swagger-ui.html.
API Endpoints: Access the API at http://localhost:8085/api/accounts.

**API Endpoints**

Bank Account Management

Create a new bank account:

POST /api/accounts/create
Parameters: accountHolderName (String), initialDeposit (BigDecimal)
Get all bank accounts:

GET /api/accounts
Get a bank account by ID:

GET /api/accounts/{id}
Deposit funds into an account:

POST /api/accounts/{id}/deposit
Parameters: amount (BigDecimal)
Withdraw funds from an account:

POST /api/accounts/{id}/withdraw
Parameters: amount (BigDecimal)
Transfer funds between accounts:

POST /api/accounts/transfer
Parameters: fromAccountId (Long), toAccountId (Long), amount (BigDecimal)
Project Structure
BankAccount Entity: Represents a bank account with properties like id, accountHolderName, and balance.
BankAccountRepository: Interface for performing CRUD operations on the BankAccount entity.
BankAccountService: Contains business logic for creating accounts, depositing, withdrawing, and transferring funds.
BankAccountController: REST controller for handling HTTP requests related to bank accounts.


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

[32m :: Spring Boot :: [39m              [2m (v3.3.2)[0;39m

[2m2024-08-15T19:41:00.750+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mB.BankyApplication.BankyApplication     [0;39m [2m:[0;39m Starting BankyApplication using Java 21.0.3 with PID 12376 (C:\Users\Hp\Downloads\BankyApplication\BankyApplication\target\classes started by Hp in C:\Users\Hp\Downloads\BankyApplication\BankyApplication)
[2m2024-08-15T19:41:00.755+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mB.BankyApplication.BankyApplication     [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2024-08-15T19:41:02.251+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36m.s.d.r.c.RepositoryConfigurationDelegate[0;39m [2m:[0;39m Bootstrapping Spring Data JPA repositories in DEFAULT mode.
[2m2024-08-15T19:41:02.329+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36m.s.d.r.c.RepositoryConfigurationDelegate[0;39m [2m:[0;39m Finished Spring Data repository scanning in 65 ms. Found 1 JPA repository interface.
[2m2024-08-15T19:41:03.151+05:30[0;39m [31mERROR[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mo.a.catalina.core.AprLifecycleListener  [0;39m [2m:[0;39m An incompatible version [1.2.33] of the Apache Tomcat Native library is installed, while Tomcat requires version [1.2.34]
[2m2024-08-15T19:41:03.459+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat initialized with port 8085 (http)
[2m2024-08-15T19:41:03.478+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Starting service [Tomcat]
[2m2024-08-15T19:41:03.478+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mo.apache.catalina.core.StandardEngine   [0;39m [2m:[0;39m Starting Servlet engine: [Apache Tomcat/10.1.26]
[2m2024-08-15T19:41:03.561+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring embedded WebApplicationContext
[2m2024-08-15T19:41:03.561+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mw.s.c.ServletWebServerApplicationContext[0;39m [2m:[0;39m Root WebApplicationContext: initialization completed in 2735 ms
[2m2024-08-15T19:41:03.987+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mo.hibernate.jpa.internal.util.LogHelper [0;39m [2m:[0;39m HHH000204: Processing PersistenceUnitInfo [name: default]
[2m2024-08-15T19:41:04.087+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36morg.hibernate.Version                   [0;39m [2m:[0;39m HHH000412: Hibernate ORM core version 6.5.2.Final
[2m2024-08-15T19:41:04.145+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mo.h.c.internal.RegionFactoryInitiator   [0;39m [2m:[0;39m HHH000026: Second-level cache disabled
[2m2024-08-15T19:41:04.631+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mo.s.o.j.p.SpringPersistenceUnitInfo     [0;39m [2m:[0;39m No LoadTimeWeaver setup: ignoring JPA class transformer
[2m2024-08-15T19:41:04.673+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mcom.zaxxer.hikari.HikariDataSource      [0;39m [2m:[0;39m HikariPool-1 - Starting...
[2m2024-08-15T19:41:05.109+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mcom.zaxxer.hikari.pool.HikariPool       [0;39m [2m:[0;39m HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@2e64ae1a
[2m2024-08-15T19:41:05.112+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mcom.zaxxer.hikari.HikariDataSource      [0;39m [2m:[0;39m HikariPool-1 - Start completed.
[2m2024-08-15T19:41:05.188+05:30[0;39m [33m WARN[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36morg.hibernate.orm.deprecation           [0;39m [2m:[0;39m HHH90000025: MySQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
[2m2024-08-15T19:41:06.341+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mo.h.e.t.j.p.i.JtaPlatformInitiator      [0;39m [2m:[0;39m HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
[2m2024-08-15T19:41:06.403+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mj.LocalContainerEntityManagerFactoryBean[0;39m [2m:[0;39m Initialized JPA EntityManagerFactory for persistence unit 'default'
[2m2024-08-15T19:41:06.932+05:30[0;39m [33m WARN[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mJpaBaseConfiguration$JpaWebConfiguration[0;39m [2m:[0;39m spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
[2m2024-08-15T19:41:08.016+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mo.s.b.a.e.web.EndpointLinksResolver     [0;39m [2m:[0;39m Exposing 1 endpoint beneath base path '/actuator'
[2m2024-08-15T19:41:08.111+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat started on port 8085 (http) with context path '/'
[2m2024-08-15T19:41:08.126+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [           main][0;39m [2m[0;39m[36mB.BankyApplication.BankyApplication     [0;39m [2m:[0;39m Started BankyApplication in 7.979 seconds (process running for 9.175)
[2m2024-08-15T19:41:08.993+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [on(4)-127.0.0.1][0;39m [2m[0;39m[36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring DispatcherServlet 'dispatcherServlet'
[2m2024-08-15T19:41:08.993+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [on(4)-127.0.0.1][0;39m [2m[0;39m[36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Initializing Servlet 'dispatcherServlet'
[2m2024-08-15T19:41:08.995+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [on(4)-127.0.0.1][0;39m [2m[0;39m[36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Completed initialization in 2 ms
[2m2024-08-15T19:43:01.059+05:30[0;39m [32m INFO[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [nio-8085-exec-9][0;39m [2m[0;39m[36mo.springdoc.api.AbstractOpenApiResource [0;39m [2m:[0;39m Init duration for springdoc-openapi is: 505 ms
Hibernate: insert into bank_account (account_holder_name,balance) values (?,?)
Hibernate: select ba1_0.id,ba1_0.account_holder_name,ba1_0.balance from bank_account ba1_0 where ba1_0.id=?
[2m2024-08-15T19:47:38.164+05:30[0;39m [31mERROR[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [nio-8085-exec-6][0;39m [2m[0;39m[36mo.a.c.c.C.[.[.[/].[dispatcherServlet]   [0;39m [2m:[0;39m Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed: java.lang.IllegalArgumentException: Insufficient funds to maintain minimum balance of 500] with root cause

java.lang.IllegalArgumentException: Insufficient funds to maintain minimum balance of 500
	at BankyApplication.BankyApplication.service.BankAccountService.withdraw(BankAccountService.java:49) ~[classes/:na]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:354) ~[spring-aop-6.1.11.jar:6.1.11]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.invokeJoinpoint(ReflectiveMethodInvocation.java:196) ~[spring-aop-6.1.11.jar:6.1.11]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163) ~[spring-aop-6.1.11.jar:6.1.11]
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:768) ~[spring-aop-6.1.11.jar:6.1.11]
	at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:379) ~[spring-tx-6.1.11.jar:6.1.11]
	at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:119) ~[spring-tx-6.1.11.jar:6.1.11]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.1.11.jar:6.1.11]
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:768) ~[spring-aop-6.1.11.jar:6.1.11]
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:720) ~[spring-aop-6.1.11.jar:6.1.11]
	at BankyApplication.BankyApplication.service.BankAccountService$$SpringCGLIB$$0.withdraw(<generated>) ~[classes/:na]
	at BankyApplication.BankyApplication.controller.BankAccountController.withdraw(BankAccountController.java:55) ~[classes/:na]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:255) ~[spring-web-6.1.11.jar:6.1.11]
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:188) ~[spring-web-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:118) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:926) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:831) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1089) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:979) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1014) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.FrameworkServlet.doPost(FrameworkServlet.java:914) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:590) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:885) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:195) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:51) ~[tomcat-embed-websocket-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-6.1.11.jar:6.1.11]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.11.jar:6.1.11]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93) ~[spring-web-6.1.11.jar:6.1.11]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.11.jar:6.1.11]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.springframework.web.filter.ServerHttpObservationFilter.doFilterInternal(ServerHttpObservationFilter.java:113) ~[spring-web-6.1.11.jar:6.1.11]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.11.jar:6.1.11]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201) ~[spring-web-6.1.11.jar:6.1.11]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.11.jar:6.1.11]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:167) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:90) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:483) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:115) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:93) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:344) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:389) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:904) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1741) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1190) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:63) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at java.base/java.lang.Thread.run(Thread.java:1583) ~[na:na]

Hibernate: select ba1_0.id,ba1_0.account_holder_name,ba1_0.balance from bank_account ba1_0 where ba1_0.id=?
[2m2024-08-15T19:47:50.316+05:30[0;39m [31mERROR[0;39m [35m12376[0;39m [2m---[0;39m [2m[BankyApplication] [nio-8085-exec-8][0;39m [2m[0;39m[36mo.a.c.c.C.[.[.[/].[dispatcherServlet]   [0;39m [2m:[0;39m Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed: java.lang.IllegalArgumentException: Insufficient funds to maintain minimum balance of 500] with root cause

java.lang.IllegalArgumentException: Insufficient funds to maintain minimum balance of 500
	at BankyApplication.BankyApplication.service.BankAccountService.withdraw(BankAccountService.java:49) ~[classes/:na]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:354) ~[spring-aop-6.1.11.jar:6.1.11]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.invokeJoinpoint(ReflectiveMethodInvocation.java:196) ~[spring-aop-6.1.11.jar:6.1.11]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163) ~[spring-aop-6.1.11.jar:6.1.11]
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:768) ~[spring-aop-6.1.11.jar:6.1.11]
	at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:379) ~[spring-tx-6.1.11.jar:6.1.11]
	at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:119) ~[spring-tx-6.1.11.jar:6.1.11]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.1.11.jar:6.1.11]
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:768) ~[spring-aop-6.1.11.jar:6.1.11]
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:720) ~[spring-aop-6.1.11.jar:6.1.11]
	at BankyApplication.BankyApplication.service.BankAccountService$$SpringCGLIB$$0.withdraw(<generated>) ~[classes/:na]
	at BankyApplication.BankyApplication.controller.BankAccountController.withdraw(BankAccountController.java:55) ~[classes/:na]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:255) ~[spring-web-6.1.11.jar:6.1.11]
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:188) ~[spring-web-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:118) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:926) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:831) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1089) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:979) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1014) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at org.springframework.web.servlet.FrameworkServlet.doPost(FrameworkServlet.java:914) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:590) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:885) ~[spring-webmvc-6.1.11.jar:6.1.11]
	at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:658) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:195) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:51) ~[tomcat-embed-websocket-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100) ~[spring-web-6.1.11.jar:6.1.11]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.11.jar:6.1.11]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93) ~[spring-web-6.1.11.jar:6.1.11]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.11.jar:6.1.11]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.springframework.web.filter.ServerHttpObservationFilter.doFilterInternal(ServerHttpObservationFilter.java:113) ~[spring-web-6.1.11.jar:6.1.11]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.11.jar:6.1.11]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201) ~[spring-web-6.1.11.jar:6.1.11]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116) ~[spring-web-6.1.11.jar:6.1.11]
	at org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:164) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:140) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:167) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:90) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:483) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:115) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:93) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:344) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:389) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:904) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1741) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1190) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:659) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:63) ~[tomcat-embed-core-10.1.26.jar:10.1.26]
	at java.base/java.lang.Thread.run(Thread.java:1583) ~[na:na]

Hibernate: select ba1_0.id,ba1_0.account_holder_name,ba1_0.balance from bank_account ba1_0 where ba1_0.id=?
Hibernate: update bank_account set account_holder_name=?,balance=? where id=?
Hibernate: select ba1_0.id,ba1_0.account_holder_name,ba1_0.balance from bank_account ba1_0 where ba1_0.id=?
Hibernate: update bank_account set account_holder_name=?,balance=? where id=?
Hibernate: select ba1_0.id,ba1_0.account_holder_name,ba1_0.balance from bank_account ba1_0 where ba1_0.id=?
Hibernate: select ba1_0.id,ba1_0.account_holder_name,ba1_0.balance from bank_account ba1_0 where ba1_0.id=?
Hibernate: update bank_account set account_holder_name=?,balance=? where id=?
Hibernate: update bank_account set account_holder_name=?,balance=? where id=?
Hibernate: select ba1_0.id,ba1_0.account_holder_name,ba1_0.balance from bank_account ba1_0 where ba1_0.id=?
Hibernate: select ba1_0.id,ba1_0.account_holder_name,ba1_0.balance from bank_account ba1_0

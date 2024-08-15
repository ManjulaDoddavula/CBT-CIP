# ChatWorldApplication

ChatWorldApplication is a simple chat application developed using Spring Boot and WebSocket. It allows multiple users to connect and send messages in real-time. The application includes both the server-side WebSocket handling and a basic HTML client to interact with the WebSocket server.

## Features

- Real-time communication between multiple clients using WebSockets.
- Simple and intuitive user interface built with HTML and JavaScript.
- Easy to configure and deploy with Spring Boot.

## Technologies Used

- Java
- Spring Boot
- WebSocket
- HTML
- JavaScript

## Getting Started

### Prerequisites

Before you can run the ChatWorldApplication, you need to have the following installed:

- Java 8 or higher
- Maven 3.6.0 or higher

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/ChatWorldApplication.git
    cd ChatWorldApplication
    ```

2. Build the application using Maven:

    ```bash
    mvn clean install
    ```

3. Run the application:

    ```bash
    mvn spring-boot:run
    ```

    Alternatively, you can run the compiled JAR file:

    ```bash
    java -jar target/ChatWorldApplication-0.0.1-SNAPSHOT.jar
    ```

### Accessing the Chat Application

1. Open your web browser and navigate to:

    ```
    http://localhost:8080
    ```

2. You will see a simple chat interface with a message box and an input field.

3. Start typing messages and click the "Send" button to send them. Messages will be displayed in real-time.

### Running the Application as a WAR

If you want to deploy the application as a WAR file on a servlet container, you can do so by following these steps:

1. Package the application as a WAR file:

    ```bash
    mvn clean package -DskipTests
    ```

2. Deploy the generated WAR file (`target/ChatWorldApplication.war`) to your preferred servlet container (e.g., Apache Tomcat).

## Project Structure

The project structure is organized as follows:

- `src/main/java/com/ChatWorldApplication/ChatWorldApplication/handler/`
  - Contains the `ChatWebSocketHandler` class, which handles WebSocket connections and messages.

- `src/main/java/com/ChatWorldApplication/ChatWorldApplication/config/`
  - Contains the `WebSocketConfig` class, which configures the WebSocket endpoint.

- `src/main/resources/static/`
  - Contains the `index.html` file, which serves as the front-end client for the chat application.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes. For major changes, please open an issue first to discuss what you would like to change.

## Contact

If you have any questions or need further assistance, feel free to contact [yourname@example.com](mailto:yourname@example.com).


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

[32m :: Spring Boot :: [39m              [2m (v3.3.2)[0;39m

[2m2024-08-14T18:52:12.157+05:30[0;39m [32m INFO[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [           main][0;39m [2m[0;39m[36mc.C.C.ChatWorldApplication              [0;39m [2m:[0;39m Starting ChatWorldApplication using Java 21.0.3 with PID 11864 (C:\Users\Hp\Downloads\ChatWorldApplication\ChatWorldApplication\target\classes started by Hp in C:\Users\Hp\Downloads\ChatWorldApplication\ChatWorldApplication)
[2m2024-08-14T18:52:12.162+05:30[0;39m [32m INFO[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [           main][0;39m [2m[0;39m[36mc.C.C.ChatWorldApplication              [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2024-08-14T18:52:13.202+05:30[0;39m [31mERROR[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [           main][0;39m [2m[0;39m[36mo.a.catalina.core.AprLifecycleListener  [0;39m [2m:[0;39m An incompatible version [1.2.33] of the Apache Tomcat Native library is installed, while Tomcat requires version [1.2.34]
[2m2024-08-14T18:52:13.443+05:30[0;39m [32m INFO[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [           main][0;39m [2m[0;39m[36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat initialized with port 8080 (http)
[2m2024-08-14T18:52:13.462+05:30[0;39m [32m INFO[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [           main][0;39m [2m[0;39m[36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Starting service [Tomcat]
[2m2024-08-14T18:52:13.462+05:30[0;39m [32m INFO[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [           main][0;39m [2m[0;39m[36mo.apache.catalina.core.StandardEngine   [0;39m [2m:[0;39m Starting Servlet engine: [Apache Tomcat/10.1.26]
[2m2024-08-14T18:52:13.541+05:30[0;39m [32m INFO[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [           main][0;39m [2m[0;39m[36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring embedded WebApplicationContext
[2m2024-08-14T18:52:13.541+05:30[0;39m [32m INFO[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [           main][0;39m [2m[0;39m[36mw.s.c.ServletWebServerApplicationContext[0;39m [2m:[0;39m Root WebApplicationContext: initialization completed in 1331 ms
[2m2024-08-14T18:52:13.726+05:30[0;39m [32m INFO[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [           main][0;39m [2m[0;39m[36mo.s.b.a.w.s.WelcomePageHandlerMapping   [0;39m [2m:[0;39m Adding welcome page: class path resource [static/index.html]
[2m2024-08-14T18:52:14.075+05:30[0;39m [32m INFO[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [           main][0;39m [2m[0;39m[36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat started on port 8080 (http) with context path '/'
[2m2024-08-14T18:52:14.085+05:30[0;39m [32m INFO[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [           main][0;39m [2m[0;39m[36mc.C.C.ChatWorldApplication              [0;39m [2m:[0;39m Started ChatWorldApplication in 2.341 seconds (process running for 3.324)
[2m2024-08-14T18:52:38.864+05:30[0;39m [32m INFO[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [nio-8080-exec-1][0;39m [2m[0;39m[36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring DispatcherServlet 'dispatcherServlet'
[2m2024-08-14T18:52:38.865+05:30[0;39m [32m INFO[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [nio-8080-exec-1][0;39m [2m[0;39m[36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Initializing Servlet 'dispatcherServlet'
[2m2024-08-14T18:52:38.867+05:30[0;39m [32m INFO[0;39m [35m11864[0;39m [2m---[0;39m [2m[ChatWorldApplication] [nio-8080-exec-1][0;39m [2m[0;39m[36mo.s.web.servlet.DispatcherServlet       [0;39m [2m:[0;39m Completed initialization in 2 ms

C:\Users\Hp>npm install -g wscat

changed 9 packages in 2s

C:\Users\Hp>wscat -c ws:localhost:8080/chat
Connected (press CTRL+C to quit)
> hello
< hello
> welcome to the chatworld application
< welcome to the chatworld application
> we disscus about few things
< we disscus about few things
> how we developed this applications
< how we developed this applications
>

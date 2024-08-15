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
    git clone https://github.com/ManjulaDoddavula/CBT-CIP/ChatWorldApplication.git
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


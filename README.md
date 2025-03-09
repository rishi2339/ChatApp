# ChatApp

This project was created using the [Ktor Project Generator](https://start.ktor.io).

## Overview

ChatApp is a real-time chat application built using \*\*Jetpack Compose\*\* for the frontend and **MongoDB** for server-side data storage. It follows a **Clean MVVM Architecture** to ensure a modular, testable, and scalable codebase.

## Features

Here's a list of features included in this project:

| Name                                                                   | Description                                                                        |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| [Routing](https://start.ktor.io/p/routing)                             | Provides a structured routing DSL                                                  |
| [WebSockets](https://start.ktor.io/p/ktor-websockets)                  | Adds WebSocket protocol support for bidirectional client connections               |
| [Call Logging](https://start.ktor.io/p/call-logging)                   | Logs client requests                                                               |
| [kotlinx.serialization](https://start.ktor.io/p/kotlinx-serialization) | Handles JSON serialization using kotlinx.serialization library                     |
| [Content Negotiation](https://start.ktor.io/p/content-negotiation)     | Provides automatic content conversion according to Content-Type and Accept headers |
| [Sessions](https://start.ktor.io/p/ktor-sessions)                      | Adds support for persistent sessions through cookies or headers                    |
| **Jetpack Compose UI**                                                 | Provides a modern declarative UI framework for Android                             |
| **MongoDB Integration**                                                | Uses MongoDB as a NoSQL database for real-time chat storage                        |
| **MVVM Architecture**                                                  | Ensures clean separation of concerns and maintainability                           |

## Tech Stack

### Frontend (Android)

- **Jetpack Compose** - UI toolkit for building native Android UIs
- **Kotlin Coroutines** - Asynchronous programming
- **StateFlow & LiveData** - Reactive UI state management
- **Koin** - Dependency Injection
- **Ktor Client** - Network communication
- **WebSockets** - Real-time communication

### Backend (Ktor Server)

- **Ktor Framework** - Lightweight Kotlin backend framework
- **MongoDB** - NoSQL database for storing chat messages and user data
- **Ktor WebSockets** - Real-time messaging between users
- **Serialization** - JSON data handling with kotlinx.serialization
- **Sessions & Authentication** - Secure user sessions

## Building & Running

To build or run the project, use one of the following tasks:

| Task                          | Description                                                          |
| ----------------------------- | -------------------------------------------------------------------- |
| `./gradlew test`              | Run the tests                                                        |
| `./gradlew build`             | Build everything                                                     |
| `buildFatJar`                 | Build an executable JAR of the server with all dependencies included |
| `buildImage`                  | Build the docker image to use with the fat JAR                       |
| `publishImageToLocalRegistry` | Publish the docker image locally                                     |
| `run`                         | Run the server                                                       |
| `runDocker`                   | Run using the local docker image                                     |

## How to Run the App

### Backend Server

1. Clone the repository and navigate to the project folder.
2. Ensure MongoDB is running locally or update the connection settings.
3. Run `./gradlew run` to start the server.

### Android App

1. Open the Android project in Android Studio.
2. Connect an emulator or physical device.
3. Run the app to start chatting in real time!

## Future Improvements

- **Push Notifications** for message updates
- **User Authentication & Authorization**
- **End-to-End Encryption** for secure messaging
- **Dark Mode & Theming** support

This project is actively maintained and open for contributions!


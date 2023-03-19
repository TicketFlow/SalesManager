# Reservation Manager Service

This is a Reservation Manager microservice built using reactive programming with Java WebFlux.

The Reservation Manager microservice is responsible for managing reservations for a fictitious travel agency. The
microservice provides REST APIs that allow clients to create, retrieve, update and delete reservations.

This project uses a reactive programming model to provide efficient, non-blocking processing of requests, with a focus
on high concurrency and throughput.

### Endpoints

* **/reservations** (GET)- endpoint to list all reservations for a specific user.
* **/reservations/{id}** (GET) - endpoint for viewing details of a specific reservation.
* **/reservations** (POST) - endpoint to create a new reservation.
* **/reservations/{id}** (PUT) - endpoint for updating an existing reservation.
* **/reservations/{id}** (DELETE) - endpoint for deleting an existing reservation.

### Architecture

Architecture
The Reservation Manager microservice is designed as a standalone application that communicates with other microservices
in the system through REST APIs.

The microservice consists of several components, including:

* **Web layer**: This layer receives incoming HTTP requests and routes them to the appropriate handler methods. It uses
  Java WebFlux to provide reactive, non-blocking handling of requests.

* **Service layer**: This layer contains the business logic for managing reservations. It provides methods for creating,
  retrieving, updating and deleting reservations, and communicates with other microservices to fulfill reservation
  requests.

* **Data layer**: This layer provides access to the database where reservation information is stored. It uses Spring
  Data MongoDB to perform CRUD operations on the database

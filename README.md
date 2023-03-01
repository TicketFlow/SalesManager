# ReservationManagerService

The reservation management service is responsible for managing ticket reservations made by users in the TicketFlow application. It allows users to view, update and cancel their reservations.

### Endpoints
* **/reservations** (GET)- endpoint to list all reservations for a specific user.
* **/reservations/{id}** (GET) - endpoint for viewing details of a specific reservation.
* **/reservations** (POST) - endpoint to create a new reservation.
* **/reservations/{id}** (PUT) - endpoint for updating an existing reservation.
* **/reservations/{id}** (DELETE) - endpoint for deleting an existing reservation.

### Dependencies
* Spring Boot
* Spring Data JPA
* Flyway
* MongoDB
* PostgreSQL

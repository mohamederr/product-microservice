# Product Microservice

A REST API built with Java 17 and Spring Boot to manage products.

## Technologies

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- JUnit 5 and Mockito
- Docker
- GitHub Actions
- GitHub Container Registry (GHCR)

## Features

- Create a product
- Retrieve all products
- Retrieve a product by ID
- Update a product
- Delete a product

## Run locally

### Requirements

- Java 17
- Docker (optional)

### Run the application

```bash
./mvnw spring-boot:run
```

On Windows PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

The API runs on:

`http://localhost:8080`

## API endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/products` | Get all products |
| GET | `/api/products/{id}` | Get a product by ID |
| POST | `/api/products` | Create a product |
| PUT | `/api/products/{id}` | Update a product |
| DELETE | `/api/products/{id}` | Delete a product |

### Example request

`POST /api/products`

```json
{
  "name": "Laptop",
  "price": 8500
}
```

## Run tests

```bash
./mvnw clean test
```

## CI/CD

GitHub Actions automatically runs the tests and packages the application. The workflow also builds and publishes the Docker image to GitHub Container Registry when the required configuration and permissions are available.

## Docker

Build the image locally:

```bash
docker build -t product-microservice:1.0 .
```

Run the container:

```bash
docker run --rm -p 8080:8080 product-microservice:1.0
```

## Database

The application uses an in-memory H2 database. Data is not persistent across application restarts.

## License

Add your chosen license here if you intend to distribute the project publicly.

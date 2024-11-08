
# CQRS-Architecture

CQRS Design Pattern with SpringBoot & Apache Kafka.

Technologys used: Java, SpringBoot, Kafka, PostgreSQL, Redis.

Video explanation: Soon!


## Documentation

http://localhost:8080/doc/swagger-ui/index.html


```http
POST 'http://localhost:9191/products'
{
    "type": "CreateProduct",
    "product": {
        "name": "Book",
        "description": "Made by Aldo Becerra",
        "price": 50
}
```

```http
PUT 'http://localhost:8080/products/1'
{
    "type": "UpdateProduct",
    "product": {
        "id": 1,
        "name": "Book",
        "description": "Made by Aldo Becerra",
        "price": 50
}
```

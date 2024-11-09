
# CQRS-Architecture

CQRS Design Pattern with SpringBoot & Apache Kafka.

Technologys used: Java, SpringBoot, Kafka, PostgreSQL, Redis.

Explanation Video: [Click here!](https://www.youtube.com/watch?v=TJYcRRTPAFs&t=1s)


## Documentation

http://localhost:8080/doc/swagger-ui/index.html


```http
POST 'http://localhost:8080/products'
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

![image](https://github.com/user-attachments/assets/89426939-94b4-4dcb-bfbf-bea10018a5d4)


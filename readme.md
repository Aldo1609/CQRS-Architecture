
# CQRS-Architecture

CQRS Design Pattern with SpringBoot & Apache Kafka.

Technologys used: Java, SpringBoot, Kafka, PostgreSQL, Redis.

Explanation Video: [Click here!](https://www.youtube.com/watch?v=TJYcRRTPAFs&t=1s)


## Documentation

http://localhost:8080/doc/swagger-ui/index.html


```http
POST 'http://localhost:8080/products'
Service: Product-Command-Service

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
Service: Product-Command-Service

{
    "type": "UpdateProduct",
    "product": {
        "id": 1,
        "name": "Book",
        "description": "Made by Aldo Becerra",
        "price": 50
}
```

```http
GET 'http://localhost:8081/products'
Service: Product-Query-Service

{
    "product": {
        "id": 1,
        "name": "Book",
        "description": "Made by Aldo Becerra",
        "price": 50
}
```

![image](https://github.com/user-attachments/assets/89426939-94b4-4dcb-bfbf-bea10018a5d4)



## 🚀 About Me
I'm a Software Engineer with 2.5 years of experience in Backend development. 

I specialize in Java and have strong proficiency in the Spring Ecosystem


## 🔗 Links

¿Do you want to contact me?
Send me an email!

aldobecerra1609@gmail.com

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/aldo-isaias-becerra-campos-591621200/)




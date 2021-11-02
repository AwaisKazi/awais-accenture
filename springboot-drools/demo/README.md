# Getting Started

### Reference Documentation

### Compile and Run

```sh
mvn clean compile spring-boot:run
```
json body request
http://localhost:8080/credit-score
```json
[
        {
            "applicant":{"age":46,"name":"John"},
            "creditScore":100
        },
        {
            "applicant":{"age":20,"name":"Phil"},
            "creditScore":640
        },
        {
            "applicant":{"age":46,"name":"Chris"},
            "creditScore":321
        }
]
```
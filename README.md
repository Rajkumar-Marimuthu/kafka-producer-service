# kafka-producer-service
kafka producer service

# Tech stack
Java 25
Spring Boot

# Local Setup
Start the service locally.
http://localhost:8081/actuator/health

# Test the service
Use the below curl command to test the service.
curl -X POST http://localhost:8081/api/send -d "message=hello man"
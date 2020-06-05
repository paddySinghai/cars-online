# Stock-Management-Module
The core function of the module is to implement RESTful Java based backend application for a car-website.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a system.


### Built With:
1. Framework - SpringBoot
2. Dependency Management - Maven
3. Version Control - Git
4. Java -14  
5. Building images and running containers - Docker
6. Event Monitoring - Prometheus

### Installing

Clone the git repository in a local directory using git clone<repository_name> command.


### Deployment on Local Machine
1. Build the jar file using the command: mvn clean install.
2. Build the docker image of the same using the command: <B> docker build -f Dockerfile -t cars-online .</B>
3. Image details can be viewed using <B> docker image ls </B>
4. Return a list of cars :: Request Type: GET || URL: http://localhost:8080/cars/carsList  
5. Swagger UI URL: http://localhost:8080/swagger-ui.html  
6. Prometheus URL: http://localhost:8080/actuator/prometheus   

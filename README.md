# cars-online-case

Cars online

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a system.

### Prerequisites

Things you need to get the project up and running on a local machine:

* Docker latest version
* docker-compose latest version

### Building and Running the application

* Execute the below docker-compose command to run the application:
```
docker-compose up --build
```

#### Front End

* Open 'http://localhost:8000/' in the web browser to open the front end of the application

#### REST services

* REST services can be accessed on http://localhost:8080/cars/carsList


### Stopping the application and cleaning-up
```
docker-compose down -v --rmi all --remove-orphans
```
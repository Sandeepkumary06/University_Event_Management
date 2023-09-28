# UniversityEventManagement
[![Java](https://img.shields.io/badge/Java>=8.0-blue.svg)](https://docs.spring.io/spring-boot/docs/0.5.0.M6/api/org/springframework/boot/SpringApplication.html)
[![maven](https://img.shields.io/badge/maven->=3.0.5-green.svg)](https://www.npmjs.com/package/npm/v/5.5.0)
[![springBoot](https://img.shields.io/badge/SpringBoot->=3.0.6-blue.svg)](https://nodejs.org/en/blog/release/v9.3.0)
>This project is a University Event Management System that allows CRUD operations on a Student and Event Entity with added validation on the entity class. The project is built using Spring Boot and H2 Database.

[Homepage]();

## Framework used
 * Spring Boot
## Languaged Uesd
 * Java
## Data Model
>The data model is defined in the SudentModel class, which has the following attributes
```
* Student
studentId (Integer) : Unique identifier for Student.
firstName (String) : First Name of the Student.
lastName (String) : Last Name of the Student.
age (Integer) : Age of the Student.
department (String-Enum) : Type of department of Student(ME , ECE , CIVIL , CSE).

* Event

eventId (Integer): Unique identifier for the event.
eventName (String): Name of the Event.
locationOfEvent (String): Location of the Event.
location (String): location of the job.
date (LocalDate): Date of the Event.
startTime (String) : Start Time of the Event.
endTime (String) : End Time of the Event.
```
## Validation
```
To validate the input we get from client, we've used validation annotations that are used to enforce specific constraints on the values of the variables. These constraints ensure that the data input by the user is of the correct format and meets certain criteria.
* @Valid - In Spring Framework, the @Valid annotation is used in conjunction with @PostMapping and @PutMapping annotations, which are used to handle POST and PUT requests, respectively. When used with @PostMapping or @PutMapping, the @Valid annotation is typically applied to a method parameter annotated with @RequestBody.
* @NotEmpty: This annotation is used to validate that the annotated field is not null or empty.
* @NotNull: This annotation is used to validate that the annotated field is not null.
* @Max : This annotation is used to validate that the annotated field is not greater than the mentioned value in field.
* @Min : This annotation is used to validate that the annotated field is not smaller than the mentioned value in field.
```
## Data Flow
```
1. User send as a request to the application throgh the endpoints
2. the api recived request and sends it to the appropriate controll method
3. the controller method makes a call to the method in service class.
4. he controller method returns a response to the API
5. The API sends the response back to the user
```
## Function Used 
# Student
* PostMapping("/student")
```
This endpoint makes a call to method in StudentService class where we implement method "save()" which is in JPA Repository.
```
* GetMapping("/students")
```
This endpoint makes a call to method in UserService class which retrieves data of all users from database through API.
```
*PutMapping("/student/{studentId}/{studentDepartment}")
```
This endpoint makes a call to method in UserService class which is connected to database. In database we update student department by student Id.
```
*GetMapping("/student/{studentId}")
```
This endpoint makes a call to method in StudentService class which retrieves data of student by id from database by implementing method "findById()" present in JPA repository.
```
* DeleteMapping("/student/{studentId}")
```
This endpoint makes a call to method in studentService class which is connected to database. In database we delete a user by UserId given through API.
```
# Event
* PostMapping("/event")
```
This endpoint makes a call to method in EventService class where we implement method "save()" which is in JPA Repository.
```
* GetMapping("/events")
```
This endpoint makes a call to method in EventService class which retrieves data of all events from database by implementing method "findAll()" present in JPA repository.
```
* PutMapping("/event/{eventId}/{EventLocation}")
```
This endpoint makes a call to method in EventService class which is connected to database. In database we update a Event Location based on id given through API.
```
* DeleteMapping("/event/{eventId}")
```
This endpoint makes a call to method in EventService class which is connected to database. In database we delete a event by id given through API.
```
## Data Structure Used
* 
```
We have used InMemory database H2 to implement CRUD Operations.
```

## Project Summary
```
The project is a University Event Management built using Spring Boot and H2 Database. It allows CRUD operations on a Student and Event entity with added validation using Spring Boot validation. The Student entity class has fields for student details like studentId , first name , last name , age , department and Event entity class has fields for event details like eventId , eventName , locationOfEvent , date , startTime , endTime . The project supports various endpoints for CRUD operations and searching for Student and Events based on id and date.
```

# Management Application

##  Frameworks and Language Used

    -> Java 19
    -> Spring Boot
    -> MySQl

 
# Data Flow

### Controller

- #### StudentController
    -> Handles the CRUD operations of Student model.

- #### LaptopController
    ->Handles the CRUD operatons of Laptop model.

- #### CourseController
    ->Handles the CRUD operatons of Course model.

- #### BookController
    ->Handles the CRUD operatons of Book model.

### Service

- #### StudentService
    -> All the business logic for Student model will be implemented by StudentService.
- #### LaptopService
    ->  All the business logic for Laptop model will be implemented by LaptopService.

- #### CourseService
    -> All the business logic for Course model will be implemented by CourseService.

- #### BookService
    -> All the business logic for Book model will be implemented by BookService.


# Repository

- ### IStudentRepository
    -> It extents JpaRepository and contains all the CRUD operations for the Student Model.

- ### ILaptopRepository
    -> It extents JpaRepository and contains all the CRUD operations for the Laptop Model.
- ### ICourseRepository
    -> It extents JpaRepository and contains all the CRUD operations for the Course Model.
    - ### IBookRepository
    -> It extents JpaRepository and contains all the CRUD operations for the Book Model.

# Database Design 
    -> There are four Entiries in this application - Student,Laptop,Course,Book.
    -> Laptop and Student have a one-to-one relationship.
    -> Course and Student have a many-to-many relationship.
    -> Book and Student have a many-to-one relationship.

# Data Structure Used
    -> ArrayList.
    -> Java classes and Interfaces.
# Project Summary 
    -> This management application shows the OneToOne,ManyToMany, ManyToOne relationship in the SQL database using spring boot.It contains all of the Crud operation which is stored in the JpaRepository. 
# Server Used
    -> http:localhost:8080/(required url);
    -> h2-console for mapping the database- http://localhost:8080/h2-console


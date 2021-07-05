# Cinema

###Main idea
This is a RESTful application which represents a demo version of a cinema ticket purchasing system. 

###Project Structure
The project has an N-tier structure:
* DAO layer (interaction with the database);
* service layer (business logic);
* controller layer (HTTP request processing).

###User capabilities:
* registration, logging in and out;
* getting a list of all movies and cinema halls;
* searching for all available movies on a particular date;
* adding tickets to the shopping cart and completing the order;
* looking through order history.

###Admin capabilities:
* logging in and out;
* getting a list of all movies and cinema halls;
* searching for all available movies on a particular date;
* managing the movies, cinema halls, and movie sessions lists.

###Technologies Used:
* Java 11
* Spring Core, Spring MVC, Spring Security
* Hibernate
* MySQL database
* Apache Tomcat
* Maven
* Maven Checkstyle plugin
* Log4j


###To run the project, you need:
* clone the project into your local folder and open the project in an IDE;
* configure Tomcat: deployment: war_exploded, context address: "/";
* insert MySQL properties in the db.properties file;
###For authorization as an ADMIN:
* login: admin@i.com
* password: admin123

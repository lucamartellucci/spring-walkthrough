[![Build Status](https://travis-ci.org/lucamartellucci/spring-walkthrough.svg?branch=master)](https://travis-ci.org/lucamartellucci/spring-walkthrough)
[![Codacy Badge](https://api.codacy.com/project/badge/grade/dc15e4bdd44545e5893ad9ec65071610)](https://www.codacy.com/app/luca-martellucci/spring-walkthrough)
[![Dependency Status](https://www.versioneye.com/user/projects/570526e7fcd19a00518543dd/badge.svg?style=plastic)](https://www.versioneye.com/user/projects/570526e7fcd19a00518543dd)
[![GitHub license](https://img.shields.io/github/license/lucamartellucci/spring-walkthrough.svg)](https://github.com/lucamartellucci/spring-walkthrough/blob/master/LICENSE.md)

## Spring Framework walkthrough 

This is a small journey in the Spring Framework: from a really basic standalone application to a SPA with REST backend build upon the spring boot technology.
The repository is organized in several different branches that you can checkout to get the working code. 

- **STEP 1**: Standalone Java App with Spring (branch: **01-standalone-spring-xml**)
- **STEP 2**: Hello Wordl with Spring MVC and XML configuration (branch: **02-mvc-spring-xml**)
- **STEP 3**: Simple ToDo Application with Spring MVC, Thymeleaf and Java Configuration (branch: **03-mvc-spring-java**)
<<<<<<< HEAD
- **STEP 4**: A ToDo Application with Spring MVC, Thymeleaf, JPA2 and Spring Data JPA (branch: **04-mvc-jpa-spring-java**)
=======
>>>>>>> 0e58ef4ab6ff5579147c6636a45edb01d3a27f3e


### Step 1 - Standalone java app with Spring 
This is a simple example that shows how to bootstrap a spring context inside a standalone java application.
To excute get the application, you need to open a bash shell and 
checkout the git branch "01-standalone-spring-xml" 

```sh
$ git checkout 01-standalone-spring-xml
```

build with maven 

```sh
$ mvn clean package
```

and finally run
```sh
$ java -jar target/spring-walkthrough-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```

### Step 2 - Hello World Web application with Spring MVC 
A simple app that shows how to configure a Spring MVC based webapp. This web app is configured via spring xml files and has an HelloWorld controller mapped to the url /hello. 
To test the application checkout the git branch "02-mvc-spring-xml" with the following command:

```sh
$ git checkout 02-mvc-spring-xml
```

To execute the application launch the command 

```sh
$ mvn clean package jetty:run
```

Now open your browser and navigate to the page <http://localhost:8080/hello>

To customize the hello world message use the query param <http://localhost:8080/hello?name=Jack>

### Step 3 - ToDo Web application with Spring MVC
This simple ToDo Application is a Spring MVC application with Thymeleaf template engine. The configuration is "Java based", this means that all the spring xml files are replaced by Java classes.
Checkout the branch "03-mvc-spring-java" to get the source code.

```sh
$ git checkout 03-mvc-spring-java
```
To execute the application launch the following command:
```sh
$ mvn clean package jetty:run
```

Now open your browser and navigate to: <http://localhost:8080/todos>

### Step 4 - ToDo Web application with Spring MVC, Spring Data JPA
In this step we added the persistence layer based on JPA over H2 database. On top of JPA we added the Spring Data JPA framework to speedup the development. 

```sh
$ git checkout 04-mvc-jpa-spring-java
```
To execute the application launch the following command:
```sh
$ mvn clean package jetty:run
```
We added here a new type of Todo: the task list that is a Todo item with several dependant tasks.
To see the TODO app open your browser and navigate to: <http://localhost:8080/todos>  
=======

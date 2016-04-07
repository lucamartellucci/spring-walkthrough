## Spring Framework walkthrough 

This is a small journey in the Spring Framework: from a really basic standalone application to a SPA with REST backend build upon the spring boot technology.
The repository is organized in several different branches that you can checkout to get the working code. 

- **STEP 1**: Standalone Java App with Spring (branch: **01-standalone-spring-xml**)
- **STEP 2**: Hello Wordl with Spring MVC and XML configuration (branch: **02-mvc-spring-xml**)
- **STEP 3**: Simple ToDo Application with Spring MVC, Thymeleaf and Java Configuration (branch: **03-mvc-spring-java**)


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

Now open your browser and navigate to the page <http://localhost:8080/spring-walkthrough/hello>

To customize the hello world message use the query param <http://localhost:8080/spring-walkthrough/hello?name=Jack>

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

Now open your browser and navigate to: <http://localhost:8080/>


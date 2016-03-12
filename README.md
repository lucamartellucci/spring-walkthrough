## Spring Framework walkthrough 

### Standalone java app with Spring 
This is a simple example how to bootstrap a spring context inside a main method.
To get the application working checkout the git tag "main-spring-xml" 

```sh
$ git checkout main-spring-xml
```

and build with maven

```sh
$ mvn clean package
```

to run the application open the bash and from the project directory execute the command
```sh
$ java -jar target/springcore-0.0.1-SNAPSHOT.jar
```

### Web app with Spring MVC 
A simple app that shows how to configure a spring MVC based webapp.
There is a HelloWorld controller mapped to the url /hello. To test the application checkout the git tag "mvc-spring-xml" with the following command:

```sh
$ git checkout mvc-spring-xml
```

To execute the application launch the command 

```sh
$ mvn clean package jetty:run
```

Now open your browser and navigate to the page http://localhost:8080/springcore/hello

To customize the hello world message use the query param
http://localhost:8080/springcore/hello?name=Jack


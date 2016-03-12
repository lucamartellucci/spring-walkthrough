## Spring Framework walkthrough 

### Standalone java app with Spring 
This is a simple example that shows how to bootstrap a spring context inside a main java method.
To excute get the application, you need to open a bash shell and 
checkout the git branch "spring-main-xml" 

```sh
$ git checkout spring-main-xml
```

build with maven 

```sh
$ mvn clean package
```

and finally run
```sh
$ java -jar target/springcore-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```

### Web app with Spring MVC 
A simple app that shows how to configure a spring MVC based webapp.
There is a HelloWorld controller mapped to the url /hello. To test the application checkout the git branch "mvc-spring-xml" with the following command:

```sh
$ git checkout mvc-spring-xml
```

To execute the application launch the command 

```sh
$ mvn clean package jetty:run
```

Now open your browser and navigate to the page [http://localhost:8080/springcore/hello]

To customize the hello world message use the query param
[http://localhost:8080/springcore/hello?name=Jack]


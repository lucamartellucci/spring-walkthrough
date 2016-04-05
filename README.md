## Spring Framework walkthrough 

### Web app with Spring MVC 
A simple app that shows how to configure a spring MVC based webapp. This web app is configured via spring xml files, and there is a HelloWorld controller mapped to the url /hello. 
To test the application checkout the git branch "mvc-spring-xml" with the following command:

```sh
$ git checkout mvc-spring-xml
```

To execute the application launch the command 

```sh
$ mvn clean package jetty:run
```

Now open your browser and navigate to the page <http://localhost:8080/spring-walkthrough/hello>

To customize the hello world message use the query param <http://localhost:8080/spring-walkthrough/hello?name=Jack>


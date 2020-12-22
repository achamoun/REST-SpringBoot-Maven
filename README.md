### REST-web-services
Implementing two REST web services using Spring Boot, Maven wrapper and Java 11.
### 1.The web services:
The first web service is to get a coffee drink according to some ingredients. 
the second web service is to get the ingredients of a coffee drink. Check out the package "com.example.coffeedrink.functions"
### 2.Publishing the web services:
To publish the web services with Spring Boot. Check out the Class "CoffeeDrinkController" in the package "com.example.coffeedrink"
### 3.More Information on creating REST web services and running them with Spring Boot:
https://spring.io/guides/gs/rest-service/
### 4.Testing the web services:
In your web browser visit the URL http://localhost:8080/webservices/getCoffeeDrink?ingredients=espresso,milk and you will get the response
to your browser as JSON. The same way you can call the same web service with other parameters or even call the other web service.
### Main differences between REST and SOAP:
 1.In REST each web service is being published in a unique URL.
 IN SOAP Several Web services can be published in one URL. Check out the respository SOAP web services later on.
 
 2.In REST the web service and its parameter are included in the URL you call.
 In SOAP the web service and its parameter will be listed in an .xml file and Send to the URL, where the SOAP web services are being published. 
 Check out the folder "requests" in the repository SOAP web services. 

P.S. : To compare SOAP and REST i published the same web services of the package "com.example.coffeedrink.functions" as SOAP web services. 
Check out the repository SOAP web service and see the difference.

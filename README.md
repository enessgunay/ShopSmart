# ShopSmart
Shopping web application
A web app using Spring Boot that can perform the basic e-commerce functionality.

Features
Users perspective
Easy login & registration
User-friendly product filtering
Product gallery
Shopping cart
Order summary
Payments using Paypal
Admin perspective
Easy login
Pages (add, edit, delete, sort)
Products (add, edit, delete)
Categories (add, edit, delete, sort)
Used Tools
Java 11
Spring Boot v2.4.2
Maven v3.6.3
MySQL Community Server 8.0.23
Thymeleaf
Spring Security and roles
Spring Data Jpa
Database Setup
Using MySql Workbench:
From the Server menu, choose Data Import
Choose Import from Self-Contained File.
Select the cmsshoppingcart.sql from the database directory.
In the Default Target Schema: Create a new schema name cmsshoppingcart
Select the options: Dump Structures Only
Click Start Import
Database Configuration in Spring Boot
Change database connection config in

cmsshoppingcart/src/main/resources/application.properties

restapi/src/main/resources/application.properties

restclient/src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost/cmsshoppingcart
spring.datasource.username=root
spring.datasource.password=
Project Setup
Clone and open in Visual Studio Code (other IDE is also fine, make sure that spring boot plugins is installed)
Change database connection config in src/main/resources/application.properties
Install maven dependencies using IDE auto import or using the command mvn install
Run the app using mvn spring-boot:start from project root directory.
Browse http://localhost:8080/ or http://localhost:8080/admin/pages

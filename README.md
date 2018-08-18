# SpringBoot-With-Basic-Auth
It is a Maven project, which is targeted for beginner to quick start with Spring Boot. This project has simple demonstration of usages of each component in spring boot (@Controller, @Service, @Repository). It would be very useful for beginner, who just started learning Spring Boot, as it covers almost all the basics, which requires to implement an application using SpringBoot. Following are two major features used :

1. Demonstration of GET/POST request
2. Connecting Oracle Database
3. Basic Authentication to secure your specific URL based on roles.

To use this proejct, all you need to import this as Maven project and update application.properties file

<pre>
SERVER.PORT=#update port numer
server.servlet.context-path=/MavenProject
spring.datasource.url=#update jdbc url
spring.datasource.username=#db username
spring.datasource.password=#db user password
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
spring.jpa.generate-ddl=true
spring.datasource.hikari.connection-timeout=30000
spring.datasource.hikari.maximum-pool-size=50
</pre>

Application would be accessible from 

<code>http://localhost:#port#/MavenProject/getAll</code>

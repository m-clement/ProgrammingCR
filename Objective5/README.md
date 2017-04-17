# Objective 5: Web Site Development

References 
- Bootstrap website ( http://getbootstrap.com/ )
- XMPP ( http://apachefriends.org )

## Various things we've learned
- bootstrap is a predefined web framework that helps us get started quickly
- it also provides guardrails to prevent us against bad practices

- Java, as a web server, requires that Java and a web server be installed. The web server itself must also run java. Apache HTTPD does not suffice here. We need something like Apache Tomcat, a true java web server.

- We started a Java web site by creating a servlet to host a web page. It seemed to be quite a lot of work to get complex pages to render right. It may have been powerful a generation ago, but today it is not very convenient to write web pages in a servlet.
- In our second attempt, we copied the bootstrap directories (js, fonts, css) into the Java webserver project web folder. That enabled bootstrap in a regular Java project without the headache of servlets. We are now able to use bootstrap in a web application. Why would we do this? Well, a web page is good at rending, but a programming language like java can support it with powerful calculations or business transactions. It's probably a good thing to have both.


## Assignement findings

* tbd
# Exercise 5

## Why are Logging librarys used

Suppose you are developing an E-commerce application. There will be many modules but just to make it simple let’s suppose you have three modules to develop – searchProduct, calculateValue, and payment. A user will search for a product and add it to the cart. Then cart value will be calculated and the user will be navigated to the payment page. We have a simple flow here.

Data will be moved across modules. While developing you must have to add some standard print commands so that you could track the flow. For example – items are searched correctly, desired items are added to the cart, total payable amount, etc. These standard print statements help you to analyze the code flow and catch if there is any unexpected result or break in the flow. In short a kind of log, it is. These logs will be very important for development, testing, and finding the place of occurrence of a problem later.

The use of standard print statements is not a good way of logging. It will be really difficult to track these print statements in a pool of extra logs coming from other sources (Maven, Gradle, libraries, etc). You may also want to store logs in an external file or keep track of old logs then it may not be easy. The standard print statements will not help much in a production environment.

There are multiple logging libraries are available in Java. You can use Java Logging APIs or Apache Log4j2.

It does not matter if you are a developer or an automation tester you must need to use Logger in your framework and test scripts. In this post, we will learn about Apache Log4j2 Java library.

[Source](http://makeseleniumeasy.com/2021/03/11/log4j2-tutorial-1-introduction-to-apache-log4j2/)

## Which loglevels exists

Log levels are a mechanism to categorise logs. Levels used for identifying the severity of an event. We can easily configure levels to specify which log details we want to see. Log4j provides below levels:-

ALL – To log all events.
DEBUG – A general debugging event.
ERROR – An error in the application, possibly recoverable.
FATAL – A severe error that will prevent the application from continuing.
INFO – An event for informational purposes.
TRACE – A fine-grained debug message, typically capturing the flow through the application.
WARN – An event that might possibly lead to an error.
OFF – No events will be logged.

[Source](http://makeseleniumeasy.com/2021/03/11/log4j2-tutorial-1-introduction-to-apache-log4j2/)

## Configuration

Automatic Configuration:
Log4j2 follows a search order to look for the configuration files and I think they have explained best on their official website. Below is a copied content from there.

Log4j has the ability to automatically configure itself during initialization. When Log4j starts it will locate all the ConfigurationFactory plugins and arrange them in weighted order from highest to lowest. As delivered, Log4j contains four ConfigurationFactory implementations: one for JSON, one for YAML, one for properties, and one for XML.

[Source](http://makeseleniumeasy.com/2021/03/24/log4j2-tutorial-3-setup-console-appender-using-xml-configuration-file/)

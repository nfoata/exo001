The Coffee Bar Challenge
========================

I) Introduction
---------------

This repository contains:
* a model for a coffee bar (order, coffees, vouchers)
* unit tests
* functional tests (usable for BDD)

This model has been implemented with the following tools
* jdk 1.8.0_181 (Oracle official)
* JUnit 4.12 
* JBehave and serenity (serenity-jbehave-archetype) 

NB: Used of Eclipse and gVIm on an Ubuntu 18.04

As requested, no use of any frameworks such as RubyOnRails (if Ruby) or Spring (Java)

This code is for a test purposes (not at all for a production environment)
In this sense, some transversal features have not been implemented such as logging, security, reporting, ...
product and project documentations do not exist, packaging (debian) and image (docker) are not provided ...
none user interface (neither command line, nor web services or even a GUI) 


II) The model
--------------------

### Some quick commands to test it

```
# For the Unit tests
mvn clean test 

# For the Functional tests
mvn verify
```

### Some note about its structure

* All the instanciation have been done via a Singleton - Factory pattern
* The coffee could be enlarge with a Decorator pattern
* Order and Voucher use together a Strategy pattern
* The computation of the price has been delegated
* Coffees an Iterable of Coffee


III) Installation of java
-------------------------

### Installation of Java

```
sudo add-apt-repository ppa:webupd8team/java
sudo apt update
sudo apt install oracle-java8-installer
sudo apt install oracle-java8-set-default
javac -version
java  -version                
```

### Installation of maven

```
sudo apt-get install maven
mvn -v                       # here,I have 3.5.2

# Create the simplest base structure for our coffee challenge project
mvn archetype:generate -Dfilter=serenity-jbehave-archetype -DgroupId=fr.foata.nicolas.challenges -DartifactId=coffee -Dversion=1.0-SNAPSHOT
```

### Installation of eclispe
https://websiteforstudents.com/how-to-install-eclipse-oxygen-ide-on-ubuntu-167-04-17-10-18-04/

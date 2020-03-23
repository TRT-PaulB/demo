package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}


// com.example.demo.DemoApplication

/*
FROM ubuntu:latest

# Update and install Java & Ant & Maven
RUN apt-get update -y 
RUN apt-get upgrade -y
RUN apt-get install default-jdk -y
RUN apt-get install ant -y
RUN apt-get install maven -y

COPY pom.xml /root
COPY settings.xml /root/.m2/settings.xml
WORKDIR /root
RUN mvn -e verify

RUN touch /tmp/you

# Run Forever
CMD tail -f /dev/null

*/
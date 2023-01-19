FROM maven:3.6.3-jdk-11-slim

RUN mkdir /jar/

WORKDIR /jar/

COPY application/target/testbffnew.jar /jar/testbffnew.jar

ENV JAR_FILE=testbffnew LOG_PATH=/var/log/testbffnew

CMD ["java","-jar","/jar/testbffnew.jar"]

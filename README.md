# spring-continuous-delivery-test


__JaCoCo Test Coverage__ ![coverage](https://github.com/cb-priya/spring-continuous-delivery-test/blob/main/.github/badges/jacoco.svg)

Run locally

Run Mysql on docker
docker run -p 3306:3306 --name mysql_80 -e MYSQL_ROOT_PASSWORD=password -d mysql:8 mysqld --default-authentication-plugin=mysql_native_password

create database spring_test;
use spring_test;

create table user(
    id int auto_increment primary key,
    firstName varchar(500) NOT null,
    lastName varchar(500) NOT null,
    registrationDate varchar(1000)
);

Test commit
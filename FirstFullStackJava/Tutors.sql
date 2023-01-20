create database tutors;
use tutors;

create table users (
id int primary key auto_increment,
name varchar(20),
email varchar(20) unique,
password varchar(20),
reg_amt double,
reg_date date,
role varchar(10)
);

insert into users values(1,'rama','rama@gmail.com','1234',1500,'2017-1-23','ADMIN');
insert into users values(2,'Kiran','kir@gmail.com','123',1200,'2018-5-29','CUSTOMER');
insert into users values(3,'Shekhar','shek@gmail.com','1235',1800,'2016-3-4','CUSTOMER');
insert into users values(4,'Riya','riya@gmail.com','4235',1700,'2017-3-4','CUSTOMER');
insert into users values(5,'Raj','raj@gmail.com','4535',1900,'2019-3-4','CUSTOMER');

create table topics(
id int primary key auto_increment,
name varchar(30) unique
);

insert into topics values(default,'Servlets');
insert into topics values(default,'JSP');
insert into topics values(default,'JPA');
insert into topics values(default,'Spring Framework');

create table tutorials(
id int primary key auto_increment,
name varchar(50) unique,
author varchar(30),
publish_date date,
visits int ,contents varchar(300),
topic_id int,
constraint fk_topics foreign key  (topic_id) references topics(id)
);

insert into tutorials values(default,'Spring Core','Priti','2020-1-1',10,'Explains D.I n AOP in detail',4);
insert into tutorials values(default,'Spring MVC','Rama','2020-3-4',12,'Ready Made Implementation of MVC Pattern',4);
insert into tutorials values(default,'Spring Boot','Mihir','2021-1-1',20,'Automatic Config n Support in Spring Boot',4);

 
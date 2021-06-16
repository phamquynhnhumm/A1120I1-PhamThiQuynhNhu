create database demo;
use demo;
-- drop database demo;
create table user 
(
id int not null auto_increment primary key,
name varchar(120) not null,
email varchar(120) not null,
country varchar(120)
);

insert into user(name, email, country) values('nhu','nhu@gmail.com','Viet Nam');
insert into user(name, email, country) values('hanh','hanh@gmail.com','Nhat');
select * from user;
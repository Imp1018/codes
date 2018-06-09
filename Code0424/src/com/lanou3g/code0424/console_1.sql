create table emp (
  `id`         int,
  `name`       varchar(100),
  `gender`     varchar(10),
  `birthday`   date,
  `salary`     float(10, 2),
  `entry_date` date,
  `resume`     text
);

insert into emp values (1234, '楼上的积分', '女', '1999-9-9', '2222.22', '2000-1-1', 'sdlkfjsdlfjslad;fjsdl;kfj;adlsfkj');

select *
from emp;

show databases ;

show create database hello_world;

desc emp;

show tables ;

alter table emp add father varchar(10);

select * from emp;

alter table emp change father monther char;

rename table student to children;

select * from children;


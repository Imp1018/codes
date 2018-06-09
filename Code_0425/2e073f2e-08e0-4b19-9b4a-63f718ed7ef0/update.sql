/*
     更新
  将emp这张表中所有的行里 性别都设置为女 薪资都设置为1000
*/

update emp
set gender = '女', salary = 1000;

# 大多数修改 都不是修改全部数据 而是 修改某一条 或 某几条数据
# 这个时候需要加限定条件  限定条件关键字 where

update emp
set salary = 2000
where name = '楼上的积分';

# 修改值的时候 还可以进行简单的运算
update emp
set salary = salary * 10
where name = '老母猪';

select *
from emp;

create table teacher (
  id     int primary key, /*通过primary key 来表示一列为这个表的主键*/
  name   varchar(255),
  salary int
);
# 一张表中 所有主键的值 必须唯一
insert into teacher (id, name, salary) values (3, '李四', 1000);

update teacher
set salary = 2000
where id = 2;

# 更新的条件可以有多个 多个条件如果是"与"的关系就使用 and  "或"的关系就使用 or
# 条件如果不满足 不会报错  只不过这条语句没有什么效果
# 剩下的where条件使用规则 放在查询里详细说
update teacher
set salary = 1000
where salary > 1500 and name = '李四';

# 删除语句 是用来删除行的
# 只用while添加限定条件
delete from teacher
where name = '李四';
#如果没有添加限定条件 则会把整张表都删除了
select *
from teacher;

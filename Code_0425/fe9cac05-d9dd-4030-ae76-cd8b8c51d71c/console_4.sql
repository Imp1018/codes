# 查询所有
# *代表查询表中的所有列,正常在使用的时候要避免
# 因为SQL在解析*的时候 要稍慢一点
select *
from stu;

# 即使我们要查询出这张表里所有的列 也要把这些列名都写上
# 可以要那一列的数据就查询那一列的信息
select
  sid,
  sname,
  age,
  gender
from stu;

#  条件查询
-- 年龄大于18岁的女学生
/*
查询条件中使用的符号/关键字
1. =(判断相等)  !=,>,<,>=,<=,<>(不等于)
2. 判断在两个值中间: between....and....(包含边界条件)
3. IN(数据1,数据2,....):用来判断确定的几个值
4. 多个条件使用and(与)or(或)not(非)进行连接
5. 判断空值: is null  is not null
*/
select
  sname,
  age
from stu
where age > 18 and gender = 'female';


select emp.ename
from lan_ou.emp
where hiredate between '1981-1-1' and '1981-12-31';

select *
from stu
where sname not in ('liSi', 'zhangSan', 'wangWu') and age < 60;


select *
from stu
where gender is null ;
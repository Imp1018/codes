/**
   聚合函数
   如果查询的结果 我们不关心每一行的数据 只关心他们整体的数据
   可以使用聚合函数
   聚合函数是用来处理 指定列所有数据的
   count() 求行数
   max()   求最大值
   min()   求最小值
   sum()   求和
   avg()   求平均值
 */

/**
   count()求行数
   他会忽略null 即 只会求有值的行数
   要求 那一列有值的行数 就把列名放到conunt()的参数中
   如果是* 就是求所有数据的行数 因为一张表 不可能所有列的值都为null
   每张表我们要求要有主键 而主键一定不为null
 */
--  求 学生的个数
select count(*) as '人数'
from stu;

-- 求 emp中雇员人数
select count(*)
from lan_ou.emp;

-- 求 emp中有绩效的人数
select count(comm)
from lan_ou.emp;

-- 学生里年龄大于50
select count(*)
from stu
where age > 50;

-- emp 中 薪资大于2000 的人数
select count(*)
from lan_ou.emp
where sal + ifnull(comm, 0) > 2000;

/**
   最大值 和 最小值
 */
select max(age)
from stu;
select min(age)
from stu;

-- 超过40岁的学生最小年龄
select min(age)
from stu
where age > 40;

/**
   平均值
 */
select avg(age)
from stu;

/**
   求和
 */
select sum(sal + ifnull(comm, 0))
from lan_ou.emp;
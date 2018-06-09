#   查询结果去除重复
#   如果写的是多列 那就需要这些列的数据全部是重复的 才会只显示一遍
select distinct emp.sal
from lan_ou.emp;

/*
*  结果计算

 */
select
  *,
  sal + comm
from lan_ou.emp;

-- 计算结果时处理null
-- ifnull (列名,值)是MySQL中的一个内置函数
-- 可以认为是方法 用来处理 列名 这一列值是 null 的时候 应该使用几来计算
select
  ename,
  sal,
  comm,
  sal + ifnull(comm, 0)
from lan_ou.emp;

/**
别名
mysql 在查询列的后面 使用 as 关键字 来给查询后的 虚拟表
起一个 自己的 别名
这个列名 不需要使用 单引号 建议使用 单引号 包裹起来 不用也可以
尽量不要使用中文列名
as 可以省略
 */
select
  ename                 as '姓名',
  sal + ifnull(comm, 0) as '薪资'
from lan_ou.emp;

select HAHA.ename from lan_ou.emp as HAHA;
-- as 也可以给表起别名
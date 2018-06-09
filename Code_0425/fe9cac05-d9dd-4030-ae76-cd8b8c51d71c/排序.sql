--  学生信息按照年龄排序
--  默认是升序   关键字: asc
--  降序  关键字: desc
select *
from stu
order by age asc;

select *
from stu
order by age desc;

select
  sid,
  sname,
  ifnull(age, 0) age,
    gender
from stu
order by age asc;
--  ifnull会影响排序最后的结果


-- 可以指定多个排序规则
-- sal 是第一优先排序 只在 sal 相同 才按照 comm 进行排序
select * from lan_ou.emp
order by sal asc ,comm desc ;
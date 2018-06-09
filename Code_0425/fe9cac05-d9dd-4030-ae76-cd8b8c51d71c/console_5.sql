/*
          模糊查询

 模糊查询 使用关键字 like
 通配符:
 _: 表示一个任意字符
 %: 表示任意个任意字符
   */


-- 查询名字有2个字符组成的学生
select *
from stu
where sname like '____';

--  查询名字3个字符组成并且中间是 大 的学生
select *
from stu
where sname like '_大_';

-- 查询所有姓陈的学生信息
select *
from stu
where sname like ('陈%');

-- 查询姓陈  名字是两个以上字符的学生信息
select *
from stu
where sname like ('陈_%');

-- 全文模糊
select *
from stu
where sname like '%大%';


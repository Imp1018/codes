
# 在写表名的时候可以使用 库名.表名
# 这样 在多个库重名的情况下 不会写错
# 并且如果表名这样写 在使用这个表之前 可以不use数据库
# 在datagrip中 可以省略use 数据库这一句 开发工具会帮我们写
# 这个文件的右上角是什么数据库 就会在执行这个文件中SQL语句之前 use该数据库

insert into lan_ou.teacher ( name, salary) values ('赵柳',100);
select *
from lan_ou.teacher;
# 如果数据库中的那一列 设置了auto increment
# 那么在插入数据的时候 这一列会自动的增长
# 不需要我们制定 通常 会跟 主键搭配使用

insert into lan_ou.teacher (id, name, salary) values (null ,'陈独秀',200);
# 如果一列设置为自增长 那么
# 即使手动插入一个null 也会插入自增长后的数据

insert into lan_ou.teacher (id, name, salary) values (20 ,'马尔扎哈',200);
# 如果我们手动指定了自增长列的值
# 那么就不会自增长 而是以我们指定的值为准

insert into lan_ou.teacher ( name, salary) values ('泷泽萝拉',300);
# 自增长 具体的值 是 数据库中 历史最高的值+1

delete from lan_ou.teacher where id=20 or id=21;

insert into lan_ou.teacher ( name, salary) values ('小猪佩奇',500);
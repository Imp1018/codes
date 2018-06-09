# drop table `teacher a`;
# 插入数据
/*
  1. 列名我们通常会使用 ` (1旁边的按键)来表示它就是一个字符串
  2. 字符串类型使用单引号 引起来
  3. 列类型和值需要一一对应 他们的顺序随意
  4.
*/
insert into student (name, score, gender)
values ('张三', '95.3', '男');


# 如果这一列没有值 需要写 null
# 所有数据类型 都可以写null 包括数字
insert into student(name, score, gender)
    values ('李四',null ,null );

# 插入数据的时候 不一定每一列 都需要写
# 哪一列有数据 就可以写这一列/这几列  没写的就会自动插入null
insert into student(name)
    values ('王五');

# 如果要插入的数据每一列都有值 那么就可以省略列名
# 直接写数据 但是 需要保证数据的顺序和列的顺序一一对应
insert into student values ('赵柳',99.9,'女','1999-9-9');

# 查询所有
select * from student;
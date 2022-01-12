create database demo;
use demo;
create table teacher(
code_teacher int auto_increment,
name_teacher varchar(55),
birthday date,
primary key(code_teacher)
);
create table classroom(
code_class int auto_increment,
name_class varchar(100),
primary key(code_class)
);
create table teacher_teach_classroom(
code_class int,
code_teacher int,
primary key(code_class,code_teacher),
foreign key(code_class) references classroom(code_class),
foreign key(code_teacher) references teacher(code_teacher)
);
create table student(
code_student int auto_increment,
name_student varchar(100),
email_student varchar(100),
birthday date,
code_class int,
primary key(code_student),
foreign key(code_class) references classroom(code_class)
);
create table `account`(
user_name varchar(100),
`password` varchar(6),
code_class int unique,
code_teacher int unique,
primary key(user_name),
foreign key(code_class) references classroom(code_class),
foreign key(code_teacher) references teacher(code_teacher)
);
create table address(
code_address int auto_increment,
name_address varchar(100),
code_student int,
primary key(code_address),
foreign key(code_student) references classroom(code_student)
);

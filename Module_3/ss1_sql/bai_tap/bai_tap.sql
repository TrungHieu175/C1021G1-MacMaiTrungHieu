CREATE TABLE class(
id_class INT NOT NULL auto_increment,
name_class VARCHAR(45),
 PRIMARY KEY (id_class)
);
CREATE TABLE teacher (
  id_teacher INT NOT NULL auto_increment,
  name_teacher VARCHAR(45),
  age int,
  country varchar(45),
  PRIMARY KEY (id_teacher));
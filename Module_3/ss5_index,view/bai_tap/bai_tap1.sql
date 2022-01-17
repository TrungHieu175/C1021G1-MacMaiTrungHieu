create database demo;
use demo;
create table Products(
id int auto_increment primary key,
productCode int,
productName varchar(50),
productPrice double,
productAmount int,
productDescription varchar(50),
productStatus bool
);
create unique index idx_productCode
ON Products (productCode);
create index idx_Products
ON Products (productName,productPrice);
EXPLAIN select * from Products;
CREATE VIEW view_name AS
select productCode, productName, productPrice, productStatus
from Products;
CREATE OR REPLACE VIEW view_name AS
select productCode, productName, productPrice, productStatus
from Products;
DROP VIEW view_name;
DELIMITER //
create procedure getall()
BEGIN

  SELECT * FROM Products;

END //
DELIMITER ;
call getall();
DELIMITER //
create procedure addnew()
BEGIN

insert 

END //
DELIMITER ;

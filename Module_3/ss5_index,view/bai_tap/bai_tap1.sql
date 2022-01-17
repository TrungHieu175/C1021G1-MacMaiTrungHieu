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
create procedure addnew(
In products_name varchar(50)
)
BEGIN

insert into Products (productName)
values (products_name);

END //
DELIMITER ;
call addnew('tu lanh');

select productName from Products;

DELIMITER //
create procedure updatenew(
In product_Id int
)
BEGIN

update Products
set productDescription = 'xai di roi biet'
where productCode = (product_Id);

END //
DELIMITER ;
call updatenew(1);

DELIMITER //
create procedure removenew(
In product_Id int
)
BEGIN

DELETE FROM Products
WHERE id = product_Id;

END //
DELIMITER ;
call removenew(3);

select * from Products
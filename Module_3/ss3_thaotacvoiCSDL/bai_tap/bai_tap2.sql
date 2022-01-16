USE QuanLyBanHang;
INSERT INTO Customer (cName, cAge)
VALUES ('Minh Quan',10),('Ngoc Oanh',20),('Hong Ha',50);

INSERT INTO `Order` (cID , oDate, oTotalPrice )
VALUES 
(1,2006-3-21,null),
(2,2006-3-23,null),
(1,2006-3-16,null);

INSERT INTO Product (pName, pPrice)
VALUES ('May Giat',3),
('Tu Lanh',5),
('Dieu Hoa',7),
('Quat',1),
('Bep Dien',2);

INSERT INTO OrderDetail (oID , pID , odQTY)
VALUES (1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);

select  oID, oDate, oTotalPrice from `Order`;

select c.cName, p.pName
from customer c
join `Order` o
on c.cID = o.cID
join OrderDetail od
on o.oID = od.oID 
join Product p
on od.pID = p.pID;

select c.cName
from customer c
left join `order` o
on c.cId = o.cID  
where o.oId is null;

select o.oID, o.oDate, SUM(od.odQTY*p.pPrice)
from `order` o
join orderdetail od
on od.oId = o.oID
join product p 
on p.pID = od.pID
group by od.oID

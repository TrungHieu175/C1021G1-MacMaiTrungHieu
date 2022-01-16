Create Database QuanLyBanHang;
USE QuanLyBanHang;
CREATE TABLE Customer
(
    cID   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    cName VARCHAR(60) NOT NULL,
    cAge INT    NOT NULL
);
CREATE TABLE Product
(
    pID   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ptName VARCHAR(30) NOT NULL,
    pPrice     DOUBLE
);
CREATE TABLE `Order`
(
    oID   INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    cID INT NOT NULL,
    oDate  DateTime NOT NULL,
    oTotalPrice  DOUBLE NOT NULL,
    FOREIGN KEY (cID) REFERENCES Customer (cID)
);
CREATE TABLE Mark
(
    oID    INT NOT NULL,
    pID     INT NOT NULL,
    primary key (oID, pID),
    FOREIGN KEY (oID) REFERENCES `Order` (oID),
    FOREIGN KEY (pID) REFERENCES Product (pID)
);
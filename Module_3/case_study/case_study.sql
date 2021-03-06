create database case_study;
use case_study;

CREATE TABLE vi_tri(
ma_vi_tri INT auto_increment,
ten_vi_tri VARCHAR(45),
PRIMARY KEY (ma_vi_tri)
);
CREATE TABLE trinh_do (
  ma_trinh_do INT auto_increment,
  ten_trinh_do VARCHAR(45),
  PRIMARY KEY (ma_trinh_do));
CREATE TABLE bo_phan (
  ma_bo_phan INT auto_increment,
  ten_bo_phan VARCHAR(45),
  PRIMARY KEY (ma_bo_phan));
CREATE TABLE nhan_vien (
  ma_nhan_vien INT AUTO_INCREMENT,
  ho_ten VARCHAR(45) NULL,
  ngay_sinh DATE NULL,
  so_cmnd VARCHAR(45) NULL,
  luong DOUBLE NULL,
  so_dien_thoai VARCHAR(45) NULL,
  email VARCHAR(45) NULL,
  dia_chi VARCHAR(45) NULL,
  ma_vi_tri INT NULL,
  ma_trinh_do INT NULL,
  ma_bo_phan INT NULL,
  PRIMARY KEY (ma_nhan_vien),
foreign key(ma_vi_tri) references vi_tri(ma_vi_tri),
foreign key(ma_trinh_do) references trinh_do(ma_trinh_do),
foreign key(ma_bo_phan) references bo_phan(ma_bo_phan)
);
create table loai_khach(
ma_loai_khach int auto_increment,
ten_loai_khach varchar(55),
primary key (ma_loai_khach)
);
create table khach_hang(
ma_khach_hang int auto_increment,
ho_ten varchar(45),
ngay_sinh date,
gioi_tinh bit(1),
so_cmnd varchar(45),
so_dien_thoai varchar(45),
email varchar(45),
dia_chi varchar(45),
ma_loai_khach int,
primary key (ma_khach_hang),
foreign key(ma_loai_khach) references loai_khach(ma_loai_khach)
);
create table kieu_thue(
ma_kieu_thue int auto_increment,
ten_kieu_thue varchar(45),
primary key (ma_kieu_thue)
);
create table loai_dich_vu(
ma_loai_dich_vu int auto_increment,
ten_loai_dich_vu varchar(45),
primary key (ma_loai_dich_vu)
);
create table dich_vu(
ma_dich_vu int auto_increment,
ten_dich_vu varchar(45),
dien_tich int,
chi_phi_thue double,
so_nguoi_toi_da int,
tieu_chuan_phong varchar(45),
mo_ta_tien_nghi_khac varchar(45),
dien_tich_ho_boi double,
so_tang int,
ma_kieu_thue int,
ma_loai_dich_vu int,
primary key (ma_dich_vu),
foreign key(ma_kieu_thue) references kieu_thue(ma_kieu_thue),
foreign key(ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu)
);
create table hop_dong(
ma_hop_dong int auto_increment,
ngay_lam_hop_dong datetime,
ngay_ket_thuc datetime,
tien_dat_coc double,
ma_nhan_vien int,
ma_khach_hang int,
ma_dich_vu int,
primary key (ma_hop_dong),
foreign key(ma_nhan_vien) references nhan_vien(ma_nhan_vien),
foreign key(ma_khach_hang) references khach_hang(ma_khach_hang),
foreign key(ma_dich_vu) references dich_vu(ma_dich_vu)
);
create table dich_vu_di_kem(
ma_dich_vu_di_kem int auto_increment,
ten_dich_vu_di_kem varchar(45),
gia double,
don_vi varchar(10),
trang_thai varchar(45),
primary key (ma_dich_vu_di_kem)
);
create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int auto_increment,
so_luong int,
ma_hop_dong int,
ma_dich_vu_di_kem int,
primary key (ma_hop_dong_chi_tiet),
foreign key(ma_hop_dong) references hop_dong(ma_hop_dong),
foreign key(ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem)
);
insert into vi_tri (ma_vi_tri, ten_vi_tri) values ("1", "Quản Lí"), ("2", "Nhân Viên");
insert into trinh_do(ma_trinh_do, ten_trinh_do) values ("1","Trung Cấp"), ("2","Cao Đẳng"), ("3","Đại Học"), ("4","Sau Đại Học");
insert into bo_phan(ma_bo_phan, ten_bo_phan) values ("1","Sale-Marketting"), ("2","Hành Chính"), ("3","Dịch Vụ"), ("4","Quản Lí");
insert into nhan_vien(ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi, ma_vi_tri, ma_trinh_do, ma_bo_phan)
values ("Nguyễn Văn An", "1970-11-07","456231786", "10000000", "0123456789", "annguyen@gmail.com", "295 Nguyễn Tất Thành, Đà Nẵng", 1, 3, 1),
("Lê Văn Bình", "1997-04-09", "654231234", "7000000", "0984534758", "binhlv@gmail.com", "22 Yên Bái, Đà Nẵng", "1", "2", "2"),
("Hồ Thị Yến", "1995-12-12", "999231723", "14000000", "0456764542", "thiyen@gmail.com", "K234/11 Điện Biên Phủ, Gia Lai", "1", "3", "2"),
("Võ Công Toản", "1980-04-04", "123231365", "17000000", "0379853432", "toan0404@gmail.com", "77 Hoàng Diệu, Quảng Trị", "1", "4", "4"),
("Nguyễn Bỉnh Phát", "1999-12-09", "454363232", "6000000", "0902433454", "phatphat@gmail.com", "43 Yên Bái, Đà Nẵng", "2", "1", "1"),
("Khúc Nguyễn An Nghi", "2000-11-08", "964542311", "7000000", "0978650000", "annghi20@gmail.com", "294 Nguyễn Tất Thành, Đà Nẵng", "2", "2", "3"),
("Nguyễn Hữu Hà", "1993-01-01", "534323231", "8000000", "0941234553", "nhh0101@gmail.com", "4 Nguyễn Chí Thanh, Huế", "2", "3", "2"),
("Nguyễn Hà Đông", "1989-09-03", "234414123", "9000000", "0642123111", "donghanguyen@gmail.com", "11 Hùng Vương, Hà Nội", "2", "4", "4"),
("Tòng Hoang", "1982-09-03", "256781231", "6000000", "0245144444", "hoangtong@gmail.com", "213 Hàm Nghi, Đà Nẵng", "2", "4", "4"),
("Nguyễn Công Đạo", "1994-01-08", "755434343", "8000000", "0988767111", "nguỹenongdao12@gmail.com", "6 Hoà Khánh, Đồng Nai", "2", "3", "2");
insert into loai_khach(ma_loai_khach, ten_loai_khach) values ("1", "Diamond"), ("2", "Platinium"), ("3", "Gold"), ("4", "Silver"), ("5", "Member");
insert into khach_hang(ma_loai_khach, ho_ten, ngay_sinh, gioi_tinh, so_cmnd, so_dien_thoai, email, dia_chi)
values ("5","Nguyễn Thị Hào", "1970-11-07", b'0', "643431213", "0945459999", "thihao07@gmail.com", "23 Nguyễn Hoàng, Đà Nẵng"),
 ("3","Phạm Xuân Diệu", "1992-08-08", b'1', "865342123", "0954678909", "xuandieu92@gmail.com", "K77/22 Thái Phiên, Quảng Trị"),
 ("1","Trương Đình Nghệ", "1990-02-27", b'1', "488645199", "0373213122", "nghenhan2702@gmail.com", "K323/12 Ông Ích Khiêm, Vinh"),
 ("1","Dương Văn Quang", "1981-07-08", b'1', "543421111", "0490039241", "duongquan@gmail.com", "K452/12 Lê Lợi, Đà Nẵng"),
 ("4","Hoàng Trần Nhi Nhi", "1995-12-09", b'0', "795453345", "0312345678", "nhinhi123@gmail.com", "242 Lý Thái Tổ, Gia Lai"),
 ("4","Tôn Nữ Mộc Châu", "2005-12-06", b'0', "732434215", "0988888844", "tonnuchau@gmail.com", "37 Yên Thế, Đà Nẵng"),
 ("1","Nguyễn Mỹ Kim", "1984-04-08", b'0', "856453123", "0912345698", "kimcuong84@gmail.com", "K123/45 Lê Lợi, Hồ Chí Minh"),
 ("3","Nguyễn Thị Hào", "1999-04-08", b'0', "965656433", "0763212345", "haohao99@gmail.com", "55 Nguyễn Văn Linh, Kom Tum"),
 ("1","Trần Đại Danh", "1994-07-01", b'1', "432341235", "0643343433", "danhhai99@gmail.com", "24 Lý Thường Kiệt, Quảng Ngãi"),
 ("2","Nguyễn Tâm Đắc", "1989-07-01", b'1', "344343432", "0987654321", "dactam@gmail.com", "22 Ngô Quyền, Đà Nẵng");
insert into kieu_thue(ma_kieu_thue, ten_kieu_thue) values ("1", "year"), ("2", "month"), ("3", "day"), ("4", "hour");
insert into loai_dich_vu(ma_loai_dich_vu, ten_loai_dich_vu) values ("1", "Villa"), ("2", "House"), ("3", "Room");
insert into dich_vu(ten_dich_vu, dien_tich, chi_phi_thue, so_nguoi_toi_da, tieu_chuan_phong, mo_ta_tien_nghi_khac, dien_tich_ho_boi, so_tang, ma_loai_dich_vu, ma_kieu_thue)
values
("Villa Beach Front", 25000, 10000000, 10, "vip", "Có hồ bơi", 500, 4, 1, 3),
("House Princess 01", 14000, 5000000, 7, "vip", "Có thêm Bếp Nướng",null, 3, 2, 2),
("Room Twin 01", 5000, 1000000, 2, "normal", "Có TV",null, null, 3, 4),
("Villa Beach Front", 22000, 9000000, 8, "normal", "Có hồ bơi", 300, 3, 1, 3),
("House Princess 02", 10000, 4000000, 5, "normal", "Có thêm Bếp Nướng", null, 2, 2, 3),
("Room Twin 02", 3000, 900000, 2, "normal", "Có TV",null, null, 3, 4);
insert into dich_vu_di_kem(ten_dich_vu_di_kem, gia, don_vi, trang_thai) values
("Karaoke", "10000", "giờ", "tiện nghi, hiện đại"),
("Thuê xe máy", "10000", "Chiếc", "hỏng 1 xe"),
("Thuê xe đẹp", "20000", "Chiếc", "Tốt"),
("Buffer buổi sáng", "15000", "Suất", "đầy đủ đồ ăn, tráng miệng"),
("Buffer buổi trưa", "9000", "Suất", "đầy đủ đồ ăn, tráng miệng"),
("Buffer buổi tối", "16000", "Suất", "đầy đủ đồ ăn, tráng miệng");
insert into hop_dong(ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, ma_nhan_vien, ma_khach_hang, ma_dich_vu)
values
("2021-12-08", "2021-12-08", 0, 3, 1, 1),
("2021-07-14", "2021-07-21", 200000, 7, 3,2),
("2021-03-15", "2021-03-17", 50000, 3,4, 3),
("2021-01-14", "2021-01-18", 100000, 7, 5, 4),
("2021-07-14", "2021-07-15", 0, 7, 2, 5),
("2021-06-01", "2021-06-03", 0, 7, 7, 6),
("2021-09-02", "2021-09-05", 100000, 7, 4, 5),
("2021-06-17", "2021-06-18", 150000, 3, 4, 5),
("2020-11-19", "2020-11-19", 0, 3, 4, 6),
("2021-04-12", "2021-04-14", 0, 10, 3, 4),
("2021-04-25", "2021-04-25", 0, 2, 2, 1),
("2021-05-25", "2021-05-27", 0, 7,10, 2);
insert into hop_dong_chi_tiet(ma_dich_vu_di_kem, so_luong)
values
(4, 5),
(5, 8),
(6, 15),
(1, 1),
(2, 11),
(3, 1),
(2, 2),
(2, 2);
-- task 2
select * from nhan_vien where (ho_ten like 'H%' or ho_ten like'T%' or ho_ten like 'K%') and length(ho_ten) < 15;
-- task 3
select * from khach_hang where dia_chi in('Đà Nẵng','Quảng Nam') and (curdate() - ngay_sinh > (18*30*365) and curdate() - ngay_sinh < (50*30*365))
-- task 4

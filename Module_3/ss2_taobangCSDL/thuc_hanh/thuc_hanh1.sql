create database quan_ly_don_dat_hang;
use quan_ly_don_dat_hang;
create table don_vi_dat_hang(
ma_dv int auto_increment,
ten_dv varchar(55),
dia_chi varchar(55),
dien_thoai int,
primary key(ma_dv)
);
create table don_vi_khach_hang(
ma_dv_khach int auto_increment,
ten_dv_khach varchar(55),
dia_chi_khach varchar(55),
primary key(ma_dv_khach)
);
create table hang(
ma_hang int auto_increment,
ten_hang varchar(55),
dv_tinh int,
mo_ta_hang varchar(100),
primary key(ma_hang)
);
create table nguoi_dat(
ma_nguoi_dat int auto_increment,
ho_ten varchar(100),
primary key(ma_nguoi_dat)
);
create table noi_giao(
ma_dia_diem_giao int auto_increment,
ten_noi_giao varchar(100),
primary key(ma_dia_diem_giao)
);
create table nguoi_giao(
ma_nguoi_giao int auto_increment,
ho_ten_nguoi_giao varchar(100),
primary key(ma_nguoi_giao)
);

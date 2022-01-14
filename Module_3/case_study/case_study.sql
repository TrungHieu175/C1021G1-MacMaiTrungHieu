use case_study;
CREATE TABLE vi_tri(
ma_vi_tri INT NOT NULL auto_increment,
ten_vi_tri VARCHAR(45),
 PRIMARY KEY (ma_vi_tri)
);
CREATE TABLE trinh_do (
  ma_trinh_do INT NOT NULL auto_increment,
  ten_trinh_do VARCHAR(45),
  PRIMARY KEY (ma_trinh_do));
CREATE TABLE bo_phan (
  ma_bo_phan INT NOT NULL auto_increment,
  ten_bo_phan VARCHAR(45),
  PRIMARY KEY (ma_bo_phan));
CREATE TABLE nhan_vien (
  ma_nhan_vien INT NOT NULL AUTO_INCREMENT,
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
foreign key(ma_bo_phan) references classroom(ma_bo_phan)
);

use furama_module4;
-- drop database furama_module4;


insert into quyen
values
(1,'ROLE_ADMIN'),
(2,'ROLE_NHANVIEN'),
(3,'ROLE_DICHVU'),
(4,'ROLE_HOPDONG'),
(5,'ROLE_KHACHHANG');

INSERT INTO `furama_module4`.`tai_khoan` (`tai_khoan`, `ghi_chu`, `mat_khau`, `tinh_trang`) VALUES ('1', '1', '1', b'1');

insert into tai_khoan
values
('admin','active','$2a$12$BH/YFfwpDjQSKbFyepedKOcMEwsn8rEITDjahrHmbq52T912yp2ma',1),
('nhanvien','active','$2a$12$BH/YFfwpDjQSKbFyepedKOcMEwsn8rEITDjahrHmbq52T912yp2ma',1),
('khachhang','active','$2a$12$BH/YFfwpDjQSKbFyepedKOcMEwsn8rEITDjahrHmbq52T912yp2ma',1),
('dichvu','active','$2a$12$BH/YFfwpDjQSKbFyepedKOcMEwsn8rEITDjahrHmbq52T912yp2ma',1),
('hopdong','active','$2a$12$BH/YFfwpDjQSKbFyepedKOcMEwsn8rEITDjahrHmbq52T912yp2ma',1);


INSERT INTO `furama_module4`.`trinhdo` (`id_trinh_do`, `ten_trinh_do`) VALUES ('TD01', '12/12');
INSERT INTO `furama_module4`.`trinhdo` (`id_trinh_do`, `ten_trinh_do`) VALUES ('TD02', 'cấp 3');
INSERT INTO `furama_module4`.`trinhdo` (`id_trinh_do`, `ten_trinh_do`) VALUES ('TD03', 'đại học');
INSERT INTO `furama_module4`.`trinhdo` (`id_trinh_do`, `ten_trinh_do`) VALUES ('TD04', 'cao đẳng');
INSERT INTO `furama_module4`.`trinhdo` (`id_trinh_do`, `ten_trinh_do`) VALUES ('TD05', 'trung cấp');
INSERT INTO `furama_module4`.`trinhdo` (`id_trinh_do`, `ten_trinh_do`) VALUES ('TD06', 'thạc sĩ');

-- INSERT INTO `furama_module4`.`vai_tro` (`vaitro`, `ten_vaitro`) VALUES ('VT01', 'Nhân Viên');
-- INSERT INTO `furama_module4`.`vai_tro` (`vaitro`, `ten_vaitro`) VALUES ('VT02', 'Thực Tập');
-- INSERT INTO `furama_module4`.`vai_tro` (`vaitro`, `ten_vaitro`) VALUES ('VT03', 'Intern');
-- INSERT INTO `furama_module4`.`vai_tro` (`vaitro`, `ten_vaitro`) VALUES ('VT04', 'Pull Time');

INSERT INTO `furama_module4`.`kieuthue` (`idkieuthue`, `tenkieuthue`) VALUES ('K01', 'giờ');
INSERT INTO `furama_module4`.`kieuthue` (`idkieuthue`, `tenkieuthue`) VALUES ('K02', 'ngày');
INSERT INTO `furama_module4`.`kieuthue` (`idkieuthue`, `tenkieuthue`) VALUES ('K03', 'tháng');


INSERT INTO `furama_module4`.`vitri` (`vitri_id`, `ten_vi_tri`) VALUES ('VT01', 'quản lý');
INSERT INTO `furama_module4`.`vitri` (`vitri_id`, `ten_vi_tri`) VALUES ('VT02', 'nhân viên');
INSERT INTO `furama_module4`.`vitri` (`vitri_id`, `ten_vi_tri`) VALUES ('VT03', 'lễ tên');
INSERT INTO `furama_module4`.`vitri` (`vitri_id`, `ten_vi_tri`) VALUES ('VT04', 'giám đốc');



INSERT INTO `furama_module4`.`bophan` (`id_bo_phan`, `ten_bo_phan`) VALUES ('BP01', 'Giám Đốc');
INSERT INTO `furama_module4`.`bophan` (`id_bo_phan`, `ten_bo_phan`) VALUES ('BP02', 'Nhân Viên');
INSERT INTO `furama_module4`.`bophan` (`id_bo_phan`, `ten_bo_phan`) VALUES ('BP03', 'Lễ Tân');
INSERT INTO `furama_module4`.`bophan` (`id_bo_phan`, `ten_bo_phan`) VALUES ('BP04', 'Quản Lý');
INSERT INTO `furama_module4`.`bophan` (`id_bo_phan`, `ten_bo_phan`) VALUES ('BP05', 'Bảo Vệ');

INSERT INTO `furama_module4`.`nhanvien` (`idnhanvien`, `email`, `luong`, `ngaysinh`, `sdt`, `socmnd`, `tennhanvien`, `thanhpho`, `bophan_id`, `trinh_do_id`, `vitri_id`) VALUES ('NV01', 'nhu@gmail.com', '24597', '1999-02-01', '111111111', '22222222', 'Phạm Thị Quỳnh Như', 'Đà Nẵng', 'BP01', 'TD01', 'VT03');
INSERT INTO `furama_module4`.`nhanvien` (`idnhanvien`, `email`, `luong`, `ngaysinh`, `sdt`, `socmnd`, `tennhanvien`, `thanhpho`, `bophan_id`, `trinh_do_id`, `vitri_id`) VALUES ('NV02', 'quynh@gmail.com', '0341685', '1999-06-01', '111111111', '111111111', 'Phạm Như Quỳnh', 'Hà Nội', 'BP02', 'TD04', 'VT02');
INSERT INTO `furama_module4`.`nhanvien` (`idnhanvien`, `email`, `luong`, `ngaysinh`, `sdt`, `socmnd`, `tennhanvien`, `thanhpho`, `bophan_id`, `trinh_do_id`, `vitri_id`) VALUES ('NV03', 'trang@gmail.com', '407320857', '1998-02-01', '111111111', '111111111', 'Pạm Thị Trang', 'Quảng Ngãi', 'BP03', 'TD02', 'VT04');
INSERT INTO `furama_module4`.`nhanvien` (`idnhanvien`, `email`, `luong`, `ngaysinh`, `sdt`, `socmnd`, `tennhanvien`, `thanhpho`, `bophan_id`, `trinh_do_id`, `vitri_id`) VALUES ('NV04', 'ha@gmail.com', '23466752', '2000-02-01', '111111111', '111111111', 'Bùi Thị Hà', 'Thanh Hóa', 'BP02', 'TD03', 'VT01');

-- Dich Vụ

INSERT INTO `furama_module4`.`loaidv` (`idloai`, `ten`) VALUES ('LK01', 'Thành Viên');
INSERT INTO `furama_module4`.`loaidv` (`idloai`, `ten`) VALUES ('LK02', 'Bạc');
INSERT INTO `furama_module4`.`loaidv` (`idloai`, `ten`) VALUES ('LK03', 'Vàng');
INSERT INTO `furama_module4`.`loaidv` (`idloai`, `ten`) VALUES ('LK04', 'Kim Cương');
INSERT INTO `furama_module4`.`loaidv` (`idloai`, `ten`) VALUES ('LK05', 'Sắt');

INSERT INTO `furama_module4`.`loaikhach` (`id_loai_khach`, `ten_loai_khach`) VALUES ('LK01', 'Thành Viên');
INSERT INTO `furama_module4`.`loaikhach` (`id_loai_khach`, `ten_loai_khach`) VALUES ('LK02', 'Bạc');
INSERT INTO `furama_module4`.`loaikhach` (`id_loai_khach`,`ten_loai_khach`) VALUES ('LK03', 'Vàng');
INSERT INTO `furama_module4`.`loaikhach` (`id_loai_khach`, `ten_loai_khach`) VALUES ('LK04', 'Kim Cương');
INSERT INTO `furama_module4`.`loaikhach` (`id_loai_khach`, `ten_loai_khach`) VALUES ('LK05', 'Sắt');

INSERT INTO `furama_module4`.`khachhang` (`khach_hang_id`, `email`, `gioitinh`, `ngaysinh_khachhang`, `sdt`, `socmnd`, `ten_khachhang`, `thanhpho`, `id_loai_khach`) VALUES ('KH01', 'nhu@gmail.com', '1', '2000-08-02', '11111111', '11111111', 'Phạm Quỳnh Như', 'Thanh Hóa', 'LK04');
INSERT INTO `furama_module4`.`khachhang` (`khach_hang_id`, `email`, `gioitinh`, `ngaysinh_khachhang`, `sdt`, `socmnd`, `ten_khachhang`, `thanhpho`, `id_loai_khach`) VALUES('KH02', 'nga@gmail.com', '1', '2000-03-04', '2222222', '2222222', 'Nguyễn Thị Nga', 'Sầm Sơn', 'LK01');
INSERT INTO `furama_module4`.`khachhang` (`khach_hang_id`, `email`, `gioitinh`, `ngaysinh_khachhang`, `sdt`, `socmnd`, `ten_khachhang`, `thanhpho`, `id_loai_khach`) VALUES('KH03', 'huy@mail.com', '0', '1999-03-01', '333333', '333333', 'Trần Ngọc Huy', 'Quảng Nam', 'LK02');
INSERT INTO `furama_module4`.`khachhang` (`khach_hang_id`, `email`, `gioitinh`, `ngaysinh_khachhang`, `sdt`, `socmnd`, `ten_khachhang`, `thanhpho`, `id_loai_khach`) VALUES('KH04', 'tanh@gmail.com', '0', '1995-05-12', '444444', '444444', 'Phạm Văn Tánh', 'Đà Nẵng', 'LK03');
INSERT INTO `furama_module4`.`khachhang` (`khach_hang_id`, `email`, `gioitinh`, `ngaysinh_khachhang`, `sdt`, `socmnd`, `ten_khachhang`, `thanhpho`, `id_loai_khach`) VALUES ('KH05', 'oanh@gmail.com', '1', '1993-03-05', '555555', '55555', 'Lê Cảnh Kiều Oanh', 'Quảng Trị', 'Lk05');


INSERT INTO `furama_module4`.`dichvu` (`id_dich_vu`, `chiphi`, `dientich`, `songuoi`, `ten_dichvu`, `idkieuthue`, `idloai`) VALUES ('DV01', '300000000', '34', '3', 'Room', 'K02', 'LK01');
INSERT INTO `furama_module4`.`dichvu` (`id_dich_vu`, `chiphi`, `dientich`, `songuoi`, `ten_dichvu`, `idkieuthue`, `idloai`) VALUES ('DV02', '400000', '55', '4', 'House', 'K03', 'LK02');
INSERT INTO `furama_module4`.`dichvu` (`id_dich_vu`, `chiphi`, `dientich`, `songuoi`, `ten_dichvu`, `idkieuthue`, `idloai`) VALUES ('DV03', '40000', '33', '6', 'Villa', 'K01', 'LK03');

INSERT INTO `furama_module4`.`dichvudikem` (`iddvdi_kem`, `dongia`, `tendvdikem`, `tien`) VALUES ('DVDK01', 'chia', 'Nước', '9393939');
INSERT INTO `furama_module4`.`dichvudikem` (`iddvdi_kem`, `dongia`, `tendvdikem`, `tien`) VALUES ('DVDK02', 'lon', 'Bia', '45555');
INSERT INTO `furama_module4`.`dichvudikem` (`iddvdi_kem`, `dongia`, `tendvdikem`, `tien`) VALUES ('DVDK03', 'giờ', 'Karaoke', '30000');


INSERT INTO `furama_module4`.`hopdong` (`id_hop_dong`, `ngaybatdau`, `ngayketthuc`, `sotiendatcoc`, `tongsotienthanhtoan`, `id_dich_vu`, `khachhang_id`, `id_nhan_vien`) VALUES ('HD01', '2000/04/02', '2000/04/02', '35566', '35566', 'DV01', 'KH01', 'NV01');
INSERT INTO `furama_module4`.`hopdong` (`id_hop_dong`, `ngaybatdau`, `ngayketthuc`, `sotiendatcoc`, `tongsotienthanhtoan`, `id_dich_vu`, `khachhang_id`, `id_nhan_vien`) VALUES ('HD03', '2000/04/02', '2000/04/02', '3673', '5343467', 'DV02', 'KH03', 'NV02');
INSERT INTO `furama_module4`.`hopdong` (`id_hop_dong`, `ngaybatdau`, `ngayketthuc`, `sotiendatcoc`, `tongsotienthanhtoan`, `id_dich_vu`, `khachhang_id`, `id_nhan_vien`) VALUES ('HD02', '2000/04/02', '2000/04/02', '35566', '35566', 'DV03', 'KH02', 'NV03');
INSERT INTO `furama_module4`.`hopdong` (`id_hop_dong`, `ngaybatdau`, `ngayketthuc`, `sotiendatcoc`, `tongsotienthanhtoan`, `id_dich_vu`, `khachhang_id`, `id_nhan_vien`) VALUES ('HD04', '2000/04/02', '2000/04/02', '35566', '4567567', 'DV01', 'KH04', 'NV02');

 

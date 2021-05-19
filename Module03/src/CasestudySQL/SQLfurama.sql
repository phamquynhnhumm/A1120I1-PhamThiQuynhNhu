create database caseStudy;
use caseStudy;
--  drop database caseStudy;

create table trinhdo(
id_trinhdo nvarchar(5) not null primary key ,
ten_trinhdo nvarchar(250) not null
);

create table vitri(
id_vitri  nvarchar(5) not null primary key ,
ten_vitri nvarchar(250) not null
);
create table bophan(
id_bophan  nvarchar(5) not null primary key ,
ten_bophan nvarchar(250) not null
);
create table nhanvien(
id_nhanvien nvarchar(5) not null primary key ,
ten_nhanvien nvarchar(250) not null,
ngaysinh date not null,
socmnd int(9) not null,
email nvarchar(250) not null,
id_trinhdo  nvarchar(5) ,
foreign key(id_trinhdo) references trinhdo(id_trinhdo),
id_vitri  nvarchar(5) ,
foreign key(id_vitri) references vitri(id_vitri),
id_bophan  nvarchar(5) ,
foreign key(id_bophan) references bophan(id_bophan),
luong float 
);

create table kieuthue(
id_kieuthue  nvarchar(5) not null primary key ,
ten_kieuthue nvarchar(250) not null
);

create table dichvu(
id_dichvu  nvarchar(5) not null primary key ,
ten_dichvu  nvarchar(250) not null,
dientich float,
chiphi float,
songuoi  nvarchar(250) not null,
id_kieuthue nvarchar(5) not null ,
foreign key(id_kieuthue) references kieuthue(id_kieuthue)
);

create table house(
id_house nvarchar(5) not null primary key ,
tieuchuaphong  nvarchar(250) not null,
mota  nvarchar(250) not null,
sotang int,
id_dichvu nvarchar(5) not null ,
foreign key(id_dichvu) references dichvu(id_dichvu)
);



create table villa(
id_villa nvarchar(5) not null primary key ,
tieuchuaphong  nvarchar(250) not null,
mota  nvarchar(250) not null,
dientichhoboi float,
sotang int,
id_dichvu nvarchar(5) not null ,
foreign key(id_dichvu) references dichvu(id_dichvu)
);


create table  room(
id_room nvarchar(5) not null primary key ,
tendichvufreedikem  nvarchar(250) not null,
id_dichvu nvarchar(5) not null ,
foreign key(id_dichvu) references dichvu(id_dichvu)
);
create table dvdikem(
 id_dvdikem nvarchar(5) not null primary key ,
 ten_dvdikem  nvarchar(250) not null,
 dongia  nvarchar(250) not null,
 tien float
 );
   create table loaikhach( 
id_loaikhach  nvarchar(5) not null primary key ,
ten_loaikhach nvarchar(250) not null
   );
 
   create table diachi(
id_diachi  nvarchar(5) not null primary key ,
sonha nvarchar(250) not null,
xa  nvarchar(250) not null,
huyen nvarchar(250) not null,
tinh nvarchar(250) not null,
quocgia nvarchar(250) not null
   );
   
  create table khachhang(
  id_khachhang nvarchar(5) not null primary key ,
  ten_khachhang  nvarchar(250) not null,
  ngaysinh date,
  gioitinh  nvarchar(250) not null,
  socmnd int(9),
  sdt int(10),
  email  nvarchar(250) not null,
  id_loaikhach  nvarchar(5) not null,
   foreign key(id_loaikhach) references loaikhach(id_loaikhach),
  id_diachi  nvarchar(5) not null,
   foreign key(id_diachi) references diachi(id_diachi)
  );
 
 
  create table hopdong(
  id_hopdong nvarchar(5) not null primary key ,
  ngaybatau date,
   ngayketthuc date,
   sotendatcuoc float,
   tongsotienthanhtoan float,
   id_nhanvien nvarchar(5) not null,
   foreign key(id_nhanvien) references nhanvien(id_nhanvien),
   id_khachhang nvarchar(5) not null,
   foreign key(id_khachhang) references khachhang(id_khachhang),
   id_dichvu nvarchar(5) not null,
   foreign key(id_dichvu) references dichvu(id_dichvu)
  );
 create table hopdong_dvdikem(
 id_dvdikem  nvarchar(5) not null,
 id_hopdong  nvarchar(5) not null,
 soluong int ,
primary key (id_dvdikem, id_hopdong),
 foreign key( id_dvdikem) references dvdikem(id_dvdikem),
 foreign key( id_hopdong) references hopdong(id_hopdong)
 );


-- thực hiện yêu cầu 

-- 1 thêm mới thông tin các bảng
insert into trinhdo( id_trinhdo,ten_trinhdo ) value
('TD01','trung cấp'),
('TD02','cao đẳng'),
('TD03','đại học'),
('TD04','sau đại học');

 insert into vitri(id_vitri,ten_vitri) value
('VT01','lễ tân'),
('VT02','phục vụ'),
('VT03','chuyên viên'),
('VT04','giám sát'),
('VT05','quản lý'),
('VT06','giám đốc');

 insert into bophan(id_bophan,ten_bophan) value
 ('BP01','sale_marketing'),
 ('BP02','hành chính'),
 ('BP03','phục vụ'),
 ('BP04','quản lý');

insert into nhanvien(id_nhanvien,ten_nhanvien,ngaysinh,socmnd ,email,id_trinhdo,id_vitri,id_bophan,luong) value
('NV01','Phạm Thị Quỳnh Như','2000/09/28','123456789','quynhnhuctcn@gmail.com','TD03','VT05','BP04','50000000'),
('NV02','Trần Mỹ Hạnh','1989/04/08','111111111','tranhanh@gmail.com','TD04','VT03','BP02','24000000'),
('NV03','Nguyễn Trung Trọng','1999/12/03','222222222','trungtrong@gmail.com','TD03','VT02','BP03','14000000'),
('NV04','Trần Thanh phương','1979/01/24','33333333','phuongtran@gmail.com','TD04','VT06','BP04','60000000'),
('NV05','Doãn Mạnh Thắng','1998/04/15','444444444','manhthang@gmail.com','TD02','VT04','BP01','67000000');

insert into kieuthue(id_kieuthue,ten_kieuthue) value 
('KT01','năm'),
('KT02','thang'),
('KT03','ngay'),
('KT04','giờ');

insert into dichvu(id_dichvu,ten_dichvu,dientich,chiphi,songuoi,id_kieuthue) value
('DV01','Roomgio','300000','7000','4','KT04'),
('DV02','Roomngay','300000','10000000','4','KT03'),
('DV03','Roomthang','300000','290000000','4','KT02'),
('DV04','Roomyear','300000','100000000','4','KT01'),
('DV05','Housegio','4700000','20000000','20','KT04'),
('DV06','Housengay','4700000','400000000','20','KT03'),
('DV07','Housethang','4700000','700000000','20','KT02'),
('DV08','Housenam','4700000','10000000000','20','KT01'),
('DV09','Housegay','5000000','70000000','25','KT03'),
('DV10','Housethang','5000000','100000000','15','KT02'),
('DV11','Housenam','5000000','200000000','23','KT01'),
('DV12','Housegio','5000000','21540000','20','KT04');

insert into room(id_room,tendichvufreedikem,id_dichvu) value
('R01','nuoc','DV01'),
('R02','nuoc','DV03'),
('R03','sữa tắm','DV03'),
('R04','karaoke','DV02'),
('R05','trái cây','DV04');

insert into house(id_house,tieuchuaphong,mota,sotang,id_dichvu) value
('H01','vip','có điều hòa, máy giặt, bồn tắm',10,'DV08'),
('H02','trung bình','co dieu hoa may giat',7,'DV07'),
('H03','thương gia','có điều hòa, máy lạnh, bồn tắm, tủ lạnh',8,'DV06'),
('H04','bình dan','có máy lạnh',5,'DV05');

insert into villa (id_villa,tieuchuaphong ,mota,dientichhoboi,sotang,id_dichvu) value
('V01','vip','có điều hòa, máy giặt, bồn tắm','3460',10,'DV12'),
('V02','trung bình','co dieu hoa may giat',7,'50000','DV11'),
('V03','thương gia','có điều hòa, máy lạnh, bồn tắm, tủ lạnh','5000',8,'DV10'),
('V04','bình dan','có máy lạnh','560',5,'DV09');

   insert into dvdikem( id_dvdikem, ten_dvdikem, dongia,tien) value
   ('DK01','massage','giờ','500000'),
   ('DK02','karaoke','giờ','60000'),
   ('DK03','thức ăn','dĩa','100000'),
   ('DK04','nước uống','chai','30000'),
   ('DK05','thuê xe','gio','120000');
   
    insert into loaikhach(id_loaikhach,ten_loaikhach) value
    ('LK01','Diamond'),
	('LK02','Platinnium'),
	('LK03','Gold'),
	('LK04','Silver'),
	('LK05','Member');
    
  insert into diachi(id_diachi,sonha,xa,huyen,tinh,quocgia) value
  ('DC01','kiệt 98 NGuyễn lương bằng','Hòa khánh  Bắc','Liên Chiểu','Đà Nẵng','Việt Nam'),
  ('DC02','08 hà văn tính','Hòa khánh Nam','Liên Chiểu','Đà Nẵng','Việt Nam'),
  ('DC03','Thổ 2',' Bình Đào','Thăng Bình','Quảng Nam','Việt Nam'),
  ('DC04','Chò tráng','Cao Ngọc','Ngọc Lặc','Thanh Hóa','Việt Nam'),
  ('DC05','kiệt 9 Trà Lương','Trà Đỏa','Gia Lâm','Hà Nội','Việt Nam');

insert into khachhang( id_khachhang,ten_khachhang,ngaysinh,gioitinh,socmnd,sdt,email,id_loaikhach, id_diachi) value
('KH01','Phạm Thùy Linh','2004/08/15','nu','999999999','1234554321','thuylinh123@gmail.com','LK03','DC04'),
('KH02','Phạm Thị Như Quỳnh','1997/08/15','nu','888888888','0987667867','nhuquynh@gmail.com','LK02','DC05'),
('KH03','Nguyễn Thị Nga','2000/06/02','nu','55555555','1111111111','nguyennga13@gmail.com','LK04','DC02'),
('KH04','Trần Ngọc Huy','2000/10/14','nam','876923401','0358693432','truongduc910@gmail.com','LK01','DC03'),
('KH05','Phạm Văn Tánh','1999/08/05','nam','345345549','1233212321','tanhpham@gmail.com','LK05','DC01'),
('KH06','Trần Ngọc Huy','2000/10/14','nam','876923401','0358693432','truongduc910@gmail.com','LK01','DC03'),
('KH08','Trần Yến Nhi','2003/10/14','nam','876923401','0322293432','yennhi@gmail.com','LK01','DC03');
   
  insert into hopdong( id_hopdong, ngaybatau,  ngayketthuc, sotendatcuoc,tongsotienthanhtoan ,  id_nhanvien, id_khachhang ,  id_dichvu) value
  ('HD01','2020/12/10','2020/12/10','3000000','30000000','NV02','KH01','DV01'),
  ('HD02','2021/02/10','2021/2/25','10000000','50000000','NV03','KH02','DV02'),
  ('HD03','2021/04/10','2021/6/10','4000000','60000000','NV05','KH04','DV07'),
  ('HD04','2020/12/10','2021/12/10','30000000','900000000','NV05','KH03','DV08'),
  ('HD05','2021/03/12','2021/4/12','4500000','450000000','NV04','KH05','DV10'),
  ('HD06','2021/03/12','2021/4/12','4500000','450000000','NV04','KH06','DV10'),
  ('HD08','2021/05/17','2021/06/12','45060000','450000000','NV04','KH08','DV10');
 insert into hopdong_dvdikem( id_dvdikem , id_hopdong,soluong) value
 ('DK02','HD01','4'),
 ('DK01','HD02','6'),
 ('DK02','HD03','3'),
 ('DK03','HD04','6'),
 ('DK05','HD05','9'),
 ('DK04','HD05','5'),
 ('DK05','HD04','4'),
 ('DK02','HD04','3');
 
 -- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K”
 -- và có tối đa 15 ký tự.
 select * from nhanvien
  where  (ten_nhanvien like 'H%' or  ten_nhanvien like  't%' or  ten_nhanvien like 'k%') and length(ten_nhanvien) <=15; 

-- - 3. khachhangHiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
 select * from khachhang 
 left join diachi on khachhang.id_diachi = diachi.id_diachi
 where  (year(now()) - year(ngaysinh) >=18 AND year(now()) - year(ngaysinh) <=40) AND (  tinh = 'Đà Nẵng' OR tinh='Quảng Trị'); 
--  
 --   4. Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
 -- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
 -- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
 
select  ten_khachhang ,hopdong.id_hopdong , count(*) as solanhopdong from (hopdong 
inner join khachhang on khachhang.id_khachhang = hopdong.id_khachhang)
 inner join loaikhach on  loaikhach.id_loaikhach = khachhang.id_loaikhach 
where ten_loaikhach = 'diamond' 
group by ten_khachhang 
 order by solanhopdong;   -- mạc định tăng dần,  DESC giảm dần
 
 --  5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong,
 -- TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien (Với TongTien được tính theo 
 -- công thức như sau: ChidvdikemdichvuPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
 -- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
 
select khachhang.id_khachhang, ten_khachhang, ten_loaikhach,hopdong.id_hopdong,ten_dichvu,ngaybatau,ngayketthuc, (dichvu.chiphi + dvdikem.tien *   hopdong_dvdikem.soluong) as tongtien from ((((khachhang
inner join hopdong on khachhang.id_khachhang = hopdong.id_khachhang)
inner join  loaikhach on  loaikhach.id_loaikhach = khachhang.id_loaikhach )
inner join dichvu on dichvu.id_dichvu = hopdong.id_dichvu)
inner join hopdong_dvdikem on hopdong_dvdikem.id_hopdong = hopdong.id_hopdong)
inner join dvdikem  on dvdikem.id_dvdikem = hopdong_dvdikem.id_dvdikem ;

-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng 
-- được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).

select * from 


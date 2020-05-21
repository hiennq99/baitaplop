use master
go
drop database QuanLyTour
go
create database QuanLyTour
go
use QuanLyTour
go

--tạo bảng


create table USERS
(
	IDuser char(4) PRIMARY KEY,
	HoTen varchar(30) not null,
	SoDT varchar(10),
	Email varchar(30),
	DiaChi varchar(30),
	SoNguoi int
)
GO

create table QUOCGIA
(
	MaQG char(4) PRIMARY KEY,
	TenQG varchar(20)
)
GO

create table DIADIEM
(
	MaDD char(4) PRIMARY KEY,
	TenDD varchar(20),
	MaQG char(4),
	CONSTRAINT fk_DIADIEM_MAQG FOREIGN KEY (MaQG) REFERENCES QUOCGIA(MaQG)
)
GO

create table TOUR
(
	MaTour char(10) PRIMARY KEY,
	TenTour varchar(30),
	NgayKH date,
	ThoiLuong int,
	NoiKH char(4),
	NoiDen char(4),
	Gia char(15),
	CONSTRAINT fk_TOUR_KH FOREIGN KEY (NoiKH) REFERENCES DIADIEM(MaDD),
	CONSTRAINT fk_TOUR_DD FOREIGN KEY (NoiDen) REFERENCES DIADIEM(MaDD)

)
go
create table VE
(
	IDve char(4) PRIMARY KEY,
	IDuser char(4),
	MaTour char(10),
	TenVe varchar(30),
	CONSTRAINT fk_VE_IDuser FOREIGN KEY(IDuser) REFERENCES USERS(IDuser),
	CONSTRAINT fk_VE_MaTour FOREIGN KEY(MaTour) REFERENCES TOUR(MaTour)
)

-- INSERT DU LIEU

insert into QUOCGIA values ('QG01','Trong nước'), ('QG02','Nước ngoài');

insert into DIADIEM values ('DD01','Ha Noi','QG01'),
('DD02','Ho Chi Minh City','QG01'),
('DD03','Da Lat','QG01'),
('DD04','Ha Long Bay','QG01'),
('DD05','Phu Quoc','QG01'),
('DD06','Dubai','QG02'),
('DD07','New York','QG02'),
('DD08','Paris','QG02'),
('DD09','Venice','QG02'),
('DD10','Rio de Janero','QG02')


insert into USERS values ('ID01','Nguyen Van A','072139123','nva@gmail.com','Ha Noi',5),
('ID02','Tran Thi B','123702183','ttb@gmail.com','Hai Phong',6),
('ID03','Ngo Van C','123215123','nvc@gmail.com','Quang Ninh',4),
('ID04','Le Thu D','125125123','ltd@gmail.com','Lao Cai',7);


insert into TOUR values ('T01','Du lich HCM City','2006-06-05',7,'DD01','DD07','9000000'),
('T02','Tham quan Vinh Ha Long','2020-10-06',4,'DD02','DD04','123000'),
('T03','Du lich Brazil','2020-12-11',12,'DD05','DD10','4500000'),
('T04','Dao ngoc Phu Quoc','2019-11-09',14,'DD03','DD05','871000'),
('T05','Make America Stupid','2021-06-15',8,'DD02','DD07','1250000'),
('T06','Paris trang le','2020-12-11',7,'DD01','DD08','1750000'),
('T07','Mua xuan Arab','2022-06-15',6,'DD02','DD06','7500000'),
('T08','Nuoc Y hao hoa','2021-07-17',8,'DD05','DD09','2250000'),
('T09','Thang Long 1000','2021-06-15',8,'DD02','DD01','1050000'),
('T10','Da Lat tuoi dep','2020-09-07',7,'DD02','DD03','900000'),
('T11','Welcome to Vietnam','2020-11-23',12,'DD08','DD01','3250000'),
('T12','Tham quan Burj Khalifa','2019-12-12',9,'DD01','DD06','7250000'),
('T13','Nam My Sampa','2020-02-02',10,'DD01','DD10','5250000'),
('T14','Nu than New York','2020-10-10',8,'DD01','DD07','8250000'),
('T15','Make America Stupid','2021-06-15',8,'DD03','DD07','2250000'),
('T16','Tham quan Burj Khalifa','2019-12-12',8,'DD03','DD06','6250000'),
('T17','Nuoc Y hao hoa','2021-07-17',8,'DD01','DD09','6250000'),
('T18','Tham quan Vinh Ha Long','2020-10-06',4,'DD01','DD04','93000'),
('T19','Dao ngoc Phu Quoc','2019-11-10',8,'DD01','DD05','671000');

INSERT INTO VE values ('VE01','ID01','T05','Ve di My'),
('VE02','ID03','T04','Ve di Phu Quoc'),
('VE03','ID02','T05','Ve di My'),
('VE04','ID04','T03','Ve di Nam My');

select TOUR.MaTour, TenTour, NgayKH, NoiKH
from TOUR inner join DIADIEM on TOUR.NoiKH=DIADIEM.MaDD


create function fn_Thongke(@noikh char(4), @noiden char(4))
returns @bang table(matour char(4), tentour varchar(20), ngaykh datetime, thoiluong int, noikhoih char(4), noidend char(4), gia char(15))
as
begin
	insert into @bang
	select * from TOUR
	where NoiKH=@noikh and NoiDen=@noiden	
	return
end

select * from fn_Thongke('DD02','DD06')

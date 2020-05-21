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



insert into TOUR values ('TO1','Du lich HCM City','2006-06-05',7,'DD01','DD07','9000000'),
('T02','Tham quan Vinh Ha Long','2020-10-06',4,'DD02','DD04','123000'),
('T03','Du lich Brazil','2020-12-11',12,'DD05','DD10','4500000'),
('T04','Dao ngoc Phu Quoc','2019-11-09',14,'DD03','DD05','871000'),
('T05','Make America Stupid','2021-06-15',8,'DD02','DD07','1250000');


INSERT INTO VE values ('VE01','ID01','T05','Ve di My'),
('VE02','ID03','T04','Ve di Phu Quoc'),
('VE03','ID02','T05','Ve di My'),
('VE04','ID04','T03','Ve di Nam My');

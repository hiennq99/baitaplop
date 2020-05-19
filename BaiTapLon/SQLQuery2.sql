create database BaiTapLon

create table roles(
	id int not null primary key,
	title varchar(30) not null
)

create table CabinTypes(
	id int not null primary key,
	name varchar(30) not null
)

create table Countries(
	id int not null primary key,
	name varchar(30) not null
)

create table Aircratts(
	id int not null primary key,
	name varchar(30) not null,
	makemodel varchar(30) not null,
	totalseats varchar(30) not null,
	economyseats varchar(30) not null,
	businessseats varchar(30) not null

)

create table Users(
	id int not null primary key,
	roleid int not null,
	officeid int not null,
	email varchar(255) not null,
	password varchar(255) not null,
	firstname nvarchar(20) not null,
	lastname nvarchar(20) not null,
	birthday date not null,
	active binary not null,
)

create table Offices(
	id int not null primary key,
	countryID int not null,
	Title varchar(50) not null,
	Phone int not null,
	Contacts varchar(255) not null,
	constraint FK foreign key(countryID) references Countries(id) on update cascade on delete cascade
)

create table Airports(
	id int not null primary key,
	countryID int not null,
	lataCoode varchar(10),
	name varchar(50) not null,
	constraint FK1 foreign key(countryID) references Countries(id) on update cascade on delete cascade
)

create table Routes(
	id int not null primary key,
	DepartureAirportID int not null,
	ArrivalAirportID int not null,
	Distance int not null,
	FlightTime int not null,
	constraint FK2 foreign key(DepartureAirportID) references Airports(id) on update cascade on delete cascade,
	constraint FK3 foreign key(ArrivalAirportID) references Airports(id)
)

create table Schedules(
	id int not null primary key,
	date date not null,
	time time not null,
	AircraftID int not null,
	RouteID int not null,
	FlightNumber int not null,
	EconomyPrice int not null,
	Confirmed int not null,
	constraint FK4 foreign key(AircraftID) references Aircratts(id) on update cascade on delete cascade,
	constraint FK5 foreign key(RouteID) references Routes(id) on update cascade on delete cascade,
)

create table Tickets(
	id int not null primary key,
	userID int not null,
	SchedduleID int not null,
	CabinTypeID int not null,
	FirstName varchar(15) not null,
	LastName varchar(15) not null,
	Email varchar(30) not null,
	Phone int not null,
	PassportNumber int not null,
	PassportCountryID int not null,
	BookingReference varchar(30) not null,
	Confirmed int not null,
	constraint FK6 foreign key(userID) references Users(id) on update cascade on delete cascade,
	constraint FK7 foreign key(SchedduleID) references Schedules(id) on update cascade on delete cascade,
	constraint FK8 foreign key(CabinTypeID) references CabinTypes(id) on update cascade on delete cascade,
	constraint FK9 foreign key(PassportCountryID) references Countries(id)
)

select * from Routes
create view From_1
as
	select Routes.id , Routes.DepartureAirportID, Airports.name as 'adFrom' from Routes inner join Airports on Airports.id = Routes.DepartureAirportID

go

create view To_1
as
	select Routes.id , Routes.ArrivalAirportID, Airports.name as 'adTo' from Routes inner join Airports on Airports.id = Routes.ArrivalAirportID

go
[ID]
      ,[Date]
      ,[Time]
      ,[AircraftID]
      ,[RouteID]
      ,[FlightNumber]
      ,[EconomyPrice]

drop view outbound
go
create view outbound
as
	select ID , EconomyPrice,Date,Time,AircraftID,RouteID,FlightNumber from Schedules

go

select * from From_1
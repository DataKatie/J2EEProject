
create database waringHouse;
use waringHouse;
create table Booking (ReservationId bigint primary key auto_increment,
GuestId bigint not null,
NoAdults int,
NoChildren int,
NoRooms int not null,
Promotion varchar(30),
CheckIn date not null,
CheckOut date not null,
hotelId int(5),
roomId int(5),
roomType varchar(20),
PricePerNight double,
PriceTotal double,
DinnerReservations varchar(50),
SpecialRequests varchar(300)
 );
 

 
 CREATE TABLE Hotels(
    HotelID        INT(5)        NOT NULL   AUTO_INCREMENT,
    HotelName    varchar(50)    NOT NULL,
    TotalRooms    INT(5)        NOT NULL,
    Standard     INT(3)         NOT NULL,
    Deluxe        INT(3)        NOT NULL,
    Superior    INT(3)        NOT NULL,
    Premium        INT(3)        NOT NULL,
    SuiteHot    INT(3)        NOT NULL,
    Vineyard    INT(3)        NOT NULL,
    primary key(HotelID)
);

CREATE TABLE `user` (
   `user_id` int(11) NOT NULL AUTO_INCREMENT,
   `last_name` varchar(100) NOT NULL,
   `first_name` varchar(100) NOT NULL,
   `address` varchar(200) NOT NULL,
   `city` varchar(100) NOT NULL,
   `country` varchar(100) NOT NULL,
   `postal` varchar(50) NOT NULL,
   `phone_number` varchar(45) NOT NULL,
   `email_address` varchar(70) NOT NULL,
   `pin` varchar(45) DEFAULT NULL,
   `credit_card_type` varchar(45) NOT NULL,
   `credit_card_number` varchar(45) NOT NULL,
   `cvv_code` varchar(45) NOT NULL,
   `exp_month` int(11) NOT NULL,
   `exp_year` int(11) NOT NULL,
   `offers_notification` bit(1) DEFAULT b'0',
   `date_created` datetime NOT NULL DEFAULT Current_Timestamp(),
   PRIMARY KEY (`user_id`),
   UNIQUE KEY `user_id_UNIQUE` (`user_id`)
 ) ;
 select * from booking;
 select * from user;

select reservationId, guestId, NoAdults, NoChildren, NoRooms, Promotion, CheckIn, CheckOut, hotelId, roomId, RoomType, PricePerNight, PriceTotal, DinnerReservations from booking join user on (GuestId = user_id) where reservationId = 2 and credit_card_number = 23893289329329 and credit_card_type="American Express";

CREATE TABLE Rooms(
    ID            INT(5)        NOT NULL   AUTO_INCREMENT,
    HotelID        INT(5)        NOT NULL REFERENCES Hotels(HotelID),
    RoomType    varchar(50)    NOT NULL,
    Price        DECIMAL(5,2)NOT NULL,
    Description varchar(200),
	Image varchar(50),
    primary key(ID)
);

create table admin(
admin_id bigint auto_increment primary key,
login varchar(20),
password varchar(20),
date_created date
);

select * from booking;

alter table booking add foreign key (RoomId) references rooms(id);
alter table booking add foreign key (hotelId) references hotels(hotelId);


select * from booking;
select * from user;
select * from hotels;
insert into user VALUES (1, "Sullivan", "Katie", "2559 Lakeshore Blvd W", "Etobicoke", "Canada", "M8V1E5", "647-233-6056", "katie.m.sullivan@gmail.com", "1234", "Mastercard", "13456000950452", "911", "09", "20", 0, NOW());
insert into rooms (HotelId, RoomType, Price, Description, Image) VALUES (1, 1, 240, "Standard room.", "standard.jpg");

select ReservationId from booking where guestId = 9 and CheckIn = 2016-12-01 and CheckOut = 2016-12-01;

alter table rooms add roomName varchar(50);

insert into hotels values (1234, "WaringInn", 15, 5, 4, 3, 2, 1, 1);

select user_id, last_name, first_name, address, city, country, postal, phone_number, email_address, pin, credit_card_type, credit_card_number, cvv_code, exp_month, exp_year,offers_notification from user where pin = 5432 and email_address = "nom@NOM.com";

select reservationId, guestId, NoAdults, NoChildren, NoRooms, Promotion, CheckIn, CheckOut, hotelId, roomId, RoomType, PricePerNight, PriceTotal from booking join user on (GuestId = user_id) where reservationId = 2 and credit_card_number =  23893289329329;
                    
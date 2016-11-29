create database waringHouse;
use waringHouse;
create table Booking (ReservationId bigint primary key,
GuestId bigint not null,
HotelId bigint not null,
NoAdults int,
NoChildren int,
NoRooms int not null,
Promotion varchar(30),
CheckIn date not null,
CheckOut date not null,
roomTypeId bigint,
PricePerNight double,
PriceTotal double,
DinnerReservations varchar(50),
SpecialRequests varchar(300)
 );
 
 select * from booking;
 
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
   `date_created` datetime NOT NULL,
   PRIMARY KEY (`user_id`),
   UNIQUE KEY `user_id_UNIQUE` (`user_id`)
 ) ;
 
 alter table user modify column date_created datetime NOT NULL DEFAULT CURRENT_TIMESTAMP();
 

CREATE TABLE Rooms(
    ID            INT(5)        NOT NULL   AUTO_INCREMENT,
    HotelID        INT(5)        NOT NULL REFERENCES Hotels(HotelID),
    RoomType    varchar(50)    NOT NULL,
    Price        DECIMAL(5,2)NOT NULL,
    primary key(ID)
);

create table admin(
admin_id bigint auto_increment primary key,
login varchar(20),
password varchar(20),
date_created date
);

select * from booking;

alter TABLE Rooms add column Description varchar(200);
alter TABLE Rooms add column Image varchar(50);

select * from booking;
alter table booking modify roomTypeId int(5);
alter table booking modify hotelId int(5);

alter table booking add foreign key (RoomTypeID) references rooms(id);
alter table booking add foreign key (hotelId) references hotels(hotelId);


insert into booking (GuestId, hotelId, NoAdults, NoChildren, NoRooms, Promotion, CheckIn, CheckOut, roomTypeId, PriceTotal, SpecialRequests) values (-5415875016310049440,1234,2,0,1,null,3916-12-27,3916-12-29,0,0.0,"");

select * from hotels;
select * from user;
insert into user VALUES (1, "Sullivan", "Katie", "2559 Lakeshore Blvd W", "Etobicoke", "Canada", "M8V1E5", "647-233-6056", "katie.m.sullivan@gmail.com", "1234", "Mastercard", "13456000950452", "911", "09", "20", 0, NOW());
insert into rooms (HotelId, RoomType, Price, Description, Image) VALUES (1, 1, 240, "Standard room.", "standard.jpg");

alter table booking modify column CheckIn datetime not null;
alter table booking modify column CheckOut datetime not null;
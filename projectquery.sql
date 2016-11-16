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
RoomType varchar(100),
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
   `date_created` datetime NOT NULL,
   PRIMARY KEY (`user_id`),
   UNIQUE KEY `user_id_UNIQUE` (`user_id`)
 ) ;

CREATE TABLE Rooms(
    ID            INT(5)        NOT NULL   AUTO_INCREMENT,
    HotelID        INT(5)        NOT NULL REFERENCES Hotels(HotelID),
    RoomType    varchar(50)    NOT NULL,
    Price        DECIMAL(5,2)NOT NULL,
    primary key(ID)
);

select * from booking;
alter table booking modify roomTypeId int(5);
alter table booking modify hotelId int(5);

alter table booking add foreign key (RoomTypeID) references rooms(id);
alter table booking add foreign key (hotelId) references hotels(hotelId);
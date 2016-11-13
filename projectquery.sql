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
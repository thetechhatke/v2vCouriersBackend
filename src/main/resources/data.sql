create table User
(
	id integer auto_increment not null,
	name varchar(255) not null,
	user_type varchar(50) not null,
	location varchar(255) not null,
	birth_date timestamp,
	email varchar(255),
	primary key(id)
);

create table Parcel
(
	parcel_id integer not null,
	parcel_src varchar(1000) not null,
	parcel_dest varchar(1000) not null,
	parcel_cost integer not null,
	parcel_refund boolean,
	primary key(parcel_id)
);


INSERT INTO USER
( NAME ,USER_TYPE ,LOCATION ,BIRTH_DATE ,EMAIL)
VALUES('User1', 'Customer Officer', 'Pune', '2038-01-19 03:14:07','abc@test.com') ;

INSERT INTO USER
( NAME ,USER_TYPE ,LOCATION ,BIRTH_DATE ,EMAIL)
VALUES('User2', 'Customer Officer', 'Pune', '2038-01-19 03:14:07','abc2@test.com') ;

INSERT INTO USER
( NAME ,USER_TYPE ,LOCATION ,BIRTH_DATE ,EMAIL)
VALUES('User3', 'Customer Officer', 'Pune', '2038-01-19 03:14:07','abc3@test.com') ;
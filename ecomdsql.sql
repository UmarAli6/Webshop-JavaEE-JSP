create database if not exists ecomdb;
use ecomdb;

create table if not exists t_product(
pId	int not null auto_increment,
name varchar(100) not null,
price varchar(100) not null,
stock int not null,
primary key(pId)
);

create table if not exists t_user(
uId int not null auto_increment,
username varchar(100) not null,
password varchar(100) not null,
primary key (uId)
);

create table if not exists t_cart(
uId int not null,
pId int not null,
primary key(uId, pId),
foreign key(uId) references t_user(uId),
foreign key(pId) references t_product(pId)
);

insert into t_product (name, price, stock) values
('iPhone 13 Pro', 13000, 3),
('iPhone 13 Pro Max', 15000, 10),
('OnePlus 8T', 10000, 44),
('Samsung Galaxy Fold 3', 22000, 78),
('Samsung Galaxy Z Flip 3', 20000, 36),
('LG G6', 3000, 5);

insert into t_user (username, password) values
('muali01', '1234'),
('rabisu', '1234');

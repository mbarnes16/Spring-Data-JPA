create table Shirt(
     shirt_id int primary key,
     name varchar(200) not null,
     price int not null,
     quantity_in_stock int not null default 10,
     image_file_name varchar(200)
);
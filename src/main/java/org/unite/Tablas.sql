create table cliente(
id_cliente integer primary key auto_increment,
nombre varchar(100),
email varchar(100),
a_paterno varchar (100)
);

create table tarjeta(
id_tarjeta integer primary key auto_increment,
id_cliente integer,
nombre_tarjeta varchar (100),
saldo float,
num_tarjeta integer,
foreign key(id_cliente) references cliente(id_cliente) 
);

create table reservacion(
id_reservacion integer primary key auto_increment,
id_cliente integer,
id_tarjeta integer,
ciudad_destino varchar(100),
nom_hotel varchar(100),
num_personas integer,
foreign key (id_cliente) references cliente(id_cliente),
foreign key (id_tarjeta) references tarjeta(id_tarjeta)
);

select * from reservacion; 
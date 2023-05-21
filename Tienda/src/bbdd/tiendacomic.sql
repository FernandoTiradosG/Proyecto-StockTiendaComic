create database if not exists tiendacomic;

create table if not exists tiendacomic.stock (
ID int primary key not null auto_increment,
Nombre varchar(50) not null,
Heroe varchar(50),
Autores varchar (200),
Editorial varchar (50),
Precio double not null,
Cantidad int);

insert into tiendacomic.stock (Nombre, Heroe, Autores, Editorial, Precio, Cantidad)
values ('Marvel Must-Have Civil War', 'Varios', 'Steve McNiven, Mark Millar', 'Panini comics', 18.00, 5),
('Marvel Must-Have Born Again', 'Daredevil', 'Frank Miller, David Mazzucchelli', 'Panini comics', 20.00, 3),
('Marvel Must-Have Soldado de invierno', 'Capitan America', 'Ed Brubaker, Steven Epting', 'Panini comics', 15.00, 2),
('Marvel Must-Have El Juramento', 'Doctor Extraño', 'Brian K.Vaughn, Marcos Martin', 'Panini comics', 18.00, 3),
('Marvel Must-Have Dinastia de M', 'Patrulla-X', 'Brian Michael Bendis, Olivier Coipel', 'Panini comics', 18.00, 1),
('Bleach: Bestseller 1', 'Bleach', 'Tite Kubo', 'Panini comics', 1.95, 5),
('Bleach: Bestseller 2', 'Bleach', 'Tite Kubo', 'Panini comics', 6.00, 5),
('Bleach: Bestseller 3', 'Bleach', 'Tite Kubo', 'Panini comics', 6.00, 5),
('Bleach: Bestseller 4', 'Bleach', 'Tite Kubo', 'Panini comics', 6.00, 5),
('Maximum Berserk 1', 'Berserk', 'Kentaro Miura', 'Panini comics', 16.95, 3),
('Maximum Berserk 2', 'Berserk', 'Kentaro Miura', 'Panini comics', 16.95, 4),
('Maximum Berserk 3', 'Berserk', 'Kentaro Miura', 'Panini comics', 16.95, 1),
('Batman en Benidorm', 'Batman', 'Paco Roca', 'ECC', 15.00, 3),
('El hombre mas rapido del mundo', 'Flash', 'Kenny Porter', 'ECC', 17.95, 4),
('La era espacial', 'Superman', 'Mark Russell', 'ECC', 28.00, 2),
('Crisis en tierras infinitas', 'Varios', 'Marv Wolfman', 'ECC', 37.50, 3),
('El regreso del Caballero Oscuro', 'Batman', 'Frank Miller', 'ECC', 23.00, 1);

Select * from tiendacomic.stock;

insert into tiendacomic.stock (Nombre, Heroe, Autores, Editorial, Precio, Cantidad)
values ('Los huesos de los gigantes n27', 'Hellboy', 'Mike Mignola', 'Norma', 25.00, 5);

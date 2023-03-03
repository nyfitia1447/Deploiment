create database deploiment;

\c deploiment;

create table personne
(
    id serial not null primary key,
    nom varchar(30)
);

insert into personne(nom) values
('Ny Fitia'),
('Benja'),
('Mohini Dey');
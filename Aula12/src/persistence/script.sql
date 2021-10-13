drop database if exists bancoteste;
create database bancoteste;
use bancoteste;

create table cliente(codigo int primary key auto_increment,
nome varchar(60) not null,
telefone varchar(10),
email varchar(35) unique);

insert into cliente values(null,'Carolina','2498806798','carol@gmail.com');
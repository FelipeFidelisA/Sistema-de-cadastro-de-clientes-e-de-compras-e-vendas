create database cadastrocliente;

create table cliente
 id int auto_increment, 
 nome varchar (45),
 telefone varchar (12),
 email varchar (45),
 cpf varchar (11);

create table produto;
 id int auto_increment, 
 nome varchar (45),
 preço double;
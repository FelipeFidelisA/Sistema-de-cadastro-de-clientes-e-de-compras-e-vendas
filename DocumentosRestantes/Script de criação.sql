create database cadastroCliente;

use cadastroCliente;

create table cliente(
    id int primary key auto_increment, 
    nome varchar(45) not null,
    telefone varchar(12) not null,
    email varchar(45) not null,
    cpf varchar(11) not null);

create table produto(
    id int primary key auto_increment, 
    nome varchar(45) not null,
    descricao varchar(100) not null, 
    preco double not null);

create table venda(
    id int primary key auto_increment,
    data date not null,
    valor_total int not null);

CREATE TABLE compra(
    cliente_id int not null,
    venda_id int not null);

CREATE TABLE transacao(
    vendas_id int not null,
    produto_id int not null);

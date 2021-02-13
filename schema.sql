CREATE DATABASE IF NOT EXISTS plaform;
USE plaform;

create table IF NOT EXISTS cliente (
        id bigint not null auto_increment,
         cpf varchar(255) not null,
         data_nascimento date,
         idade integer not null,
         nome varchar(255) not null,
         endereco varchar(255) not null,
         primary key (id)
     ) engine=InnoDB;
  
     
     create table IF NOT EXISTS perfil (
        id bigint not null auto_increment,
         nome varchar(255),
         primary key (id)
     ) engine=InnoDB;
  
     
     create table IF NOT EXISTS usuario (
        id bigint not null auto_increment,
         email varchar(255) not null,
         nome varchar(255),
         senha varchar(255) not null,
         primary key (id)
     ) engine=InnoDB;
  
     
     create table IF NOT EXISTS usuario_perfis (
        usuario_id bigint not null,
         perfis_id bigint not null
     ) engine=InnoDB;
  


insert into cliente(nome,cpf,data_nascimento,idade,endereco) values('Jose maria', '12245608900','2019-11-05',0, R. dos Coelhos, 300 );
insert into cliente(nome,cpf,data_nascimento,idade,endereco) values('Jose', '11345678900','2019-11-05',0, R. Francisco Alves, 326);
insert into cliente(nome,cpf,data_nascimento,idade,endereco) values('Jose', '00000000000','2019-11-05',0, Av. Conselheiro Aguiar, 2775);
insert into cliente(nome,cpf,data_nascimento,idade,endereco) values('Felipe Leitao', '12345678900','2019-11-05',0, Rua Dr. João Guilherme Pontes Sobrinho, 245);
insert into usuario(nome,email,senha) values('Felipe Leitao','fleitao@com','$2a$10$OVAMbJHd0FpycZ2hPKVQbuPXoAITb4jBM46br8FURDYfgRUJYnMSa');

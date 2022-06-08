create database banco_portaria;

use banco_portaria;

create table tb_porteiro (
	id_porteiro int auto_increment,
    nome_porteiro varchar(45) not null,
    senha_porteiro varchar(45) not null,
    dia_servico_porteiro smallint not null default 1,
    
    primary key (id_porteiro)
);

create table tb_prestador(
	id_prestador int auto_increment,
    cpf_prestador bigint(11) not null unique,
    nome_prestador varchar(50) not null,
    contato_prestador varchar(30),
    
    primary key (id_prestador, cpf_prestador)
);

create table tb_residente (
	id_residente int auto_increment,
    id_casa int not null,
    cpf_residente bigint(11) unique,
    nome_residente varchar(50),
    contato_residente varchar(50),
    
    primary key(id_residente)
);

create table tb_servico(
	id_servico int auto_increment,
    id_prestador_servico int not null,
    id_contratante_servico int not null,
    tipo_servico varchar(100),
    data_agendada_servico date,
    data_realizada_servico date,
    
    primary key (id_servico, id_prestador_servico, id_contratante_servico),
    constraint fk_id_prestador foreign key (id_prestador_servico)
		references tb_prestador(id_prestador),
	constraint fk_id_contratante foreign key (id_contratante_servico)
		references tb_residente(id_residente)
);

create table tb_correspondencia (
	id_correspondencia int auto_increment,
    id_destinatario_correspondencia int not null,
    tipo_correspondencia varchar(50),
    nome_entregador_correspondencia varchar(50),
    cpf_entregador_correspondencia bigint(11),
    
    primary key (id_correspondencia,id_destinatario_correspondencia),
    constraint fk_id_destinatario foreign key (id_destinatario_correspondencia)
		references tb_residente(id_residente)
);

create table tb_agenda(
	id_agenda int auto_increment,
    compromisso_agenda varchar(200),
    
    primary key (id_agenda)
);

create table tb_admin (
	id_admin int auto_increment,
    cpf_admin bigint(11) not null unique,
    nome_admin varchar(50) not null,
    senha_admin varchar(50) not null,
    
    primary key (id_admin, cpf_admin)
);
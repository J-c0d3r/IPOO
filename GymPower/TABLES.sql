drop database if exists GymPower;
create database GymPower;

use GymPower;

create table Aluno(
	matricula int auto_increment primary key,
    nome varchar(50),
    dataNasc date,
    idade int,
    endereco varchar(100),
    mensalidade float,
    telefone varchar(20),
    parceiroMatricula int,
    
    constraint fk_alunos 
		foreign key (parceiroMatricula) 
		references aluno(matricula)
        on update cascade
        on delete set null
);

create table Atendente(
	matricula varchar(15) primary key,
    nome varchar(50),
    salario float,
    idade int,
    dataNasc date,
    telefone varchar(20),
    endereco varchar(100),
    email varchar(100)
);

create table Professor(
	matricula varchar(15) primary key,
    nome varchar(50),
    salario float,
    idade int,
    dataNasc date,
    telefone varchar(20),
    endereco varchar(100),
    email varchar(100),
    qtdAulas int
);

create table Aula(
	codigo varchar(10) primary key,
    periodos int,
    horaInicio time,
    numAlunos int,
    maxAlunos int,
    vagas int,
    sala varchar(20),
    diaSemana varchar(15),
    tipoAula varchar(20) not null,
    
    numParedesEspelhadas int,
    numBarras int,
    tamPiscina varchar(20),
    tipoKungFu varchar(20),
    
    professorMatricula varchar(15),
    
    constraint fk_professor_aula
		foreign key(professorMatricula)
        references Professor(matricula)
        on update cascade
        on delete set null
        
);

create table AlunoAula(
	idAlunoAula int not null auto_increment primary key,
	alunoMatricula int not null,
    aulaCodigo varchar(10) not null,
    constraint fk_Aluno_AulnoAula
		foreign key (alunoMatricula)
        references Aluno(matricula)
        on update cascade
        on delete cascade,
	
    constraint fk_Aula_AlunoAula
		foreign key (aulaCodigo)
        references Aula(codigo)
        on update cascade
        on delete cascade
);
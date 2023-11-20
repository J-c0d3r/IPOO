use GymPower;

insert into Aluno(nome, dataNasc, endereco, telefone) values 
('Zé', STR_TO_DATE("03-04-00","%d-%m-%y"), 'Rua couve verde', '(35) 99999999'),
('Marcelinho', STR_TO_DATE("03-04-99","%d-%m-%y"), 'Rua maçã vermelha', '(35) 888888888'),
('Rosa', STR_TO_DATE("03-04-02","%d-%m-%y"), 'Rua abacaxi amarelo', '(35) 777777777'),
('Fabiola', STR_TO_DATE("03-04-01","%d-%m-%y"), 'Rua arroz branco', '(35) 666666666');

insert into Professor(matricula, nome, dataNasc, telefone, endereco, email) values 
("P-0806212246", "Jorge Marcelo", STR_TO_DATE("03-04-86","%d-%m-%y"), "(35) 222223333", "Rua Coelhinho", "Jm@fit.com"),
("P-0706212246", "Ricardo Leite", STR_TO_DATE("03-04-94","%d-%m-%y"), "(35) 553323333", "Rua Raposinha", "Rl@fit.com"),
("P-0606212246", "Luisa Alves", STR_TO_DATE("03-04-97","%d-%m-%y"), "(35) 456223333", "Rua Lobinho", "La@fit.com"),
("P-0506212246", "Pedro Prego", STR_TO_DATE("03-04-89","%d-%m-%y"), "(35) 222438233", "Rua Pandinha", "Pp@fit.com");

insert into Atendente(matricula, nome, dataNasc, telefone, endereco, email) values 
("A-0806212246", "Fabinho", STR_TO_DATE("03-04-85","%d-%m-%y"), "(35) 229998333", "Rua Guaxinim", "Fab@fit.com"),
("A-0706212246", "Souza", STR_TO_DATE("03-04-05","%d-%m-%y"), "(35) 524113333", "Rua Iguana", "Sz@fit.com");

-- Aula de natação
insert into Aula(codigo, periodos, horaInicio, maxAlunos, sala, diaSemana, tipoAula, tamPiscina) values
("N-001", '1', '13:30', '10', 'P-01', 'Terça-feira', 'Natação', 'Olímpica'),
("N-002", '1', '13:30', '10', 'P-01', 'Quinta-feira', 'Natação', 'Semi Olímpica');

-- Aula de Bale
insert into Aula(codigo, periodos, horaInicio, maxAlunos, sala, diaSemana, tipoAula, numParedesEspelhadas, numBarras) values
("B-003", '1', '08:00', '15', 'S-02', 'Segunda-feira', 'Bale', '2','5'),
("B-004", '1', '10:00', '15', 'S-02', 'Quarta-feira', 'Bale', '2','5');

-- Aula de Musculação
insert into Aula(codigo, periodos, horaInicio, maxAlunos, sala, diaSemana, tipoAula) values
("M-005", '1', '09:30', '15', 'S-03', 'Segunda-feira', 'Musculação'),
("M-006", '1', '11:30', '15', 'S-03', 'Sexta-feira', 'Musculação');

-- Aula de KungFu
insert into Aula(codigo, periodos, horaInicio, maxAlunos, sala, diaSemana, tipoAula, tipoKungFu) values
("K-007", '1', '13:50', '15', 'S-02', 'Quarta-feira', 'Kung Fu','Sanda'),
("K-008", '1', '13:00', '15', 'S-02', 'Quinta-feira', 'Kung Fu','Shaolin');

-- Cadastrando professores nas aulas
update Aula as a set professorMatricula = "P-0806212246" where a.codigo = 'K-007' or a.codigo = 'K-008';
update Aula as a set professorMatricula = "P-0706212246" where a.codigo = 'M-006' or a.codigo = 'M-005';
update Aula as a set professorMatricula = "P-0606212246" where a.codigo = 'B-004' or a.codigo = 'B-003';
update Aula as a set professorMatricula = "P-0506212246" where a.codigo = 'N-001' or a.codigo = 'N-002';

-- Cadastrando Alunos nas aulas
insert into AlunoAula(alunoMatricula, aulaCodigo) values
("1","M-005"), ("2","K-007"),
("3","N-001"), ("4","M-006"),
("4","N-001"), ("3","K-007"),
("2","K-008"), ("1","B-003");

-- Buscando informações do aluno 1
select al.nome, au.codigo, au.horaInicio, au.diaSemana, au.sala, p.nome from Aluno as al
inner join AlunoAula as aa on al.matricula = aa.alunoMatricula
inner join Aula as au on aa.aulaCodigo = au.codigo
inner join Professor as p on au.professorMatricula = p.matricula 
and al.matricula = '1';
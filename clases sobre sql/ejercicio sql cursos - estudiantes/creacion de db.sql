create database if not exists instituto;
use instituto;

create table if not exists estudiantes (
id_estudiante int auto_increment,
nombre varchar(45) not null,
apellido varchar(45) not null,
primary key (id_estudiante)
);

create table if not exists notas (
nota decimal(2,1),
estudiantes_id_estudiante int not null,
primary key (nota, estudiantes_id_estudiante),
foreign key (estudiantes_id_estudiante)
	references instituto.estudiantes(id_estudiante)
);

create table if not exists profesores (
id_profesor int not null auto_increment,
nombre VARCHAR(45) not null,
apellido VARCHAR(45) not null,
notas_nota DECIMAL(2,1),
notas_estudiantes_id_estudiante int not null,
primary key (id_profesor, notas_nota, notas_estudiantes_id_estudiante),
foreign key (notas_nota)
	references instituto.notas(nota),
foreign key (notas_estudiantes_id_estudiante)
	references instituto.notas(estudiantes_id_estudiante)
);

create table if not exists cursos (
id_curso int auto_increment,
nombre varchar(45) not null,
clases int not null,
notas_nota decimal(2,1),
notas_estudiantes_id_estudiante int not null,
profesores_id_profesor int not null,
profesores_notas_nota decimal(2,1),
profesores_notas_estudiantes_id_estudiante int not null, 
primary key (id_curso, notas_nota, notas_estudiantes_id_estudiante),
foreign key (notas_nota, notas_estudiantes_id_estudiante)
	references instituto.notas (nota, estudiantes_id_estudiante),
foreign key (profesores_id_profesor, profesores_notas_nota, profesores_notas_estudiantes_id_estudiante)
	references instituto.profesores (id_profesor, notas_nota, notas_estudiantes_id_estudiante)
);

create table if not exists estudiantes_cursos (
estudiantes_id_estudiante int not null,
cursos_id_curso int not null,
primary key (estudiantes_id_estudiante, cursos_id_curso),
foreign key (estudiantes_id_estudiante)
	references instituto.estudiantes (id_estudiante),
foreign key (cursos_id_curso)
	references instituto.cursos (id_curso)
);
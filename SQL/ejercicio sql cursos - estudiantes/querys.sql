#-estudiantes

insert into estudiantes(nombre,apellido) values
("federico","ara"),
("juan","gomez"),
("marcelo","nuñes"),
("florencia","diorio"),
("micaela","perez"),
("roberto","diaz"),
("john","johnson");


#-cursos

insert into cursos(nombre,clases) values
("javascript","22"),
("html","7"),
("css","8"),
("python","30"),
("java","40");


#-profesores

insert into profesores(nombre,apellido, cursos_id_curso) values
("marcelo","none",'1'),
("francisco","lam",'2'),
("luciano","sert",'3'),
("ricardo","cervio",'4'),
("juan","gom",'5');


#-estudiantes_cursos

insert into estudiantes_cursos(estudiantes_id_estudiante,cursos_id_curso) values
("1","1"),
("2","1"),
("3","2"),
("4","3"),
("5","4"),
("6","5"),
("7","5");


#-notas

insert into notas(nota,estudiantes_id_estudiante,cursos_id_curso) values
("7","1","1"),
("8","2","1"),
("2","3","2"),
("8","4","3"),
("9","5","4"),
("4","6","5"),
("5","7","5");


#-alumnos a los que profesor les da clase

select 
concat(e.nombre, ' ', e.apellido) as 'estudiante', 
concat(p.nombre,' ',p.apellido) as 'profesor',
c.nombre as "curso"
from estudiantes e
inner join estudiantes_cursos ec on e.id_estudiante = ec.estudiantes_id_estudiante
inner join profesores p on ec.cursos_id_curso = p.cursos_id_curso
inner join cursos c on c.id_curso = p.cursos_id_curso
where p.nombre="marcelo" and p.apellido="none";


#- Total de cursos que imparte el profesor

select 
concat(p.nombre,' ',p.apellido) as 'profesor', 
count(*) as "Cantidad cursos"
from cursos c
inner join profesores p on c.profesores_id_profesor = p.id_profesor
group by profesores_id_profesor;

 
#- Total de cursos que realiza el alumno

select 
concat(e.nombre,' ',e.apellido) as 'alumno', 
count(*) as "Cantidad cursos"
from estudiantes e
inner join estudiantes_cursos ec on ec.estudiantes_id_estudiante = e.id_estudiante
group by e.id_estudiante;
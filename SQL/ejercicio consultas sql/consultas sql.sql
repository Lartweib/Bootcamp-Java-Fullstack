#Ejercicio consultas SQL

#ejercicio 2
select * from departments;

#ejercicio 3
select first_name, last_name, phone_number from employees;

#ejercicio 4
select first_name as Nombre, last_name as apellido , phone_number as numero_movil from employees;

#ejercicio 5
select * from employees where phone_number = "515.127.4565";
DELETE from office_db.employees where phone_number = "515.127.4565";
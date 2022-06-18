show variables where variable_name='autocommit';
set autocommit= off;

select * from office_db.departments;

#iniciamos una transaccion 
start transaction;
insert into office_db.departments(department_name,location_id) values
("prueba","100");

#volvemos al estado previo de la transaccion con rollback
rollback;
#confirmamos permanentemente y anulando un futuro rollback con commit
commit;

select * from departments
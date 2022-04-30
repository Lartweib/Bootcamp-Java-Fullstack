#Ejercicio insert
insert into salesman(name,city,commission) values
("federico","barcelona","100"),
("juan","madrid","300"),
("matias","abrera","150"),
("florencia","barcelona","120"),
("franco","valencia","100");
select * from salesman;

insert into customer(cust_name,city,grade) values
("mercadona","madrid","1"),
("consum","barcelona","3"),
("fnac","abrera","1"),
("dia","barcelona","2"),
("gamestop","valencia","4");
select * from customer;

insert into orders(purch_amt,ord_date,salesman_salesman_id,customer_customer_id) values
("124","2022-01-11","1","1"),
("45","2022-02-10","3","3"),
("46","2022-03-09","5","3"),
("205","2022-01-25","2","5"),
("189","2022-02-17","4","4");
select * from orders;

#Ejercicio count
select count(*) as 'total reg en order' from orders;

#Ejercicio mostrar no repetidos
select distinct cust_name from customer ;

#Ejercicio ordenar por ventas
SELECT s.name as 'nombre del vendedor',SUM(purch_amt) AS 'Imp de ventas totales', count(purch_amt) as 'cantidad de ventas'
FROM orders o
inner join salesman s
on s.salesman_id = o.salesman_salesman_id
GROUP BY salesman_salesman_id 
Order by SUM(purch_amt) desc;
#order by count(purch_amt) desc;

#Ejercicio mostrar customers
select * from customer order by customer_id asc limit 5;

#Ejercicio registros min max
select * from orders order by purch_amt asc limit 1; #minimo
select * from orders order by purch_amt desc limit 1; #maximo
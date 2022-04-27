#Ejercicio 1
select postalZip, region, country, phone from mytable;

#Ejercicio 2
select * from mytable where phone like "(811)%";

#Ejercicio 3
select * from mytable where country = "italy" or country = "spain";

#Ejercicio 4
select count(*) as "Cantidad de registros" from mytable;

#Ejercicio 5
select id, country, region, postalZip from mytable where id in (select id from mytable where country = "germany" or country = "turkey");

#Ejercicio 6
select max(id), min(id) from mytable;

#Ejercicio 7
select count(*) as "Total", country as "Pais" from mytable group by country;

#Ejercicio 8
select * from mytable order by postalZip limit 10;

#Ejercicio 9
select * from mytable where country = "singapore";
delete from mytable where country = "singapore";

#Ejercicio 10
update mytable set country="España" where country = "spain";

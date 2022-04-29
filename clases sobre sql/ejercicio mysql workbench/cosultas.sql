insert into mydb_workbench.country(country,last_update) values
("argentina",CURRENT_TIMESTAMP),("españa",CURRENT_TIMESTAMP),("brasil",CURRENT_TIMESTAMP);

insert into mydb_workbench.address(address,last_update,city_id) values
("asldkjas 123",CURRENT_TIMESTAMP,1),("werwerwer 33",CURRENT_TIMESTAMP,2),("nmeieii 334",CURRENT_TIMESTAMP,3);

insert into mydb_workbench.city(city,last_update,country_id) values
("buenos aires",CURRENT_TIMESTAMP,1),("barcelona",CURRENT_TIMESTAMP,2),("rio",CURRENT_TIMESTAMP,3);

select * from address 
inner join city on address.city_id = city.city_id
inner join country on city.country_id = country.country_id


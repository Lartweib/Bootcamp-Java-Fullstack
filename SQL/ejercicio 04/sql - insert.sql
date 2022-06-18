USE discography_db;
CREATE table if not exists Genre (
idGenre INT primary key not null auto_increment,
Genre Varchar(255));
CREATE table if not exists Album (
idAlbum INT primary key not null auto_increment,
albumName varchar(255),
dateReleased datetime);
CREATE table if not exists Artist (
artistId INT primary key not null auto_increment,
artistName varchar(255));

insert into discography_db.genre(genre) values
("rock"),("regaeton"),("clasico"),("blues"),("cumbia");

insert into discography_db.artist(artistName) values
("papo"),("daddy yankee"),("mozart"),("memphis blues"),("mala fama");

insert into discography_db.album(albumName, dateReleased) values
("papo1","1998-01-01"),("daddy yankee","1998-01-01"),("mozart","1998-01-01"),("memphis blues","1998-01-01"),("mala fama","1998-01-01");
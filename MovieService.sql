CREATE DATABASE IF NOT EXISTS jaz_db;
USE jaz_db;

DROP TABLE IF EXISTS movie;
CREATE TABLE movie
(
    id       bigint         NOT NULL AUTO_INCREMENT,
    name     VARCHAR(30) NOT NULL,
    category VARCHAR(20) NOT NULL,
    rating int,
    PRIMARY KEY (id)
);

INSERT INTO movie(name, category)
VALUES ('Sesja lato 2k21', 'Horror'),
       ('Love', 'SciFi'),
       ('Zdany JAZ', 'Fantasy');
       
       
SELECT * FROM movie;
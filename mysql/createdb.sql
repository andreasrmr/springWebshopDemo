DROP DATABASE IF EXISTS webshopdb;
CREATE DATABASE webshopdb;
USE webshopdb;

CREATE TABLE Items (
  itemId int(10) NOT NULL AUTO_INCREMENT, 
  itemName  varchar(25) NOT NULL, 
  itemDescription varchar(50) NOT NULL,
  PRIMARY KEY (itemId));
  
  SELECT * FROM Items;

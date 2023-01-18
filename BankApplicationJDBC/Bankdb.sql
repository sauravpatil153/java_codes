CREATE DATABASE BankDb;
USE BankDb;

CREATE TABLE Accounts(
accountNo INT PRIMARY KEY,
accholdername VARCHAR(20),
acctype VARCHAR(20),
address VARCHAR(20),
balance DECIMAL(9,2)
 );
 
 INSERT INTO Accounts VALUES(101,"Saurav","Demat","Kalyan",200000),(102,"Chinmay","Savings","Yavatmal",100000),
 (103,"Runesh","Current","Ratnagiri",120000),(104,"Mbappe","Savings","Kolhapur",80000);
 
 
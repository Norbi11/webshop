CREATE SCHEMA AUTHORIZATION APP;

SET SCHEMA APP;

CREATE TABLE USERS(
				uid INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) PRIMARY KEY, 
				username varchar(60),
				ufirstname varchar(60), 
				ulastname varchar(60), 
				upassword varchar(60)
				);
					
CREATE TABLE PRODUCTS(
				pid INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) PRIMARY KEY, 
				pname varchar(60) NOT NULL, 
				pprice double, pweight int, 
				pdescription varchar(500)
				);
				
CREATE TABLE STOCK(
				sid INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) PRIMARY KEY, 
				pid int NOT NULL REFERENCES PRODUCTS(pid), 
				pamount int NOT NULL, 
				pshippingprice double,
				pshippingtime int
				);
				
CREATE TABLE ORDERS(
				oid INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) PRIMARY KEY, 
				uid int NOT NULL REFERENCES USERS(uid)
				);
				
CREATE TABLE ORDERITEMS(
				iid INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) PRIMARY KEY,
				oid int NOT NULL REFERENCES ORDERS(oid), 
				pid int NOT NULL REFERENCES PRODUCTS(pid), 
				pamount int NOT NULL
				);

INSERT INTO USERS (username, ufirstname, ulastname, upassword) VALUES ('petergriffin','peter','griffin','familyguy');
INSERT INTO PRODUCTS (pname,pprice,pweight,pdescription) VALUES ('Xiaomi A1', 199.99,153,'Xiaomi smartphone. Good value for price.');
INSERT INTO STOCK (pid,pamount,pshippingprice,pshippingtime) VALUES (1,4,12.85,2);
INSERT INTO ORDERS (uid) VALUES (1);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (1,1,2);


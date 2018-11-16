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

INSERT INTO USERS (username, ufirstname, ulastname, upassword) VALUES ('petergriffin','Peter','Griffin','familyguy');
INSERT INTO USERS (username, ufirstname, ulastname, upassword) VALUES ('ericcartman','Eric','Cartman','southpark');
INSERT INTO USERS (username, ufirstname, ulastname, upassword) VALUES ('ijones','Indiana','Jones','holygrail');
INSERT INTO USERS (username, ufirstname, ulastname, upassword) VALUES ('luke','Luke','Skywalker','jedi');
INSERT INTO USERS (username, ufirstname, ulastname, upassword) VALUES ('brucewayne','Bruce','Wayne','batman');
INSERT INTO USERS (username, ufirstname, ulastname, upassword) VALUES ('homersimpson','Homer','Simpson','simpsons');

INSERT INTO PRODUCTS (pname,pprice,pweight,pdescription) VALUES ('Xiaomi A1', 199.99, 153,'Xiaomi smartphone. Good value for price.');
INSERT INTO PRODUCTS (pname,pprice,pweight,pdescription) VALUES ('Lenovo P20', 99.99, 200,'Lenovo smartphone. Older, but good battery.');
INSERT INTO PRODUCTS (pname,pprice,pweight,pdescription) VALUES ('Philips microwave', 69.95, 1500,'A microwave.');
INSERT INTO PRODUCTS (pname,pprice,pweight,pdescription) VALUES ('Braun electric razor', 154.95, 300,'An electric razor with spinning blades.');
INSERT INTO PRODUCTS (pname,pprice,pweight,pdescription) VALUES ('LG smart TV', 259.99, 1400,'A LED smart TV with vivid colors.');
INSERT INTO PRODUCTS (pname,pprice,pweight,pdescription) VALUES ('Nespresso Essenza', 79.95, 630,'A capsule-based coffe maker.');

INSERT INTO STOCK (pid,pamount,pshippingprice,pshippingtime) VALUES (1,4,12.85,2);
INSERT INTO STOCK (pid,pamount,pshippingprice,pshippingtime) VALUES (2,2,15.85,3);
INSERT INTO STOCK (pid,pamount,pshippingprice,pshippingtime) VALUES (3,10,12.15,2);
INSERT INTO STOCK (pid,pamount,pshippingprice,pshippingtime) VALUES (4,20,8.75,1);
INSERT INTO STOCK (pid,pamount,pshippingprice,pshippingtime) VALUES (5,5,19.75,5);
INSERT INTO STOCK (pid,pamount,pshippingprice,pshippingtime) VALUES (6,14,14.55,4);

INSERT INTO ORDERS (uid) VALUES (1);
INSERT INTO ORDERS (uid) VALUES (1);
INSERT INTO ORDERS (uid) VALUES (3);
INSERT INTO ORDERS (uid) VALUES (2);
INSERT INTO ORDERS (uid) VALUES (4);
INSERT INTO ORDERS (uid) VALUES (3);
INSERT INTO ORDERS (uid) VALUES (5);
INSERT INTO ORDERS (uid) VALUES (5);
INSERT INTO ORDERS (uid) VALUES (6);
INSERT INTO ORDERS (uid) VALUES (1);

INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (1,1,2);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (1,2,1);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (1,5,1);

INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (2,3,1);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (2,6,1);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (2,4,2);

INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (3,1,1);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (3,5,2);

INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (4,6,1);

INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (5,1,1);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (5,2,1);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (5,3,1);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (5,4,1);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (5,5,1);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (5,6,1);

INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (6,2,6);

INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (7,3,1);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (7,4,1);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (7,2,1);

INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (8,5,2);

INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (9,1,1);
INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (9,2,1);

INSERT INTO ORDERITEMS (oid,pid,pamount) VALUES (10,1,4);


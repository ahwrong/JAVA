CREATE TABLE Customer (
	cid			BIGINT			PRIMARY KEY	AUTO_INCREMENT,
	name		VARCHAR(10)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 1001;

SELECT * FROM Customer;

INSERT INTO Customer (name, ssn);
VALUES ('James Bond', '900101-1234567');

UPDATE Customer SET name='James Bond', ssn='900101-1234567' WHERE cid=1001;
CREATE TABLE Account(
	aid					BIGINT			PRIMARY KEY AUTO_INCREMENT,
	accType				CHAR(1)			NOT NULL	DEFAULT 'S',
	balance				DOUBLE			NOT NULL	DEFAULT 0.0,
	interestRate		DOUBLE			NOT NULL	DEFAULT 0.0, 
	overdraftAmount		DOUBLE			NOT NULL	DEFAULT 0.0,
	customerId			BIGINT			NOT NULL,
	regDate				TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT	Account_customerId_FK FOREIGN KEY (customerId) REFERENCES Customer(cid)
)AUTO_INCREMENT = 3001;

SELECT * FROM Account;

INSERT INTO Account (accType, interestRate, overdraftAmount, customerId);
VALUES ('C', 2000.0, 0.03, 0.0, '1001');

UPDATE Customer SET name='Jason Bourne' WHERE cid=1002;

DELETE FROM Customer WHERE cid 1002;
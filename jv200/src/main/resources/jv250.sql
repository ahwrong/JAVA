DROP TABLE Sample10;
CREATE TABLE Sample10 (
	no		 	INT(11)			DEFAULT NULL,
	name		VARCHAR(20) 	DEFAULT NULL,
	birthday 	DATE			DEFAULT NULL,
	address 	VARCHAR(40) 	DEFAULT NULL
);

SELECT * FROM Sample10;

INSERT INTO Sample10 VALUES (1, '����', '1996-10-25', '�뱸 �߱� �ݿ���');
INSERT INTO Sample10 VALUES (2, '����', '1999-09-09', '�뱸 �߱� �߾ӿ�');
INSERT INTO Sample10 VALUES (3, '���', '1995-06-13', '�뱸 �߱� ����');

CREATE TABLE Customer (
	cid			BIGINT			PRIMARY KEY	AUTO_INCREMENT,
	name		VARCHAR(20)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL,
	phone		VARCHAR(14)		NOT NULL,
	customerId	VARCHAR(16)		NOT NULL,
	passwd		VARCHAR(16)		NOT NULL,
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 1001;

ALTER TABLE Customer CHANGE customerId userId VARCHAR(16) NOT NULL;

SELECT * FROM Customer;
INSERT INTO Customer (name, ssn, phone, customerId, passwd) 
VALUES ('����', '901213-1234567', '010-2323-2323', 'java', '1111');

INSERT INTO Customer (name, ssn, phone, customerId, passwd)
VALUES ('����', '901213-1234567', '010-2323-2323', 'java', '1111');

INSERT INTO Customer (name, ssn, phone, customerId, passwd)
VALUES ('���', '901213-1234567', '010-2323-2323', 'java', '1111');

UPDATE Customer SET ssn='901010-1234567', phone='010-3434-4444' WHERE cid=1001;

DELETE FROM Customer WHERE cid between 1007 and 1024;

DROP TABLE Account;
CREATE TABLE Account(
	aid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	accountNum		VARCHAR(11)		NOT NULL,			-- 111-11-1111
	balance			DOUBLE			NOT NULL	DEFAULT 0.0,
	interestRate	DOUBLE			NOT NULL	DEFAULT 0.0, 
	overdraft		DOUBLE			NOT NULL	DEFAULT 0.0,
	accountType		CHAR(1)			NOT NULL	DEFAULT 'S',
	customerId		BIGINT			NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT	Account_customerId_FK FOREIGN KEY (customerId) REFERENCES Customer(cid)
)AUTO_INCREMENT = 3001;

SELECT * FROM Account;

ALTER TABLE Customer CHANGE customerId userId VARCHAR(16) NOT NULL;

INSERT INTO Account (accountNum, balance, interestRate, overdraft, accountType, customerId)
VALUES ('111-33-2222', 1000.0, 0.03, 0.0, 'S', 1025);

-- inner join
SELECT * FROM Account, Customer 
WHERE Account.customerId = Customer.cid AND Customer.ssn = '901010-1234567' ;

SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid;

SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid 
WHERE c.ssn = '901010-1234567' ; 


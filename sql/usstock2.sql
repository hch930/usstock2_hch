DROP TABLE MEMBER;

CREATE TABLE MEMBER(
	ID VARCHAR2(10) PRIMARY KEY,
	NAME VARCHAR2(10),
	PASSWORD VARCHAR2(100),
	EMAIL VARCHAR2(50),
	ENABLED BOOLEAN,
	REGDATE TIMESTAMP DEFAULT NOW(),
	UPDATEDATE TIMESTAMP DEFAULT NOW()
);

https://u2ful.tistory.com/32?category=872126
https://suhyeokeee.tistory.com/94
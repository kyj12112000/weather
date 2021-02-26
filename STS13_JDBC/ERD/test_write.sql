
/* Drop Tables */

DROP TABLE test_write CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE test_write
(
	wr_uid int NOT NULL,
	wr_subject varchar2(200),
	wr_content varchar2(200),
	wr_name varchar2(20),
	wr_viewcnt int,
	we_regdate date,
	PRIMARY KEY (wr_uid)
);

SELECT * FROM TEST_WRITE tw ;

CREATE SEQUENCE 




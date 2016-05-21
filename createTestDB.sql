DROP DATABASE IF EXISTS test;

CREATE DATABASE test DEFAULT CHARACTER SET 'utf8';

USE test;

create table User
(
	id int(8) NOT NULL PRIMARY KEY,
	name varchar(25),
	age int,
	isAdmin bit,
	createdDate timestamp
);

set names 'utf8';
DELIMITER $$
CREATE PROCEDURE insert_test_data()
BEGIN
  DECLARE i INT DEFAULT 1;
DECLARE j INT DEFAULT 1001;
  WHILE i < 1000 DO
    INSERT INTO User (id, name, age, isAdmin, createdDate)
    values(i, 'Dmytro', i%100,  i%1, now());
    set i = i + 1;
  END WHILE;
  WHILE j < 4000 DO
    INSERT INTO User (id, name, age, isAdmin, createdDate)
    values(j, 'Mykhailo', j%100,  j%1, now());
    set j = j + 1;
  END WHILE;
END$$
DELIMITER ;
CALL insert_test_data();
DROP PROCEDURE insert_test_data;
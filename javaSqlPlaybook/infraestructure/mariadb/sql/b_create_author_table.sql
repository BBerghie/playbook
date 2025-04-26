USE `social_media`

DROP TABLE IF EXISTS `author`

CREATE TABLE `author`(
	athorId bigint primary key AUTO_INCREMENT,
	name varchar(128) charset utf8,
	lastName varchar(128) charset utf8,
	birthNate DATETIME
);

INSERT INTO author (name, lastName, birthNate) values 
	("Joel", "Spolsky", NOW()),
	("Bernard", "Russell", NOW()),
	("Karl", "Polanyi", NOW()),
	("Naomi", "Klein", NOW())
);

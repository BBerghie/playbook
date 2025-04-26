DROP TABLE IF EXISTS `sqlPlaybook`.`author`;

CREATE TABLE `sqlPlaybook`.`author`(
        authorId bigint primary key AUTO_INCREMENT,
        name varchar(128) charset utf8,
        lastName varchar(128) charset utf8,
        birthDate DATETIME
);

INSERT INTO `sqlPlaybook`.`author` (name, lastName, birthDate) values
        ("Joel", "Spolsky", NOW()),
        ("Bernard", "Russell", NOW()),
        ("Karl", "Polanyi", NOW()),
        ("Naomi", "Klein", NOW());


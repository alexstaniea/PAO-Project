CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `projects` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `budget` int(11) NOT NULL ,
  `timespan` int(11) NOT NULL ,
  `tasks` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);


CREATE TABLE `salaries` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` double(11) NOT NULL ,
  `startFrom` date NOT NULL ,
  `endFrom` date NOT NULL,
  `currency` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);


CREATE TABLE `contracts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `startFrom` date NOT NULL ,
  `endFrom` date NOT NULL,
  `position` varchar(45) NOT NULL,
  `relocation` BOOLEAN,
   PRIMARY KEY (`id`)
);




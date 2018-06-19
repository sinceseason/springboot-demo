/*
* create table
*/
CREATE TABLE `demo`.`user`(
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`) ) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_general_ci;

ALTER TABLE `demo`.`user` ADD COLUMN `type` INT(10) NOT NULL COMMENT '1:审批账户 2:管理账户' AFTER `password`;
ALTER TABLE `demo`.`user` CHANGE `type` `type` INT(10) NOT NULL COMMENT '1:sa管理账户 2:审批账户 3:申报账户';

/*
* insert data
*/
INSERT INTO `demo`.`user` (`userName`, `password`, `type`) VALUES ('sa', 'c33367701511b4f6020ec61ded352059', '1');
INSERT INTO `demo`.`user` (`userName`, `password`, `type`) VALUES ('sp', 'c33367701511b4f6020ec61ded352059', '2');
INSERT INTO `demo`.`user` (`userName`, `password`, `type`) VALUES ('sb', 'c33367701511b4f6020ec61ded352059', '3');
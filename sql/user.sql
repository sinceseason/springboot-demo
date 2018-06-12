CREATE TABLE `demo`.`user`(
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`) ) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_general_ci;

ALTER TABLE `demo`.`user` ADD COLUMN `type` INT(10) NOT NULL COMMENT '1:审批账户 2:管理账户' AFTER `password`;
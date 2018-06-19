CREATE TABLE `demo`.`menu`(
  `id` INT(10) NOT NULL AUTO_INCREMENT, PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_general_ci;

ALTER TABLE `demo`.`menu`
  ADD COLUMN `main` VARCHAR(50) NOT NULL COMMENT '菜单项' AFTER `id`,
  ADD COLUMN `parent_id` INT(10) NOT NULL COMMENT '父菜单id' AFTER `main`,
  ADD COLUMN `type` INT(1) NOT NULL COMMENT '1:sa管理账户 2:审批账户 3:申报账户' AFTER `parent_id`;


/*
* insert data
*/
INSERT INTO `demo`.`menu` (`main`, `parent_id`, `type`) VALUES ('wharf_manage', '0', '1');
INSERT INTO `demo`.`menu` (`main`, `parent_id`, `type`) VALUES ('external_manage', '0', '1');
INSERT INTO `demo`.`menu` (`main`, `parent_id`, `type`) VALUES ('internal_manage', '0', '1');
INSERT INTO `demo`.`menu` (`main`, `parent_id`, `type`) VALUES ('approve_apply', '0', '2');
INSERT INTO `demo`.`menu` (`main`, `parent_id`, `type`) VALUES ('approve_query', '0', '2');
INSERT INTO `demo`.`menu` (`main`, `parent_id`, `type`) VALUES ('approve_user_manage', '0', '2');
INSERT INTO `demo`.`menu` (`main`, `parent_id`, `type`) VALUES ('approve_external_manage', '6', '2');
INSERT INTO `demo`.`menu` (`main`, `parent_id`, `type`) VALUES ('apply_entry', '0', '3');
INSERT INTO `demo`.`menu` (`main`, `parent_id`, `type`) VALUES ('apply_query', '0', '3');
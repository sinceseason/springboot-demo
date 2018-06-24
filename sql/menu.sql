DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `main` varchar(50) NOT NULL COMMENT '菜单项',
  `parent_id` int(10) NOT NULL COMMENT '父菜单id',
  `type` int(1) NOT NULL COMMENT '1:sa管理账户 2:审批账户 3:申报账户',
  `menu_id` int(10) DEFAULT NULL COMMENT '当前菜单组的id',
  `router` varchar(50) DEFAULT NULL COMMENT '前端路由跳转',
  `icon` varchar(50) DEFAULT NULL COMMENT '前端按钮',
  PRIMARY KEY (`id`)
) ENGINE=INNODB CHARSET=utf8 COLLATE=utf8_general_ci;


/*
* insert data
*/
insert  into `menu`(`id`,`main`,`parent_id`,`type`,`menu_id`,`router`,`icon`) values

(1,'wharf_manage',0,1,1,'wharf',NULL),

(2,'external_manage',0,1,2,'external',NULL),

(3,'internal_manage',0,1,3,'internal',NULL),

(4,'approve_apply',0,2,1,'approveApply','solution'),

(5,'approve_query',0,2,2,'approveQuery','select'),

(6,'approve_user_manage',0,2,3,NULL,'setting'),

(7,'approve_external_manage',6,2,0,'approveExternalUser',NULL),

(8,'apply_entry',0,3,1,NULL,'switcher'),

(9,'apply_query',0,3,2,NULL,'api');
DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `account` varchar(50) NOT NULL DEFAULT '' COMMENT '계정',
  `name` varchar(30) NOT NULL DEFAULT '' COMMENT '이름',
  `password` varchar(100) NOT NULL DEFAULT '' COMMENT '비밀번호',
  `created_time` datetime NOT NULL COMMENT '생성일시',
  `updated_time` datetime DEFAULT NULL COMMENT '수정일시',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UX_account` (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='사용자';
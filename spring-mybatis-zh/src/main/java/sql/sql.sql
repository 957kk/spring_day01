CREATE TABLE `tb_account` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `money` double(255,0) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

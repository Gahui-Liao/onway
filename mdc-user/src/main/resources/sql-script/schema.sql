CREATE TABLE `user` (
  `user_id` bigint(10) NOT NULL AUTO_INCREMENT,
  `user_code` varchar(20) NOT NULL,
  `account_id` bigint(10) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `create_time` datetime NOT NULL DEFAULT NOW(),
  `update_time` datetime NOT NULL DEFAULT NOW(),
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `cert` (
  `cert_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cert_code` bigint(20) DEFAULT NULL,
  `account_id` bigint(20) NOT NULL,
  `cert_type` tinyint(4) DEFAULT NULL,
  `cert_number` varchar(20) DEFAULT NULL,
  `cert_address` varchar(50) DEFAULT NULL,
  `create_time` datetime NOT NULL DEFAULT NOW(),
  `update_time` datetime NOT NULL DEFAULT NOW(),
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`cert_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `address` (
  `address_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address_code` varchar(20) DEFAULT NULL,
  `account_id` bigint(20) NOT NULL,
  `address_region_id` bigint(20) DEFAULT NULL,
  `address_content` varchar(50) DEFAULT NULL,
  `create_time` datetime NOT NULL DEFAULT NOW(),
  `update_time` datetime NOT NULL DEFAULT NOW(),
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `account` (
  `account_id` bigint(10) NOT NULL AUTO_INCREMENT,
  `account_code` varchar(20) NOT NULL,
  `account_name` varchar(20) NOT NULL,
  `account_password` varchar(10) NOT NULL,
  `create_time` datetime NOT NULL DEFAULT NOW(),
  `update_time` datetime NOT NULL DEFAULT NOW(),
  `remark` varchar(255) DEFAULT NULL,
	PRIMARY KEY (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


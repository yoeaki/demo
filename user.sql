/*
Navicat MySQL Data Transfer

Source Server         : mybatis
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2018-12-22 15:59:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
CREATE TABLE `test` (
`test_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '测试ID',
`test_name` char(255) DEFAULT NULL COMMENT '测试名称',
`info` text COMMENT '各种信息',
`other` varchar(255) DEFAULT NULL,
PRIMARY KEY (`test_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;








/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50149
Source Host           : localhost:3306
Source Database       : db_ssh_comp

Target Server Type    : MYSQL
Target Server Version : 50149
File Encoding         : 65001

Date: 2018-05-18 14:39:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'asd', 'myname', null);
INSERT INTO `tb_user` VALUES ('2', 'asd', 'aaaa', null);
INSERT INTO `tb_user` VALUES ('3', '1234', 'kate', '18');
INSERT INTO `tb_user` VALUES ('4', '123', '123', '1');
INSERT INTO `tb_user` VALUES ('5', '1', '123', '1');

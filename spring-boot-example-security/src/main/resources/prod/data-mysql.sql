/*
 Navicat Premium Data Transfer

 Source Server         : 百度云
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : 106.12.97.129:3306
 Source Schema         : ximao

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 27/12/2018 13:54:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES (1, 1, '系统管理', 0, 1, '#', 'M', '0', '', 'fa fa-gear', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统管理目录', '1');
INSERT INTO `menu` VALUES (2, 1, '系统监控', 0, 2, '#', 'M', '0', '', 'fa fa-video-camera', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统监控目录', '1');
INSERT INTO `menu` VALUES (3, 1, '系统工具', 0, 3, '#', 'M', '0', '', 'fa fa-bars', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '系统工具目录', '1');


-- ----------------------------
-- Records of mid_role_permission
-- ----------------------------
INSERT INTO `mid_role_permission` VALUES (1, 1, 1);
INSERT INTO `mid_role_permission` VALUES (2, 1, 2);


-- ----------------------------
-- Records of mid_user_role
-- ----------------------------
INSERT INTO `mid_user_role` VALUES (1, 1, 1);
INSERT INTO `mid_user_role` VALUES (2, 1, 2);


-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES (1, '1', '菜单权限', '1');
INSERT INTO `permission` VALUES (2, '2', '资源权限', '1');


-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '管理员', 'ROLE_ADMIN', 1, '1', '0', '0', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '管理员');


-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 103, 'admin', '若依', '00', 'ry@163.com', '15888888888', '1', '', '29c67a30398638269fe600f73a054934', '111111', '0', '0', '127.0.0.1', '2018-12-21 18:18:57', 'admin', '2018-03-16 11:33:00', 'ry', '2018-12-21 18:18:57', '管理员');
INSERT INTO `user` VALUES (2, 105, 'ry', '若依', '00', 'ry@qq.com', '15666666666', '1', '', '8e6d98b90472783cc73c17047ddccf36', '222222', '0', '0', '127.0.0.1', '2018-03-16 11:33:00', 'admin', '2018-03-16 11:33:00', 'ry', '2018-03-16 11:33:00', '测试员');

SET FOREIGN_KEY_CHECKS = 1;

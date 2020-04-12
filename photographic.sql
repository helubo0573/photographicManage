/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : photographic

Target Server Type    : MYSQL
Target Server Version : 50099
File Encoding         : 65001

Date: 2020-04-12 09:57:02
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `administrator`
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
  `username` varchar(18) NOT NULL,
  `password` varchar(18) NOT NULL,
  `state` tinyint(4) DEFAULT '0' COMMENT '是否禁用',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of administrator
-- ----------------------------
INSERT INTO `administrator` VALUES ('administrator', 'gbbbgf3w44navmo5d3', '0');

-- ----------------------------
-- Table structure for `goods_type`
-- ----------------------------
DROP TABLE IF EXISTS `goods_type`;
CREATE TABLE `goods_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `org_id` int(11) DEFAULT NULL COMMENT '机构id',
  `parent_id` int(11) DEFAULT NULL,
  `typename` varchar(30) DEFAULT NULL COMMENT '产品类型名称',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods_type
-- ----------------------------
INSERT INTO `goods_type` VALUES ('1', '0', '-1', '相框', ''), ('3', '0', '1', '撒打算1', '23a'), ('4', '0', '1', 'aadasd', 'asas'), ('5', '0', '1', '白珍珠', '121');

-- ----------------------------
-- Table structure for `org_dept`
-- ----------------------------
DROP TABLE IF EXISTS `org_dept`;
CREATE TABLE `org_dept` (
  `id` varchar(32) NOT NULL,
  `org_id` varchar(32) NOT NULL COMMENT '构机ID',
  `dept_name` varchar(50) NOT NULL COMMENT '部门名称',
  `remarks` varchar(100) DEFAULT NULL COMMENT '注备',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of org_dept
-- ----------------------------

-- ----------------------------
-- Table structure for `org_info`
-- ----------------------------
DROP TABLE IF EXISTS `org_info`;
CREATE TABLE `org_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `org_code` varchar(32) DEFAULT NULL,
  `org_name` varchar(50) NOT NULL DEFAULT '' COMMENT '机构名称',
  `org_address` varchar(6) NOT NULL DEFAULT '' COMMENT '所在地',
  `site` varchar(100) DEFAULT NULL COMMENT '详细地址',
  `range` varchar(100) DEFAULT NULL COMMENT '经营范围',
  `create_time` date NOT NULL,
  `create_user` int(11) NOT NULL COMMENT '创建的用户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of org_info
-- ----------------------------
INSERT INTO `org_info` VALUES ('0', '430481001', '诺金山', '耒阳', '城北路178', '婚纱照、宝宝照', '2020-02-26', '1');

-- ----------------------------
-- Table structure for `org_post`
-- ----------------------------
DROP TABLE IF EXISTS `org_post`;
CREATE TABLE `org_post` (
  `id` varchar(32) NOT NULL,
  `org_id` varchar(32) NOT NULL COMMENT '属所机构id',
  `dept_id` varchar(32) NOT NULL COMMENT '所属部门ID',
  `post_name` varchar(50) NOT NULL COMMENT '位岗名称',
  `remarks` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of org_post
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(20) NOT NULL DEFAULT '' COMMENT '单菜名称',
  `parent_id` int(11) DEFAULT NULL COMMENT '父菜单id',
  `url_path` varchar(50) DEFAULT NULL,
  `icon_code` varchar(20) DEFAULT '' COMMENT '图标',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `remarks` varchar(30) DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='菜单表';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '个人中心', '0', null, 'MemberCenter', '4', ''), ('2', '个人详细信息', '1', '/member/memberdetailinfo.do', 'DetailInfo', '1', ''), ('4', '密码重置', '1', '/member/resetpassword.do', 'ResetPd', '4', ''), ('7', '产品管理', '0', null, 'GoodsManage', '3', ''), ('8', '产品信息管理', '7', '/goods/goodsinfo.do', 'GoodsInfo', '3', ''), ('9', '销售管理', '0', null, 'SalesManage', '1', ''), ('10', '订单信息', '9', '/sales/orderInfo.do', 'OrderInfo', '2', ''), ('11', '产品类型管理', '7', '/goods/goodstype.do', 'GoodsType', '1', ''), ('12', '产品规格管理', '7', '/goods/goodssize.do', 'GoodsSize', '2', ''), ('13', '新增订单', '9', '/sales/neworder.do', 'NewOrder', '1', ''), ('14', '服务流程管控', '0', null, 'PGQA', '2', ''), ('15', '摄控管理', '14', '/pgqa/casemanage.do', 'CaseManage', '1', ''), ('16', '服务进度管理', '14', '/pgqa/processmanage.do', 'ProcessManage', '2', ''), ('17', '拍摄套餐管理', '9', '/sales/entireManage.do', 'EntireManage', '3', '');

-- ----------------------------
-- Table structure for `sys_perm`
-- ----------------------------
DROP TABLE IF EXISTS `sys_perm`;
CREATE TABLE `sys_perm` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` varchar(128) NOT NULL COMMENT '编码',
  `name` varchar(512) DEFAULT '' COMMENT '权限名称',
  `perm_level` int(2) NOT NULL DEFAULT '1' COMMENT '权限级别 1-系统级别 2-普通级别',
  `remark` varchar(128) DEFAULT '' COMMENT '权限备注',
  `add_time` datetime NOT NULL COMMENT '添加时间',
  `add_user` varchar(11) NOT NULL DEFAULT '' COMMENT '添加人',
  `menu_id` int(11) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of sys_perm
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `org_id` varchar(32) NOT NULL DEFAULT '' COMMENT '机构id',
  `rule_name` varchar(30) NOT NULL DEFAULT '' COMMENT '角色名称',
  `last_update_user` varchar(18) NOT NULL DEFAULT '' COMMENT '最后操作用户名',
  `update_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '最后更新时间',
  `remarks` varchar(100) DEFAULT '' COMMENT '备注',
  `state` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态:0：禁用  1：启用',
  PRIMARY KEY (`id`),
  KEY `orgid` (`org_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='角色表';

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `menu_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `rule` (`role_id`) USING BTREE,
  KEY `menu` (`menu_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_role_perm`
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_perm`;
CREATE TABLE `sys_role_perm` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  `perm_id` int(11) NOT NULL COMMENT '权限ID',
  `add_user` varchar(11) NOT NULL DEFAULT '' COMMENT '添加人',
  `add_time` datetime NOT NULL COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_perm
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_sms_send`
-- ----------------------------
DROP TABLE IF EXISTS `sys_sms_send`;
CREATE TABLE `sys_sms_send` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `send_time` datetime DEFAULT NULL COMMENT '发送时间',
  `content` varchar(200) DEFAULT NULL COMMENT '发送信息',
  `resp_time` datetime DEFAULT NULL COMMENT '响应时间',
  `resp` varchar(255) DEFAULT NULL COMMENT '响应信息',
  `sms_type` varchar(30) DEFAULT NULL COMMENT '短信类型',
  `code` varchar(6) DEFAULT '' COMMENT '验证码',
  `state` varchar(2) DEFAULT '10' COMMENT '短信是否被使用 10-已使用 20-未使用',
  `verify_time` int(11) DEFAULT '0' COMMENT '短信验证次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_sms_send
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`),
  KEY `userid` (`user_id`) USING BTREE,
  KEY `ruleid` (`role_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='用户角色表';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(12) NOT NULL COMMENT '用户名',
  `password` varchar(128) NOT NULL COMMENT '密码',
  `register_time` datetime NOT NULL COMMENT '注册时间',
  `mobile_number` varchar(11) DEFAULT '' COMMENT '移动电话',
  `login_time` datetime DEFAULT '1970-01-01 00:00:00' COMMENT '登录时间',
  `org_id` int(11) DEFAULT NULL,
  `is_admin` tinyint(1) DEFAULT '0' COMMENT '否是为管理员',
  `state` tinyint(1) DEFAULT '0' COMMENT '锁定账号 1：锁定',
  PRIMARY KEY (`id`),
  KEY `username` (`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='用户表';

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'helubo0573', 'gbbbgf3w44navmo5d3hkyzmezhbwojf2k22sqkkiz7zswqd5yw2k2kmixfjvhlkukxtupwzfxkg4u', '2019-06-28 00:02:28', '18773454340', null, '0', '1', '0');

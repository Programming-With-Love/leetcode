/*
Source Server         : localhost
Source Host           : localhost:3306
Source Database       : dxTechMall
Target Server Type    : MYSQL
*/
use dxTechMall;
SET FOREIGN_KEY_CHECKS=0;
/*
用户相关——用户表
*/
DROP TABLE IF EXISTS `ums_member`;
CREATE TABLE `ums_member` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `member_level_id` bigint(20) DEFAULT NULL,
  `tb_userid` int(10) DEFAULT NULL COMMENT '淘宝用户id',
  `tb_pid` int(10) DEFAULT NULL COMMENT '分享赚钱的pid',
  `username` varchar(64) DEFAULT NULL COMMENT '用户名',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `nickname` varchar(64) DEFAULT NULL COMMENT '昵称',
  `phone` varchar(64) DEFAULT NULL COMMENT '手机号码',
  `status` int(1) DEFAULT NULL COMMENT '帐号启用状态:0->禁用；1->启用',
  `create_time` datetime DEFAULT NULL COMMENT '注册时间',
  `icon` varchar(500) DEFAULT NULL COMMENT '头像',
  `gender` int(1) DEFAULT NULL COMMENT '性别：1->男；2->女',
  `levle` int(1) DEFAULT NULL COMMENT '用户等级',
  `alipay_account_number` varchar(30)  DEFAULT NULL COMMENT '用户支付宝账号',
  `invitation_code` bigint(20) DEFAULT NULL COMMENT '自己生成的邀请码',
  `parent_id`  bigint(20) DEFAULT NULL COMMENT '上级的邀请码，null则代表自己注册',
  `score` int(11) DEFAULT NULL COMMENT '账户现有积分',
  `history_score` int(11) DEFAULT NULL COMMENT '总共积分（包括已经兑换的）',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_username` (`username`),
  UNIQUE KEY `idx_phone` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='会员表';

/*
用户相关——会员返利信息统计表
*/
DROP TABLE if exists `ums_member_rebate`;
CREATE TABLE `ums_member_rebate`(
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`member_id` BIGINT(20) DEFAULT NULL,
	`can_rebate_number` DECIMAL(10 , 2 ) DEFAULT NULL COMMENT '可提现金额',
	`await_rebate_number` DECIMAL(10 , 2 ) DEFAULT NULL COMMENT '待返利金额',
	`total_rebate_number` DECIMAL(10 , 2 ) DEFAULT NULL COMMENT '累计返利金额',
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='会员返利信息统计表';

/*
用户相关——返利规则
写入代码的逻辑之中。
*/

/*
用户相关——返利金额变化记录
订单类型和编号在增加返利的时候才有
*/
DROP TABLE IF EXISTS `ums_member_rebate_info`;
CREATE TABLE `ums_member_rebate_info` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `member_id` BIGINT(20) DEFAULT NULL,
    `rebate_from` int(2) DEFAULT NULL COMMENT '1->tb,2->other',
    `order_style` int(1)  DEFAULT NULL COMMENT '返利订单类型 0->自购 1->分享 2->下线购物 3->邀请人成为了高级会员',
    `order_id` BIGINT(20) DEFAULT NULL COMMENT '订单编号',
    `order_rebate_amount` DECIMAL(10 , 2 ) DEFAULT NULL COMMENT '变化金额',
    `ip` varchar(64) DEFAULT NULL COMMENT '用户IP',
    `recent_order_time` DATETIME DEFAULT NULL COMMENT '用户操作时间记录',
    PRIMARY KEY (`id`)
)  ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=UTF8 COMMENT='返利金额变化记录';


/*
用户相关——用户消费统计表
*/
DROP TABLE IF EXISTS `ums_member_statistics_info`;
CREATE TABLE `ums_member_statistics_info` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `member_id` BIGINT(20) DEFAULT NULL,
    `total_coupon_amount` DECIMAL(10 , 2 ) DEFAULT NULL COMMENT '用户消费金额',
    `order_count` INT(11) DEFAULT NULL COMMENT '订单数量',
    `coupon_count` INT(11) DEFAULT NULL COMMENT '优惠券数量',
    `coupon_amount` DECIMAL(10 , 2 ) DEFAULT NULL COMMENT '优惠券金额',
    `login_count` INT(11) DEFAULT NULL COMMENT '登录次数',
    `recent_order_time` DATETIME DEFAULT NULL COMMENT '最后一次下订单时间',
    PRIMARY KEY (`id`)
)  ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=UTF8 COMMENT='用户消费统计表';

/*
用户相关——领取优惠券记录
product_id 通过商品id找到优惠券的信息
*/
DROP TABLE IF EXISTS `ums_receive_coupon_history`;
CREATE TABLE `ums_receive_coupon_history`(
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`member_id` BIGINT(20) DEFAULT NULL,
    `product_id` BIGINT(20) DEFAULT NULL, 
    `ip` varchar(64) DEFAULT NULL COMMENT '用户IP',
	`receive_time` DATETIME DEFAULT NULL COMMENT '用户领取时间',
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='领取优惠券记录';

/*
用户相关——收藏夹
product_id 通过其查找商品的信息
*/
DROP TABLE IF exists `ums_member_favorites`;
CREATE TABLE `ums_member_favorites`(
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`member_id` BIGINT(20) DEFAULT NULL,
    `product_id` BIGINT(20) DEFAULT NULL, 
	`receive_time` DATETIME DEFAULT NULL COMMENT '用户收藏时间',
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='收藏夹记录';

/*
用户相关——猜你喜欢
现在接口无法使用 在咨询tb方面
*/

/*
用户相关——用户浏览记录
点开商品详情就算
*/
DROP TABLE IF EXISTS `ums_member_browse_history`;
CREATE TABLE `ums_member_browse_history`(
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`member_id` BIGINT(20) DEFAULT NULL,
    `product_id` BIGINT(20) DEFAULT NULL, 
    `ip` varchar(64) DEFAULT NULL COMMENT '用户IP',
	`receive_time` DATETIME DEFAULT NULL COMMENT '浏览时间',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='用户浏览记录';

/*
用户相关——等级表规则表
nema : lv1，lv2，lv3，lv4，lv5，高级。
*/
DROP TABLE IF EXISTS `ums_member_level`;
CREATE TABLE `ums_member_level` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `levle_name` varchar(100) DEFAULT NULL COMMENT '等级名称',
  `order_number` int(11) DEFAULT NULL COMMENT '订单数量',
  `growth_type` int(1) DEFAULT NULL COMMENT '升级方式1->299',
  `note` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='会员等级表';

insert into ums_member_level values ('1','lv1','3','0',null);
insert into ums_member_level values ('2','lv2','10','0',null);
insert into ums_member_level values ('3','lv3','50','0',null);

/*
用户相关——用户升级记录
*/
DROP TABLE IF EXISTS `ums_member_level_history`;
CREATE TABLE `ums_member_level_history` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `member_id` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `member_level_up` int(11) DEFAULT NULL COMMENT '提升之后的等级Lv1-Lv5，高级',
  `growth_type_id` bigint(20) DEFAULT NULL COMMENT '关联等级规则表',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户升级表';

/*
 用户相关——积分获取规则
 其中订单积分和返利金额有关
*/
DROP TABLE IF EXISTS `ums_member_rule_setting`;
CREATE TABLE `ums_member_rule_setting` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `member_level_id` bigint(20) DEFAULT NULL COMMENT '等级id',
  `continue_sign_point` int(11) DEFAULT NULL COMMENT '签到赠送积分数量',
  `share_point` int(11) DEFAULT NULL COMMENT '邀请得到的积分',
  `consume_per_point` decimal(10,2) DEFAULT NULL COMMENT '返利1元返回积分是1(lv1) 2(lv2)',
  `low_order_amount` decimal(10,2) DEFAULT NULL COMMENT '返利为1元才会反积分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员积分成长规则表';
/*
用户相关——积分兑换红包规则
*/

/*
用户相关——积分赚取记录
*/
DROP TABLE IF EXISTS `ums_growth_up_history`;
CREATE TABLE `ums_growth_up_history` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `member_id` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `change_up_count` int(11) DEFAULT NULL COMMENT '积分增长数量',
  `source_type` int(1) DEFAULT NULL COMMENT '积分增长来源：0->邀请注册并且购物获取积分；1->购物获取积分；2->签到；3->其他',
  `order_id` bigint(20) DEFAULT NULL COMMENT '购物积分对应的订单编号(自己购物/邀请好友完成购物)',
  `operate_man` varchar(100) DEFAULT NULL COMMENT '操作人员',
  `operate_note` varchar(200) DEFAULT NULL COMMENT '操作备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='积分赚取记录';

/*
用户相关——积分消费记录
*/
DROP TABLE IF EXISTS `ums_growth_down_history`;
CREATE TABLE `ums_growth_down_history` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `member_id` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `change_down_count` int(11) DEFAULT NULL COMMENT '积分减少数量',
  `source_type` int(1) DEFAULT NULL COMMENT '积分花费途径：0->兑换红包；1->抽奖；',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='积分消费记录';

/*
用户相关——问题反馈
*/
DROP TABLE IF EXISTS `ums_member_problem_feedback`;
CREATE TABLE `ums_member_problem_feedback`(
	 `id` bigint(20) NOT NULL AUTO_INCREMENT,
	 `phone` varchar(64) DEFAULT NULL COMMENT '联系方式',
     `content` varchar(1000) DEFAULT NULL COMMENT '反馈内容',
     `recent_order_time` DATETIME DEFAULT NULL COMMENT '用户反馈时间',
	 PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='问题反馈';

/*
用户相关——使用说明
购物指南，常见问题，会员等级,返现教程
*/
DROP TABLE IF EXISTS `ums_member_instructions`;
CREATE TABLE `ums_member_instructions`(
	`id` bigint(20) NOT NULL AUTO_INCREMENT,
	`name` varchar(20)  NOT NULL COMMENT '名称',
    `description` varchar(2000) NOT NULL COMMENT '描述',
	PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='使用说明';

insert into ums_member_instructions values ('1','购物指南','购物指南说明'); 
insert into ums_member_instructions values ('2','常见问题','常见问题说明');
insert into ums_member_instructions values ('1','会员等级','会员等级说明');
insert into ums_member_instructions values ('1','返现教程','返现教程说明');

/*
用户相关——登陆记录
*/
DROP TABLE IF EXISTS `ums_member_login_log`;
CREATE TABLE `ums_member_login_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `member_id` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `ip` varchar(64) DEFAULT NULL,
  `city` varchar(64) DEFAULT NULL,
  `login_type` varchar(1000) DEFAULT NULL COMMENT '会员设备类型（包含版本号等）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员登录记录';

/*
用户相关——购物车
购物车是淘宝的购物车
*/


/*
管理员相关—管理员列表
*/
DROP TABLE IF EXISTS `ums_admin`;
CREATE TABLE `ums_admin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `phone` varchar(64) DEFAULT NULL COMMENT '手机账号',
  `password` varchar(64) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `note` varchar(500) DEFAULT NULL COMMENT '备注信息',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` int(1) DEFAULT '1' COMMENT '帐号启用状态：0->禁用；1->启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='后台管理员表';

/*
管理员相关—管理员登陆日志
*/
DROP TABLE IF EXISTS `ums_admin_login_log`;
CREATE TABLE `ums_admin_login_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_id` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `ip` varchar(64) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `user_agent` varchar(100) DEFAULT NULL COMMENT '浏览器登录类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台用户登录日志表';


/*
产品相关——产品分类
根据性别不同，分类显示也不同。
*/
DROP TABLE IF EXISTS `pms_product_category`;
CREATE TABLE `pms_product_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) DEFAULT NULL COMMENT '分类的名称',
  `choice` int(1) DEFAULT '0' COMMENT '是否是优选榜单 0->false 1->true',
  `gender_id` int(1) DEFAULT '0' COMMENT '0->女（默认） 1->男 2->无论男女都需要显示的类型 ',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '所属夫类id',
  `parent_name` varchar(64) DEFAULT NULL COMMENT '夫类的名称',
  `level` int(1) DEFAULT NULL COMMENT '分类级别：1->1级；2->2级；3->3级',
  `product_count` int(11) DEFAULT NULL COMMENT '该分类下多少商品',
  `nav_status` int(1) DEFAULT NULL COMMENT '是否显示在导航栏：0->不显示；1->显示',
  `show_status` int(1) DEFAULT NULL COMMENT '显示状态：0->不显示；1->显示',
  `sort` int(11) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL COMMENT '图标',
  `description` text COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='产品分类';

insert into pms_product_category values('10','男装','0','1',null,null,'1','1000','1','1','1',null,'男装的分类');
insert into pms_product_category values('20','女装','0','0',null,null,'1','1000','1','1','3',null,'女装的分类');
insert into pms_product_category values('30','女鞋','0','0',null,null,'1','1000','1','1','4',null,'女鞋的分类');
insert into pms_product_category values('40','食品','0','2',null,null,'1','1000','1','1','5',null,'食品的分类');
insert into pms_product_category values('60','毛衣女','0','0','20','女装','2','200','1','0','2',null,'女生的毛衣');
insert into pms_product_category values('10000','时尚穿搭','1','2',null,null,'1','200','0','1','10',null,'优选榜单 模块下的时尚穿搭');


/*
产品相关——首页为你精选模块
根据用户的不同推荐算法得到
*/
DROP TABLE IF EXISTS `pms_product_choice`;
CREATE TABLE `ums_admin_login_log` (
	`id` bigint(20) NOT NULL COMMENT 'id为member_id',
	`product_id` bigint(20) NOT NULL,
	PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='精选模块';


/*
产品相关——超级省钱模块（超省）
其中数据通过算法从1W条数据中获取
*/
DROP TABLE IF EXISTS `pms_product_super_save`;
CREATE TABLE `pms_product_super_save`(
	`id` bigint(20) DEFAULT NULL COMMENT '开始时间的标示 0->10:00 1->20:00',
	`product_id` bigint(20)  DEFAULT NULL COMMENT '筛选出的商品id',
	PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='超省模块';

/*
产品相关——模块筛选分类
1，9.9包邮 1W数据中，价格(减去优惠券的价格和返利之后的价格)<9.9 
2，时尚穿搭 1W数据中 根据衣服来进行挑选
3，每如要吃 1W数据中 挑选出水果和食物
*/
DROP TABLE IF EXISTS `pms_product_nine`;
CREATE TABLE `pms_product_module`(
	`id` bigint(20) not NULL COMMENT '模块id',
    `name` varchar(30)  DEFAULT NULL COMMENT '模块名称',
	`product_id` bigint(20)  DEFAULT NULL COMMENT '筛选出的商品id',
	PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模块分类';

/*
产品相关——TB商品详情
商品详情，直接请求淘宝和第三方接口。
pms_product
*/

/*
产品相关——商品列表详情
1，含有有优惠券的
2，图片列表通过‘，’分开
3，商品id通过算法得到
*/
DROP TABLE IF EXISTS `pms_product_list`;
CREATE TABLE `pms_product_list` (
	`id` bigint(20) NOT NULL COMMENT '商品id',
	`small_image_list` varchar(1000) DEFAULT NULL COMMENT '图片列表',
    `shop_title` varchar(100) DEFAULT NULL COMMENT '店铺名称',
    `zk_final_price` decimal(10,2) DEFAULT NULL COMMENT '折扣价',
    `title` varchar(200) DEFAULT NULL COMMENT '商品标题',
    `nick` varchar(200) DEFAULT NULL COMMENT '买家昵称',
	`seller_id` bigint(20) DEFAULT NULL COMMENT '买家id',
    `volume` int(10) DEFAULT NULL COMMENT '30天销量',
    `pict_url` varchar(200) DEFAULT NULL COMMENT '商品主图',
    `item_url` varchar(200) DEFAULT NULL COMMENT '商品详情页地址',
    `coupon_total_count` int(6) DEFAULT NULL COMMENT '优惠券的数量',
    `commission_rate` decimal(10,2) DEFAULT NULL COMMENT '佣金比率',
    `coupon_info` int(6) DEFAULT NULL COMMENT '优惠券面额',
    `category` int(1) DEFAULT NULL COMMENT '后台一级目录',
    `num_iid` bigint(20) DEFAULT NULL,
    `coupon_remain_count` int(6) DEFAULT NULL COMMENT '优惠券的剩余量',
    `coupon_start_time` varchar(20)  DEFAULT NULL COMMENT '优惠券开始时间',
    `coupon_end_time` varchar(20)  DEFAULT NULL COMMENT '优惠券结束时间',
    `coupon_click_url` varchar(300) DEFAULT NULL COMMENT '优惠券链接',
    `item_description` varchar(1000) default NUll COMMENT '宝贝描述（推荐理由）',
	PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='含有优惠券的商品信息';


/*
产品相关——banner图
1—>热门活动banner，2->分类banner，3->启动图
*/
DROP TABLE IF EXISTS `pms_banner`;
CREATE TABLE `pms_banner`(
	`id` int(1) NOT NULL COMMENT 'banner图位置',
    `position` varchar(30) DEFAULT NULL COMMENT 'banner位置名称',
	`banner_url` varchar(200) DEFAULT NULL COMMENT 'banner活动链接',
    `banner_resouce` varchar(200) DEFAULT NULL COMMENT 'banner资源链接',
    `start_time` datetime DEFAULT NULL COMMENT '启动页开始时间',
    `end_time` datetime DEFAULT NULL COMMENT '启动页结束时间',
	PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='banner图';

insert into pms_banner values('1','热门活动banner','www.baidu.com',null,null,null);
insert into pms_banner values('2','分类banner','www.tujietg.xyz',null,null,null);
insert into pms_banner values('3','启动界面','www.alibabaxcom',null,'2019-01-31 12:00:00','2019-02-01 11:59:59'); 


/*
产品相关——活动推广
淘宝的活动（官方，商家）
其他活动
*/
DROP TABLE IF EXISTS `pms_activity_extend`;
CREATE TABLE  `pms_activity_extend`(
	`id` bigint(20) DEFAULT NULL COMMENT '活动id',
	`name` varchar(30) DEFAULT NULL COMMENT '活动名称',
	`url` varchar(200) DEFAULT NULL COMMENT '活动的url',
    `img_url` varchar(100) DEFAULT NULL COMMENT '活动banner的url',
	`start_time` datetime DEFAULT NULL COMMENT '活动开始时间',
    `end_time` datetime DEFAULT NULL COMMENT '活动结束时间',
    `activity_from` int(2) DEFAULT NULL COMMENT '1->tb 11->官方活动 12->商家活动  2->other',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='活动推广';

/*
订单相关——TB订单详情
*/
DROP TABLE IF EXISTS `oms_order`;
CREATE TABLE `oms_order` (
	`id` bigint(20) NOT NULL COMMENT 'TB订单id',
	`member_id` bigint(20) DEFAULT NULL,
	`trade_parent_id` bigint(20) DEFAULT NULL COMMENT '淘宝订单父类ID',
	`num_iid` bigint(20) DEFAULT NULL COMMENT '商品ID',
	`item_title` varchar(200) DEFAULT NULL COMMENT '商品标题',
	`item_num` int(5)  DEFAULT NULL COMMENT '商品数量',
	`price` decimal(10,2) DEFAULT NULL COMMENT '商品单价',
	`pay_price` decimal(10,2) DEFAULT NULL COMMENT '实际支付金额',
	`seller_nick` varchar(40) DEFAULT NULL COMMENT '买家昵称',
	`seller_shop_title` varchar(100) DEFAULT NULL COMMENT '买家店铺名称',
	`commission` decimal(10,2) DEFAULT NULL COMMENT '预估收入',
	`commission_rate` decimal(10,2) DEFAULT NULL COMMENT '预估收入比率',
	`create_time` datetime DEFAULT NULL COMMENT 'tb订单创建时间',
	`earning_time` datetime DEFAULT NULL COMMENT 'tb订单结算时间',
	`tk_status` int(2) DEFAULT NULL COMMENT 'tb订单状态 3：订单结算，12：订单付款， 13：订单失效，14：订单成功',
	`tk3rd_type` varchar(30) DEFAULT NULL COMMENT '第三方服务来源',
	`tk3rd_pub_id`  bigint(20) DEFAULT NULL COMMENT '第三方推广者id',
	`order_type` varchar(15) DEFAULT NULL COMMENT '订单类型',
    `income_rate` decimal(10,3) DEFAULT NULL COMMENT '收入比率',
    `pub_share_pre_fee` decimal(10,3) DEFAULT NULL COMMENT '效果预估',
    `subsidy_rate` decimal(10,3) DEFAULT NULL COMMENT '补贴比率',
    `subsidy_type` varchar(30) DEFAULT NULL COMMENT '补贴类型',
    `terminal_type` varchar(30) DEFAULT NULL COMMENT '成交平台',
    `auction_category` varchar(100) DEFAULT NULL COMMENT '类目名称',
	`site_name` varchar(30) DEFAULT NULL COMMENT '来源媒体名称',
    `site_id` varchar(20) DEFAULT NULL COMMENT '来源媒体id',
    `adzone_name` varchar(30) DEFAULT NULL COMMENT '推广位名称',
    `adzone_id` varchar(20) DEFAULT NULL COMMENT '推广位id',
    `alipay_total_price` decimal(10,2) DEFAULT NULL COMMENT '付款金额',
    `total_commission_rate` decimal(10,3) DEFAULT NULL COMMENT '佣金比率',
    `total_commission_fee` decimal(10,2) DEFAULT NULL COMMENT '佣金金额',
    `subsidy_fee` decimal(10,2) DEFAULT NULL COMMENT '补贴金额',
    `relation_id` bigint(20)  DEFAULT NULL COMMENT '渠道关系ID',
    `special_id` bigint(20)  DEFAULT NULL COMMENT '会员运营id',
    `click_time	` datetime DEFAULT NULL COMMENT '跟踪时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COMMENT='订单表';











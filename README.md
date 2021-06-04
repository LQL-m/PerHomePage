# PerHomePage
### JavaWeb 个人主页项目->测试地址：http://shellmon.cn:8080/

#### 1、基本信息页
![基本信息](https://user-images.githubusercontent.com/66428632/120834754-0b488380-c596-11eb-9a27-dc87d11d56df.png)

#### 2、教育经历页
![教育经历](https://user-images.githubusercontent.com/66428632/120835235-a2154000-c596-11eb-91d4-3d61859e070d.png)

#### 3、工作经历页
![工作经历](https://user-images.githubusercontent.com/66428632/120835380-d38e0b80-c596-11eb-8ad4-e6c8b69bd0af.png)

#### 4、技能列表页
![技能列表](https://user-images.githubusercontent.com/66428632/120835442-e99bcc00-c596-11eb-804f-2c6702fd3b64.png)

#### 5、特长领域页
![特长领域](https://user-images.githubusercontent.com/66428632/120835523-00422300-c597-11eb-95b2-48c829cba843.png)

#### 6、生成成功页
![生成成功](https://user-images.githubusercontent.com/66428632/120835762-531bda80-c597-11eb-8f03-67013bb24f21.png)

#### 7、个人主页页
![个人主页](https://user-images.githubusercontent.com/66428632/120836079-befe4300-c597-11eb-9342-60fa57d6d528.png)

#### 8、数据库设计

##### 1）基础信息表 kkb_user

* id 
* 姓名 name
* 年龄 age
* 地区 city
* 现住址 address
* 邮箱 email
* 电话 phone
* 微信 weixin
* qq qq
* 微博地址 Weibo
* 个人简介 info

```sql
CREATE TABLE `kkb_user` (
	`id` bigint(20) NOT NULL COMMENT '用户唯一标示，用于关联教育经历、工作经历、特长以及技能列表',
	`name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '姓名',
	`age` int(8) NULL COMMENT '年龄',
	`city` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '地区城市',
	`address` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '详细地址',
	`email` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '邮箱地址',
	`phone` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '电话或手机号码',
	`weixin` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '微信号码',
	`qq` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT 'qq号码',
	`weibo` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '微博地址',
	`description` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '个人简介',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='用户基础信息表，包含了用户的基本信息'
ROW_FORMAT=DYNAMIC
AVG_ROW_LENGTH=0;

```



##### 2）教育经历表 kkb_Educational

* id
* userid
* 开始时间 start
* 结束时间 end
* 学校 school
* 专业 study
* 介绍 description

```sql
CREATE TABLE `kkb_edu` (
	`id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
	`userid` bigint(20) NULL COMMENT '用户编号',
	`start` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '开始时间',
	`end` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '结束时间',
	`school` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '学校',
	`study` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '专业名称',
	`description` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '描述',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='用于描述用户的学习'
ROW_FORMAT=DYNAMIC
AVG_ROW_LENGTH=0;

```

##### 3）工作经历表 kkb_work

* id
* userid
* 开始时间 start
* 结束时间 end
* 公司名称 company
* 职位 job
* 介绍 description

```sql
CREATE TABLE `kkb_work` (
	`id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
	`userid` bigint(20) NULL COMMENT '用户编号',
	`start` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '开始时间',
	`end` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '结束时间',
	`company` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '所在公司',
	`job` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '岗位名称',
	`description` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '工作描述',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='用于描述用户的工作经历'
ROW_FORMAT=DYNAMIC
AVG_ROW_LENGTH=0;

```

##### 4）技能表 kkb_skill

* id
* userid
* 关键词 keywords

```sql
CREATE TABLE `kkb_skill` (
	`id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
	`userid` bigint(20) NULL COMMENT '用户编号',
	`keywords` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '用户的技能词列表',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='用户技能表'
ROW_FORMAT=DYNAMIC
AVG_ROW_LENGTH=0;

```

##### 5）特长表 kkb_specialty

* id
* userid
* 特长名称 name
* 特长描述 description

```sql
CREATE TABLE `kkb_specialty` (
	`id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
	`userid` bigint(20) NULL COMMENT '用户编号',
	`name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '特长名称',
	`description` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '描述',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='用于描述用户特长'
ROW_FORMAT=DYNAMIC
AVG_ROW_LENGTH=0;

```


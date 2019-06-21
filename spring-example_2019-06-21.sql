# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.26)
# Database: spring-example
# Generation Time: 2019-06-21 11:03:51 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table answer
# ------------------------------------------------------------

DROP TABLE IF EXISTS `answer`;

CREATE TABLE `answer` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `q_id` bigint(20) NOT NULL COMMENT '问题id',
  `a_id` bigint(20) NOT NULL COMMENT '作者id',
  `content` varchar(400) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '回答内容',
  `voteup_count` bigint(20) NOT NULL COMMENT '赞同数',
  `comment_count` bigint(20) NOT NULL COMMENT '评论数',
  `created_time` bigint(11) NOT NULL COMMENT '创建时间',
  `updated_time` bigint(11) NOT NULL COMMENT '更新时间',
  `status` tinyint(4) NOT NULL COMMENT '状态 0正常 1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

LOCK TABLES `answer` WRITE;
/*!40000 ALTER TABLE `answer` DISABLE KEYS */;

INSERT INTO `answer` (`id`, `q_id`, `a_id`, `content`, `voteup_count`, `comment_count`, `created_time`, `updated_time`, `status`)
VALUES
	(1,1,2,'我若成佛天下无魔，我若成魔佛奈我何',12785,897,1561105939,1561105939,0),
	(2,1,3,'凡事都有偶然的凑巧，结果却又如宿命的必然',549,12,1561105939,1561105939,0),
	(3,1,4,'心如槁木不如多愁善感，迷蒙的醒不如热烈的梦，一口苦水胜于一盏白汤，一场痛哭胜于哀乐两忘。',32776,4531,1561105939,1561105939,0);

/*!40000 ALTER TABLE `answer` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table author
# ------------------------------------------------------------

DROP TABLE IF EXISTS `author`;

CREATE TABLE `author` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '网名',
  `avatar_url` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '头像',
  `tags` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '标签',
  `gender` tinyint(2) NOT NULL COMMENT '性别 0女 1男',
  `created_time` bigint(11) NOT NULL COMMENT '注册时间',
  `status` tinyint(4) NOT NULL COMMENT '状态 0正常 1冻结',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;

INSERT INTO `author` (`id`, `name`, `avatar_url`, `tags`, `gender`, `created_time`, `status`)
VALUES
	(1,'言蹊','https://pic4.zhimg.com/v2-bfdc82c8e36c5c9c3e3cc99ff5972de3_s.jpg','句子迷,二次元,80后',0,1561105461,0),
	(2,'青葱少年','https://pic2.zhimg.com/v2-afaf333dbd10c838be1e840d3b0e1d81_s.jpg','公众号：青葱少年',1,1561105461,0),
	(3,'arimaken','https://pic4.zhimg.com/v2-446e6e3dee3b25f385190bb48bee7d51_s.jpg','愿闻其详',1,1561105461,0),
	(4,'见鹿','https://pic1.zhimg.com/v2-0739ad0c013cd352e0d0a0d10c2409ad_s.jpg','',0,1561105461,0);

/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table question
# ------------------------------------------------------------

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '问题标题',
  `detail` varchar(2000) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '详情',
  `a_id` bigint(11) NOT NULL COMMENT '作者id',
  `answer_count` bigint(11) NOT NULL DEFAULT '0' COMMENT '回答数',
  `follower_count` bigint(11) NOT NULL COMMENT '关注数',
  `created_time` bigint(11) NOT NULL COMMENT '创建时间',
  `updated_time` bigint(11) NOT NULL COMMENT '更新时间',
  `status` int(4) NOT NULL COMMENT '状态 0正常 1删除 2冻结',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;

INSERT INTO `question` (`id`, `title`, `detail`, `a_id`, `answer_count`, `follower_count`, `created_time`, `updated_time`, `status`)
VALUES
	(1,'有哪些句子是真正写到你的心里去了？','',1,543,2234,1561105390,1561105390,0);

/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

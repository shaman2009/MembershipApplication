-- phpMyAdmin SQL Dump
-- http://www.phpmyadmin.net
--
-- 生成日期: 2013 年 11 月 18 日 08:25

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- 数据库: `ybOxfzZbYWcQsTKYVrDk`
--

-- --------------------------------------------------------

--
-- 表的结构 `tb_applicant`
--

CREATE TABLE IF NOT EXISTS `tb_applicant` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `applicantName` varchar(128) NOT NULL,
  `applyDate` date NOT NULL,
  `referrerName` varchar(128) NOT NULL,
  `creditCardNumber` varchar(64) NOT NULL,
  `memberType` varchar(64) NOT NULL,
  `CreatedDate` datetime NOT NULL,
  `ModifiedDate` datetime NOT NULL,
  `IsDeleted` bit(1) NOT NULL DEFAULT b'0',
  `status` varchar(45) NOT NULL DEFAULT 'todo',
  `IsMember` bit(1) NOT NULL DEFAULT b'0',
  `IsReferrerTrue` bit(1) NOT NULL DEFAULT b'0',
  `applicantEmail` varchar(45) NOT NULL DEFAULT 'example@example.com',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=44 ;

--
-- 转存表中的数据 `tb_applicant`
--

INSERT INTO `tb_applicant` (`ID`, `applicantName`, `applyDate`, `referrerName`, `creditCardNumber`, `memberType`, `CreatedDate`, `ModifiedDate`, `IsDeleted`, `status`, `IsMember`, `IsReferrerTrue`, `applicantEmail`) VALUES
(4, '冯飞', '2013-11-07', '朱枫翔', '320106', 'B等會員', '2013-11-08 23:51:49', '2013-11-17 13:37:49', b'0', 'additionalInfo', b'0', b'0', 'example@example.com'),
(5, 'Yui', '2013-10-28', 'Rio', 'Love', 'A等會員', '2013-11-09 08:23:33', '2013-11-13 00:21:14', b'0', 'accept', b'1', b'0', 'example@example.com'),
(10, 'FF', '2013-11-09', 'ZFX', 'credit', 'A等會員', '2013-11-09 10:50:19', '2013-11-17 13:37:49', b'0', 'defer', b'0', b'0', 'example@example.com'),
(11, '翔子', '2013-11-08', '静宇翔', '820', 'B等會員', '2013-11-11 17:45:11', '2013-11-11 17:45:11', b'0', 'todo', b'1', b'0', 'example@example.com'),
(16, '肥肥飞', '2013-11-03', '组织者', '330', 'A等會員', '2013-11-12 23:16:43', '2013-11-17 13:37:49', b'0', 'deny', b'0', b'0', 'example@example.com'),
(17, 'ChengBo', '2013-11-13', '冯飞', '56778', 'A等會員', '2013-11-13 08:55:30', '2013-11-17 13:37:49', b'0', 'additionalInfo', b'0', b'0', 'example@example.com'),
(18, 'ChengBo', '2013-11-13', '冯飞', '56778', 'A等會員', '2013-11-13 08:55:35', '2013-11-17 13:37:49', b'0', 'todo', b'0', b'0', 'example@example.com'),
(19, '朱枫翔', '2013-11-01', '大业', '330', 'A等會員', '2013-11-13 22:40:07', '2013-11-17 13:37:49', b'0', 'defer', b'0', b'0', 'example@example.com');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

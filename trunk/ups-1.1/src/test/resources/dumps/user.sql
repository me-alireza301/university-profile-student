/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


USE `ups-test`;

--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_PK` bigint(20) NOT NULL,
  `day_birthday` datetime DEFAULT NULL,
  `email` varchar(64) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `middle_name` varchar(20) DEFAULT NULL,
  `password` longtext NOT NULL,
  `role_FK` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`user_PK`),
  KEY `FK285FEB9042FFD5` (`role_FK`),
  CONSTRAINT `FK285FEB9042FFD5` FOREIGN KEY (`role_FK`) REFERENCES `user_role` (`role_PK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_PK`,`day_birthday`,`email`,`firstname`,`lastname`,`middle_name`,`password`,`role_FK`) VALUES
 (1,NULL,'user1aiksssi@mail.com','testuser','testuser',NULL,'11856895',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


--
-- Definition of table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `role_PK` bigint(20) NOT NULL,
  `authority` varchar(45) NOT NULL,
  `description` varchar(100) NOT NULL,
  PRIMARY KEY (`role_PK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_role`
--

/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` (`role_PK`,`authority`,`description`) VALUES
 (1,'ROLE_STUDENT','This role for student'),
 (2,'ROLE_TEACHER','This role for teacher');
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

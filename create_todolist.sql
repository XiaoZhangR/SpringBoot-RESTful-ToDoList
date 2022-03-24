CREATE DATABASE  IF NOT EXISTS `todo_list`;
USE `todo_list`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `things_to_do`;

CREATE TABLE `things_to_do` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item` varchar(45) DEFAULT NULL,
  `status` BOOLEAN,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `things_to_do` VALUES
(1, 'study', true),
(2, 'workout', false),
(3, 'sleep', false)
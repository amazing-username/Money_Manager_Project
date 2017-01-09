-- MySQL dump 10.16  Distrib 10.1.20-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: localhost
-- ------------------------------------------------------
-- Server version	10.1.20-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clothingAccount`
--

DROP TABLE IF EXISTS `clothingAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clothingAccount` (
  `Date` char(16) DEFAULT NULL,
  `Account` char(25) DEFAULT NULL,
  `Balance` double DEFAULT NULL,
  `Transaction_Type` char(1) DEFAULT NULL,
  `Transaction` double DEFAULT NULL,
  `Comment` char(35) DEFAULT NULL,
  `Percent` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clothingAccount`
--

LOCK TABLES `clothingAccount` WRITE;
/*!40000 ALTER TABLE `clothingAccount` DISABLE KEYS */;
INSERT INTO `clothingAccount` VALUES ('2016-06-10-12-00','Clothing',74,'+',74,'Paycheck',12),('2016-06-25-12-00','Clothing',82,'+',8,'Paycheck',12),('2016-07-09-12-00','Clothing',98,'+',16,'Paycheck',12),('2016-08-01-12-00','Clothing',114,'+',16,'Paycheck',12),('2016-08-01-12-01','Clothing',87,'-',27,'Levi Purchase',12),('2016-08-06-12-00','Clothing',17,'-',70,'Nike Purchase',12),('2016-08-10-12-00','Clothing',32,'+',15,'Paycheck',12),('2016-08-25-12-00','Clothing',55,'+',23,'Paycheck',12),('2016-09-02-01-00','Clothing',67,'+',12,'Paycheck',12),('2016-09-03-13-00','Clothing',40.29,'-',26.71,'Jones Purchase',12),('2016-09-27-13-30','Clothing',44.01,'-',10.28,'Thrift Purchase',12),('2016-09-23-12-00','Clothing',54.29,'+',14,'Refund Leftover',12),('2016-09-30-00-00','Clothing',58.01,'+',14,'Paycheck',12),('2016-10-10-12-14','Clothing',29.88,'-',28.13,'Jones Purchase',12),('2016-10-14-00-00','Clothing',35.87,'+',6,'Paycheck',12),('2016-10-28-00-00','Clothing',49.86,'+',14,'Paycheck',12),('2016-11-10-00-00','Clothing',61.86,'+',12,'Paycheck',12),('2016-11-22-01-00','Clothing',78.86,'+',17,'Paycheck',12),('2016-12-09-12-12','Clothing',86.86,'+',8,'Paycheck',12),('2016-12-22-12-15','Clothing',96.86,'+',10,'Paycheck',12);
/*!40000 ALTER TABLE `clothingAccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entertainmentAccount`
--

DROP TABLE IF EXISTS `entertainmentAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entertainmentAccount` (
  `Date` char(16) DEFAULT NULL,
  `Account` char(25) DEFAULT NULL,
  `Balance` double DEFAULT NULL,
  `Transaction_Type` char(1) DEFAULT NULL,
  `Transaction` double DEFAULT NULL,
  `Comment` char(35) DEFAULT NULL,
  `Percent` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entertainmentAccount`
--

LOCK TABLES `entertainmentAccount` WRITE;
/*!40000 ALTER TABLE `entertainmentAccount` DISABLE KEYS */;
INSERT INTO `entertainmentAccount` VALUES ('2016-06-10-12-00','Entertainment',49,'+',49,'Paycheck',4),('2016-06-25-12-00','Entertainment',51,'+',2,'Paycheck',4),('2016-07-09-12-00','Entertainment',56,'+',5,'Paycheck',4),('2016-08-01-12-00','Entertainment',61,'+',5,'Paycheck',4),('2016-08-10-12-00','Entertainment',66,'+',5,'Paycheck',4),('2016-08-25-12-00','Entertainment',72,'+',6,'Paycheck',4),('2016-09-02-01-00','Entertainment',76,'+',4,'Paycheck',4),('2016-09-23-12-00','Entertainment',80,'+',4,'Refund Leftover',4),('2016-09-30-00-00','Entertainment',84,'+',4,'Paycheck',4),('2016-10-14-18-42','Entertainment',176.6,'+',90.6,'Account Transfer',13),('2016-10-14-00-00','Entertainment',86,'+',2,'Paycheck',4),('2016-10-27-16-00','Entertainment',142.81,'-',33.79,'PC Video Game',13),('2016-10-28-00-00','Entertainment',157.81,'+',15,'Paycheck',13),('2016-11-10-00-00','Entertainment',170.81,'+',13,'Paycheck',13),('2016-11-22-01-00','Entertainment',188.81,'+',18,'Paycheck',13),('2016-12-09-12-12','Entertainment',197.81,'+',9,'Paycheck',13),('2016-12-22-12-15','Entertainment',208.81,'+',11,'Paycheck',13);
/*!40000 ALTER TABLE `entertainmentAccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `familyAccount`
--

DROP TABLE IF EXISTS `familyAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `familyAccount` (
  `Date` char(16) DEFAULT NULL,
  `Account` char(25) DEFAULT NULL,
  `Balance` double DEFAULT NULL,
  `Transaction_Type` char(1) DEFAULT NULL,
  `Transaction` double DEFAULT NULL,
  `Comment` char(35) DEFAULT NULL,
  `Percent` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `familyAccount`
--

LOCK TABLES `familyAccount` WRITE;
/*!40000 ALTER TABLE `familyAccount` DISABLE KEYS */;
INSERT INTO `familyAccount` VALUES ('2016-06-10-12-00','Family',142,'+',142,'Paycheck',10),('2016-06-25-12-00','Family',148,'+',6,'Paycheck',10),('2016-07-09-12-00','Family',166.6,'+',18.6,'Paycheck',10),('2016-08-01-12-00','Family',180.6,'+',14,'Paycheck',10),('2016-08-10-12-00','Family',192.6,'+',12,'Paycheck',10),('2016-08-25-12-00','Family',208.6,'+',16,'Paycheck',10),('2016-09-02-01-00','Family',218.6,'+',10,'Paycheck',10),('2016-09-16-14-00','Family',198.6,'-',22,'Grocceries',10),('2016-09-16-14-30','Family',196.6,'-',2,'Bill Cover',10),('2016-09-23-12-00','Family',208.6,'+',12,'Refund Leftover',10),('2016-09-30-00-00','Family',220.6,'+',12,'Paycheck',14),('2016-10-14-00-00','Family',225.6,'+',5,'Paycheck',16),('2016-10-28-00-00','Family',243.6,'+',18,'Paycheck',16),('2016-11-10-00-00','Family',259.6,'+',16,'Paycheck',16),('2016-11-22-01-00','Family',281.6,'+',22,'Paycheck',16),('2016-11-23-20-05','Family',150.18,'-',131.42,'Plane Ticket',19),('2016-12-09-12-12','Family',163.18,'+',13,'Paycheck',19),('2016-12-22-12-15','Family',179.18,'+',16,'Paycheck',19),('2016-12-22-18-25','Family',99.18,'-',80,'Gifts',19),('2016-12-27-12-30','Family',55.18,'-',44,'Vitamins for mom',19);
/*!40000 ALTER TABLE `familyAccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `investingAccount`
--

DROP TABLE IF EXISTS `investingAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `investingAccount` (
  `Date` char(16) DEFAULT NULL,
  `Account` char(25) DEFAULT NULL,
  `Balance` double DEFAULT NULL,
  `Transaction_Type` char(1) DEFAULT NULL,
  `Transaction` double DEFAULT NULL,
  `Comment` char(35) DEFAULT NULL,
  `Percent` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `investingAccount`
--

LOCK TABLES `investingAccount` WRITE;
/*!40000 ALTER TABLE `investingAccount` DISABLE KEYS */;
INSERT INTO `investingAccount` VALUES ('2016-06-10-12-00','Investing',74,'+',74,'Paycheck',9),('2016-06-25-12-00','Investing',80,'+',6,'Paycheck',9),('2016-07-09-12-00','Investing',92,'+',12,'Paycheck',9),('2016-08-01-12-00','Investing',104,'+',12,'Paycheck',9),('2016-08-10-12-00','Investing',120,'+',16,'Paycheck',9),('2016-08-25-12-00','Investing',135,'+',15,'Paycheck',9),('2016-09-02-01-00','Investing',144,'+',9,'Paycheck',9),('2016-09-10-14-57','Investing',124.02,'-',19.98,'Book Rental',9),('2016-09-11-11-35','Investing',118.64,'-',5.38,'School Supplies',9),('2016-09-23-12-00','Investing',128.64,'+',10,'Refund Leftover',9),('2016-09-30-00-00','Investing',139.64,'+',11,'Paycheck',10),('2016-10-14-00-00','Investing',144.63,'+',5,'Paycheck',12),('2016-10-28-00-00','Investing',158.63,'+',14,'Paycheck',12),('2016-11-10-00-00','Investing',170.63,'+',12,'Paycheck',12),('2016-11-22-01-00','Investing',187.63,'+',17,'Paycheck',12),('2016-12-09-12-12','Investing',195.63,'+',8,'Paycheck',12),('2016-12-21-20-10','Investing',132.63,'-',63,'Bright Tangled Chain',12),('2016-12-22-12-15','Investing',142.63,'+',10,'Paycheck',12),('2016-12-27-22-30','Investing',122.63,'-',20,'Relief',12);
/*!40000 ALTER TABLE `investingAccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `miscellaneousAccount`
--

DROP TABLE IF EXISTS `miscellaneousAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `miscellaneousAccount` (
  `Date` char(16) DEFAULT NULL,
  `Account` char(25) DEFAULT NULL,
  `Balance` double DEFAULT NULL,
  `Transaction_Type` char(1) DEFAULT NULL,
  `Transaction` double DEFAULT NULL,
  `Comment` char(35) DEFAULT NULL,
  `Percent` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `miscellaneousAccount`
--

LOCK TABLES `miscellaneousAccount` WRITE;
/*!40000 ALTER TABLE `miscellaneousAccount` DISABLE KEYS */;
INSERT INTO `miscellaneousAccount` VALUES ('2016-06-10-12-00','Miscellaneous',27,'+',27,'Paycheck',18),('2016-06-25-12-00','Miscellaneous',40,'+',13,'Paycheck',18),('2016-07-09-12-00','Miscellaneous',47,'+',7,'Paycheck',18),('2016-08-01-12-00','Miscellaneous',54,'+',7,'Paycheck',18),('2016-08-10-12-00','Miscellaneous',76,'+',22,'Paycheck',18),('2016-08-25-12-00','Miscellaneous',106,'+',30,'Paycheck',18),('2016-09-02-01-00','Miscellaneous',124,'+',18,'Paycheck',18),('2016-09-03-13-00','Miscellaneous',12.65,'-',111.35,'Levi Purchase',18),('2016-09-23-12-00','Miscellaneous',39.65,'+',27,'Refund Leftover',18),('2016-09-30-00-00','Miscellaneous',65.65,'+',26,'Paycheck',18),('2016-10-14-18-42','Miscellaneous',197.65,'+',122,'Account Transfer',18),('2016-10-14-00-00','Miscellaneous',75.65,'+',10,'Paycheck',18),('2016-10-15-19-50','Miscellaneous',196.45,'-',1.2,'Movie Snacks',18),('2016-10-15-20-00','Miscellaneous',191.95,'-',4.5,'Movie',16),('2016-10-19-22-30','Miscellaneous',146.95,'-',45,'Goodbye Eric',16),('2016-10-19-22-30','Miscellaneous',137.95,'-',9,'GE Tip',16),('2016-10-28-00-00','Miscellaneous',155.94,'+',18,'Paycheck',16),('2016-10-29-20-00','Miscellaneous',136.94,'-',19,'XC NACC Champs',16),('2016-11-07-18-30','Miscellaneous',90.94,'-',46,'John\'s 21st',16),('2016-11-10-00-00','Miscellaneous',106.94,'+',16,'Paycheck',16),('2016-11-13-11-30','Miscellaneous',99.47,'-',7.47,'Krispy Kreme with friends',16),('2016-11-17-19-00','Miscellaneous',88.49,'-',10.98,'Jimmy\'s Mac part fix',16),('2016-11-22-01-00','Miscellaneous',110.49,'+',22,'Paycheck',16),('2016-11-22-12-00','Miscellaneous',125.49,'+',15,'Jimmy\'s Mac Reimbursement',16),('2016-11-22-22-30','Miscellaneous',111.72,'-',13.77,'Bar partner surrogate',16),('2016-12-09-12-12','Miscellaneous',122.72,'+',11,'Paycheck',16),('2016-12-22-12-15','Miscellaneous',136.72,'+',14,'Paycheck',16),('2016-12-29-20-00','Miscellaneous',74.72,'-',62,'Splurge',18);
/*!40000 ALTER TABLE `miscellaneousAccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personalAccount`
--

DROP TABLE IF EXISTS `personalAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personalAccount` (
  `Date` char(16) DEFAULT NULL,
  `Account` char(25) DEFAULT NULL,
  `Balance` double DEFAULT NULL,
  `Transaction_Type` char(1) DEFAULT NULL,
  `Transaction` double DEFAULT NULL,
  `Comment` char(35) DEFAULT NULL,
  `Percent` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personalAccount`
--

LOCK TABLES `personalAccount` WRITE;
/*!40000 ALTER TABLE `personalAccount` DISABLE KEYS */;
INSERT INTO `personalAccount` VALUES ('2016-06-10-12-00','Personal',339,'+',339,'Paycheck',15),('2016-06-25-12-00','Personal',355.78,'+',16.78,'Paycheck',15),('2016-07-09-12-00','Personal',376.78,'+',21,'Paycheck',15),('2016-08-01-12-00','Personal',397.78,'+',21,'Paycheck',15),('2016-08-10-12-00','Personal',415.78,'+',18,'Paycheck',15),('2016-08-25-12-00','Personal',440.78,'+',25,'Paycheck',15),('2016-09-02-01-00','Personal',455.78,'+',15,'Paycheck',15),('2016-09-14-12-00','Personal',400.78,'-',55,'House Bills',15),('2016-09-20-16-40','Personal',392.78,'-',8,'Food With Friend',15),('2016-09-23-12-00','Personal',410.78,'+',18,'Refund Leftover',15),('2016-09-30-00-00','Personal',428.78,'+',18,'Paycheck',15),('2016-10-14-18-42','Personal',558.78,'+',122,'Account Transfer',19),('2016-10-14-00-00','Personal',436.78,'+',8,'Paycheck',15),('2016-10-28-00-00','Personal',580.78,'+',22,'Paycheck',19),('2016-11-10-00-00','Personal',599.78,'+',19,'Paycheck',19),('2016-11-22-01-00','Personal',626.78,'+',27,'Paycheck',19),('2016-11-23-20-05','Personal',426,'-',200.78,'Plane Ticket',19),('2016-12-09-12-12','Personal',439,'+',13,'Paycheck',19),('2016-12-20-08-30','Personal',432.39,'-',6.61,'Uber to Metra',18),('2016-12-20-10-00','Personal',400.02,'-',32.37,'Uber to Ohare',19),('2016-12-20-11-00','Personal',392.27,'-',7.75,'Metra to Chicago',19),('2016-12-20-11-20','Personal',367.27,'-',25,'Baggage check-in',19),('2016-12-20-11-30','Personal',360.59,'-',6.86,'McD at Ohare',19),('2016-12-20-15-30','Personal',354.24,'-',5.83,'Wendys at NC',19),('2016-12-22-12-15','Personal',370.24,'+',16,'Paycheck',19),('2016-12-30-12-00','Personal',346.24,'-',24,'Chocolate',19),('2017-01-03-13-00','Personal',285.24,'-',61,'Splurge',19);
/*!40000 ALTER TABLE `personalAccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `runningAccount`
--

DROP TABLE IF EXISTS `runningAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `runningAccount` (
  `Date` char(16) DEFAULT NULL,
  `Account` char(25) DEFAULT NULL,
  `Balance` double DEFAULT NULL,
  `Transaction_Type` char(1) DEFAULT NULL,
  `Transaction` double DEFAULT NULL,
  `Comment` char(35) DEFAULT NULL,
  `Percent` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `runningAccount`
--

LOCK TABLES `runningAccount` WRITE;
/*!40000 ALTER TABLE `runningAccount` DISABLE KEYS */;
INSERT INTO `runningAccount` VALUES ('2016-06-10-12-00','Running',26,'+',26,'Paycheck',10),('2016-06-25-12-00','Running',32,'+',6,'Paycheck',10),('2016-07-09-12-00','Running',46,'+',14,'Paycheck',10),('2016-08-01-12-00','Running',60,'+',14,'Paycheck',10),('2016-08-06-12-00','Running',0,'-',60,'Nike Purchase',10),('2016-08-10-12-00','Running',12,'+',12,'Paycheck',10),('2016-08-25-12-00','Running',28,'+',16,'Paycheck',10),('2016-09-02-01-00','Running',38,'+',10,'Paycheck',10),('2016-09-05-17-00','Running',11,'-',27,'Asics Order',10),('2016-09-23-12-00','Running',23,'+',12,'Refund Leftover',10),('2016-09-30-00-00','Running',35,'+',12,'Paycheck',10),('2016-10-14-00-00','Running',40,'+',5,'Paycheck',10),('2016-10-24-13-09','Running',81.94,'+',41.94,'Account Transfer',12),('2016-10-28-00-00','Running',95.94,'+',14,'Paycheck',12),('2016-11-10-00-00','Running',107.94,'+',12,'Paycheck',12),('2016-11-22-01-00','Running',124.94,'+',17,'Paycheck',12),('2016-12-09-12-12','Running',132.94,'+',8,'Paycheck',12),('2016-12-15-12-00','Running',122.95,'-',9.99,'Insulated gloves',10),('2016-12-15-12-30','Running',106,'-',16.95,'Thick gloves',10),('2016-12-22-12-15','Running',114,'+',8,'Paycheck',10);
/*!40000 ALTER TABLE `runningAccount` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-08 16:16:35

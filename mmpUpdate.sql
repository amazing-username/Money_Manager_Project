-- MySQL dump 10.16  Distrib 10.1.17-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: moneydatabase
-- ------------------------------------------------------
-- Server version	10.1.17-MariaDB

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
-- Table structure for table `carAccount`
--

DROP TABLE IF EXISTS `carAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carAccount` (
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
-- Dumping data for table `carAccount`
--

LOCK TABLES `carAccount` WRITE;
/*!40000 ALTER TABLE `carAccount` DISABLE KEYS */;
INSERT INTO `carAccount` VALUES ('2016-06-10-12-00','Car',135,'+',135,'Paycheck',11),('2016-06-25-12-00','Car',142,'+',7,'Paycheck',11),('2016-07-09-12-00','Car',157,'+',15,'Paycheck',11),('2016-08-01-12-00','Car',180,'+',23,'Paycheck',11),('2016-08-10-12-00','Car',193,'+',13,'Paycheck',11),('2016-08-25-12-00','Car',211,'+',18,'Paycheck',11),('2016-09-02-01-00','Car',222,'+',11,'Paycheck',11),('2016-09-14-12-00','Car',218,'-',4,'Food With Friend',11),('2016-09-23-12-00','Car',231,'+',13,'Refund Leftover',11),('2016-09-30-00-00','Car',244,'+',13,'Paycheck',11);
/*!40000 ALTER TABLE `carAccount` ENABLE KEYS */;
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
INSERT INTO `entertainmentAccount` VALUES ('2016-06-10-12-00','Entertainment',49,'+',49,'Paycheck',4),('2016-06-25-12-00','Entertainment',51,'+',2,'Paycheck',4),('2016-07-09-12-00','Entertainment',56,'+',5,'Paycheck',4),('2016-08-01-12-00','Entertainment',61,'+',5,'Paycheck',4),('2016-08-10-12-00','Entertainment',66,'+',5,'Paycheck',4),('2016-08-25-12-00','Entertainment',72,'+',6,'Paycheck',4),('2016-09-02-01-00','Entertainment',76,'+',4,'Paycheck',4),('2016-09-23-12-00','Entertainment',80,'+',4,'Refund Leftover',4),('2016-09-30-00-00','Entertainment',84,'+',4,'Paycheck',4);
/*!40000 ALTER TABLE `entertainmentAccount` ENABLE KEYS */;
UNLOCK TABLES;

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
INSERT INTO `clothingAccount` VALUES ('2016-06-10-12-00','Clothing',74,'+',74,'Paycheck',12),('2016-06-25-12-00','Clothing',82,'+',8,'Paycheck',12),('2016-07-09-12-00','Clothing',98,'+',16,'Paycheck',12),('2016-08-01-12-00','Clothing',114,'+',16,'Paycheck',12),('2016-08-01-12-01','Clothing',87,'-',27,'Levi Purchase',12),('2016-08-06-12-00','Clothing',17,'-',70,'Nike Purchase',12),('2016-08-10-12-00','Clothing',32,'+',15,'Paycheck',12),('2016-08-25-12-00','Clothing',55,'+',23,'Paycheck',12),('2016-09-02-01-00','Clothing',67,'+',12,'Paycheck',12),('2016-09-03-13-00','Clothing',40.29,'-',26.71,'Jones Purchase',12),('2016-09-27-13-30','Clothing',44.01,'-',10.28,'Thrift Purchase',12),('2016-09-23-12-00','Clothing',54.29,'+',14,'Refund Leftover',12),('2016-09-30-00-00','Clothing',58.01,'+',14,'Paycheck',12);
/*!40000 ALTER TABLE `clothingAccount` ENABLE KEYS */;
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
INSERT INTO `familyAccount` VALUES ('2016-06-10-12-00','Family',142,'+',142,'Paycheck',10),('2016-06-25-12-00','Family',148,'+',6,'Paycheck',10),('2016-07-09-12-00','Family',166.6,'+',18.6,'Paycheck',10),('2016-08-01-12-00','Family',180.6,'+',14,'Paycheck',10),('2016-08-10-12-00','Family',192.6,'+',12,'Paycheck',10),('2016-08-25-12-00','Family',208.6,'+',16,'Paycheck',10),('2016-09-02-01-00','Family',218.6,'+',10,'Paycheck',10),('2016-09-16-14-00','Family',198.6,'-',22,'Grocceries',10),('2016-09-16-14-30','Family',196.6,'-',2,'Bill Cover',10),('2016-09-23-12-00','Family',208.6,'+',12,'Refund Leftover',10),('2016-09-30-00-00','Family',220.6,'+',12,'Paycheck',10);
/*!40000 ALTER TABLE `familyAccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `iPhoneAccount`
--

DROP TABLE IF EXISTS `iPhoneAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `iPhoneAccount` (
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
-- Dumping data for table `iPhoneAccount`
--

LOCK TABLES `iPhoneAccount` WRITE;
/*!40000 ALTER TABLE `iPhoneAccount` DISABLE KEYS */;
INSERT INTO `iPhoneAccount` VALUES ('2016-06-10-12-00','iPhone',36.6,'+',36.6,'Paycheck',3),('2016-06-25-12-00','iPhone',43.6,'+',7,'Paycheck',3),('2016-07-09-12-00','iPhone',58.6,'+',15,'Paycheck',3),('2016-08-01-12-00','iPhone',73.6,'+',15,'Paycheck',3),('2016-08-10-12-00','iPhone',76.6,'+',3,'Paycheck',3),('2016-08-25-12-00','iPhone',81.6,'+',5,'Paycheck',3),('2016-09-02-01-00','iPhone',84.6,'+',3,'Paycheck',3),('2016-09-23-12-00','iPhone',87.6,'+',3,'Refund Leftover',3),('2016-09-30-00-00','iPhone',90.6,'+',3,'Paycheck',3);
/*!40000 ALTER TABLE `iPhoneAccount` ENABLE KEYS */;
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
INSERT INTO `investingAccount` VALUES ('2016-06-10-12-00','Investing',74,'+',74,'Paycheck',9),('2016-06-25-12-00','Investing',80,'+',6,'Paycheck',9),('2016-07-09-12-00','Investing',92,'+',12,'Paycheck',9),('2016-08-01-12-00','Investing',104,'+',12,'Paycheck',9),('2016-08-10-12-00','Investing',120,'+',16,'Paycheck',9),('2016-08-25-12-00','Investing',135,'+',15,'Paycheck',9),('2016-09-02-01-00','Investing',144,'+',9,'Paycheck',9),('2016-09-10-14-57','Investing',124.02,'-',19.98,'Book Rental',9),('2016-09-11-11-35','Investing',118.64,'-',5.38,'School Supplies',9),('2016-09-23-12-00','Investing',128.64,'+',10,'Refund Leftover',9),('2016-09-30-00-00','Investing',139.64,'+',11,'Paycheck',9);
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
INSERT INTO `miscellaneousAccount` VALUES ('2016-06-10-12-00','Miscellaneous',27,'+',27,'Paycheck',18),('2016-06-25-12-00','Miscellaneous',40,'+',13,'Paycheck',18),('2016-07-09-12-00','Miscellaneous',47,'+',7,'Paycheck',18),('2016-08-01-12-00','Miscellaneous',54,'+',7,'Paycheck',18),('2016-08-10-12-00','Miscellaneous',76,'+',22,'Paycheck',18),('2016-08-25-12-00','Miscellaneous',106,'+',30,'Paycheck',18),('2016-09-02-01-00','Miscellaneous',124,'+',18,'Paycheck',18),('2016-09-03-13-00','Miscellaneous',12.65,'-',111.35,'Levi Purchase',18),('2016-09-23-12-00','Miscellaneous',39.65,'+',27,'Refund Leftover',18),('2016-09-30-00-00','Miscellaneous',65.65,'+',26,'Paycheck',18);
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
INSERT INTO `personalAccount` VALUES ('2016-06-10-12-00','Personal',339,'+',339,'Paycheck',15),('2016-06-25-12-00','Personal',355.78,'+',16.78,'Paycheck',15),('2016-07-09-12-00','Personal',376.78,'+',21,'Paycheck',15),('2016-08-01-12-00','Personal',397.78,'+',21,'Paycheck',15),('2016-08-10-12-00','Personal',415.78,'+',18,'Paycheck',15),('2016-08-25-12-00','Personal',440.78,'+',25,'Paycheck',15),('2016-09-02-01-00','Personal',455.78,'+',15,'Paycheck',15),('2016-09-14-12-00','Personal',400.78,'-',55,'House Bills',15),('2016-09-20-16-40','Personal',392.78,'-',8,'Food With Friend',15),('2016-09-23-12-00','Personal',410.78,'+',18,'Refund Leftover',15),('2016-09-30-00-00','Personal',428.78,'+',18,'Paycheck',15);
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
INSERT INTO `runningAccount` VALUES ('2016-06-10-12-00','Running',26,'+',26,'Paycheck',10),('2016-06-25-12-00','Running',32,'+',6,'Paycheck',10),('2016-07-09-12-00','Running',46,'+',14,'Paycheck',10),('2016-08-01-12-00','Running',60,'+',14,'Paycheck',10),('2016-08-06-12-00','Running',0,'-',60,'Nike Purchase',10),('2016-08-10-12-00','Running',12,'+',12,'Paycheck',10),('2016-08-25-12-00','Running',28,'+',16,'Paycheck',10),('2016-09-02-01-00','Running',38,'+',10,'Paycheck',10),('2016-09-05-17-00','Running',11,'-',27,'Asics Order',10),('2016-09-23-12-00','Running',23,'+',12,'Refund Leftover',10),('2016-09-30-00-00','Running',35,'+',12,'Paycheck',10);
/*!40000 ALTER TABLE `runningAccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplementsAccount`
--

DROP TABLE IF EXISTS `supplementsAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplementsAccount` (
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
-- Dumping data for table `supplementsAccount`
--

LOCK TABLES `supplementsAccount` WRITE;
/*!40000 ALTER TABLE `supplementsAccount` DISABLE KEYS */;
INSERT INTO `supplementsAccount` VALUES ('2016-06-10-12-00','Supplements',57,'+',57,'Paycheck',8),('2016-06-25-12-00','Supplements',62,'+',5,'Paycheck',8),('2016-07-09-12-00','Supplements',73,'+',11,'Paycheck',8),('2016-08-01-12-00','Supplements',8,'-',65,'Purchase',8),('2016-08-01-12-01','Supplements',19,'+',11,'Paycheck',8),('2016-08-10-12-00','Supplements',28,'+',9,'Paycheck',8),('2016-08-25-12-00','Supplements',41,'+',13,'Paycheck',8),('2016-09-02-01-00','Supplements',49,'+',8,'Paycheck',8),('2016-09-23-12-00','Supplements',58,'+',9,'Refund Leftover',8),('2016-09-30-00-00','Supplements',67,'+',9,'Paycheck',8),('2016-10-01-08-46','Supplements',37.94,'-',29.06,'Purchase',8);
/*!40000 ALTER TABLE `supplementsAccount` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-03 20:58:50

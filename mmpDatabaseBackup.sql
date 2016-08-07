-- MySQL dump 10.16  Distrib 10.1.14-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: moneydatabase
-- ------------------------------------------------------
-- Server version	10.1.14-MariaDB

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
  `Comment` char(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carAccount`
--

LOCK TABLES `carAccount` WRITE;
/*!40000 ALTER TABLE `carAccount` DISABLE KEYS */;
INSERT INTO `carAccount` VALUES ('2016-06-10-12-00','Car',135,'+',135,'Paycheck'),('2016-06-25-12-00','Car',142,'+',7,'Paycheck'),('2016-07-09-12-00','Car',157,'+',15,'Paycheck'),('2016-08-01-12-00','Car',180,'+',23,'Paycheck');
/*!40000 ALTER TABLE `carAccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chessSetAccount`
--

DROP TABLE IF EXISTS `chessSetAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chessSetAccount` (
  `Date` char(16) DEFAULT NULL,
  `Account` char(25) DEFAULT NULL,
  `Balance` double DEFAULT NULL,
  `Transaction_Type` char(1) DEFAULT NULL,
  `Transaction` double DEFAULT NULL,
  `Comment` char(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chessSetAccount`
--

LOCK TABLES `chessSetAccount` WRITE;
/*!40000 ALTER TABLE `chessSetAccount` DISABLE KEYS */;
INSERT INTO `chessSetAccount` VALUES ('2016-06-10-12-00','Chess Set',49,'+',49,'Paycheck'),('2016-06-25-12-00','Chess Set',51,'+',2,'Paycheck'),('2016-07-09-12-00','Chess Set',56,'+',5,'Paycheck'),('2016-08-01-12-00','Chess Set',61,'+',5,'Paycheck');
/*!40000 ALTER TABLE `chessSetAccount` ENABLE KEYS */;
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
  `Comment` char(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clothingAccount`
--

LOCK TABLES `clothingAccount` WRITE;
/*!40000 ALTER TABLE `clothingAccount` DISABLE KEYS */;
INSERT INTO `clothingAccount` VALUES ('2016-06-10-12-00','Clothing',74,'+',74,'Paycheck'),('2016-06-25-12-00','Clothing',82,'+',8,'Paycheck'),('2016-07-09-12-00','Clothing',98,'+',16,'Paycheck'),('2016-08-01-12-00','Clothing',114,'+',16,'Paycheck');
/*!40000 ALTER TABLE `clothingAccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `familyEmergencyAccount`
--

DROP TABLE IF EXISTS `familyEmergencyAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `familyEmergencyAccount` (
  `Date` char(16) DEFAULT NULL,
  `Account` char(25) DEFAULT NULL,
  `Balance` double DEFAULT NULL,
  `Transaction_Type` char(1) DEFAULT NULL,
  `Transaction` double DEFAULT NULL,
  `Comment` char(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `familyEmergencyAccount`
--

LOCK TABLES `familyEmergencyAccount` WRITE;
/*!40000 ALTER TABLE `familyEmergencyAccount` DISABLE KEYS */;
INSERT INTO `familyEmergencyAccount` VALUES ('2016-06-10-12-00','Family Emergency',142,'+',142,'Paycheck'),('2016-06-25-12-00','Family Emergency',148,'+',6,'Paycheck'),('2016-07-09-12-00','Family Emergency',166.6,'+',18.6,'Paycheck'),('2016-08-01-12-00','Family Emergency',180.6,'+',14,'Paycheck');
/*!40000 ALTER TABLE `familyEmergencyAccount` ENABLE KEYS */;
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
  `Comment` char(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `iPhoneAccount`
--

LOCK TABLES `iPhoneAccount` WRITE;
/*!40000 ALTER TABLE `iPhoneAccount` DISABLE KEYS */;
INSERT INTO `iPhoneAccount` VALUES ('2016-06-10-12-00','iPhone',36.6,'+',36.6,'Paycheck'),('2016-06-25-12-00','iPhone',43.6,'+',7,'Paycheck'),('2016-07-09-12-00','iPhone',58.6,'+',15,'Paycheck'),('2016-08-01-12-00','iPhone',73.6,'+',15,'Paycheck');
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
  `Comment` char(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `investingAccount`
--

LOCK TABLES `investingAccount` WRITE;
/*!40000 ALTER TABLE `investingAccount` DISABLE KEYS */;
INSERT INTO `investingAccount` VALUES ('2016-06-10-12-00','Investing',74,'+',74,'Paycheck'),('2016-06-25-12-00','Investing',80,'+',6,'Paycheck'),('2016-07-09-12-00','Investing',92,'+',12,'Paycheck'),('2016-08-01-12-00','Investing',104,'+',12,'Paycheck');
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
  `Comment` char(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `miscellaneousAccount`
--

LOCK TABLES `miscellaneousAccount` WRITE;
/*!40000 ALTER TABLE `miscellaneousAccount` DISABLE KEYS */;
INSERT INTO `miscellaneousAccount` VALUES ('2016-06-10-12-00','Miscellaneous',27,'+',27,'Paycheck'),('2016-06-25-12-00','Miscellaneous',40,'+',13,'Paycheck'),('2016-07-09-12-00','Miscellaneous',47,'+',7,'Paycheck'),('2016-08-01-12-00','Miscellaneous',54,'+',7,'Paycheck');
/*!40000 ALTER TABLE `miscellaneousAccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personalEmergencyAccount`
--

DROP TABLE IF EXISTS `personalEmergencyAccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personalEmergencyAccount` (
  `Date` char(16) DEFAULT NULL,
  `Account` char(25) DEFAULT NULL,
  `Balance` double DEFAULT NULL,
  `Transaction_Type` char(1) DEFAULT NULL,
  `Transaction` double DEFAULT NULL,
  `Comment` char(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personalEmergencyAccount`
--

LOCK TABLES `personalEmergencyAccount` WRITE;
/*!40000 ALTER TABLE `personalEmergencyAccount` DISABLE KEYS */;
INSERT INTO `personalEmergencyAccount` VALUES ('2016-06-10-12-00','Personal Emergency',339,'+',339,'Paycheck'),('2016-06-25-12-00','Personal Emergency',355.78,'+',16.78,'Paycheck'),('2016-07-09-12-00','Personal Emergency',376.78,'+',21,'Paycheck'),('2016-08-01-12-00','Personal Emergency',397.78,'+',21,'Paycheck');
/*!40000 ALTER TABLE `personalEmergencyAccount` ENABLE KEYS */;
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
  `Comment` char(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `runningAccount`
--

LOCK TABLES `runningAccount` WRITE;
/*!40000 ALTER TABLE `runningAccount` DISABLE KEYS */;
INSERT INTO `runningAccount` VALUES ('2016-06-10-12-00','Running',26,'+',26,'Paycheck'),('2016-06-25-12-00','Running',32,'+',6,'Paycheck'),('2016-07-09-12-00','Running',46,'+',14,'Paycheck'),('2016-08-01-12-00','Running',60,'+',14,'Paycheck');
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
  `Comment` char(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplementsAccount`
--

LOCK TABLES `supplementsAccount` WRITE;
/*!40000 ALTER TABLE `supplementsAccount` DISABLE KEYS */;
INSERT INTO `supplementsAccount` VALUES ('2016-06-10-12-00','Supplements',57,'+',57,'Paycheck'),('2016-06-25-12-00','Supplements',62,'+',5,'Paycheck'),('2016-07-09-12-00','Supplements',73,'+',11,'Paycheck'),('2016-08-01-12-00','Supplements',8,'-',65,'Purchase'),('2016-08-01-12-01','Supplements',19,'+',11,'Paycheck');
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

-- Dump completed on 2016-08-03 13:33:13

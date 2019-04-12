CREATE DATABASE  IF NOT EXISTS `horizon` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `horizon`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: horizon
-- ------------------------------------------------------
-- Server version	5.7.19-log

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
-- Table structure for table `horizonevent`
--

DROP TABLE IF EXISTS `horizonevent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `horizonevent` (
  `eID` int(11) NOT NULL AUTO_INCREMENT,
  `eName` varchar(50) DEFAULT NULL,
  `eLocation` varchar(100) DEFAULT NULL,
  `eDatetime` varchar(50) DEFAULT NULL,
  `eSize` int(11) DEFAULT NULL,
  PRIMARY KEY (`eID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horizonevent`
--

LOCK TABLES `horizonevent` WRITE;
/*!40000 ALTER TABLE `horizonevent` DISABLE KEYS */;
/*!40000 ALTER TABLE `horizonevent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jobs`
--

DROP TABLE IF EXISTS `jobs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jobs` (
  `jID` int(11) NOT NULL AUTO_INCREMENT,
  `jTitle` varchar(50) DEFAULT NULL,
  `jDatetime` varchar(50) DEFAULT NULL,
  `eID` int(11) DEFAULT NULL,
  PRIMARY KEY (`jID`),
  KEY `fk_jobs` (`eID`),
  CONSTRAINT `fk_jobs` FOREIGN KEY (`eID`) REFERENCES `horizonevent` (`eID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jobs`
--

LOCK TABLES `jobs` WRITE;
/*!40000 ALTER TABLE `jobs` DISABLE KEYS */;
/*!40000 ALTER TABLE `jobs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sponsors`
--

DROP TABLE IF EXISTS `sponsors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sponsors` (
  `spID` int(11) NOT NULL AUTO_INCREMENT,
  `spName` varchar(50) DEFAULT NULL,
  `spFname` varchar(50) DEFAULT NULL,
  `spLname` varchar(50) DEFAULT NULL,
  `spPhone` varchar(50) DEFAULT NULL,
  `spPledge` int(11) DEFAULT NULL,
  `eID` int(11) DEFAULT NULL,
  PRIMARY KEY (`spID`),
  KEY `fk_sponsors` (`eID`),
  CONSTRAINT `fk_sponsors` FOREIGN KEY (`eID`) REFERENCES `horizonevent` (`eID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sponsors`
--

LOCK TABLES `sponsors` WRITE;
/*!40000 ALTER TABLE `sponsors` DISABLE KEYS */;
/*!40000 ALTER TABLE `sponsors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `staff` (
  `sID` int(11) NOT NULL AUTO_INCREMENT,
  `sFname` varchar(50) DEFAULT NULL,
  `sLname` varchar(100) DEFAULT NULL,
  `sPhone` varchar(50) DEFAULT NULL,
  `sDatetime` varchar(50) DEFAULT NULL,
  `sStatus` varchar(50) DEFAULT NULL,
  `eID` int(11) DEFAULT NULL,
  PRIMARY KEY (`sID`),
  KEY `fk_staff` (`eID`),
  CONSTRAINT `fk_staff` FOREIGN KEY (`eID`) REFERENCES `horizonevent` (`eID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendors`
--

DROP TABLE IF EXISTS `vendors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendors` (
  `vID` int(11) NOT NULL AUTO_INCREMENT,
  `vName` varchar(50) DEFAULT NULL,
  `vFname` varchar(50) DEFAULT NULL,
  `vLname` varchar(50) DEFAULT NULL,
  `vMedium` varchar(50) DEFAULT NULL,
  `vStatus` varchar(50) DEFAULT NULL,
  `eID` int(11) DEFAULT NULL,
  `vPhone` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`vID`),
  KEY `fk_vendors` (`eID`),
  CONSTRAINT `fk_vendors` FOREIGN KEY (`eID`) REFERENCES `horizonevent` (`eID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendors`
--

LOCK TABLES `vendors` WRITE;
/*!40000 ALTER TABLE `vendors` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendors` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-14  9:43:45

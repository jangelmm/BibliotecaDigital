-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: biblioteca_db
-- ------------------------------------------------------
-- Server version	9.2.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (1,'Juan Rulfo'),(2,'Gabriel Garcia Marquez'),(3,'Guillermo del Toro'),(4,'Jose Emilio Pacheco'),(5,'Homero');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `material_autor`
--

DROP TABLE IF EXISTS `material_autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `material_autor` (
  `material_id` int NOT NULL,
  `autor_id` int NOT NULL,
  KEY `FKiaql65a0o0i1xaq5sefkxv0nk` (`autor_id`),
  KEY `FKocmxbr8yngeybammrj7nibac9` (`material_id`),
  CONSTRAINT `FKiaql65a0o0i1xaq5sefkxv0nk` FOREIGN KEY (`autor_id`) REFERENCES `autor` (`id`),
  CONSTRAINT `FKocmxbr8yngeybammrj7nibac9` FOREIGN KEY (`material_id`) REFERENCES `materialbiblioteca` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `material_autor`
--

LOCK TABLES `material_autor` WRITE;
/*!40000 ALTER TABLE `material_autor` DISABLE KEYS */;
INSERT INTO `material_autor` VALUES (1,5),(2,3);
/*!40000 ALTER TABLE `material_autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `materialbiblioteca`
--

DROP TABLE IF EXISTS `materialbiblioteca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materialbiblioteca` (
  `TIPO_MATERIAL` varchar(31) NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `anio` int NOT NULL,
  `disponible` bit(1) NOT NULL,
  `rutaArchivo` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `editorial` varchar(255) DEFAULT NULL,
  `numPaginas` int DEFAULT NULL,
  `numero` int DEFAULT NULL,
  `duracion` float DEFAULT NULL,
  `formato` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materialbiblioteca`
--

LOCK TABLES `materialbiblioteca` WRITE;
/*!40000 ALTER TABLE `materialbiblioteca` DISABLE KEYS */;
INSERT INTO `materialbiblioteca` VALUES ('LIBRO',1,-100,_binary '','/ruta/archivo1.pdf','La Odisea','Mundo',500,NULL,NULL,NULL),('VIDEO',2,2013,_binary '','/media/vid1.mp4','Titanes del Pacifico',NULL,NULL,NULL,131,'mp4');
/*!40000 ALTER TABLE `materialbiblioteca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamo`
--

DROP TABLE IF EXISTS `prestamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fechaDevolucion` date DEFAULT NULL,
  `fechaPrestamo` date DEFAULT NULL,
  `usuario_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKbivngnhldmsxy0069wr5u9a06` (`usuario_id`),
  CONSTRAINT `FKbivngnhldmsxy0069wr5u9a06` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamo`
--

LOCK TABLES `prestamo` WRITE;
/*!40000 ALTER TABLE `prestamo` DISABLE KEYS */;
INSERT INTO `prestamo` VALUES (1,NULL,'2025-09-18',3);
/*!40000 ALTER TABLE `prestamo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamo_material`
--

DROP TABLE IF EXISTS `prestamo_material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamo_material` (
  `prestamo_id` int NOT NULL,
  `material_id` int NOT NULL,
  KEY `FK40s54hjmr7rij0s4w4icwr40c` (`material_id`),
  KEY `FK6cn0fung70sfc6xjsceovrm6h` (`prestamo_id`),
  CONSTRAINT `FK40s54hjmr7rij0s4w4icwr40c` FOREIGN KEY (`material_id`) REFERENCES `materialbiblioteca` (`id`),
  CONSTRAINT `FK6cn0fung70sfc6xjsceovrm6h` FOREIGN KEY (`prestamo_id`) REFERENCES `prestamo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamo_material`
--

LOCK TABLES `prestamo_material` WRITE;
/*!40000 ALTER TABLE `prestamo_material` DISABLE KEYS */;
INSERT INTO `prestamo_material` VALUES (1,2);
/*!40000 ALTER TABLE `prestamo_material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `passwordHash` varchar(255) DEFAULT NULL,
  `rol` enum('ADMINISTRADOR','CLIENTE','ENCARGADO') DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_4tdehxj7dh8ghfc68kbwbsbll` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'jesus@gmail.com','jesus','$2a$10$8nUOlnc69ux0Cdilzzpa9uuG6BpkRuHxyoL2MC9tddP5dATv1wqz.','ADMINISTRADOR'),(2,'angel@gmail.com','angel','$2a$10$ibx0CKvxOwBRQPmta4NsO.sIgvVlmOyvXOWpR3Lx8JUwu5EHDv19q','ENCARGADO'),(3,'jose@gmail.com','jose','$2a$10$NPvCvASm4vWPhPBvSxeKxOJPoWirTkG4BaO97RDRdUP6/lR5LME7O','CLIENTE');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-09-18 20:49:34

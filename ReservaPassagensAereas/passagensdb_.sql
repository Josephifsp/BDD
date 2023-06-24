#
# Criação da base de dados "passagensdb"
#

CREATE DATABASE passagensdb

#
# Uso da base de dados "passagensdb"
#

USE passagensdb

#
# Estrutura para tabela "avioes"
#

CREATE TABLE `avioes` (
  `Modelo` varchar(50) NOT NULL DEFAULT '',
  `total_fileiras` int DEFAULT '0',
  `total_assentos` int DEFAULT '0',
  PRIMARY KEY (`Modelo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#
# Estrutura para tabela "voos"
#

CREATE TABLE `voos` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `data` varchar(255) DEFAULT '',
  `hora` varchar(6) DEFAULT '',
  `destino` varchar(20) DEFAULT '',
  `modelo` varchar(50) DEFAULT '',
  PRIMARY KEY (`Id`),
  KEY `modelo` (`modelo`),
  CONSTRAINT `voos_ibfk_1` FOREIGN KEY (`modelo`) REFERENCES `avioes` (`Modelo`) ON DELETE RESTRICT ON UPDATE RESTRICT
) 
#
# Estrutura para tabela "assentos_ocupados"
#

CREATE TABLE `assentos_ocupados` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `id_voo` int NOT NULL DEFAULT '0',
  `modelo_aviao` varchar(20) NOT NULL DEFAULT '0',
  `assentos_ocupados` varchar(255) DEFAULT '',
  PRIMARY KEY (`Id`),
  KEY `id_voo` (`id_voo`),
  KEY `modelo_aviao` (`modelo_aviao`),
  CONSTRAINT `assentos_ocupados_ibfk_1` FOREIGN KEY (`id_voo`) REFERENCES `voos` (`Id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `assentos_ocupados_ibfk_2` FOREIGN KEY (`modelo_aviao`) REFERENCES `avioes` (`Modelo`) ON DELETE RESTRICT ON UPDATE RESTRICT
) 

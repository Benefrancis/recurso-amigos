-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.8-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura para tabela api-amigos.amigo
CREATE TABLE IF NOT EXISTS `amigo` (
  `id` bigint(20) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela api-amigos.amigo: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `amigo` DISABLE KEYS */;
INSERT IGNORE INTO `amigo` (`id`, `nome`) VALUES
	(1, 'Luiz '),
	(2, 'José '),
	(3, 'Paulo ');
/*!40000 ALTER TABLE `amigo` ENABLE KEYS */;

-- Copiando estrutura para tabela api-amigos.evento
CREATE TABLE IF NOT EXISTS `evento` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `data` date DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `tipo` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK3pwttvhsp7qna30b8px52d0oq` (`tipo`),
  CONSTRAINT `FK3pwttvhsp7qna30b8px52d0oq` FOREIGN KEY (`tipo`) REFERENCES `tipoevento` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela api-amigos.evento: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `evento` DISABLE KEYS */;
INSERT IGNORE INTO `evento` (`id`, `data`, `descricao`, `hora`, `nome`, `tipo`) VALUES
	(10, '2020-04-19', 'Jantar cheio de chocolate', '19:00:00', 'Jantar Top demais', 3),
	(11, '2020-04-22', 'Jantar com muita cerveja', '19:00:00', 'Jantar com os Brothers', 3);
/*!40000 ALTER TABLE `evento` ENABLE KEYS */;

-- Copiando estrutura para tabela api-amigos.evento_convidados
CREATE TABLE IF NOT EXISTS `evento_convidados` (
  `Evento_id` bigint(20) NOT NULL,
  `convidados` bigint(20) NOT NULL,
  KEY `FKi11c5x6idg9yohwtmjb2am6sl` (`convidados`),
  KEY `FKf54kkvqsf1wr0wwccv8m0ymwp` (`Evento_id`),
  CONSTRAINT `FKf54kkvqsf1wr0wwccv8m0ymwp` FOREIGN KEY (`Evento_id`) REFERENCES `evento` (`id`),
  CONSTRAINT `FKi11c5x6idg9yohwtmjb2am6sl` FOREIGN KEY (`convidados`) REFERENCES `amigo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela api-amigos.evento_convidados: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `evento_convidados` DISABLE KEYS */;
INSERT IGNORE INTO `evento_convidados` (`Evento_id`, `convidados`) VALUES
	(10, 3),
	(10, 2),
	(10, 1),
	(11, 3),
	(11, 2),
	(11, 1);
/*!40000 ALTER TABLE `evento_convidados` ENABLE KEYS */;

-- Copiando estrutura para tabela api-amigos.tipoevento
CREATE TABLE IF NOT EXISTS `tipoevento` (
  `id` bigint(20) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela api-amigos.tipoevento: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `tipoevento` DISABLE KEYS */;
INSERT IGNORE INTO `tipoevento` (`id`, `descricao`) VALUES
	(1, 'Churrasco'),
	(2, 'Almoço'),
	(3, 'Jantar');
/*!40000 ALTER TABLE `tipoevento` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

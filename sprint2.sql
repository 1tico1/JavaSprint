-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 07/11/2023 às 20:27
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `sprint2`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `tb_bike`
--

CREATE TABLE `tb_bike` (
  `id` int(11) NOT NULL,
  `model` varchar(50) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `accident` varchar(255) DEFAULT NULL,
  `brand` varchar(50) DEFAULT NULL,
  `modification` varchar(255) DEFAULT NULL,
  `nameBike` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `tb_bike`
--

INSERT INTO `tb_bike` (`id`, `model`, `color`, `accident`, `brand`, `modification`, `nameBike`) VALUES
(3, 'Mountain Bike', 'Black', 'Scratches on the handlebar', 'Giant', 'Tubeless tires', 'Giant Trance X'),
(4, 'Mountain Bike', 'Black', 'Scratches on the handlebar', 'Giant', 'Tubeless tires', 'Giant Trance X');

-- --------------------------------------------------------

--
-- Estrutura para tabela `tb_cliente`
--

CREATE TABLE `tb_cliente` (
  `id` bigint(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `mail` varchar(50) DEFAULT NULL,
  `rg` varchar(20) DEFAULT NULL,
  `confirmMail` varchar(50) DEFAULT NULL,
  `confirmPass` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `tb_cliente`
--

INSERT INTO `tb_cliente` (`id`, `name`, `cpf`, `mail`, `rg`, `confirmMail`, `confirmPass`, `password`) VALUES
(1, 'João da Silva', '123.456.789-00', 'joao@example.com', '1234567', 'joao@example.com', 'password123', 'secretpassword'),
(2, 'Ana Santos', '111.222.333-44', 'ana.santos@email.com', '9876543', 'ana.santos@email.com', 'senha123ana', 'minhasenha456'),
(4, 'Ana Oliveira', '234.567.890-12', 'ana.oliveira@email.com', '2345678', 'ana.oliveira@email.com', 'senha123ana', 'senhasecreta');

-- --------------------------------------------------------

--
-- Estrutura para tabela `tb_protocol`
--

CREATE TABLE `tb_protocol` (
  `idprotocol` int(11) NOT NULL,
  `aproved` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `tb_protocol`
--

INSERT INTO `tb_protocol` (`idprotocol`, `aproved`) VALUES
(1, 1),
(2, 0),
(4, 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `tb_bike`
--
ALTER TABLE `tb_bike`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `tb_cliente`
--
ALTER TABLE `tb_cliente`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `tb_protocol`
--
ALTER TABLE `tb_protocol`
  ADD PRIMARY KEY (`idprotocol`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_bike`
--
ALTER TABLE `tb_bike`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `tb_cliente`
--
ALTER TABLE `tb_cliente`
  MODIFY `id` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `tb_protocol`
--
ALTER TABLE `tb_protocol`
  MODIFY `idprotocol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

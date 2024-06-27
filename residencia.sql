-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 17-05-2022 a las 06:19:43
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `residencia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Arrendador`
--

CREATE TABLE `Arrendador` (
  `ID` int(11) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `apellido` varchar(40) NOT NULL,
  `celular` varchar(10) NOT NULL,
  `estado_laboral` varchar(20) NOT NULL,
  `cargo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Arrendador`
--

INSERT INTO `Arrendador` (`ID`, `nombre`, `apellido`, `celular`, `estado_laboral`, `cargo`) VALUES
(123, 'dd', 'dd', '422', 'dd', 'd');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Habitacion`
--

CREATE TABLE `Habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `tipo` varchar(40) NOT NULL,
  `complemento` varchar(50) NOT NULL,
  `arrendador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Habitacion`
--

INSERT INTO `Habitacion` (`idHabitacion`, `tipo`, `complemento`, `arrendador`) VALUES
(12, 'Grande', ',Escritorio,,', 123);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Pagos`
--

CREATE TABLE `Pagos` (
  `idPagos` int(11) NOT NULL,
  `pago` double NOT NULL,
  `total` double NOT NULL,
  `estado` varchar(30) NOT NULL,
  `arrendador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `Pagos`
--

INSERT INTO `Pagos` (`idPagos`, `pago`, `total`, `estado`, `arrendador`) VALUES
(4, 20000, 23800, 'validado', 123);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Arrendador`
--
ALTER TABLE `Arrendador`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `Habitacion`
--
ALTER TABLE `Habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD KEY `arrendador` (`arrendador`) USING BTREE;

--
-- Indices de la tabla `Pagos`
--
ALTER TABLE `Pagos`
  ADD PRIMARY KEY (`idPagos`),
  ADD KEY `arrendador` (`arrendador`) USING BTREE;

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Habitacion`
--
ALTER TABLE `Habitacion`
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `Pagos`
--
ALTER TABLE `Pagos`
  MODIFY `idPagos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Habitacion`
--
ALTER TABLE `Habitacion`
  ADD CONSTRAINT `Habitacion_ibfk_1` FOREIGN KEY (`arrendador`) REFERENCES `Arrendador` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `Pagos`
--
ALTER TABLE `Pagos`
  ADD CONSTRAINT `Pagos_ibfk_1` FOREIGN KEY (`arrendador`) REFERENCES `Arrendador` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

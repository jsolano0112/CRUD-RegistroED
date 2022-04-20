-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-04-2022 a las 02:05:49
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `speedlist`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `nombresA` varchar(50) DEFAULT NULL,
  `apellidoA1` varchar(50) DEFAULT NULL,
  `apellidoA2` varchar(50) DEFAULT NULL,
  `correoA` varchar(50) DEFAULT NULL,
  `contraseñaA` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`idAlumno`, `nombresA`, `apellidoA1`, `apellidoA2`, `correoA`, `contraseñaA`) VALUES
(111110, 'Jesus Daniel', 'Rincon', 'Solano', 'sjdaidjadkkkkio', '2232324'),
(3333442, 'Isaac David', 'Gonzales', 'Sol', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docente`
--

CREATE TABLE `docente` (
  `idDocente` int(11) NOT NULL,
  `nombresD` varchar(50) DEFAULT NULL,
  `apellidoD1` varchar(50) DEFAULT NULL,
  `apellidoD2` varchar(50) DEFAULT NULL,
  `correoD` varchar(50) DEFAULT NULL,
  `contraseñaD` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `docente`
--

INSERT INTO `docente` (`idDocente`, `nombresD`, `apellidoD1`, `apellidoD2`, `correoD`, `contraseñaD`) VALUES
(222222, 'hhhhhh', '222', '222', 'swedwd', ''),
(22323123, 'Mario', 'Tangarife', 'soto', 'mario', '23213123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`idAlumno`);

--
-- Indices de la tabla `docente`
--
ALTER TABLE `docente`
  ADD PRIMARY KEY (`idDocente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

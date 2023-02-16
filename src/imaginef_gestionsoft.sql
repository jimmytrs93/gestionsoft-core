-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 16-02-2023 a las 09:49:11
-- Versión del servidor: 5.7.23-23
-- Versión de PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `imaginef_gestionsoft`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `cliente_id` int(11) NOT NULL,
  `negocio_id` int(11) NOT NULL,
  `documento` varchar(20) CHARACTER SET utf8 NOT NULL,
  `nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `fecha_nacimeinto` date DEFAULT NULL,
  `genero` varchar(1) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fecha_registro` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `autoriza_notificaciones` tinyint(1) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `fecha_inactivacion` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cliente_id`, `negocio_id`, `documento`, `nombre`, `telefono`, `email`, `fecha_nacimeinto`, `genero`, `fecha_registro`, `autoriza_notificaciones`, `estado`, `fecha_inactivacion`) VALUES
(1, 2, '1212121', 'Fill Park', '211211', 'fill@gmail.com', '2020-09-10', NULL, '2022-07-15 10:47:10', 1, 1, NULL),
(2, 1, '1212121', 'Fill Park', '211211', 'fill@gmail.com', '2020-09-09', NULL, '2022-07-15 10:51:33', 1, 1, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `colaborador`
--

CREATE TABLE `colaborador` (
  `colaborador_id` int(11) NOT NULL,
  `negocio_id` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `documento` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cargo` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `fecha_vinculacion` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `estado` tinyint(1) NOT NULL,
  `fecha_desvinculacion` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `colaborador`
--

INSERT INTO `colaborador` (`colaborador_id`, `negocio_id`, `nombre`, `documento`, `telefono`, `email`, `cargo`, `fecha_vinculacion`, `estado`, `fecha_desvinculacion`) VALUES
(1, 1, 'Alex Does', '1234563', NULL, NULL, 'CEO', '2022-07-14 20:19:25', 1, NULL),
(2, 1, 'Jhon Does', '123456123', NULL, NULL, 'Gerente', '2022-07-14 21:04:38', 1, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `factura_id` int(11) NOT NULL,
  `negocio_id` int(11) NOT NULL,
  `cliente_id` int(11) NOT NULL,
  `estado_factura_id` int(11) NOT NULL,
  `fecha_creacion` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `metodo_pago` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fecha_modificacion` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura_estado`
--

CREATE TABLE `factura_estado` (
  `factura_estado_id` int(11) NOT NULL,
  `nombre` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `item`
--

CREATE TABLE `item` (
  `item_id` int(11) NOT NULL,
  `negocio_id` int(11) NOT NULL,
  `codigo` varchar(20) CHARACTER SET utf8 NOT NULL,
  `nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `descripcion` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `valor_venta` double NOT NULL,
  `valor_compra` double NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `fecha_creacion` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_inactivacion` datetime DEFAULT NULL,
  `inventario` tinyint(1) NOT NULL,
  `cantidad` int(11) NOT NULL DEFAULT '0',
  `comision_colaborador` double NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `item`
--

INSERT INTO `item` (`item_id`, `negocio_id`, `codigo`, `nombre`, `descripcion`, `valor_venta`, `valor_compra`, `estado`, `fecha_creacion`, `fecha_inactivacion`, `inventario`, `cantidad`, `comision_colaborador`) VALUES
(1, 1, 'ASD100', 'Corte hombre', 'Corte de cabello a hombre', 15000, 0, 1, '2022-07-15 13:10:22', NULL, 0, 0, 5000),
(2, 2, 'ASD200', 'Corte hombre', 'Corte de cabello a hombre y lavado', 16500, 0, 1, '2022-07-15 13:12:38', NULL, 0, 0, 5500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `negocio`
--

CREATE TABLE `negocio` (
  `negocio_id` int(11) NOT NULL,
  `nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `documento` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `representante` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `contacto_autorizado` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `fecha_creacion` datetime NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `fecha_inactivacion` datetime DEFAULT NULL,
  `imagen` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `observacion` varchar(300) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `negocio`
--

INSERT INTO `negocio` (`negocio_id`, `nombre`, `documento`, `representante`, `contacto_autorizado`, `telefono`, `email`, `fecha_creacion`, `estado`, `fecha_inactivacion`, `imagen`, `observacion`) VALUES
(1, 'Estilo AAA', '1234567', 'Jhon Doe', 'jhondoe@email.com', '3121234567', 'jhondoe@email.com', '2022-06-22 10:23:18', 1, NULL, NULL, NULL),
(2, 'Estilo BBB', '1234567890', 'Alan Doe', 'alan@email.com', '3121234567', 'alan@email.com', '2022-06-21 00:00:00', 1, NULL, 'miImagen/princial', 'Solo venta online');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `registro_id` int(11) NOT NULL,
  `factura_id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  `colaborador_id` int(11) DEFAULT NULL,
  `comision_colaborador` double DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  `valor_venta` double NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `fecha_registro` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `reserva_id` int(11) NOT NULL,
  `negocio_id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  `cliente_id` int(11) NOT NULL,
  `colaborador_id` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  `fecha_creacion` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `estado` tinyint(1) NOT NULL,
  `efectiva` tinyint(1) DEFAULT NULL,
  `observacion` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`reserva_id`, `negocio_id`, `item_id`, `cliente_id`, `colaborador_id`, `fecha`, `fecha_creacion`, `estado`, `efectiva`, `observacion`) VALUES
(1, 1, 2, 1, 1, '2022-09-06 22:04:09', '2022-09-05 22:04:56', 1, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `usuario_id` int(11) NOT NULL,
  `negocio_id` int(11) NOT NULL,
  `documento` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `nombre` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `contrasena` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `fecha_creacion` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `estado` tinyint(1) NOT NULL,
  `fecha_inactivacion` timestamp NULL DEFAULT NULL,
  `ultimo_login` datetime DEFAULT NULL,
  `cambio_contrasena` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cliente_id`),
  ADD KEY `negocio_id` (`negocio_id`);

--
-- Indices de la tabla `colaborador`
--
ALTER TABLE `colaborador`
  ADD PRIMARY KEY (`colaborador_id`),
  ADD KEY `negocio_id` (`negocio_id`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`factura_id`),
  ADD KEY `estado_factura_id` (`estado_factura_id`),
  ADD KEY `negocio_id` (`negocio_id`),
  ADD KEY `cliente_id` (`cliente_id`);

--
-- Indices de la tabla `factura_estado`
--
ALTER TABLE `factura_estado`
  ADD PRIMARY KEY (`factura_estado_id`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- Indices de la tabla `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`item_id`),
  ADD KEY `negocio_id` (`negocio_id`);

--
-- Indices de la tabla `negocio`
--
ALTER TABLE `negocio`
  ADD PRIMARY KEY (`negocio_id`);

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`registro_id`),
  ADD KEY `factura_id` (`factura_id`),
  ADD KEY `item_id` (`item_id`),
  ADD KEY `colaborador_id` (`colaborador_id`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`reserva_id`),
  ADD KEY `negocio_id` (`negocio_id`),
  ADD KEY `item_id` (`item_id`),
  ADD KEY `cliente_id` (`cliente_id`),
  ADD KEY `colaborador_id` (`colaborador_id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`usuario_id`),
  ADD KEY `negocio_id` (`negocio_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `cliente_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `colaborador`
--
ALTER TABLE `colaborador`
  MODIFY `colaborador_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `factura_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `factura_estado`
--
ALTER TABLE `factura_estado`
  MODIFY `factura_estado_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `item`
--
ALTER TABLE `item`
  MODIFY `item_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `negocio`
--
ALTER TABLE `negocio`
  MODIFY `negocio_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `registro`
--
ALTER TABLE `registro`
  MODIFY `registro_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `reserva_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `usuario_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`negocio_id`) REFERENCES `negocio` (`negocio_id`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `colaborador`
--
ALTER TABLE `colaborador`
  ADD CONSTRAINT `colaborador_ibfk_1` FOREIGN KEY (`negocio_id`) REFERENCES `negocio` (`negocio_id`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`estado_factura_id`) REFERENCES `factura_estado` (`factura_estado_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `factura_ibfk_2` FOREIGN KEY (`negocio_id`) REFERENCES `negocio` (`negocio_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `factura_ibfk_3` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`cliente_id`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `item`
--
ALTER TABLE `item`
  ADD CONSTRAINT `item_ibfk_1` FOREIGN KEY (`negocio_id`) REFERENCES `negocio` (`negocio_id`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `registro`
--
ALTER TABLE `registro`
  ADD CONSTRAINT `registro_ibfk_1` FOREIGN KEY (`colaborador_id`) REFERENCES `colaborador` (`colaborador_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `registro_ibfk_2` FOREIGN KEY (`factura_id`) REFERENCES `factura` (`factura_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `registro_ibfk_3` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`negocio_id`) REFERENCES `negocio` (`negocio_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `reserva_ibfk_3` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`cliente_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `reserva_ibfk_4` FOREIGN KEY (`colaborador_id`) REFERENCES `colaborador` (`colaborador_id`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`negocio_id`) REFERENCES `negocio` (`negocio_id`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

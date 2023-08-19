-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:33065
-- Generation Time: Aug 19, 2023 at 02:45 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pruebaproyecto`
--

-- --------------------------------------------------------

--
-- Table structure for table `cliente`
--

CREATE TABLE `cliente` (
  `IdCliente` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Direccion` varchar(100) NOT NULL,
  `Telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `cliente`
--

INSERT INTO `cliente` (`IdCliente`, `Nombre`, `Apellido`, `Direccion`, `Telefono`) VALUES
(1, 'Juan', 'Pérez', 'Calle 123, Ciudad', 809123456),
(2, 'María', 'González', 'Avenida Principal, Pueblo', 12345667),
(3, 'Luis', 'Martínez', 'Carrera 45, Villa', 56789012),
(4, 'Ana', 'Sánchez', 'Callejón 8, Aldea', 34567890),
(5, 'Carlos', 'López', 'Plaza Mayor, Ciudad', 89012345),
(6, 'Laura', 'Rodríguez', 'Calle 9, Pueblo', 67890123),
(7, 'Javier', 'Hernández', 'Avenida Central, Villa', 45678901),
(8, 'Sofía', 'Díaz', 'Carrera 12, Aldea', 23456789),
(9, 'Miguel', 'Torres', 'Calle 67, Ciudad', 90123456),
(10, 'Isabel', 'Fernández', 'Calle 3, Pueblo', 78901234),
(11, 'Alejandro', 'Gómez', 'Avenida 5, Villa', 56789012),
(12, 'Elena', 'Pérez', 'Calle 21, Aldea', 34567890),
(13, 'Raúl', 'Ramírez', 'Carrera 8, Ciudad', 12345678),
(14, 'Mónica', 'López', 'Plaza Central, Pueblo', 98765432),
(15, 'Andrés', 'García Para', 'Avenida 25, Villa', 67890123),
(16, 'Mariela', 'Santos', 'Ave. Libre', 23467233),
(17, 'Diego', 'Sánchez', 'Calle 50, Ciudad', 23456789),
(18, 'Natalia', 'Hernández', 'Carrera 18, Pueblo', 90123456),
(19, 'Pablo', 'Díaz', 'Avenida 2, Villa', 78901234),
(20, 'Valentina', 'Torres', 'Calle 15, Aldea', 5678901),
(21, 'Ricardo', 'Volquez', 'Calle Manuela 10', 809252177),
(22, 'Juana', 'Del rosario', 'Calle maria', 809234567);

-- --------------------------------------------------------

--
-- Table structure for table `compras`
--

CREATE TABLE `compras` (
  `IdCompras` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Total` int(11) NOT NULL,
  `Id_Cliente` int(11) NOT NULL,
  `Id_Producto` int(11) NOT NULL,
  `Nombre_Producto` varchar(45) NOT NULL,
  `Precio_Unitario` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `compras`
--

INSERT INTO `compras` (`IdCompras`, `Fecha`, `Total`, `Id_Cliente`, `Id_Producto`, `Nombre_Producto`, `Precio_Unitario`, `Cantidad`, `Stock`) VALUES
(1001, '2022-10-17 00:00:00', 20, 1, 101, 'Coca COla', 10, 2, 10),
(1002, '2022-10-17 00:00:00', 20, 1, 101, 'kola real', 10, 2, 10);

-- --------------------------------------------------------

--
-- Table structure for table `departamento`
--

CREATE TABLE `departamento` (
  `Cod_Dep` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Id_Empresa1` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `departamento`
--

INSERT INTO `departamento` (`Cod_Dep`, `Nombre`, `Id_Empresa1`) VALUES
(200, 'Ventas', 1),
(201, 'Limpieza', 1),
(202, 'Gerencia', 1),
(203, 'Calidad', 1),
(204, 'Tecnologia', 1),
(205, 'Gerencia', 1);

-- --------------------------------------------------------

--
-- Table structure for table `empleado`
--

CREATE TABLE `empleado` (
  `IdEmp` int(11) NOT NULL,
  `NombreEmp` varchar(45) NOT NULL,
  `ApellidoEmp` varchar(45) NOT NULL,
  `Telefono` int(11) NOT NULL,
  `Salario` float NOT NULL,
  `Fecha_Ing` datetime NOT NULL,
  `Cargo` varchar(45) NOT NULL,
  `Id_Empresa` int(11) NOT NULL,
  `Cod_Dep1` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `empleado`
--

INSERT INTO `empleado` (`IdEmp`, `NombreEmp`, `ApellidoEmp`, `Telefono`, `Salario`, `Fecha_Ing`, `Cargo`, `Id_Empresa`, `Cod_Dep1`) VALUES
(1, 'Juan', 'Pérez', 12367890, 40000, '2023-01-15 08:00:00', 'Gerente', 1, 205),
(2, 'María', 'González', 96543210, 18000, '2023-02-20 09:30:00', 'Vendedor', 1, 200),
(3, 'Luis', 'Martínez', 78901234, 1500, '2023-03-10 10:15:00', 'Conserje', 1, 201),
(5, 'Carlos', 'López', 1234567, 1700, '2023-05-12 08:30:00', 'Conserje', 1, 201),
(7, 'Javier', 'Hernández', 67890123, 2600, '2023-07-25 10:45:00', 'Vice Gerente', 1, 205),
(8, 'Sofía', 'Díaz', 23458901, 1900, '2023-08-02 11:30:00', 'Supervisor', 1, 200),
(9, 'Miguel', 'Torres', 12345678, 1600, '2023-09-09 08:15:00', 'Analista de calidad', 1, 203),
(10, 'Isabel', 'Fernández', 90123456, 2100, '2023-10-14 09:45:00', 'Vendedor', 1, 200),
(11, 'Alejandro', 'Gómez', 78901234, 1800, '2023-11-20 10:30:00', 'Vendedor', 1, 200),
(12, 'Elena', 'Pérez', 34789012, 2400, '2023-12-25 11:15:00', 'Analista de calidad', 1, 203),
(13, 'Raúl', 'Ramírez', 34567890, 2700, '2024-01-05 08:45:00', 'Vendedor', 1, 200),
(14, 'Mónica', 'López', 76543210, 2000, '2024-02-10 09:30:00', 'Supervisor', 1, 200),
(15, 'Andrés', 'García', 89012345, 1700, '2024-03-15 10:15:00', 'Analista de calidad', 1, 203),
(16, 'Fernanda', 'Martínez', 45890123, 2200, '2024-04-20 11:45:00', 'Vendedor', 1, 200),
(17, 'Diego', 'Sánchez', 23458901, 1900, '2024-05-25 08:30:00', 'Vendedor', 1, 200),
(18, 'Natalia', 'Hernández', 92345678, 2600, '2024-06-30 09:15:00', 'Analista de calidad', 1, 203),
(19, 'Pablo', 'Díaz', 78901256, 2100, '2024-07-05 10:45:00', 'Supervisor calidad', 1, 203),
(20, 'Valentina', 'Torres', 58901234, 1800, '2024-08-10 11:30:00', 'Supervisor', 1, 200),
(21, 'Vivaldi', ' Nahuel', 80965567, 21000, '2015-10-09 00:00:00', 'Supervisor', 0, 200);

-- --------------------------------------------------------

--
-- Table structure for table `empresa`
--

CREATE TABLE `empresa` (
  `Id` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `RNC` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `empresa`
--

INSERT INTO `empresa` (`Id`, `Nombre`, `RNC`) VALUES
(0, 'Distribuidora H', 3304);

-- --------------------------------------------------------

--
-- Table structure for table `factura`
--

CREATE TABLE `factura` (
  `IdFactura` int(11) NOT NULL,
  `Nombre_Cliente` varchar(45) NOT NULL,
  `Productos` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Descuento` int(11) NOT NULL,
  `Total` int(11) NOT NULL,
  `IdCompra` int(11) NOT NULL,
  `IdCliente` int(11) NOT NULL,
  `IdProducto` int(11) NOT NULL,
  `IdEmpleado` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `productos`
--

CREATE TABLE `productos` (
  `Id_Producto` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Descripcion` text NOT NULL,
  `Stock` int(11) NOT NULL,
  `Precio` float NOT NULL,
  `Id_Prov` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `productos`
--

INSERT INTO `productos` (`Id_Producto`, `Nombre`, `Descripcion`, `Stock`, `Precio`, `Id_Prov`) VALUES
(101, 'Coca Cola', 'Sin azucar 16Oz', 50, 10.99, 5),
(102, 'Buzz', 'Cerveza americana enlatada 20Oz', 30, 15.75, 5),
(103, 'Vive 100', 'Bebida energizante dominicana', 20, 7.5, 2),
(104, 'Frito Lays', 'Papa fritas en bolsas paquetes grandes', 80, 5.25, 1),
(105, 'Arizolin', 'Producto de limpieza', 10, 20, 3),
(106, 'Colgate personal', 'Producto de higiene personal', 60, 8.99, 3),
(107, 'Shampoo mikakito', 'Shampoo para perro', 25, 12.49, 3),
(108, 'Pringgles', 'Papa fritas en latas', 15, 18.5, 4),
(109, 'chetos koki', 'Aderente para vehiculos', 40, 6.75, 3),
(111, 'Kola Real', 'Refresco de 16Oz con s', 25, 10, 5),
(1002, 'Galletas Princesas', 'Paq. de 9 galletas', 100, 50, 0),
(2001, 'Chicharon Light', 'Chicharon en bolsa', 25, 10, 10002);

-- --------------------------------------------------------

--
-- Table structure for table `proveedor`
--

CREATE TABLE `proveedor` (
  `Id_Proveedor` int(11) NOT NULL,
  `Nombre_Empresa` varchar(45) NOT NULL,
  `RNC` int(9) NOT NULL,
  `Direccion_Empresa` varchar(100) NOT NULL,
  `Telefono` int(13) NOT NULL,
  `Correo` varchar(100) NOT NULL,
  `Id_Empresa2` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `proveedor`
--

INSERT INTO `proveedor` (`Id_Proveedor`, `Nombre_Empresa`, `RNC`, `Direccion_Empresa`, `Telefono`, `Correo`, `Id_Empresa2`) VALUES
(1, 'Proveedor Lays', 113782682, 'Calle 123, Ciudad Real', 2147483647, 'papitaslays@gmail.com', 1),
(2, 'Gestion 360', 123456785, 'Calle Juana Saltitopa', 809654241, 'gestion360@gmail.com', 0),
(3, 'Proveedor Limpieza', 209635817, 'Carrera 45, Villa Nueva', 2147483647, 'limpieza@hotmail.com', 1),
(4, 'Proveedor Pringgles', 309462187, 'Callejón 8, Aldea adentro', 2147483647, 'papitaspringgles@hotmail.com', 0);

-- --------------------------------------------------------

--
-- Table structure for table `ventas`
--

CREATE TABLE `ventas` (
  `IdVentas` int(11) NOT NULL,
  `Producto` varchar(45) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Total` int(11) NOT NULL,
  `Id_Producto` int(11) NOT NULL,
  `Nombre_cliente` varchar(45) DEFAULT NULL,
  `Apellido_Cliente` varchar(45) DEFAULT NULL,
  `cliente_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `ventas`
--

INSERT INTO `ventas` (`IdVentas`, `Producto`, `Cantidad`, `Fecha`, `Total`, `Id_Producto`, `Nombre_cliente`, `Apellido_Cliente`, `cliente_id`) VALUES
(1001, 'Pringgles', 10, '2022-10-09 00:00:00', 185, 108, 'Javier', 'Hernández', 8),
(1004, 'Colgate personal', 3, '2023-01-01 00:00:00', 27, 106, 'Luis', 'Martínez', 4),
(1009, 'Frito Lays', 3, '2021-02-14 00:00:00', 16, 104, 'Javier', 'Hernández', 7),
(10001, 'Vive 100', 1, '2022-10-09 00:00:00', 8, 103, 'Sofía', 'Díaz', 11),
(10002, 'Coca Cola', 10, '2021-02-21 00:00:00', 110, 101, 'Juan', 'Pérez', 1),
(10003, 'Coca Cola', 10, '2021-02-21 00:00:00', 110, 101, 'Juan', 'Pérez', 3),
(10004, 'Pegamento koki', 2, '2023-07-12 00:00:00', 14, 109, 'Alejandro', 'Gómez', 10),
(10005, 'Kola Real', 5, '2022-04-09 00:00:00', 95, 102, 'Maria', 'Sánchez', 5),
(10006, 'Coca Cola', 1, '2023-08-18 00:00:00', 22, 101, 'Carlos msnuel', 'López', 6);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`IdCliente`);

--
-- Indexes for table `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`IdCompras`),
  ADD KEY `fk_Compra_Clien` (`Id_Cliente`),
  ADD KEY `fk_Compra_Prod` (`Id_Producto`);

--
-- Indexes for table `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`Cod_Dep`),
  ADD KEY `fk_dep_emp` (`Id_Empresa1`);

--
-- Indexes for table `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`IdEmp`);

--
-- Indexes for table `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`IdFactura`),
  ADD KEY `fk_Fact_Clie` (`IdCliente`),
  ADD KEY `fk_Fact_Prod` (`IdProducto`),
  ADD KEY `fk_Fact_Emp` (`IdEmpleado`),
  ADD KEY `fk_Fact_Comp` (`IdCompra`);

--
-- Indexes for table `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`Id_Producto`),
  ADD KEY `IDX_ID_PRODUCTO` (`Id_Producto`);

--
-- Indexes for table `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`Id_Proveedor`),
  ADD KEY `fk_Prov_Empr` (`Id_Empresa2`);

--
-- Indexes for table `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`IdVentas`),
  ADD KEY `fk_Venta_Prov` (`Id_Producto`),
  ADD KEY `fk_idcliente2` (`cliente_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `IdCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `empleado`
--
ALTER TABLE `empleado`
  MODIFY `IdEmp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `empresa`
--
ALTER TABLE `empresa`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `ventas`
--
ALTER TABLE `ventas`
  MODIFY `cliente_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `compras`
--
ALTER TABLE `compras`
  ADD CONSTRAINT `fk_Compra_Clien` FOREIGN KEY (`Id_Cliente`) REFERENCES `cliente` (`IdCliente`),
  ADD CONSTRAINT `fk_Compra_Prod` FOREIGN KEY (`Id_Producto`) REFERENCES `productos` (`Id_Producto`);

--
-- Constraints for table `proveedor`
--
ALTER TABLE `proveedor`
  ADD CONSTRAINT `fk_Prov_Empr` FOREIGN KEY (`Id_Empresa2`) REFERENCES `empresa` (`Id`);

--
-- Constraints for table `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `fk_Venta_Prov` FOREIGN KEY (`Id_Producto`) REFERENCES `productos` (`Id_Producto`),
  ADD CONSTRAINT `fk_idcliente2` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`IdCliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

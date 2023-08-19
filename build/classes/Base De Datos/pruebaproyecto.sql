

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
  `IdCliente` int NOT NULL,
  `Nombre` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `Apellido` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `Direccion` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `Telefono` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

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
(15, 'Andrés', 'García', 'Avenida 25, Villa', 67890123),
(16, 'Fernanda', 'Martínez', 'Calle 10, Aldea', 45678901),
(17, 'Diego', 'Sánchez', 'Calle 50, Ciudad', 23456789),
(18, 'Natalia', 'Hernández', 'Carrera 18, Pueblo', 90123456),
(19, 'Pablo', 'Díaz', 'Avenida 2, Villa', 78901234),
(20, 'Valentina', 'Torres', 'Calle 15, Aldea', 5678901);

-- --------------------------------------------------------

--
-- Table structure for table `compras`
--

CREATE TABLE `compras` (
  `IdCompras` int NOT NULL,
  `Fecha` datetime NOT NULL,
  `Total` int NOT NULL,
  `Id_Cliente` int NOT NULL,
  `Id_Producto` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

-- --------------------------------------------------------

--
-- Table structure for table `departamento`
--

CREATE TABLE `departamento` (
  `Cod_Dep` int NOT NULL,
  `Nombre` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `Id_Empresa1` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

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
  `IdEmp` int NOT NULL,
  `NombreEmp` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `ApellidoEmp` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `Telefono` int NOT NULL,
  `Salario` float NOT NULL,
  `Fecha_Ing` datetime NOT NULL,
  `Cargo` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `Id_Empresa` int NOT NULL,
  `Cod_Dep1` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

--
-- Dumping data for table `empleado`
--

INSERT INTO `empleado` (`IdEmp`, `NombreEmp`, `ApellidoEmp`, `Telefono`, `Salario`, `Fecha_Ing`, `Cargo`, `Id_Empresa`, `Cod_Dep1`) VALUES
(1, 'Juan', 'Pérez', 12367890, 4000, '2023-01-15 08:00:00', 'Gerente', 1, 205),
(2, 'María', 'González', 96543210, 1800, '2023-02-20 09:30:00', 'Vendedor', 1, 200),
(3, 'Luis', 'Martínez', 78901234, 1500, '2023-03-10 10:15:00', 'Conserje', 1, 201),
(4, 'Ana', 'Sánchez', 56789012, 2000, '2023-04-05 11:45:00', 'Supervisor', 1, 200),
(5, 'Carlos', 'López', 1234567, 1700, '2023-05-12 08:30:00', 'Conserje', 1, 201),
(6, 'Laura', 'Rodríguez', 89012345, 2200, '2023-06-18 09:15:00', 'Analista de calidad', 1, 203),
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
(20, 'Valentina', 'Torres', 58901234, 1800, '2024-08-10 11:30:00', 'Supervisor', 1, 200);

-- --------------------------------------------------------

--
-- Table structure for table `empresa`
--

CREATE TABLE `empresa` (
  `Id` int NOT NULL,
  `Nombre` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `RNC` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

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
  `IdFactura` int NOT NULL,
  `Nombre_Cliente` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `Productos` int NOT NULL,
  `Fecha` datetime NOT NULL,
  `Descuento` int NOT NULL,
  `Total` int NOT NULL,
  `IdCompra` int NOT NULL,
  `IdCliente` int NOT NULL,
  `IdProducto` int NOT NULL,
  `IdEmpleado` int NOT NULL,
  `Cantidad` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

-- --------------------------------------------------------

--
-- Table structure for table `productos`
--

CREATE TABLE `productos` (
  `Id_Producto` int NOT NULL,
  `Nombre` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `Stock` int NOT NULL,
  `Precio` float NOT NULL,
  `Id_Prov` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

--
-- Dumping data for table `productos`
--

INSERT INTO `productos` (`Id_Producto`, `Nombre`, `Stock`, `Precio`, `Id_Prov`) VALUES
(101, 'Coca Cola', 50, 10.99, 5),
(102, 'Buzz', 30, 15.75, 5),
(103, 'Presidente', 20, 7.5, 2),
(104, 'Frito Lays', 80, 5.25, 1),
(105, 'Arizolin', 10, 20, 3),
(106, 'Colgate personal', 60, 8.99, 3),
(107, 'Shampoo mikakito', 25, 12.49, 3),
(108, 'Pringgles', 15, 18.5, 4),
(109, 'Pegamento koki', 40, 6.75, 3),
(110, 'Paquete velas', 5, 30.25, 3);

-- --------------------------------------------------------

--
-- Table structure for table `proveedor`
--

CREATE TABLE `proveedor` (
  `Id_Proveedor` int NOT NULL,
  `Nombre_Prov` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `Direccion_Prov` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `Telefono` int NOT NULL,
  `Id_Empresa2` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

--
-- Dumping data for table `proveedor`
--

INSERT INTO `proveedor` (`Id_Proveedor`, `Nombre_Prov`, `Direccion_Prov`, `Telefono`, `Id_Empresa2`) VALUES
(1, 'Proveedor Lays', 'Calle 123, Ciudad', 12345678, 1),
(2, 'Proveedor Presidente', 'Avenida Principal, Pueblo', 98765432, 1),
(3, 'Proveedor Limpieza', 'Carrera 45, Villa', 56789012, 1),
(4, 'Proveedor Pringgles', 'Callejón 8, Aldea', 34567012, 1),
(5, 'Proveedor Coca cola', 'Plaza Mayor, Ciudad', 81234567, 1);

-- --------------------------------------------------------

--
-- Table structure for table `ventas`
--

CREATE TABLE `ventas` (
  `IdVentas` int NOT NULL,
  `Producto` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin NOT NULL,
  `Cantidad` int NOT NULL,
  `Fecha` datetime NOT NULL,
  `Total` int NOT NULL,
  `Id_Producto` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;

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
  ADD KEY `fk_Venta_Prov` (`Id_Producto`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `IdCliente` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `empleado`
--
ALTER TABLE `empleado`
  MODIFY `IdEmp` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `empresa`
--
ALTER TABLE `empresa`
  MODIFY `Id` int NOT NULL AUTO_INCREMENT;

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
-- Constraints for table `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `fk_Venta_Prov` FOREIGN KEY (`Id_Producto`) REFERENCES `productos` (`Id_Producto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

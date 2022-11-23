-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2022 at 08:53 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `travelsafe`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `billID` int(255) NOT NULL,
  `tourID` varchar(255) NOT NULL,
  `Date` varchar(255) NOT NULL,
  `Category` varchar(255) NOT NULL,
  `passenger` varchar(255) NOT NULL,
  `vehicletype` varchar(255) NOT NULL,
  `Duration` varchar(255) NOT NULL,
  `Price` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`billID`, `tourID`, `Date`, `Category`, `passenger`, `vehicletype`, `Duration`, `Price`) VALUES
(1, 'T-001', '2022-04-30', 'BEACH SIDE (MATARA)', '4', 'Sedan', '5', '45000');

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `bookingID` varchar(255) NOT NULL,
  `reqID` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `roomno` varchar(255) NOT NULL,
  `roomtype_` varchar(255) NOT NULL,
  `hname` varchar(255) NOT NULL,
  `sreq` varchar(255) NOT NULL,
  `Status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`bookingID`, `reqID`, `date`, `roomno`, `roomtype_`, `hname`, `sreq`, `Status`) VALUES
('B-001', 'R-001', '2022-04-30', '2', 'AC Room', 'Beach Sidein Hotel', 'NONE', 'ACTIVE');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `empID` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`empID`, `role`, `username`, `password`) VALUES
('1', 'Receptionist', 'Receptionist', 'Pass@123'),
('2', 'Reservation Executive', 'ReservationEx', 'Pass@123'),
('3', 'Transport Executive', 'TransportEx', 'Pass@123'),
('4', 'Tour Planner', 'Tourplanner', 'Pass@123');

-- --------------------------------------------------------

--
-- Table structure for table `maintenance_booking`
--

CREATE TABLE `maintenance_booking` (
  `maintenanceID` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `vehtype` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `maintenance_booking`
--

INSERT INTO `maintenance_booking` (`maintenanceID`, `date`, `vehtype`) VALUES
('M-001', '2022-04-28', 'Sedan');

-- --------------------------------------------------------

--
-- Table structure for table `requirement`
--

CREATE TABLE `requirement` (
  `reqID` varchar(255) NOT NULL,
  `userID` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `catergory` varchar(255) NOT NULL,
  `vehtype` varchar(255) NOT NULL,
  `duration` varchar(255) NOT NULL,
  `passenger` varchar(255) NOT NULL,
  `Status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `requirement`
--

INSERT INTO `requirement` (`reqID`, `userID`, `date`, `catergory`, `vehtype`, `duration`, `passenger`, `Status`) VALUES
('R-001', 'U-001', '2022-04-30', 'BEACH SIDE (MATARA)', 'Sedan', '5', '4', 'ACTIVE');

-- --------------------------------------------------------

--
-- Table structure for table `tour`
--

CREATE TABLE `tour` (
  `tourID` varchar(255) NOT NULL,
  `userID` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  `vehtype` varchar(255) NOT NULL,
  `duration` varchar(255) NOT NULL,
  `passenger` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tour`
--

INSERT INTO `tour` (`tourID`, `userID`, `date`, `location`, `vehtype`, `duration`, `passenger`) VALUES
('T-001', 'U-001', '2022-04-30', 'BEACH SIDE (MATARA)', 'Sedan', '5', '4');

-- --------------------------------------------------------

--
-- Table structure for table `tourguide`
--

CREATE TABLE `tourguide` (
  `tourID` varchar(255) NOT NULL,
  `location1` varchar(255) NOT NULL,
  `guide1` varchar(255) NOT NULL,
  `location2` varchar(255) NOT NULL,
  `guide2` varchar(255) NOT NULL,
  `location3` varchar(255) NOT NULL,
  `guide3` varchar(255) NOT NULL,
  `location4` varchar(255) NOT NULL,
  `guide4` varchar(255) NOT NULL,
  `location5` varchar(255) NOT NULL,
  `guide5` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tourguide`
--

INSERT INTO `tourguide` (`tourID`, `location1`, `guide1`, `location2`, `guide2`, `location3`, `guide3`, `location4`, `guide4`, `location5`, `guide5`) VALUES
('T-001', 'MATARA', 'MR. Saman', 'SELECT LOCATION 02', 'SELECT GUIDE', 'SELECT LOCATION 03', 'SELECT GUIDE', 'SELECT LOCATION 04', 'SELECT GUIDE', 'SELECT LOCATION 04', 'SELECT GUIDE');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userID` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `cName` varchar(255) NOT NULL,
  `phoneNo` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `userAddress` varchar(255) NOT NULL,
  `nicNo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userID`, `name`, `cName`, `phoneNo`, `email`, `userAddress`, `nicNo`) VALUES
('U-001', 'Hirusha', 'A2 Company', '072 - 852 1545', 'hirusha@gmail.com', '150/A, Gampaha', '200014678321'),
('U-002', 'Kamal', 'ABC Company', '011 - 521 4598', 'kamal@gmail.com', '20/C, Colombo 01', '199752143221'),
('U-003', 'Madhawa', '-', '077 - 985 1452', 'madhawa@gmail.com', '75/C, Colombo 07', '200145735251');

-- --------------------------------------------------------

--
-- Table structure for table `veh_booking`
--

CREATE TABLE `veh_booking` (
  `reqID` varchar(255) NOT NULL,
  `userID` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `catergory` varchar(255) NOT NULL,
  `vehtype` varchar(255) NOT NULL,
  `duration` varchar(255) NOT NULL,
  `spec` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `veh_booking`
--

INSERT INTO `veh_booking` (`reqID`, `userID`, `date`, `catergory`, `vehtype`, `duration`, `spec`) VALUES
('B-001', 'U-001', '2022-04-30', 'BEACH SIDE', 'Sedan', '5', 'None');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`billID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bill`
--
ALTER TABLE `bill`
  MODIFY `billID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

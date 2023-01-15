-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 14, 2019 at 08:34 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gajipegawai`
--

-- --------------------------------------------------------

--
-- Table structure for table `dpegawai`
--

CREATE TABLE `dpegawai` (
  `nip` int(30) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jekel` varchar(20) NOT NULL,
  `tempat` varchar(40) NOT NULL,
  `tenggal` date NOT NULL,
  `pendidikan` varchar(49) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dpegawai`
--

INSERT INTO `dpegawai` (`nip`, `nama`, `jekel`, `tempat`, `tenggal`, `pendidikan`) VALUES
(1977801121, 'AGUS SOFYAN', 'Laki-laki', 'Jakarta', '1986-07-10', 'SMA');

-- --------------------------------------------------------

--
-- Table structure for table `gaji`
--

CREATE TABLE `gaji` (
  `nip` int(25) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jekel` varchar(20) NOT NULL,
  `tempat` varchar(40) NOT NULL,
  `tenggal` varchar(20) NOT NULL,
  `pendidikan` varchar(40) NOT NULL,
  `pangkat` varchar(30) NOT NULL,
  `jabatan` varchar(40) NOT NULL,
  `masa` varchar(30) NOT NULL,
  `gaji` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `laporan`
--

CREATE TABLE `laporan` (
  `nip` int(25) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jekel` varchar(50) NOT NULL,
  `tempat` varchar(40) NOT NULL,
  `tenggal` varchar(30) NOT NULL,
  `pendidikan` varchar(40) NOT NULL,
  `pangkat` varchar(50) NOT NULL,
  `jabatan` varchar(40) NOT NULL,
  `masa` varchar(30) NOT NULL,
  `gaji` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `laporan`
--

INSERT INTO `laporan` (`nip`, `nama`, `jekel`, `tempat`, `tenggal`, `pendidikan`, `pangkat`, `jabatan`, `masa`, `gaji`) VALUES
(15560012, 'oscar dewata', 'Laki-laki', 'blitar', '2019-07-11', 'S1 Sistem Informasi', 'II/b', 'Manager', '5 tahun', '8000000'),
(1977801121, 'AGUS SOFYAN', 'Laki-laki', 'Jakarta', '1986-07-10', 'SMA', 'Ib', 'Juru Muda Tingkat I', '6 Tahun', '5000000');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(15) NOT NULL,
  `pass` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `pass`) VALUES
('admin', 'admin'),
('user', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `multiuserlogin`
--

CREATE TABLE `multiuserlogin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `usertype` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tabeljabatan`
--

CREATE TABLE `tabeljabatan` (
  `nip` int(25) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `pangkat` varchar(50) NOT NULL,
  `jabatan` varchar(40) NOT NULL,
  `masa` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabeljabatan`
--

INSERT INTO `tabeljabatan` (`nip`, `nama`, `pangkat`, `jabatan`, `masa`) VALUES
(1977801121, 'AGUS SOFYAN', 'Ib', 'Juru Muda Tingkat I', '6 Tahun');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dpegawai`
--
ALTER TABLE `dpegawai`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `laporan`
--
ALTER TABLE `laporan`
  ADD PRIMARY KEY (`nip`);

--
-- Indexes for table `tabeljabatan`
--
ALTER TABLE `tabeljabatan`
  ADD PRIMARY KEY (`nip`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 24, 2022 at 02:55 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rad_library_v1`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(10) NOT NULL,
  `name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `name`, `username`, `password`) VALUES
(4, 'Admin', 'admin', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `assistant_librarian`
--

DROP TABLE IF EXISTS `assistant_librarian`;
CREATE TABLE IF NOT EXISTS `assistant_librarian` (
  `id` int(10) NOT NULL,
  `name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assistant_librarian`
--

INSERT INTO `assistant_librarian` (`id`, `name`, `username`, `password`) VALUES
(4, 'Assistant Librarian', 'assis', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
CREATE TABLE IF NOT EXISTS `books` (
  `bookID` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `subject` varchar(255) NOT NULL,
  `edition` tinyint(3) NOT NULL,
  PRIMARY KEY (`bookID`)
) ENGINE=MyISAM AUTO_INCREMENT=4539 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`bookID`, `name`, `author`, `subject`, `edition`) VALUES
(1, 'Systematic Musicology', 'Rolf Bader', 'Engineering', 3),
(2, 'Nanotechnology', 'Prof. Bharat Bhushan', 'Engineering', 5),
(3, 'Applied Cryptography and Network Security', 'Dr. Giuseppe Ateniese', 'Computer Science', 8),
(4, 'Encyclopedia of Optimization', 'Christodoulos A. Floudas', 'Mathematics', 10),
(5, 'Commutative Algebra', 'Irena Peeva', 'Mathematics', 5);

-- --------------------------------------------------------

--
-- Table structure for table `issue_books`
--

DROP TABLE IF EXISTS `issue_books`;
CREATE TABLE IF NOT EXISTS `issue_books` (
  `issueID` int(255) NOT NULL AUTO_INCREMENT,
  `bookID` int(10) NOT NULL,
  `stuID` int(8) NOT NULL,
  `issueDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`issueID`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `issue_books`
--

INSERT INTO `issue_books` (`issueID`, `bookID`, `stuID`, `issueDate`) VALUES
(7, 1, 20021178, '2022-09-24 02:44:17');

-- --------------------------------------------------------

--
-- Table structure for table `librarian`
--

DROP TABLE IF EXISTS `librarian`;
CREATE TABLE IF NOT EXISTS `librarian` (
  `id` int(10) NOT NULL,
  `name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `librarian`
--

INSERT INTO `librarian` (`id`, `name`, `username`, `password`) VALUES
(4, 'Librarian', 'lib', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `registrar`
--

DROP TABLE IF EXISTS `registrar`;
CREATE TABLE IF NOT EXISTS `registrar` (
  `id` int(10) NOT NULL,
  `name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registrar`
--

INSERT INTO `registrar` (`id`, `name`, `username`, `password`) VALUES
(4, 'Registrar', 'reg', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `request_books`
--

DROP TABLE IF EXISTS `request_books`;
CREATE TABLE IF NOT EXISTS `request_books` (
  `requestID` int(255) NOT NULL AUTO_INCREMENT,
  `bookID` int(10) NOT NULL,
  `stuID` int(8) NOT NULL,
  `requestDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`requestID`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `request_books`
--

INSERT INTO `request_books` (`requestID`, `bookID`, `stuID`, `requestDate`) VALUES
(7, 3, 20020325, '2022-09-24 02:43:05'),
(9, 5, 20020503, '2022-09-24 02:43:53');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `stuID` int(8) NOT NULL,
  `firstName` varchar(255) NOT NULL,
  `lastName` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`stuID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`stuID`, `firstName`, `lastName`, `username`, `password`) VALUES
(20020325, 'Lahiru', 'Dissanayake', 'lahiru', '1234'),
(20020503, 'Ravindu', 'Viranga', 'ravindu', '1234'),
(20020643, 'Nishan', 'Madhushanka', 'nishan', '1234'),
(20021178, 'Dinethi', 'Wickramasinghe', 'dinethi', '1234'),
(20020572, 'Kivi', 'Amarakoon', 'kivi', '1234');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

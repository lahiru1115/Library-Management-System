-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 16, 2022 at 02:35 AM
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
-- Database: `rad_library`
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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `name`, `username`, `password`) VALUES
(1, 'Admin', 'Admin', 'Admin'),
(2, 'Admin2', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `all_books`
--

DROP TABLE IF EXISTS `all_books`;
CREATE TABLE IF NOT EXISTS `all_books` (
  `bookno` int(11) NOT NULL,
  `bookname` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `pages` int(11) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`bookno`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `all_books`
--

INSERT INTO `all_books` (`bookno`, `bookname`, `author`, `pages`, `price`) VALUES
(2, 'c#', 'james', 250, 2500),
(1, 'java ', 'abcd', 250, 1000),
(3, 'c++', 'abcd', 20, 2000),
(4, 'python', 'james', 500, 3500),
(5, 'web development', 'abc', 56, 500),
(6, 'java 2', 'sandul', 20, 100),
(7, 'java 3', 'John', 50, 500),
(10, 'java 3', 'john', 50, 500),
(20, 'java 4', 'james', 540, 5000),
(50, 'c# 5', 'nihal perera', 400, 500),
(100, 'java book 1', 'kaamal', 525, 1000),
(56, 'dfgd', 'dffg', 56, 200),
(234, '2erwe', 'werwer', 34, 234);

-- --------------------------------------------------------

--
-- Table structure for table `assistant_librarian`
--

DROP TABLE IF EXISTS `assistant_librarian`;
CREATE TABLE IF NOT EXISTS `assistant_librarian` (
  `id` int(10) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assistant_librarian`
--

INSERT INTO `assistant_librarian` (`id`, `fname`, `lname`, `username`, `password`) VALUES
(1, '123', '123', 'sandul', 'sandul'),
(55555, '123', '123', '4', '4'),
(8979, '123', '123', '45', '67'),
(5678678, '123', '123', '657', '567'),
(56, '56456456', '324234terter', '34234retert', '324234rtert'),
(43534535, '345344535', '3453453', '3453535', '3453535');

-- --------------------------------------------------------

--
-- Table structure for table `issue_books`
--

DROP TABLE IF EXISTS `issue_books`;
CREATE TABLE IF NOT EXISTS `issue_books` (
  `bookno` int(11) NOT NULL,
  `book_name` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `price` float NOT NULL,
  `pages` int(11) NOT NULL,
  `student_no` varchar(255) NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `date_of_issue` varchar(255) NOT NULL,
  `date_to_be_return` varchar(255) NOT NULL,
  `availability` varchar(255) NOT NULL,
  PRIMARY KEY (`bookno`,`student_no`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `librarian`
--

DROP TABLE IF EXISTS `librarian`;
CREATE TABLE IF NOT EXISTS `librarian` (
  `id` int(10) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `librarian`
--

INSERT INTO `librarian` (`id`, `fname`, `lname`, `username`, `password`) VALUES
(1, '123', '123', 'sandul', 'sandul'),
(55555, '123', '123', '4', '4'),
(5678678, '123', '123', '657', '567'),
(234, 'df', 'df', 'df', 'df'),
(345345, '345353', '34535', '3453453', '3453535');

-- --------------------------------------------------------

--
-- Table structure for table `registrar`
--

DROP TABLE IF EXISTS `registrar`;
CREATE TABLE IF NOT EXISTS `registrar` (
  `id` int(10) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registrar`
--

INSERT INTO `registrar` (`id`, `fname`, `lname`, `username`, `password`) VALUES
(1, '123', '123', 'sandul', 'sandul'),
(55555, '123', '123', '4', '4'),
(8979, '123', '123', '45', '67'),
(5678678, '123', '123', '657', '567'),
(43534535, '345344535', '3453453', '3453535', '3453535'),
(67567, '567567', '567567', '567567', '567567');

-- --------------------------------------------------------

--
-- Table structure for table `return_books`
--

DROP TABLE IF EXISTS `return_books`;
CREATE TABLE IF NOT EXISTS `return_books` (
  `bookno` int(11) NOT NULL,
  `book_name` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `price` float NOT NULL,
  `pages` int(11) NOT NULL,
  `student_no` varchar(255) NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `date_of_issue` varchar(11) NOT NULL,
  `date_to_be_return` varchar(11) NOT NULL,
  PRIMARY KEY (`bookno`,`student_no`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `return_books`
--

INSERT INTO `return_books` (`bookno`, `book_name`, `author`, `price`, `pages`, `student_no`, `student_name`, `date_of_issue`, `date_to_be_return`) VALUES
(100, 'java book 1', 'kaamal', 1000, 525, 'D/BSE/19/0025', 'sandun', '05/04/2020', '10/04/2020'),
(50, 'c# 5', 'nihal perera', 500, 400, 'D/BSE/19/0025', 'tharaka', '05/04/2020', '20/04/2020'),
(7, 'java 3', 'John', 500, 50, 'D/BSE/19/0020', 'sampath', '20/20/2020', '20/03/2020'),
(20, 'java 4', 'james', 5000, 540, 'D/BSE/19/0020', 'Sameera', '06/04/2020', '12/04/2020'),
(2, 'c#', 'james', 2500, 250, 'D/BSE/19/0030', 'viraj', '05/04/2020', '25/04/2020');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

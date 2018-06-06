-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 06 Jun 2018 pada 10.51
-- Versi Server: 10.1.26-MariaDB
-- PHP Version: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_wedding_organizer`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `dtl_tr_pembayaran`
--

CREATE TABLE `dtl_tr_pembayaran` (
  `kodePembayaran` varchar(10) NOT NULL DEFAULT '',
  `kodePenyedia` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `dtl_tr_pembayaran`
--

INSERT INTO `dtl_tr_pembayaran` (`kodePembayaran`, `kodePenyedia`) VALUES
('2305182201', 'lengkap'),
('2305182202', 'lengkap'),
('2305182301', 'kuranglebih'),
('2305182301', 'lengkap'),
('2405181401', 'lengkap');

-- --------------------------------------------------------

--
-- Struktur dari tabel `dtl_tr_pemesanan`
--

CREATE TABLE `dtl_tr_pemesanan` (
  `kodePemesanan` varchar(10) NOT NULL,
  `kodeLayanan` varchar(5) NOT NULL,
  `qtyLayanan` int(11) NOT NULL,
  `keterangan` varchar(100) NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `dtl_tr_pemesanan`
--

INSERT INTO `dtl_tr_pemesanan` (`kodePemesanan`, `kodeLayanan`, `qtyLayanan`, `keterangan`, `status`) VALUES
('2305182201', '6', 1, 'oke', 1),
('2305182201', '7', 3, 'Yang Bagus', 1),
('2305182202', '5', 100, 'Tolong Murahin', 1),
('2305182202', '6', 1, 'Oke', 1),
('2305182202', '7', 2, 'Siap', 1),
('2305182301', '10', 1, '10', 1),
('2305182301', '2', 100, '2', 1),
('2405181301', '10', 1, 'Oke', 1),
('2405181401', '3', 1, 'OKe', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `hdr_tr_pembayaran`
--

CREATE TABLE `hdr_tr_pembayaran` (
  `kodePembayaran` varchar(10) NOT NULL,
  `kodePemesanan` varchar(10) NOT NULL,
  `customerID` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `hdr_tr_pembayaran`
--

INSERT INTO `hdr_tr_pembayaran` (`kodePembayaran`, `kodePemesanan`, `customerID`) VALUES
('2305182201', '2305182201', 'fajar'),
('2305182202', '2305182202', 'fajar'),
('2305182301', '2305182301', 'fajar'),
('2405181401', '2405181401', 'fajar');

-- --------------------------------------------------------

--
-- Struktur dari tabel `hdr_tr_pemesanan`
--

CREATE TABLE `hdr_tr_pemesanan` (
  `kodePemesanan` varchar(10) NOT NULL,
  `customerID` varchar(30) NOT NULL,
  `tanggalPemesanan` date NOT NULL,
  `tanggalAcara` date NOT NULL,
  `waktuMulaiAcara` time NOT NULL,
  `waktuSelesaiAcara` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `hdr_tr_pemesanan`
--

INSERT INTO `hdr_tr_pemesanan` (`kodePemesanan`, `customerID`, `tanggalPemesanan`, `tanggalAcara`, `waktuMulaiAcara`, `waktuSelesaiAcara`) VALUES
('2305182201', 'fajar', '2018-05-23', '2018-12-12', '12:12:00', '14:12:00'),
('2305182202', 'fajar', '2018-05-23', '2018-12-12', '21:21:00', '33:21:00'),
('2305182301', 'fajar', '2018-05-23', '1221-12-12', '12:12:00', '14:12:00'),
('2405181301', 'fajar', '2018-05-24', '2018-12-12', '23:21:00', '24:21:00'),
('2405181401', 'fajar', '2018-05-24', '2018-12-12', '13:11:00', '14:11:00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ms_bank`
--

CREATE TABLE `ms_bank` (
  `kodeBank` varchar(5) NOT NULL,
  `namaBank` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `ms_bank`
--

INSERT INTO `ms_bank` (`kodeBank`, `namaBank`) VALUES
('1', 'BCA'),
('2', 'Bank Mandiri'),
('3', 'Bank INA'),
('4', 'Panin Bank'),
('5', 'Digi Bank'),
('6', 'Bank Mas');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ms_customer`
--

CREATE TABLE `ms_customer` (
  `customerID` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `namaCustomer` varchar(30) NOT NULL,
  `alamatCustomer` varchar(75) NOT NULL,
  `telpCustomer` varchar(12) NOT NULL,
  `noRekeningCustomer` varchar(20) NOT NULL,
  `kodeBank` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `ms_customer`
--

INSERT INTO `ms_customer` (`customerID`, `password`, `namaCustomer`, `alamatCustomer`, `telpCustomer`, `noRekeningCustomer`, `kodeBank`) VALUES
('', '', '', '', '', '', '1'),
('fajar', 'oke', 'FajarS', 'Bojong Indah 12', '081212345679', '1120133242', '1'),
('maunikah', 'sekarang', 'Budi', 'Jelambar', '0211313212', '12343543534', '4'),
('setia', 'selalu', 'Setia', 'Hatimu Selalu', '0211237901', '11121312312', '2'),
('tidakjomblolagi', 'asikdah', 'Agus', 'Tanjung Duren', '021234324234', '11112312431', '3');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ms_layanan`
--

CREATE TABLE `ms_layanan` (
  `kodeLayanan` varchar(5) NOT NULL,
  `kodeTipeLayanan` varchar(3) NOT NULL,
  `keteranganLayanan` varchar(100) NOT NULL,
  `hargaSatuan` int(11) NOT NULL,
  `kodePenyedia` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `ms_layanan`
--

INSERT INTO `ms_layanan` (`kodeLayanan`, `kodeTipeLayanan`, `keteranganLayanan`, `hargaSatuan`, `kodePenyedia`) VALUES
('10', '1', 'Sederhana', 500000, 'kuranglebih'),
('10', '1', 'Besar', 10, 'lengkap'),
('2', '2', 'Undangan Cantik dan Menawan', 100000, 'kuranglebih'),
('3', '6', 'Sangat Berpengalaman', 2000000, 'lengkap'),
('5', '2', 'Menarik', 20000, 'kuranglebih'),
('6', '1', 'Gedung Murah', 100000, 'lengkap'),
('7', '5', 'Berkualitas Baik Sekali OKe', 1000000, 'lengkap');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ms_penyedia`
--

CREATE TABLE `ms_penyedia` (
  `kodePenyedia` varchar(30) NOT NULL,
  `password` varchar(50) NOT NULL,
  `namaPenyedia` varchar(30) NOT NULL,
  `alamatPenyedia` varchar(100) NOT NULL,
  `telpPenyedia` varchar(12) NOT NULL,
  `noRekeningPenyedia` varchar(20) NOT NULL,
  `kodeBank` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `ms_penyedia`
--

INSERT INTO `ms_penyedia` (`kodePenyedia`, `password`, `namaPenyedia`, `alamatPenyedia`, `telpPenyedia`, `noRekeningPenyedia`, `kodeBank`) VALUES
('', '', '', '', '', '', '1'),
('fajar', '', '', '', '', '', '1'),
('kuranglebih', 'adasemua', 'Pasti Ada', 'Bojong', '24758942792', '123124234324', '6'),
('lengkap', 'asd', 'Penyedia Lengkap Oke', 'Dimana Saja Pasti Ada Ya Kan', '123', '100', '1');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ms_tipelayanan`
--

CREATE TABLE `ms_tipelayanan` (
  `kodeTipeLayanan` varchar(3) NOT NULL,
  `tipeLayanan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `ms_tipelayanan`
--

INSERT INTO `ms_tipelayanan` (`kodeTipeLayanan`, `tipeLayanan`) VALUES
('1', 'Gedung'),
('2', 'Undangan'),
('3', 'Fotografer'),
('4', 'Catering'),
('5', 'Singer'),
('6', 'MC'),
('7', 'Souvenir'),
('8', 'Baju dan Make Up');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dtl_tr_pembayaran`
--
ALTER TABLE `dtl_tr_pembayaran`
  ADD PRIMARY KEY (`kodePembayaran`,`kodePenyedia`),
  ADD KEY `kodePenyedia` (`kodePenyedia`);

--
-- Indexes for table `dtl_tr_pemesanan`
--
ALTER TABLE `dtl_tr_pemesanan`
  ADD PRIMARY KEY (`kodePemesanan`,`kodeLayanan`),
  ADD KEY `kodeLayanan` (`kodeLayanan`);

--
-- Indexes for table `hdr_tr_pembayaran`
--
ALTER TABLE `hdr_tr_pembayaran`
  ADD PRIMARY KEY (`kodePembayaran`),
  ADD KEY `customerID` (`customerID`),
  ADD KEY `kodePemesanan` (`kodePemesanan`);

--
-- Indexes for table `hdr_tr_pemesanan`
--
ALTER TABLE `hdr_tr_pemesanan`
  ADD PRIMARY KEY (`kodePemesanan`),
  ADD KEY `customerID` (`customerID`);

--
-- Indexes for table `ms_bank`
--
ALTER TABLE `ms_bank`
  ADD PRIMARY KEY (`kodeBank`);

--
-- Indexes for table `ms_customer`
--
ALTER TABLE `ms_customer`
  ADD PRIMARY KEY (`customerID`),
  ADD KEY `kodeBank` (`kodeBank`);

--
-- Indexes for table `ms_layanan`
--
ALTER TABLE `ms_layanan`
  ADD PRIMARY KEY (`kodeLayanan`,`kodePenyedia`),
  ADD KEY `kodePenyedia` (`kodePenyedia`),
  ADD KEY `kodeTipeLayanan` (`kodeTipeLayanan`);

--
-- Indexes for table `ms_penyedia`
--
ALTER TABLE `ms_penyedia`
  ADD PRIMARY KEY (`kodePenyedia`),
  ADD KEY `kodeBank` (`kodeBank`);

--
-- Indexes for table `ms_tipelayanan`
--
ALTER TABLE `ms_tipelayanan`
  ADD PRIMARY KEY (`kodeTipeLayanan`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `dtl_tr_pembayaran`
--
ALTER TABLE `dtl_tr_pembayaran`
  ADD CONSTRAINT `dtl_tr_pembayaran_ibfk_1` FOREIGN KEY (`kodePenyedia`) REFERENCES `ms_penyedia` (`kodePenyedia`),
  ADD CONSTRAINT `dtl_tr_pembayaran_ibfk_2` FOREIGN KEY (`kodePembayaran`) REFERENCES `hdr_tr_pembayaran` (`kodePembayaran`);

--
-- Ketidakleluasaan untuk tabel `dtl_tr_pemesanan`
--
ALTER TABLE `dtl_tr_pemesanan`
  ADD CONSTRAINT `dtl_tr_pemesanan_ibfk_1` FOREIGN KEY (`kodeLayanan`) REFERENCES `ms_layanan` (`kodeLayanan`),
  ADD CONSTRAINT `dtl_tr_pemesanan_ibfk_2` FOREIGN KEY (`kodePemesanan`) REFERENCES `hdr_tr_pemesanan` (`kodePemesanan`);

--
-- Ketidakleluasaan untuk tabel `hdr_tr_pembayaran`
--
ALTER TABLE `hdr_tr_pembayaran`
  ADD CONSTRAINT `hdr_tr_pembayaran_ibfk_1` FOREIGN KEY (`customerID`) REFERENCES `ms_customer` (`customerID`),
  ADD CONSTRAINT `hdr_tr_pembayaran_ibfk_2` FOREIGN KEY (`kodePemesanan`) REFERENCES `hdr_tr_pemesanan` (`kodePemesanan`);

--
-- Ketidakleluasaan untuk tabel `hdr_tr_pemesanan`
--
ALTER TABLE `hdr_tr_pemesanan`
  ADD CONSTRAINT `hdr_tr_pemesanan_ibfk_1` FOREIGN KEY (`customerID`) REFERENCES `ms_customer` (`customerID`);

--
-- Ketidakleluasaan untuk tabel `ms_customer`
--
ALTER TABLE `ms_customer`
  ADD CONSTRAINT `ms_customer_ibfk_1` FOREIGN KEY (`kodeBank`) REFERENCES `ms_bank` (`kodeBank`);

--
-- Ketidakleluasaan untuk tabel `ms_layanan`
--
ALTER TABLE `ms_layanan`
  ADD CONSTRAINT `ms_layanan_ibfk_1` FOREIGN KEY (`kodePenyedia`) REFERENCES `ms_penyedia` (`kodePenyedia`),
  ADD CONSTRAINT `ms_layanan_ibfk_2` FOREIGN KEY (`kodeTipeLayanan`) REFERENCES `ms_tipelayanan` (`kodeTipeLayanan`);

--
-- Ketidakleluasaan untuk tabel `ms_penyedia`
--
ALTER TABLE `ms_penyedia`
  ADD CONSTRAINT `ms_penyedia_ibfk_1` FOREIGN KEY (`kodeBank`) REFERENCES `ms_bank` (`kodeBank`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

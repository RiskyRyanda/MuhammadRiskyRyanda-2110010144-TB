-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 06 Jan 2024 pada 08.25
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pesawat`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `jadwal`
--

CREATE TABLE `jadwal` (
  `ID_JADWAL` varchar(10) NOT NULL,
  `ID_PESAWAT` varchar(10) DEFAULT NULL,
  `KOTA_AWAL` varchar(10) DEFAULT NULL,
  `KOTA_TUJUAN` varchar(10) DEFAULT NULL,
  `KEBERANGKATAN` varchar(10) DEFAULT NULL,
  `KEDATANGAN` varchar(10) DEFAULT NULL,
  `HARGA` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `jadwal`
--

INSERT INTO `jadwal` (`ID_JADWAL`, `ID_PESAWAT`, `KOTA_AWAL`, `KOTA_TUJUAN`, `KEBERANGKATAN`, `KEDATANGAN`, `HARGA`) VALUES
('JD01', 'PW01', 'KT01', 'KT03', '11:00:00', '12:00:00', 550000),
('JD02', 'PW02', 'KT02', 'KT03', '11:00:00', '12:00:00', 550000),
('JD03', 'PW05', 'KT01', 'KT00', '13:30:00', '15:30:00', 930000),
('JD04', 'PW04', 'KT04', 'KT05', '13:00:00', '14:00:00', 550000),
('JD05', 'PW05', 'KT05', 'KT01', '14:00:00', '15:00:00', 550000),
('JD06', 'PW01', 'KT01', 'KT02', '01:00:00', '12:00:00', 777777),
('JD07', 'PW04', 'KT06', 'KT00', '08:00:00', '09:45:00', 300000),
('JD08', 'PW04', 'KT00', 'KT06', '08:00:00', '09:35:00', 380000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `kota`
--

CREATE TABLE `kota` (
  `ID_KOTA` varchar(10) NOT NULL,
  `KOTA` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `kota`
--

INSERT INTO `kota` (`ID_KOTA`, `KOTA`) VALUES
('KT00', 'Banjarbaru'),
('KT01', 'Banjarmasin'),
('KT02', 'Surabaya'),
('KT03', 'Bali'),
('KT04', 'Malang'),
('KT05', 'Semarang'),
('KT06', 'Batulicin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `Nama` varchar(30) NOT NULL,
  `No_telpon` varchar(30) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`Nama`, `No_telpon`, `Email`, `Username`, `Password`) VALUES
('risky ryanda', '082155144', 'riskyryanda321@gmail.com', 'risky11', 'risky11'),
('Muhammad Risky Ryanda', '0895632555', 'riskyryanda99@gmail.com', 'riskyryanda', 'riskyryanda');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemesanan`
--

CREATE TABLE `pemesanan` (
  `ID_PEMESANAN` int(11) NOT NULL,
  `ID_JADWAL` varchar(10) DEFAULT NULL,
  `NIK` varchar(16) DEFAULT NULL,
  `NAMA` varchar(100) DEFAULT NULL,
  `TELPON` varchar(16) DEFAULT NULL,
  `JUMLAH_TIKET` int(11) DEFAULT NULL,
  `TOTAL` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `pemesanan`
--

INSERT INTO `pemesanan` (`ID_PEMESANAN`, `ID_JADWAL`, `NIK`, `NAMA`, `TELPON`, `JUMLAH_TIKET`, `TOTAL`) VALUES
(6, 'JD08', '2110010144', 'Muhammad Risky Ryanda', '08956352125555', 3, 1140000),
(7, 'JD06', '2110010135', 'Muhammad Risky', '08956352125345', 2, 1555554);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pesawat`
--

CREATE TABLE `pesawat` (
  `ID_PESAWAT` varchar(10) NOT NULL,
  `MASKAPAI` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `pesawat`
--

INSERT INTO `pesawat` (`ID_PESAWAT`, `MASKAPAI`) VALUES
('PW01', 'Garuda Indonesia'),
('PW02', 'Citilink'),
('PW03', 'Sriwijaya'),
('PW04', 'Lion Air'),
('PW05', 'Air Asia'),
('PW06', 'Batik Air');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`ID_JADWAL`),
  ADD KEY `FK_RELATIONSHIP_1` (`ID_PESAWAT`),
  ADD KEY `FK_RELATIONSHIP_2` (`KOTA_TUJUAN`),
  ADD KEY `FK_RELATIONSHIP_3` (`KOTA_AWAL`);

--
-- Indeks untuk tabel `kota`
--
ALTER TABLE `kota`
  ADD PRIMARY KEY (`ID_KOTA`);

--
-- Indeks untuk tabel `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`ID_PEMESANAN`),
  ADD KEY `FK_RELATIONSHIP_4` (`ID_JADWAL`);

--
-- Indeks untuk tabel `pesawat`
--
ALTER TABLE `pesawat`
  ADD PRIMARY KEY (`ID_PESAWAT`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `pemesanan`
--
ALTER TABLE `pemesanan`
  MODIFY `ID_PEMESANAN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `FK_RELATIONSHIP_1` FOREIGN KEY (`ID_PESAWAT`) REFERENCES `pesawat` (`ID_PESAWAT`),
  ADD CONSTRAINT `FK_RELATIONSHIP_2` FOREIGN KEY (`KOTA_TUJUAN`) REFERENCES `kota` (`ID_KOTA`),
  ADD CONSTRAINT `FK_RELATIONSHIP_3` FOREIGN KEY (`KOTA_AWAL`) REFERENCES `kota` (`ID_KOTA`);

--
-- Ketidakleluasaan untuk tabel `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD CONSTRAINT `FK_RELATIONSHIP_4` FOREIGN KEY (`ID_JADWAL`) REFERENCES `jadwal` (`ID_JADWAL`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

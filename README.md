# Laporan Tugas Gabungan Week 10–12
## CCK3KAB3-SE-47-01 | Rekayasa Perangkat Lunak

> **Deadline:** Rabu, 20 Mei 2026, 23:59  
> **Dikerjakan Perkelompok (2 Orang)**

---

## 📋 Deskripsi Proyek

Project ini adalah **Simple Java Calculator** berbasis Maven yang digunakan sebagai media praktik integrasi Git, CI/CD menggunakan GitHub Actions, dan analisis keamanan kode (SAST) menggunakan Snyk.

Project mencakup:
- Operasi aritmatika dasar (tambah, kurang, kali, bagi, modulo, pangkat)
- Unit testing menggunakan **JUnit 5**
- Pipeline CI/CD menggunakan **GitHub Actions** (`mvn test` otomatis)
- Integrasi security scanning menggunakan **Snyk**

---

## 👥 Pembagian Tugas

| Anggota | Peran | Tahap |
|---------|-------|-------|
| **Dhafa Arrizki Gusman** | Inisiasi repo & finalisasi pipeline | Tahap 1 & 4 |
| **Muhammad Bintang** | Membuat unit test JUnit & Membuat GitHub Actions + integrasi Snyk | Tahap 2 & 3 |

---

## 📊 Ringkasan Git Activity

| Aktivitas | Siapa | Branch |
|-----------|-------|--------|
| Initial commit (source + pom.xml) | Dhafa Arrizki Gusman | `main` |
| Tambah unit test JUnit | Muhammad Bintang | `bintang_unit-test` |
| Merge PR unit test | Muhammad Bintang | `main` |
| Tambah GitHub Actions + Snyk | Muhammad Bintang | `bintang_github-action` |
| Merge PR CI/CD | Dhafa Arrizki Gusman | `main` |
| Pipeline otomatis berjalan | GitHub Actions | — |

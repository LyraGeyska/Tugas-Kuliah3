## Deskripsi Tugas 
Pada tugas Pemrograman Berbasis Objek (PBO) pertemuan 3 ini yaitu mengimplementasikan class abstract, override, dan overload. Pada proyek ini saya mengimplementasikan class abstract pada class KendaraanPribadi yang kemudian di extends dengan class Mobil dan class Motor, lalu saya juga membuat class utama untuk menjalankan programnya. Pada class KendaraanPribadi saya membuat method abstract yang harus di override oleh subclass dan method overload dengan dan tanpa parameter yang memiliki nama yang sama. Lalu, pada class Mobil dan Motor terdapat suatu method override dari abstract class KendaraanPribadi. Terakhir, pada class Utama menjalankan program dengan mengeprint override dan overload yang sudah ada dalam beberapa class sebelumnya.

# Class Abstract

## Pengertian Class Abstract
`Class abstract` adalah class yang tidak dapat diinstansiasi (tidak bisa dibuat objeknya secara langsung), namun berfungsi sebagai "template" atau "kerangka" bagi subclass yang mewarisinya. Biasanya, class ini mendefinisikan metode-metode abstrak (tanpa implementasi) yang harus diimplementasikan oleh subclass-nya.

Dengan kata lain, class abstract digunakan ketika Anda ingin mendefinisikan perilaku dasar yang ingin diwariskan oleh class lain, tetapi implementasi detailnya diserahkan kepada subclass.

## Ciri-ciri Class Abstract
1. Tidak bisa diinstansiasi: Objek dari class abstract tidak dapat dibuat secara langsung.
2. Memiliki metode abstract: Class abstract dapat memiliki metode abstract, yaitu metode yang hanya dideklarasikan tanpa implementasi. Subclass yang mewarisi class abstract ini harus mengimplementasikan metode tersebut.
3. Bisa memiliki metode dengan implementasi: Selain metode abstract, class abstract juga bisa memiliki metode dengan implementasi.

## Metode Abstract
Metode abstract adalah metode yang dideklarasikan dalam class abstract tanpa implementasi. Subclass yang mewarisi class abstract tersebut wajib mengimplementasikan semua metode abstract ini.
contoh : ` public abstract void suara();`

# Method Overriding
`Overriding` terjadi ketika subclass mendefinisikan kembali metode yang sudah ada di superclass dengan tujuan untuk mengubah atau menambahkan fungsionalitas baru. Syarat overriding adalah metode di subclass harus memiliki nama, tipe return, dan parameter yang sama seperti di superclass. Override digunakan untuk mengimplementasikan atau memodifikasi perilaku yang diwarisi.

# Method Overloading 
`Overloading` terjadi ketika beberapa metode dalam sebuah kelas memiliki nama yang sama, tetapi parameter yang berbeda (berbeda tipe data atau jumlah parameter). Metode-metode ini disebut overload satu sama lain. Ini digunakan ketika kita ingin memberikan berbagai cara untuk melakukan operasi yang sama.

## Ringkasan
1. `Override` digunakan ketika subclass perlu mengubah perilaku metode superclass.
2. `Overload` memungkinkan penggunaan metode yang sama dengan parameter berbeda.
3. `Class Abstract` menyediakan kerangka dasar yang harus diimplementasikan oleh subclass, yang sangat berguna dalam proyek CRUD.

Semoga penjelasan diatas dapat membantu memahami materi dalam tugas pertemuan 3 mata kuliah Pemrograman Berorientasi Objek ini.

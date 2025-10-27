### Kelas Item

Kelas Item digunakan untuk menyimpan data barang yang dibeli di supermarket.
Setiap barang memiliki tiga atribut utama, yaitu:

name → nama barang

price → harga satuan barang

quantity → jumlah barang yang dibeli

Kelas ini juga memiliki metode calculateTotal(Item item) untuk menghitung total harga barang (harga × jumlah).
Selain itu, tersedia method getter dan setter untuk mengatur serta mengambil nilai dari tiap atribut.

Contoh:

Item item = new Item("Susu", 15000, 2);
double total = Item.calculateTotal(item); // Hasil: 30000

### Kelas Cashier

Kelas Cashier berfungsi sebagai sistem kasir yang mencatat dan menghitung total belanja.
Di dalam kelas ini terdapat daftar barang (cart) yang dibeli, dan logika untuk menghitung total harga serta diskon.

Aturan diskon:

Jika total belanja lebih dari 100.000, maka pembeli mendapat diskon 5%.

Fungsi utama:

addItem(String name, double price, int quantity) → menambah item ke dalam daftar belanja.

printReceipt() → menampilkan struk pembelian yang berisi daftar barang, total harga, diskon (jika ada), dan total akhir pembayaran.

Contoh:

Cashier c = new Cashier();
c.addItem("Roti", 12000, 3);
c.addItem("Susu", 25000, 2);
c.printReceipt();

### Kelas SupermarketApp

Kelas SupermarketApp merupakan kelas utama (main class) yang menjalankan program.
Program ini memungkinkan pengguna memasukkan data barang seperti nama, harga, dan jumlah.
Jika pengguna mengetik “done”, maka sistem akan menampilkan struk pembelian lengkap dengan total harga dan diskon (jika memenuhi syarat).

Langkah kerja program:

Pengguna memasukkan nama barang, harga, dan jumlah.

Data tersebut disimpan ke dalam objek Cashier.

Setelah selesai, sistem menampilkan struk (receipt).

Contoh alur:

Enter item name (or 'done'): Roti
Enter price: 12000
Enter quantity: 2
Enter item name (or 'done'): Susu
Enter price: 25000
Enter quantity: 3
Enter item name (or 'done'): done


Keluaran:

===== SUPERMARKET RECEIPT =====
Roti x2 = 24000.0
Susu x3 = 75000.0
Discount (5%): 4950.0
Total Payment: 94050.0
===============================
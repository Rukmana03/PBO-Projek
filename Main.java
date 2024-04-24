public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan
        Buku buku1 = new Buku("Judul Buku", "Penulis Buku", 2000);
        BukuFiksi buku2 = new BukuFiksi("London Love Story", "Tisa TS", 2015, "Romance");
        BukuNonFiksi buku3 = new BukuNonFiksi("Bersikap Bodo Amat ", "Mark Manson", 2016, "Psikologi");

        buku1.displayInfo();
        System.out.println();
        buku2.displayInfo();
        System.out.println();
        buku3.displayInfo();
    }
}


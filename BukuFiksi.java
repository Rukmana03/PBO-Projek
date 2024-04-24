public class BukuFiksi extends Buku {
    private String genre;
    
    // Constructor
    public BukuFiksi(String judul, String penulis, int tahunTerbit, String genre) {
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
    }

    // Getter dan setter untuk genre
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}
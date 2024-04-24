public class BukuNonFiksi extends Buku {
    private String subjek;
    
    // Constructor
    public BukuNonFiksi(String judul, String penulis, int tahunTerbit, String subjek) {
        super(judul, penulis, tahunTerbit);
        this.subjek = subjek;
    }
    
    // Getter dan setter untuk subjek
    public String getSubjek() { return subjek; }
    public void setSubjek(String subjek) { this.subjek = subjek; }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subjek: " + subjek);
    }
}

class Mahasiswa1 {   // default, bisa dibaca dan di tulis oleh class di luar 
    public String Nama;  // public, bisa dibaca dan ditulis oleh class lain 
    private double nilai; // private hanya bisa dibaca oleh class nya 

    Mahasiswa1(String nama, double nilai) {
        this.Nama = nama;
        this.nilai = nilai;

    }

    void display() {
        System.out.println("Nama\t\t : " + this.Nama);
        System.out.println("Nilai\t\t : " + this.nilai);
    }

 
     public static void main(String[]args) throws Exception{
         Mahasiswa1 mhs = new Mahasiswa1 ("Ridho", 90.5);
        mhs.display();
         
     }
 }

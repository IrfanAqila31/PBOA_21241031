class Mahasiswa {
    String Nama;
    String NIM;
    String Prodi;
    

    Mahasiswa(String nama, String nim, String Prodi) {
        this.Nama = nama;
        this.NIM = nim;
        this.Prodi = Prodi;

        // method tanpa return, tanpa parameter
    }

    void show() {
        System.out.println("Nama : " + this.Nama);
        System.out.println("Nim : " + this.NIM);

        // Mtehod tanpa return dengan parameter
    }

    void ubahNama(String nama) {
        this.Nama = nama;

    }

    String getNama() {
        return this.Nama;
    }

    String kenalan(String Prodi) {
        return "Hai, nama saya" + this.Nama + "NIM saya " + this.NIM + "Saya dari prodi " + this.Prodi;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs = new Mahasiswa("ridho", "21241030","PTI");
        mhs.show();
        mhs.ubahNama("Syntax");
        mhs.show();
        System.out.println(mhs.getNama());
        String Pesan = mhs.kenalan("PTI");
        System.out.println(Pesan);

    }

}

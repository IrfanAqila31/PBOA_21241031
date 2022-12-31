class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;
    int umur;
}


public class App {
     public static void main(String[] args) throws Exception {
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.nama ="Aldi";
        mhs1.nim = "20241020";
        mhs1.jurusan = "Pendidikan Teknologi Informasi";
        mhs1.ipk = 3.00;
        mhs1.umur = 19;

        System.out.println("nama mahasisiwa : "+ mhs1.nama);
        System.out.println("nim mahasiswa : "+ mhs1.nim);
        System.out.println("jurusan : "+ mhs1.jurusan);
        System.out.println("IPK mahasisiwa : "+ mhs1.ipk);
        System.out.println("umur mahasisiwa : "+ mhs1.umur);

        Mahasiswa mhs2 = new Mahasiswa();

        mhs2.nama ="Otong";
        mhs2.nim = "987654321";
        mhs2.jurusan = "PTI";
        mhs2.ipk = 3.99;
        mhs2.umur = 25;

        System.out.println("nama mahasisiwa : "+ mhs2.nama);
        System.out.println("nim mahasiswa : "+ mhs2.nim);
        System.out.println("jurusan : "+ mhs2.jurusan);
        System.out.println("IPK mahasisiwa : "+ mhs2.ipk);
        System.out.println("umur mahasisiwa : "+ mhs2.umur);



    }
}

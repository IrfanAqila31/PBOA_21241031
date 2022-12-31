// class tanpa konstruktor
class polos{
    String dataString;
    int dataInteger;
}

// class tanpa konstruktor
class Mahasiswa{
String nama;
String NIM;
String jurusan;

//konstruktor parameter
    Mahasiswa(String inputnama, String inputNIM, String inputjurusan){
        nama = inputnama;
        NIM = inputNIM;
        jurusan = inputjurusan;
    }
      

    
}



public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa Mhs = new Mahasiswa("Otong", "987654321", "PTI");
        Mahasiswa Mhs1 = new Mahasiswa("Jamal", "876543210", "PTI");

       

        //System.out.println(Mhs.nama);
        //System.out.println(Mhs.NIM);
        //System.out.println(Mhs.jurusan);
    }
}

public class Mahasiswa {
    public String nama;
    public int angkatan;
    public String asal;
public Mahasiswa(){
    nama = "Jago";
    angkatan = 2020;
    asal = "Jember";
}
public void ubahNama(String nm, int ak,String as){
    nama = nm;
    angkatan = ak;
    asal = as;
}
public void cetak(){
    System.out.println("nama : " + nama);
    System.out.println("angaktan : " + angkatan);
    System.out.println("asal : " + asal);
}
}

public class TestMahasiswa {
   public static void main(String[]args){
    Mahasiswa MHS = new Mahasiswa();
    System.out.println("\nIDENTITAS AWAL : ");
    MHS.cetak();
    MHS.ubahNama("Rashford", 2020, "Manchester");
    System.out.println("\nIDENTITAS AKHIR : ");
    MHS.cetak();

    Mahasiswa mhsTI = new Mahasiswa();
    System.out.println("\nIDENTITAS AWAL");
    mhsTI.cetak();
    mhsTI.ubahNama("FATHIL", 2020, "Mataram");
    System.out.println("\nIDENTITAS AKHIR");
    mhsTI.cetak();

    Mahasiswa mhsTE = new Mahasiswa();
    System.out.println("\nIDENTITAS AWAL");
    mhsTE.cetak();
    mhsTE.ubahNama("TIYOK", 2021, "Ampenan");
    System.out.println("\nIDENTITAS AKHIR");
    mhsTE.cetak();

   }

}

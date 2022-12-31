 class Mahasiswa{
     String Nama;
     String NIM;
     Mahasiswa(String nama, String NIM){
         this.Nama = nama;
         this.NIM = NIM;

     }

     /// method tanpa return, tanpa parameter
     void show(){
         System.out.println("Nama : "+ this.Nama);
         System.out.println("NIM : "+ this.NIM);        
     }

     // method tanpa return, dengan parameter
     void ubahNama(String nama){
         this.Nama = nama;
     }
 }




 public class App{
     public static void main(String[]args) throws Exception{
         Mahasiswa mhs1 = new Mahasiswa("Fahmi", "20241005");

         mhs1.show();
         mhs1.ubahNama("SRI");
         mhs1.show();
         //System.out.println(mhs.Nama)
         //System.out.println(mhs1.NIM);
     }
 }

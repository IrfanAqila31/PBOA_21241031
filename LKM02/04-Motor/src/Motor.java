public class Motor {
    String merek;
    int tahun;
    String noPolisi;
    String warna;
    public Motor(String merek, int tahun, String noPolisi, String warna){
        this.merek=merek;
        this.tahun=tahun;
        this.warna=warna;
        this.noPolisi=noPolisi;
    }
    void showInfoMotor(){
        System.out.println("Merek : " + merek);
        System.out.println("Tahun : " + tahun);
        System.out.println("No Polisi : " + noPolisi);
        System.out.println("Warna : " + warna);
    }
    public static void main(String[] args) {
        Motor motor = new Motor("Honda GL pro", 1997, "G 5879 BF", "Hitam");
        motor.showInfoMotor();
      }
}



class motor{
    String merk;
    int tahun;
    String no_pol;
    String warna;
    

    motor(String merk,int tahun, String no_pol, String warna){
    this. merk = merk;
    this. tahun = tahun;
    this. no_pol = no_pol;
    this. warna = warna;
}
    void showInfoMotor(){
        System.out.println("merek : "+ this.merk);
        System.out.println("tahun : "+ this.tahun);
        System.out.println("no_pol : "+ this.no_pol);
        System.out.println("warna : "+ this.warna);
    

    }


public static void main(String[] args) {
        motor motor1 = new motor("YAMAHA", 2020 ,"DR 4511 UH", "hitam");
        motor1.showInfoMotor();


    }
    
}

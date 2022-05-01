package schoolProject;

public class Okul {//istenenler :okul classi olusturulacak ve constant (degistirilemez olucak )
    //okul bilgileri proje icersinde her classtan ulasabilmelidir
    //okul classi sigleton pattern e sahip olmali yani baska classlardan obje olusturulmasina izin verilmemelidir
    static final String okulIsmi="Yildiz koleji";//STATIC YAPTIK HER CLASSTAN ULASILABILSIN AMA DEGISTIRILEBILIRDE OYUZDEN FINAL YAPTIK DEGISTIRILEMEZ
    static final String adress="Cankaya/Ankara";
    static final String tel="00223145200";

    private  Okul(){
        //okul objesininn olusmasina iizin vermeme yani(baska bir classtan Okul okulobj=new Okul ();)yazinca okulun ismini degistirebilir
        // okul icindeki constructor olusturamazsaniz onuda kullanamazsiniz
    }

}

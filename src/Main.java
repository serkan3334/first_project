import java.util.Scanner;






import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                // taş : 0 , kagıt : 1 , makas : 2,
                // kullanıcıdan deger alınması gerekiyor (Scanner) aynı zamanda bilgisayar random deger aticak :
                // int pc = (int)random()*3; şeklinde olcak sonra if else ile sınıflandırcaz



                System.out.println("lütfen taş : 0 , kagıt : 1 , makas : 2, degerlerinden birini giriniz ");




                int berabere = 0;
                int bilgisayarınkazandıgı = 0;
                int kullanicikazanci = 0;


                String taş = "girdiginiz deger taştır.";
                String kagıt = "girdiginiz deger kagıttır.";
                String makas = "girdiginiz deger makastır.";



                while (bilgisayarınkazandıgı < 3 && kullanicikazanci < 3) {
                    Scanner kullanici1 = new Scanner(System.in);
                    int kullanici = kullanici1.nextInt();

                    if (kullanici == 0) {

                        System.out.println(":" + taş);

                    } else if (kullanici == 1) {
                        System.out.println(":" + kagıt);
                    } else if (kullanici == 2) {
                        System.out.println(":" + makas);
                    } else {
                        System.out.println("lütfen 0 , 1 , 2 degerleriniz giriniz ...");
                    }

                    int bilgisayar = (int) (Math.random() * 3);
                    System.out.println("bilgisayar'ın random girdigi deger  : " + bilgisayar);


                    if (kullanici == 0 && bilgisayar == 0) {
                        berabere++;
                        System.out.println("berabere");
                    }

                    if (kullanici == 0 && bilgisayar == 1) {
                        bilgisayarınkazandıgı++;
                        System.out.println("bilgisayar kazandı ve bilgisayarın puanı : " + bilgisayarınkazandıgı + "sizin kazandıgınız : " + kullanicikazanci);
                    }
                    if (kullanici == 0 && bilgisayar == 2) {
                        kullanicikazanci++;
                        System.out.println("kullanıcı kazandı ve kullanıcı puanı :" + kullanicikazanci + "   pc puanı :" + bilgisayarınkazandıgı);
                    }


                    if (kullanici == 1 && bilgisayar == 1) {
                        berabere++;
                        System.out.println("berabere");
                    }

                    if (kullanici == 1 && bilgisayar == 2) {
                        bilgisayarınkazandıgı++;
                        System.out.println("bilgisayar kazandı ve bilgisayarın puanı : " + bilgisayarınkazandıgı + "sizin kazandıgınız : " + kullanicikazanci);
                    }
                    if (kullanici == 1 && bilgisayar == 0) {
                        kullanicikazanci++;
                        System.out.println("kuulanıcı kazandı ve kullanıcı puanı :" + kullanicikazanci + "pc puanı :" + bilgisayarınkazandıgı);
                    }


                    if (kullanici == 2 && bilgisayar == 2) {
                        berabere++;
                        System.out.println("berabere");
                    }

                    if (kullanici == 2 && bilgisayar == 0) {
                        bilgisayarınkazandıgı++;
                        System.out.println("bilgisayar kazandı ve bilgisayarın puanı : " + bilgisayarınkazandıgı + "sizin kazandıgınız : " + kullanicikazanci);
                    }
                    if (kullanici == 2 && bilgisayar == 1) {
                        kullanicikazanci++;
                        System.out.println("kuulanıcı kazandı ve kullanıcı puanı :" + kullanicikazanci + "pc puanı :" + bilgisayarınkazandıgı);
                    }


                }





            }
        }

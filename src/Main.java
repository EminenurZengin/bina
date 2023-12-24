import java.util.ArrayList;
import java.util.List;

// Ana Sınıf
public class Main {
    public static void main(String[] args) {
        EvSahibi evSahibi = new EvSahibi( "huseyin zengin", "manisa");
        Bina bina = new Bina("bina1", 10, evSahibi);

        Daire daire1 = new Daire("1", 100, "bina1");
        Daire daire2 = new Daire("2", 200, "bina1");

        Kiraci kiraci1 = new Kiraci("eminenur ", "kirklar üni", bina);
        Kiraci kiraci2 = new Kiraci("seyma", "kirklar uni", bina);

        bina.daireEkle(daire1);
        bina.daireEkle(daire2);

        System.out.println("Kiracı Bilgileri:");
        kiraci1.bilgileriGoster();
        System.out.println();

        kiraci2.bilgileriGoster();
        System.out.println("\nDaire Bilgileri:");
        for (Daire daire : bina.getDaireler()) {
            daire.bilgileriGoster();
            System.out.println();
        }
    }
}

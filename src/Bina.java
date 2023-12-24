import java.util.ArrayList;
import java.util.List;

//Bina Sınıfı
class Bina extends Property {
    private int katSayisi;
    private List<Daire> daireler;
    private EvSahibi evSahibi;

    public Bina(String ad, int katSayisi, EvSahibi evSahibi) {
        super(ad);
        this.katSayisi = katSayisi;
        this.daireler = new ArrayList<>();
        this.evSahibi = evSahibi;
    }
    // Bina'ya Daire eklemek için metot
    public void daireEkle(Daire daire) {
        this.daireler.add(daire);
    }

    public List<Daire> getDaireler() {
        return daireler;
    }

    public int getKatSayisi() {
        return katSayisi;
    }

    @Override
    public void bilgileriGoster() { // Ev Sahibi ve Bina bilgilerini gösteren metot

        evSahibi.bilgileriGoster();
        System.out.println("Ev Sahip Olduğu Daire Numaraları:");

        for (Daire daire : getDaireler()) {
            System.out.println("Daire: " + daire.getDaireNumarasi());
            System.out.println("Boyut: " + daire.getBoyut());
        }
    }
}

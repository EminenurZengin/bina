// Daire Sınıfı
class Daire extends Property implements Comparable<Daire> {
    private String daireNumarasi;
    private int boyut;

    public Daire(String daireNumarasi, int boyut, String binaAdi) {
        super(binaAdi);
        this.daireNumarasi = daireNumarasi;
        this.boyut = boyut;
    }

    public String getDaireNumarasi() {
        return daireNumarasi;
    }

    public int getBoyut() {
        return boyut;
    }

    @Override
    public void bilgileriGoster() {
        System.out.println("Daire Numarası: " + getDaireNumarasi());
        System.out.println("Boyut: " + getBoyut());
        System.out.println("Bina: " + getAd());
    }

    @Override  // Daireleri karşılaştırmak için compareTo metodu
    public int compareTo(Daire daire) {
        return Integer.compare(Integer.parseInt(this.daireNumarasi), Integer.parseInt(daire.daireNumarasi));
    }
}

// Kiraci Sınıfı
class Kiraci {
    private String ad;
    private String adres;
    private Bina bina;

    public Kiraci(String ad, String adres, Bina bina) {
        this.ad = ad;
        this.adres = adres;
        this.bina = bina;
    }
    // Kiracı bilgilerini gösteren metot
    public void bilgileriGoster() {
        System.out.println("Kiracı Bilgi:");
        System.out.println("Ad Soyad: " + ad);
        System.out.println("Adres: " + adres);
        System.out.println();
        bina.bilgileriGoster();
    }

    public String getAd() {
        return ad;
    }
}

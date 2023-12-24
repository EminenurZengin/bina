// EvSahibi sınıfı
class EvSahibi {
    private String adSoyad;
    private String adres;

    public EvSahibi(String adSoyad, String adres) {
        this.adSoyad = adSoyad;
        this.adres = adres;
    }

    // Ev Sahibi bilgilerini gösteren metot
    public void bilgileriGoster() {
        System.out.println("Ev Sahibi Bilgi:");
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Adres: " + adres);
    }
}

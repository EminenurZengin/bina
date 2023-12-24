// Soyut sınıf Property
abstract class Property {
    protected String ad;

    public Property(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public abstract void bilgileriGoster();
}

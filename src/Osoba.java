public class Osoba {

    private String jmeno;
    private String prijmeni;
    private boolean zly;

    public Osoba(String jmeno, String prijmeni, boolean zly) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.zly = zly;
    }

    public Osoba(String jmeno, String prijmeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.zly = true;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                '}';
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public boolean isZly() {
        return zly;
    }
}

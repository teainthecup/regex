import java.util.Iterator;

public class CertuvIterator<Osoba> implements Iterator<Osoba> {

    private CertuvSeznam seznam;
    private int aktualniIndex;
    public CertuvIterator(CertuvSeznam seznam) {
        this.seznam = seznam;
        aktualniIndex = seznam.pocetOsob() -1;
    }

    @Override
    public boolean hasNext() {
        return aktualniIndex > -1;
    }

    @Override
    public Osoba next() {
        aktualniIndex--;
        return (Osoba) seznam.get(aktualniIndex+1);
    }
}

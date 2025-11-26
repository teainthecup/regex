import java.util.ArrayList;
import java.util.Iterator;

public class CertuvSeznam implements Iterable<Osoba>{

    private ArrayList<Osoba> seznam = new ArrayList<>();

    public boolean addOsoba(Osoba osoba){
        if(osoba.isZly()){
            return seznam.add(osoba);
        }
        return false;
    }

    public int pocetOsob(){
        return seznam.size();
    }

    public Osoba get(int index){
        return seznam.get(index);
    }

    @Override
    public Iterator<Osoba> iterator() {
        return new CertuvIterator<Osoba>(this);
    }
}

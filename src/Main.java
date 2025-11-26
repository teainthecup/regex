
public class Main {
    public static void main(String[] args) {
        CertuvSeznam seznam = new CertuvSeznam();

        seznam.addOsoba(new Osoba("Filomena", "Zelena"));
        seznam.addOsoba(new Osoba("Gertruda", "Fialova"));

       CertuvIterator<Osoba> iterator = (CertuvIterator<Osoba>) seznam.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }

    }
}
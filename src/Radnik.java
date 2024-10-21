public class Radnik {

    /*
    Napraviti klasu Radnik
    Napraviti main klasu za ispis
    Sub klase: radnik po satu, radnik po danu, radnik fiksno
    Polja: ime, prezime, jmbg, ziro racun, plata
    Napraviti metod isplatiPlatu() koji ce da ispisuje podatke radnika i obracun za svakog radnika posebno
    U main klasi kreirati i ispisati objekte za sve radnike

     */

    protected String ime;
    protected String prezime;
    protected String jmbg;
    protected String ziroRacun;
    protected double plata;

    // Konstruktor osnovne klase
    public Radnik(String ime, String prezime, String jmbg, String ziroRacun) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.ziroRacun = ziroRacun;
    }

    // Metod za isplatu plate - treba ga implementirati u podklasama

    public void isplatiPlatu() {
        System.out.println("Podaci o radniku: ");
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("JMBG: " + jmbg);
        System.out.println("Žiro račun: " + ziroRacun);
        System.out.println("Plata: " + plata);
    }
}

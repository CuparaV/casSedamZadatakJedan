public class RadnikPoDanu extends Radnik{

    private int brojDana;
    private double cenaPoDanu;

    public RadnikPoDanu(String ime, String prezime, String jmbg, String ziroRacun, int brojDana, double cenaPoDanu) {
        super(ime, prezime, jmbg, ziroRacun);
        this.brojDana = brojDana;
        this.cenaPoDanu = cenaPoDanu;
    }

    @Override
    public void isplatiPlatu() {
        plata = brojDana * cenaPoDanu;
        System.out.println("Radnik po danu: " + ime + " " + prezime);
        System.out.println("JMBG: " + jmbg);
        System.out.println("Žiro račun: " + ziroRacun);
        System.out.println("Plata: " + plata);
    }
}

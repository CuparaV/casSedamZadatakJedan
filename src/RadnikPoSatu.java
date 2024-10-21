public class RadnikPoSatu extends Radnik{


    private double satnica;
    private int brojSati;

    public RadnikPoSatu(String ime, String prezime, String jmbg, String ziroRacun, double satnica, int brojSati) {
        super(ime, prezime, jmbg, ziroRacun);
        this.satnica = satnica;
        this.brojSati = brojSati;
        this.plata = izracunajPlatu();
    }

    private double izracunajPlatu() {
        return satnica * brojSati;
    }

    @Override
    public void isplatiPlatu() {
        super.isplatiPlatu();
        System.out.println("Radnik po satu - zarada: " + plata);
    }
}


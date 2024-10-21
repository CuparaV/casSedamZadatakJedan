public class RadnikFiksno extends Radnik{

    public RadnikFiksno(String ime, String prezime, String jmbg, String ziroRacun, double plata) {
        super(ime, prezime, jmbg, ziroRacun);
        this.plata = plata;
    }

    @Override
    public void isplatiPlatu() {
        super.isplatiPlatu();
        System.out.println("Radnik sa fiksnom platom - zarada: " + plata);
    }
}

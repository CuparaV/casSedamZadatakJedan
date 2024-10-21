public class Main {


    /*
    Napraviti klasu Radnik
    Napraviti main klasu za ispis
    Sub klase: radnik po satu, radnik po danu, radnik fiksno
    Polja: ime, prezime, jmbg, ziro racun, plata
    Napraviti metod isplatiPlatu() koji ce da ispisuje podatke radnika i obracun za svakog radnika posebno
    U main klasi kreirati i ispisati objekte za sve radnike

     */
    public static void main(String[] args) {
        Radnik radnik1 = new RadnikPoSatu("Marko", "Marković", "1234567890123", "123-456789", 500, 40);
        Radnik radnik2 = new RadnikPoDanu("Jovan", "Jovanović", "9876543210987", "987-654321", 2000, 20);
        Radnik radnik3 = new RadnikFiksno("Ana", "Anić", "1357924680135", "135-792468", 80000);

        radnik1.isplatiPlatu();
//        radnik2.isplatiPlatu();
//        radnik3.isplatiPlatu();
    }
}
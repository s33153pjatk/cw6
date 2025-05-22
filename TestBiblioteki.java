public class TestBiblioteki {  public static void main(String[] args) {
    Ksiazka ks1 = new Ksiazka("Władca Pierścieni", 1954, "J.R.R. Tolkien", 1216);
    Ksiazka ks2 = new Ksiazka("Zbrodnia i kara", 1866, "Fiodor Dostojewski", 430);
    Film f1 = new Film("Incepcja", 2010, "Christopher Nolan", 148);
    Film f2 = new Film("Toy Story", 1995, "John Lasseter", 81);


    MediaBiblioteczne[] media = new MediaBiblioteczne[4];
    media[0] = ks1;
    media[1] = ks2;
    media[2] = f1;
    media[3] = f2;

    for (MediaBiblioteczne m : media) {
        m.wyswietlInformacje();
        System.out.println();
    }

    ks1.wypozycz();
    ks1.wypozycz();
    ks1.zwroc();
    System.out.println();

    ks1.sprawdzLiczbeStron();
    f1.sprawdzCzasTrwania();
    System.out.println();

    for (MediaBiblioteczne m : media) {
        if (m instanceof Ksiazka) {
            Ksiazka k = (Ksiazka) m;
            k.sprawdzLiczbeStron();
        } else if (m instanceof Film) {
            Film f = (Film) m;
            f.sprawdzCzasTrwania();
        }
        System.out.println();
    }
}
}

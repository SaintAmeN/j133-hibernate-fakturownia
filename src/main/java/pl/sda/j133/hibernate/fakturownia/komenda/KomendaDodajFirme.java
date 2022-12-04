package pl.sda.j133.hibernate.fakturownia.komenda;

import pl.sda.j133.hibernate.fakturownia.database.DataAccessObject;
import pl.sda.j133.hibernate.fakturownia.model.Firma;

/**
 * @author Paweł Recław, AmeN
 * @project j133-hibernate-fakturownia
 * @created 04.12.2022
 */
public class KomendaDodajFirme implements Komenda {
    private DataAccessObject<Firma> dao = new DataAccessObject<>();

    @Override
    public String getKomenda() {
        return "dodaj firma";
    }

    @Override
    public void obsluga() {
        System.out.println("Podaj nazwę firmy:");
        String nazwa = Komenda.SCANNER.nextLine();

        System.out.println("Podaj nip firmy:");
        String nip = Komenda.SCANNER.nextLine();

        System.out.println("Podaj adres firmy:");
        String adres = Komenda.SCANNER.nextLine();

        Firma firma = Firma.builder()
                .adres(adres)
                .nazwa(nazwa)
                .nip(nip)
                .build();

        dao.insert(firma);
    }
}

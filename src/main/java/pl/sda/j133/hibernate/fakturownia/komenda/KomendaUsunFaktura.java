package pl.sda.j133.hibernate.fakturownia.komenda;

import pl.sda.j133.hibernate.fakturownia.database.DataAccessObject;
import pl.sda.j133.hibernate.fakturownia.model.Faktura;
import pl.sda.j133.hibernate.fakturownia.model.Firma;

/**
 * @author Paweł Recław, AmeN
 * @project j133-hibernate-fakturownia
 * @created 04.12.2022
 */
public class KomendaUsunFaktura implements Komenda {
    private DataAccessObject<Faktura> dao = new DataAccessObject<>();

    @Override
    public String getKomenda() {
        return "usun faktura";
    }

    @Override
    public void obsluga() {
        System.out.println("Podaj id firmy:");
        String idString = Komenda.SCANNER.nextLine();
        Long id = Long.parseLong(idString);

        dao.delete(Faktura.class, id);
    }
}

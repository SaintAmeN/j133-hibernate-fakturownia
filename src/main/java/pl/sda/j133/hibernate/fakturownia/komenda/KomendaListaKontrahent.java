package pl.sda.j133.hibernate.fakturownia.komenda;

import pl.sda.j133.hibernate.fakturownia.database.DataAccessObject;
import pl.sda.j133.hibernate.fakturownia.model.Firma;
import pl.sda.j133.hibernate.fakturownia.model.Kontrahent;

/**
 * @author Paweł Recław, AmeN
 * @project j133-hibernate-fakturownia
 * @created 04.12.2022
 */
public class KomendaListaKontrahent implements Komenda {
    private DataAccessObject<Kontrahent> dao = new DataAccessObject<>();

    @Override
    public String getKomenda() {
        return "lista kontrahent";
    }

    @Override
    public void obsluga() {
        dao.findAll(Kontrahent.class).forEach(System.out::println);
    }
}

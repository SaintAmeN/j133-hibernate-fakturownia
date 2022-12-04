package pl.sda.j133.hibernate.fakturownia;

import pl.sda.j133.hibernate.fakturownia.database.DataAccessObject;
import pl.sda.j133.hibernate.fakturownia.model.Firma;

/**
 * @author Paweł Recław, AmeN
 * @project j133-hibernate-fakturownia
 * @created 04.12.2022
 */
public class Main {
    public static void main(String[] args) {
        // SELECT * FROM firma;
        new DataAccessObject<Firma>().findAll(Firma.class);
    }
}

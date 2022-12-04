package pl.sda.j133.hibernate.fakturownia.komenda;

import java.util.Scanner;

/**
 * @author Paweł Recław, AmeN
 * @project j133-hibernate-fakturownia
 * @created 04.12.2022
 */
public interface Komenda {
    Scanner SCANNER = new Scanner(System.in);

    String getKomenda();
    void obsluga();
}

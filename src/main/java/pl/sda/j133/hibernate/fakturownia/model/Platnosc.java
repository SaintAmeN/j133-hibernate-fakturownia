package pl.sda.j133.hibernate.fakturownia.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

/**
 * @author Paweł Recław, AmeN
 * @project j133-hibernate-fakturownia
 * @created 04.12.2022
 */
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Platnosc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double kwota;

    @Enumerated(EnumType.STRING)
    private FormaPlatnosci formaPlatnosci;

    @CreationTimestamp
    private LocalDate dataRealizacji;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    private Faktura faktura;
}

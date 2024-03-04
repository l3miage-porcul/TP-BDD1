package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="bike")
public class BikeEntity {

    @Id
    @Column(name = "immat",length = 8)
    private String immatriculation;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "cylinderNumber")
    @Enumerated(EnumType.STRING)
    private CylinderNumber cylinderNumber;

    @Column(name = "automatic")
    private boolean automatic;

    @Column(name = "shifter")
    private boolean shifter;

    @Column(name = "shifterType")
    @Enumerated(EnumType.ORDINAL)
    private ShifterType shifterType;

    @Column(name= "circulation_date")
    private LocalDate circulationDate;
}

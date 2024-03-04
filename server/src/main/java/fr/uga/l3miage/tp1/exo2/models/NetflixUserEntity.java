package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class NetflixUserEntity {

    @Id
    private Long id;

    private String uuid;
    private String lastname;
    private String firstname;

    @Enumerated
    private Sex sex;
    private LocalDate birthDate;

    @OneToOne(mappedBy = "netflixUser")
    private NetflixAccountEntity netflixAccount;
}

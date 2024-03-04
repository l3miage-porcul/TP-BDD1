package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.*;

@Entity
public class NetflixAccountEntity {

    @Id
    private Long id;

    private int nb_devices;

    private TypeAccount typeAccount;

    private String uuid_user;

    @OneToOne
    private NetflixUserEntity netflixUser;
}

package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import java.util.Set;


@Entity
@Table(name="brand_miage")
public class BrandEntity {

    private String company_name;

    @Id
    @Column(name = "siretNumber",length = 11)
    private String siretNumber;

    private BrandType type;

    @OneToMany(mappedBy = "brand")
    private Set<ProductEntity> products;
}

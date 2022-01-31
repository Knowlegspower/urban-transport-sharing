package kz.nu.cs.urbantransportsharing.domain;

import kz.nu.cs.urbantransportsharing.domain.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "scooter")
@Data
public class Scooter extends BaseEntity<Long> {
    @OneToOne(mappedBy = "scooter",cascade = CascadeType.ALL)
    private Transport transport;

    @Column
    private String currentCharge;
}

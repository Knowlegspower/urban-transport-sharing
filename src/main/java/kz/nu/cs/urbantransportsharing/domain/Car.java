package kz.nu.cs.urbantransportsharing.domain;

import kz.nu.cs.urbantransportsharing.domain.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "car")
@Data
public class Car extends BaseEntity<Long> {
    @OneToOne(mappedBy = "car",cascade = CascadeType.ALL)
    private Transport transport;

    @Column
    private String autoFuelType;

    @Column
    private String transmission;

    @Column
    private String volumeCar;

    @Column
    private String bodyType;

    @Column
    private String vinCode;

    @Column
    private String positionRudder;

    @Column
    private String currentAutoFuel;

}

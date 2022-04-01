package kz.nu.cs.urbantransportsharing.domain;

import kz.nu.cs.urbantransportsharing.domain.base.BaseEntity;
import kz.nu.cs.urbantransportsharing.util.StringListConverter;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "transport")
@Data
public class Transport extends BaseEntity<Long> {

    @Column
    private Integer type;

    @Column
    private String model;

    @Column
    private String brand;

    @Column(name = "is_removed", nullable = false, columnDefinition = "boolean default false")
    private Boolean isRemoved = false;

    @Column(name = "is_reserved", nullable = false, columnDefinition = "boolean default false")
    private Boolean isReserved = false;

    @Column
    private Integer productYear;

    @Column
    private String color;

    @Column
    private String needRepair;

    @Column(columnDefinition="TEXT")
    @Convert(converter = StringListConverter.class)
    private List<String> images;

    @Column
    private String latitude;

    @Column
    private String longitude;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car car;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "scooter_id", referencedColumnName = "id")
    private Scooter scooter;
}

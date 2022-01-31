package kz.nu.cs.urbantransportsharing.web.dto;

import io.swagger.annotations.ApiModel;
import kz.nu.cs.urbantransportsharing.domain.Transport;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "TransportDto", description = "Model for transport entity")
public class TransportDto {
    private Long id;

    private Boolean isCar;

    private String model;

    private String brand;

    private Integer productYear;

    private String color;

    private String needRepair;

    private List<String> images;

    private String coordinate;

    private CarDto carDto;

    private ScooterDto scooterDto;

    public TransportDto(Transport transport) {
        this.id = transport.getId();
        this.isCar = transport.getIsCar();
        this.model = transport.getModel();
        this.brand = transport.getBrand();
        this.productYear = transport.getProductYear();
        this.color = transport.getColor();
        this.needRepair = transport.getNeedRepair();
        this.images = transport.getImages();
        this.coordinate = transport.getCoordinate();
        if (transport.getIsCar()) {
            this.carDto = new CarDto(transport.getCar());
        } else {
            this.scooterDto = new ScooterDto(transport.getScooter());
        }
    }
}

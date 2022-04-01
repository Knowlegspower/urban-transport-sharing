package kz.nu.cs.urbantransportsharing.web.dto;

import io.swagger.annotations.ApiModel;
import kz.nu.cs.urbantransportsharing.domain.Transport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static java.util.Objects.isNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "TransportDto", description = "Model for transport entity")
public class TransportDto {
    private Long id;

    private Integer type;

    private String model;

    private String brand;

    private Integer productYear;

    private String color;

    private String needRepair;

    private List<String> images;

    private String latitude;

    private String longitude;

    private CarDto carDto;

    private ScooterDto scooterDto;

    public TransportDto(Transport transport) {
        this.id = transport.getId();
        this.type = transport.getType();
        this.model = transport.getModel();
        this.brand = transport.getBrand();
        this.productYear = transport.getProductYear();
        this.color = transport.getColor();
        this.needRepair = transport.getNeedRepair();
        this.images = transport.getImages();
        this.longitude = transport.getLongitude();
        this.latitude = transport.getLatitude();
        if (!isNull(transport.getType()) ){
            switch (transport.getType()) {
                case 1:
                    this.scooterDto = new ScooterDto(transport.getScooter());
                    break;
                case 2:
                    this.carDto = new CarDto(transport.getCar());
                    break;
                case 3:
                    break;
            }
        }
    }
}

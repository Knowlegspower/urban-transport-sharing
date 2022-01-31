package kz.nu.cs.urbantransportsharing.web.dto;

import io.swagger.annotations.ApiModel;
import kz.nu.cs.urbantransportsharing.domain.Car;
import lombok.Data;

@Data
@ApiModel(value = "CarDto", description = "Model for Car entity")
public class CarDto {
    private Long id;

    private String autoFuelType;

    private String transmission;

    private String volumeCar;

    private String bodyType;

    private String vinCode;

    private String positionRudder;

    private String currentAutoFuel;

    public CarDto (Car car) {
        this.id = car.getId();
        this.autoFuelType = car.getAutoFuelType();
        this.transmission = car.getTransmission();
        this.volumeCar = car.getVolumeCar();
        this.bodyType = car.getBodyType();
        this.vinCode = car.getVinCode();
        this.positionRudder = car.getPositionRudder();
        this.currentAutoFuel = car.getCurrentAutoFuel();
    }
}

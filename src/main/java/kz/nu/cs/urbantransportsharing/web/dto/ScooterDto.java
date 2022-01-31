package kz.nu.cs.urbantransportsharing.web.dto;

import io.swagger.annotations.ApiModel;
import kz.nu.cs.urbantransportsharing.domain.Scooter;
import lombok.Data;

@Data
@ApiModel(value = "ScooterDto", description = "Model for Scooter entity")
public class ScooterDto {
    private Long id;
    private String currentCharge;

    public ScooterDto(Scooter scooter) {
        this.id = scooter.getId();
        this.currentCharge = scooter.getCurrentCharge();
    }
}

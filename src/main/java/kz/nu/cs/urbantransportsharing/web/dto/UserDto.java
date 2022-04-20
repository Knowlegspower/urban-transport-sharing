package kz.nu.cs.urbantransportsharing.web.dto;

import io.swagger.annotations.ApiModel;
import kz.nu.cs.urbantransportsharing.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "UserDto", description = "Model for user entity")
public class UserDto {

    private Long id;

    private Integer balance;

    private String username;

    private String email;

    public UserDto(User user) {
        this.id = user.getId();
        this.balance = user.getBalance();
        this.username = user.getUsername();
        this.email = user.getEmail();
    }
}

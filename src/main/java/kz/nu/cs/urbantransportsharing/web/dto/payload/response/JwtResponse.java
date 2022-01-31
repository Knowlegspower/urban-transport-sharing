package kz.nu.cs.urbantransportsharing.web.dto.payload.response;

import lombok.Data;

import java.util.List;

@Data
public class JwtResponse {
    private Integer statusCode;
    private String token;
    private String type = "Bearer";
    private String refreshToken;
    private Long id;
    private String username;
    private String email;
    private List<String> roles;

    public JwtResponse(String accessToken, String refreshToken, Long id, String username, String email, List<String> roles) {
        this.statusCode = 200;
        this.token = accessToken;
        this.refreshToken = refreshToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }

}

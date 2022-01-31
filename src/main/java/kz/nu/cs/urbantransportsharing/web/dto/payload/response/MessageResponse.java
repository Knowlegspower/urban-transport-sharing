package kz.nu.cs.urbantransportsharing.web.dto.payload.response;

import lombok.Data;

@Data
public class MessageResponse {
    private Integer statusCode;
    private String message;

    public MessageResponse(Integer statusCode,String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

}

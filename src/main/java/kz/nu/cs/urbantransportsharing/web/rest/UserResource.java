package kz.nu.cs.urbantransportsharing.web.rest;

import io.swagger.annotations.ApiOperation;
import kz.nu.cs.urbantransportsharing.service.UserService;
import kz.nu.cs.urbantransportsharing.web.dto.TransportDto;
import kz.nu.cs.urbantransportsharing.web.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserResource {

    private final UserService userService;

    @GetMapping("/{id}")
    @ApiOperation(value = "Get user by id")
    public ResponseEntity<UserDto> getUser(@PathVariable("id")  Long id) {
        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
    }

    @PutMapping("/updateBalance/{id}/{balance}")
    @ApiOperation(value = "Update the balance")
    public ResponseEntity<String> reserveTransport(@PathVariable("id")  Long id,
                                                   @PathVariable("balance")  Integer balance) {
        return new ResponseEntity<>(userService.updateBalance(id,balance), HttpStatus.OK);
    }
}

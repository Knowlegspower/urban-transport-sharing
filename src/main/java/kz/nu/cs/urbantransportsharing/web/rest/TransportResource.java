package kz.nu.cs.urbantransportsharing.web.rest;

import io.swagger.annotations.ApiOperation;
import kz.nu.cs.urbantransportsharing.service.TransportService;
import kz.nu.cs.urbantransportsharing.web.dto.TransportDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transport")
@RequiredArgsConstructor
public class TransportResource {
    private final TransportService transportService;

    @GetMapping
    @ApiOperation(value = "Get all transports")
    public ResponseEntity<List<TransportDto>> getAllTransports() {
        return new ResponseEntity<>(transportService.getAll(), HttpStatus.OK);
    }
}

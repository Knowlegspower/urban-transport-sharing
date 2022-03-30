package kz.nu.cs.urbantransportsharing.service;

import kz.nu.cs.urbantransportsharing.web.dto.TransportDto;

import java.util.List;

public interface TransportService {
    List<TransportDto> getAll();

    String moveTransport(TransportDto dto);

    String deleteTransport(Long id);
}

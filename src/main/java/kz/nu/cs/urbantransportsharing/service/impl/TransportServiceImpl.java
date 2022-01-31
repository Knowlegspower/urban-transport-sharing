package kz.nu.cs.urbantransportsharing.service.impl;

import kz.nu.cs.urbantransportsharing.repository.TransportRepository;
import kz.nu.cs.urbantransportsharing.service.TransportService;
import kz.nu.cs.urbantransportsharing.web.dto.TransportDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TransportServiceImpl implements TransportService{
    private final TransportRepository transportRepository;

    @Override
    public List<TransportDto> getAll() {
        return transportRepository.findAll().stream()
                .map(TransportDto::new).collect(Collectors.toList());
    }

}

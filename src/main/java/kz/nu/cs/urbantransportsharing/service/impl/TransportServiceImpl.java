package kz.nu.cs.urbantransportsharing.service.impl;

import kz.nu.cs.urbantransportsharing.domain.Transport;
import kz.nu.cs.urbantransportsharing.repository.TransportRepository;
import kz.nu.cs.urbantransportsharing.service.TransportService;
import kz.nu.cs.urbantransportsharing.web.dto.TransportDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TransportServiceImpl implements TransportService{
    private final TransportRepository transportRepository;

    @Override
    public List<TransportDto> getAll() {
        return transportRepository.findAll().stream().filter(transport -> transport.getIsRemoved().equals(Boolean.FALSE))
                .map(TransportDto::new).collect(Collectors.toList());
    }

    @Override
    public String moveTransport(TransportDto dto) {
        Optional<Transport> optionalTransport = transportRepository.findById(dto.getId());
        if (!optionalTransport.isPresent()) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "entity not found"
            );
        }
        optionalTransport.get().setCoordinate(dto.getCoordinate());
        transportRepository.save(optionalTransport.get());
        return dto.getCoordinate();
    }

    @Override
    public String deleteTransport(Long id) {
        Optional<Transport> optionalTransport = transportRepository.findById(id);
        if (!optionalTransport.isPresent()) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "entity not found"
            );
        }
        optionalTransport.get().setIsRemoved(Boolean.TRUE);
        transportRepository.save(optionalTransport.get());
        return "true";
    }

}

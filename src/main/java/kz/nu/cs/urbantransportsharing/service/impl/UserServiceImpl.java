package kz.nu.cs.urbantransportsharing.service.impl;

import kz.nu.cs.urbantransportsharing.domain.User;
import kz.nu.cs.urbantransportsharing.repository.UserRepository;
import kz.nu.cs.urbantransportsharing.service.UserService;
import kz.nu.cs.urbantransportsharing.web.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDto getUser(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            return new UserDto(optionalUser.get());
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "entity not found"
            );
        }
    }

    @Override
    public String updateBalance(Long id, Integer balance) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            optionalUser.get().setBalance(balance);
            userRepository.save(optionalUser.get());
            return "OK";
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "entity not found"
            );
        }
    }
}

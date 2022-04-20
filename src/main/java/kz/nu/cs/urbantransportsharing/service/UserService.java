package kz.nu.cs.urbantransportsharing.service;

import kz.nu.cs.urbantransportsharing.web.dto.UserDto;

public interface UserService {

    UserDto getUser(Long id);

    String updateBalance(Long id, Integer balance);
}

package com.raxrot.sbblogwebapp.service;

import com.raxrot.sbblogwebapp.dto.RegistrationDto;
import com.raxrot.sbblogwebapp.entity.User;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

   User findByEmail(String email);
}

package com.raxrot.sbblogwebapp.service.implementation;

import com.raxrot.sbblogwebapp.dto.RegistrationDto;
import com.raxrot.sbblogwebapp.entity.Role;
import com.raxrot.sbblogwebapp.entity.User;
import com.raxrot.sbblogwebapp.repository.RoleRepository;
import com.raxrot.sbblogwebapp.repository.UserRepository;
import com.raxrot.sbblogwebapp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class UserServiceImplementation  implements UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;

    public UserServiceImplementation(UserRepository userRepository,
                           RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void saveUser(RegistrationDto registrationDto) {
        User user = new User();
        user.setName(registrationDto.getFirstName() + " " + registrationDto.getLastName());
        user.setEmail(registrationDto.getEmail());
        user.setPassword(registrationDto.getPassword());
        Role role = roleRepository.findByName("ROLE_GUEST");
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}

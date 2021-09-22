package sv.iuh.spring_boot_jwt_ltk.service;

import sv.iuh.spring_boot_jwt_ltk.entity.User;

import java.nio.file.attribute.UserPrincipal;

public interface UserService {
    User createUser(User user);
}

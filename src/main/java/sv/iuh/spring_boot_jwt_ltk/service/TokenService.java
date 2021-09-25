package sv.iuh.spring_boot_jwt_ltk.service;


import sv.iuh.spring_boot_jwt_ltk.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}

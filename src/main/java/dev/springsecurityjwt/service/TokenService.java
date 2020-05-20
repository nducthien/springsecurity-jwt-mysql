package dev.springsecurityjwt.service;

import dev.springsecurityjwt.entity.Token;

public interface TokenService {

    Token createToken(Token token);

    Token findByToken(String token);
}

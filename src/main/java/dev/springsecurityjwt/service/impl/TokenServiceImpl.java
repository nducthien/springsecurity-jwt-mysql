package dev.springsecurityjwt.service.impl;

import dev.springsecurityjwt.entity.Token;
import dev.springsecurityjwt.repository.TokenRepository;
import dev.springsecurityjwt.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}

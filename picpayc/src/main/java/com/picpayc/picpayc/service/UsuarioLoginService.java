package com.picpayc.picpayc.service;

import com.picpayc.picpayc.model.UsuarioLogin;
import com.picpayc.picpayc.repository.UsuarioLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioLoginService {

    @Autowired
    UsuarioLoginRepository usuarioLoginRepository;

    public void cadastraUsuarioLogin(String login, String senha){
        UsuarioLogin usuarioLogin = new UsuarioLogin();
        usuarioLogin.setLogin(login);
        usuarioLogin.setSenha(new BCryptPasswordEncoder().encode(senha));
        usuarioLoginRepository.save(usuarioLogin);
    }
}

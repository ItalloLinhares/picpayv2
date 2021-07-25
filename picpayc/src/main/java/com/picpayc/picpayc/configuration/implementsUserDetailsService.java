package com.picpayc.picpayc.configuration;

import com.picpayc.picpayc.model.UsuarioLogin;
import com.picpayc.picpayc.repository.UsuarioLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public class implementsUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioLoginRepository usuarioLoginRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        UsuarioLogin usuarioLogin = usuarioLoginRepository.findByLogin(login);

        if(usuarioLogin == null){
            throw new UsernameNotFoundException("Usuario não encontrado");
        }
        return usuarioLogin;
    }
}

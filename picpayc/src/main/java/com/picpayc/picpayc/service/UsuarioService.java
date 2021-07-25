package com.picpayc.picpayc.service;


import com.picpayc.picpayc.model.TipoUsuario;
import com.picpayc.picpayc.model.Usuario;
import com.picpayc.picpayc.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public void cadastrarUsuario(String nomeUsuario, String tipoUsuario){

        // Setando dados do usuário
        Usuario usuario = new Usuario();
        usuario.setNomeUsuario(nomeUsuario);
        if(tipoUsuario == "0") {usuario.setTipoConta(TipoUsuario.LOJISTA);}
        else{usuario.setTipoConta(TipoUsuario.CLIENTE);}
        usuario.setSaldo((float)0);

        //Persistindo no Banco de Dados
        usuarioRepository.save(usuario);
    }
}

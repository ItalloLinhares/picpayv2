package com.picpayc.picpayc.controller;

import com.picpayc.picpayc.repository.UsuarioLoginRepository;
import com.picpayc.picpayc.repository.UsuarioRepository;
import com.picpayc.picpayc.service.UsuarioLoginService;
import com.picpayc.picpayc.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    UsuarioLoginService usuarioLoginService;

    @Autowired
    UsuarioRepository usuarioRepository;

    @RequestMapping("/")
    public String index(){ return "index"; }

    @RequestMapping("/formUsuario")
    public String formUsuario(){ return "formUsuario"; }

    @RequestMapping("/formUsuarioLoginn")
    public String formUsuarioLogin(){ return "formUsuarioLoginn"; }

    @RequestMapping("/login")
    public String login(){ return "loginPage"; }

    @PostMapping("/cadastrarUsuario")
    public String cadastrarUsuario(String nomeUsuario, String tipoUsuario){
        usuarioService.cadastrarUsuario(nomeUsuario, tipoUsuario);
        return "/areaUsuario";
    }

    @RequestMapping("/cadastrarUsuarioLogin")
    public String cadastrarUsuarioLogin(String login, String senha){
        usuarioLoginService.cadastraUsuarioLogin(login, senha);
        return "/areaUsuario";
    }

    @RequestMapping("/entrarUsuario")
    public String entrarUsuario(){ return "areaUsuario"; }


    @RequestMapping("/formCadastroUsuario")
    public String formCadastroUsuario(){ return "formCadastroUsuario"; }

    @RequestMapping("/adicionaSaldo")
    public String adicionaSaldo(){
        usuarioRepository.atualizasaldo((float) 100, Long.valueOf(1));
        return "index"; }
}


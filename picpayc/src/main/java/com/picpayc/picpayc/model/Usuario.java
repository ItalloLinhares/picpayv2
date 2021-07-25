package com.picpayc.picpayc.model;

import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COD_USUARIO")
    public Long idUsuario;

    @Column(name = "NM_USUARIO")
    public String nomeUsuario;

    @Column(name = "VL_SALDO")
    public Float saldo;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_USUARIO")
    public TipoUsuario tipoConta;


    public String getNomeUsuario() { return nomeUsuario; }

    public void setNomeUsuario(String nomeUsuario) { this.nomeUsuario = nomeUsuario; }

    public Float getSaldo() { return saldo; }

    public void setSaldo(Float saldo) { this.saldo = saldo; }

    public TipoUsuario getTipoConta() { return tipoConta; }

    public void setTipoConta(TipoUsuario tipo) { this.tipoConta = tipo; }


}

package com.picpayc.picpayc.repository;

import com.picpayc.picpayc.model.UsuarioLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UsuarioLoginRepository extends JpaRepository<UsuarioLogin, String> {

    UsuarioLogin findByLogin(String login);
}

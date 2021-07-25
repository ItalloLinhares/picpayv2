package com.picpayc.picpayc.repository;

import com.picpayc.picpayc.model.Usuario;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transaction;
import javax.transaction.Transactional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Transactional
    @Modifying
    @Query("UPDATE Usuario u SET u.saldo = :novosaldo where u.id = :id")
    void atualizasaldo(@Param("novosaldo") float novosaldo, @Param("id") Long id);



}


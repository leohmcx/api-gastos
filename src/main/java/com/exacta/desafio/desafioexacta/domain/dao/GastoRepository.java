package com.exacta.desafio.desafioexacta.domain.dao;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.exacta.desafio.desafioexacta.domain.entity.Gasto;

@RestResource(exported = false)
public interface GastoRepository extends JpaRepository<Gasto, Long> {
	Gasto findById(@PathParam("id") long id);
}

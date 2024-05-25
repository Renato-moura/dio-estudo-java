package com.desafio.desafiogof.service;

import com.desafio.desafiogof.model.Cliente;

public interface ClienteService {

    public Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);
}

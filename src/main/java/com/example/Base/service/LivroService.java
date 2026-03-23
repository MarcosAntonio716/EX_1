package com.example.Base.service;

import com.example.Base.entity.Livro;
import com.example.Base.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository repository;

    // Criar livro
    public Livro salvar(Livro livro) {
        return repository.save(livro);
    }

    // Listar todos
    public List<Livro> listarTodos() {
        return repository.findAll();
    }

    // Buscar por ID
    public Optional<Livro> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Deletar por ID
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
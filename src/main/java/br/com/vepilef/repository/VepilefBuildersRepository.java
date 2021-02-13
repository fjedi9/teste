package br.com.vepilef.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vepilef.model.Cliente;

@Repository
public interface VepilefBuildersRepository extends JpaRepository<Cliente, Long>{
    public List<Cliente> findByNomeIgnoreCaseContaining(String nome);
    public Cliente findByCpf(String cpf);
}

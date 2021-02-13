package br.com.vepilef.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.vepilef.model.Cliente;
import br.com.vepilef.repository.VepilefBuildersRepository;
@Service
public class PlatformBuildersService {
	private final VepilefBuildersRepository _repository;

	@Autowired
	public PlatformBuildersService(VepilefBuildersRepository _repository) {
		this._repository = _repository;
	}

	public Page<Cliente> findAll(Pageable paginacao) {
		Page<Cliente> page = _repository.findAll(paginacao);
		return page;
	}

	public Optional<Cliente> findById(Long id) {
		Optional<Cliente>optionalCliente = _repository.findById(id) ;
		return optionalCliente;
	}

	public Cliente save( Cliente cliente) {
		return _repository.save(cliente);
	}

	public Cliente getOne(Long id) {
	    Cliente cliente = _repository.getOne(id);
	    return cliente;
	}

	public List<Cliente> findByNomeIgnoreCaseContaining(String nome) {
		List<Cliente> clientes = _repository.findByNomeIgnoreCaseContaining(nome);
		return clientes;
	}

	public Cliente findByCpf(String cpf) {
		Cliente cliente = _repository.findByCpf(cpf);
		return cliente;
	}

	public void deleteById(Long id) {
		_repository.deleteById(id);		
	}

}

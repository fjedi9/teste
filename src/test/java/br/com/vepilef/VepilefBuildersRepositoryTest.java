package br.com.vepilef;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.vepilef.model.Cliente;
import br.com.vepilef.repository.VepilefBuildersRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class VepilefBuildersRepositoryTest {
	@Autowired
	private VepilefBuildersRepository repository;
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	private Cliente cliente;

	//@Before
	//public void CreateBefore() {
	//	this.cliente = new Cliente("Jose Maria test", "12345678901", LocalDate.now(), 0);
	//}

	@Test
	public void createShouldPersistData() {
		this.repository.save(cliente);
		assertThat(this.cliente.getId()).isNotNull();
		assertThat(this.cliente.getCpf()).isEqualTo("12345678901");
		assertThat(this.cliente.getNome()).isEqualTo("Jose Maria test");
		assertThat(this.cliente.getDataNascimento()).isEqualTo(LocalDate.now());
	}

	@Test
	public void deleteShouldRemoveData() {
		this.repository.save(cliente);
		repository.delete(cliente);
		assertThat(this.repository.findByCpf(this.cliente.getCpf())).isNull();
	}

	@Test
	public void updateShouldData() {
		this.repository.save(cliente);
		this.cliente.setNome("Maria Test");
		this.cliente.setCpf("12345678900");
		this.repository.save(cliente);
		Cliente clienteNovo = this.repository.getOne(this.cliente.getId());

		assertThat(clienteNovo.getNome()).isEqualTo("Maria Test");
		assertThat(clienteNovo.getCpf()).isEqualTo("12345678900");

	}

	@Test
	public void findByNomeIgnoreCaseContainingShouldData() {
		this.repository.save(cliente);
		List<Cliente> clienteNovo = this.repository.findByNomeIgnoreCaseContaining("Jose Maria test");
		assertThat(clienteNovo.get(0).getNome()).isEqualTo("Jose Maria test");
	}

	@Test
	public void findByCpfShouldData() {
		this.repository.save(cliente);
		Cliente clienteNovo = this.repository.findByCpf("12345678901");
		assertThat(clienteNovo.getCpf()).isEqualTo("12345678901");
		assertThat(clienteNovo.getNome()).isEqualTo("Jose Maria test");
		assertThat(clienteNovo.getDataNascimento()).isEqualTo(LocalDate.now());
	}

}

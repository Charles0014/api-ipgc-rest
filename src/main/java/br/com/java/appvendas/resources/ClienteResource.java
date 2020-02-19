package br.com.java.appvendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.java.appvendas.models.Cliente;
import br.com.java.appvendas.repository.ClienteRepository;

@RestController
@RequestMapping(value = "/appvendas")
public class ClienteResource {
	@Autowired
	ClienteRepository clienteRepository;
	
	//Cadastro novo cliente
	@PostMapping("/novo-cliente")
	public Cliente novoProduto(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	//Lista todos os cliente
	@GetMapping("/lista-clientes")
	public List<Cliente> listaProduto() {
		return clienteRepository.findAll();
	}

	//Revome cliente
	@DeleteMapping("/remove-cliente")
	public String removeProduto(@RequestBody Cliente cliente) {
		clienteRepository.delete(cliente);
			return "Cliente removido com sucesso";
		}
	
	//Atualiza cliente
	@PutMapping("/atualiza-cliente/{id}")
	public Cliente atualizaProduto(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	
}

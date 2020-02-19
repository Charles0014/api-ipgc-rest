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

import br.com.java.appvendas.models.Produto;
import br.com.java.appvendas.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "/appvendas")
public class ProdutoResource {

	@Autowired
	ProdutoRepository produtoRepository;

	//Cadastro novo produto
	@PostMapping("/novo-produto")
	public Produto novoProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	//Lista todos os produtos
	@GetMapping("/lista-produtos")
	public List<Produto> listaProduto() {
		return produtoRepository.findAll();
	}

	//Revome produto
	@DeleteMapping("/remove-produto")
	public String removeProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
			return "Produto removido com sucesso";
		}
	
	//Atualiza produto
	@PutMapping("/atualiza-produto/{id}")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
}

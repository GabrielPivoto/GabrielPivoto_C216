package br.inatel.labs.labjpa;

import br.inatel.labs.labjpa.entity.Fornecedor;
import br.inatel.labs.labjpa.entity.Produto;
import br.inatel.labs.labjpa.service.FornecedorService;
import br.inatel.labs.labjpa.service.ProdutoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DataLoader {

	@Autowired
	private ProdutoService produtoService;

	@Autowired
	private FornecedorService fornecedorService;

	@Test
	void load() {

		//1. produto
		Produto p1 = new Produto("Furadeira");
		Produto p2 = new Produto("Lixadeira");
		Produto p3 = new Produto("Plaina");
		Produto p4 = new Produto("Tupia");
		Produto p5 = new Produto("Serra Circular");

		p1 = produtoService.salvar(p1);
		p2 = produtoService.salvar(p2);
		p3 = produtoService.salvar(p3);
		p4 = produtoService.salvar(p4);
		p5 = produtoService.salvar(p5);

		List<Produto> lista = produtoService.listar();
		lista.forEach(System.out::println);

		//2. fornecedor
		Fornecedor f1 = new Fornecedor("Gasometro Madeiras");
		Fornecedor f2 = new Fornecedor("Loja do Mecanico");

		f1 = fornecedorService.salvar(f1);
		f2 = fornecedorService.salvar(f2);

		List<Fornecedor> listaDeFornecedores = fornecedorService.listar();
		listaDeFornecedores.forEach(System.out::println);
	}

}

package com.example.cadpodutos;

import com.example.cadpodutos.model.DAO.ProdutoRepository;
import com.example.cadpodutos.model.Fabricante;
import com.example.cadpodutos.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ProdutosApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProdutosApplication.class, args);
    }

    @Autowired
    ProdutoRepository prodRepo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Server Starded !");

        Scanner le = new Scanner(System.in);

        while (true) {
            int escolha = exibeMenu(le);
            if (escolha == 1) {
                cadastraProduto(le);
            }else if (escolha == 2) {
                listarProdutos(le);
            } else if (escolha == 10) {
                System.out.println("Até mais !!! ");
                break;
            }
        }
    }

    private void cadastraProduto(Scanner le) {
        System.out.println(" ");
        System.out.println("Produtos");
        System.out.println(" ");
        Produto prod = new Produto();
        System.out.println("Informe o Id do produto");
        prod.setId((le.nextInt()));
        System.out.println("Descrição do produto");
        prod.setDescricao(le.next());
        prod.setEstoque(0);
        prod.setPrecoMedio(0);
        System.out.println("Lucro deseado em %");
        prod.setLucro(le.nextDouble());

        Fabricante fab = new Fabricante();
        System.out.println("Nome do fabricante");
        fab.setNome((le.next()));
        fab.setId(prod.getId());
        fab.setTelefone(" ");
        prod.setFabricante(fab);

        prodRepo.save(prod);
    }

    private static int exibeMenu(Scanner le) {
        System.out.println("Menu");
        System.out.println(" -1 Cadastrar Produtos");
        System.out.println(" -2 Listar Produtos");
        System.out.println(" -3 Compra de Produtos");
        System.out.println(" -4 Produtos em Estoque");
        System.out.println(" -5 Venda de Produtos");
        System.out.println(" -6 Relatorios");
        System.out.println(" -10 Sair");
        System.out.println(" ");
        System.out.println("Escolha uma das opções: ");

        int escolha = le.nextInt();
        return escolha;
    }

    private void listarProdutos(Scanner le) {
        List<Produto> lista = prodRepo.findAll();
        System.out.println(" ");
        System.out.println("Listagem de Produtos");
        System.out.println(" ");
        for (Produto p: lista) {
            System.out.println("*********************");
            System.out.println("Id : "+p.getId());
            System.out.println("Descrição: "+p.getDescricao());
            System.out.println("Estoque : "+p.getEstoque());
            System.out.println("*********************");
        }

    }
}

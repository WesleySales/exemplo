package com.estudos.exemplo;

import com.estudos.exemplo.entities.Category;
import com.estudos.exemplo.entities.Item;
import com.estudos.exemplo.entities.Order;
import com.estudos.exemplo.entities.Product;
import com.estudos.exemplo.repositories.CategoryRepository;
import com.estudos.exemplo.repositories.OrderRepository;
import com.estudos.exemplo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ExemploApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExemploApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category c1 = new Category("Bolsas");
		Category c2 = new Category("Tenis");
		Category c3 = new Category("Eletronicos");
		Category c4 = new Category("Camisas");

		categoryRepository.save(c1);
		categoryRepository.save(c2);
		categoryRepository.save(c3);
		categoryRepository.save(c4);

		Product p1 = new Product("Fone Headset",c3,80,20);
		Product p2 = new Product("Camisa Nike",c4,120,45);
		Product p3 = new Product("Tenis Air Force",c2,699,39);
		Product p4 = new Product("Mochila",c1,299,200);
		Product p5 = new Product("Celular",c3,1650,60);

		productRepository.save(p4);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p1);

		c1.addProduct(p4);
		c2.addProduct(p3);
		c3.addProduct(p1);
		c3.addProduct(p5);
		c4.addProduct(p2);


		Order order1 = new Order();
		order1.getItems().add(new Item(p1,2));

		orderRepository.save(order1);

		Order order2 = new Order();
		order2.getItems().add(new Item(p3,1));
		orderRepository.save(order2);


	}
}

package com.estudos.exemplo;

import com.estudos.exemplo.entities.Category;
import com.estudos.exemplo.entities.Item;
import com.estudos.exemplo.entities.WS_Order;
import com.estudos.exemplo.entities.Product;
import com.estudos.exemplo.repositories.CategoryRepository;
import com.estudos.exemplo.repositories.ItemRepository;
import com.estudos.exemplo.repositories.OrderRepository;
import com.estudos.exemplo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication(scanBasePackages = "com.estudos.exemplo")
public class ExemploApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ItemRepository itemRepository;
	@Autowired
	private OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExemploApplication.class,args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category c1 = new Category(null,"Mochilas");
		Category c2 = new Category(null,"Tenis");
		Category c3 = new Category(null,"Camisas");

		Product p1 = new Product(null,"Camisa Preta",90,120,c3);
		Product p2 = new Product(null,"Tenis Nike",289,200,c2);
		Product p3 = new Product(null,"Mochila Adidas",300,300,c1);
		Product p4 = new Product(null,"Bolsa Transversal",70,300,c1);
		Product p5 = new Product(null,"Camisa Donald",300,300,c3);
		Product p6 = new Product(null,"Camisa Palmeiras",300,300,c3);


		c1.getProducts().addAll(Arrays.asList(p3,p4));
		c2.getProducts().addAll(Arrays.asList(p2));
		c3.getProducts().addAll(Arrays.asList(p1,p5,p6));

		categoryRepository.save(c1);
		categoryRepository.save(c2);
		categoryRepository.save(c3);

		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		productRepository.save(p5);
		productRepository.save(p6);

		WS_Order order1 = new WS_Order(null,"Wesley Sales");
		WS_Order order2 = new WS_Order(null,"Joana Silva");
		orderRepository.save(order1);
		orderRepository.save(order2);

		Item item1 = new Item(null,p1,1,order1);
		Item item2 = new Item(null,p2,1,order1);
		Item item3 = new Item(null,p5,2,order2);
		Item item4 = new Item(null,p2,3,order2);

		itemRepository.save(item1);
		itemRepository.save(item2);
		itemRepository.save(item3);
		itemRepository.save(item4);

	}
}

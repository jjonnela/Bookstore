package fi.onnela.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.onnela.Bookstore.domain.Book;
import fi.onnela.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			Book kirja1 = new Book("Testikirja1", "Testiauthor1", "ISBN-111", 2022, 29.40);
			Book kirja2 = new Book("Testikirja2", "Testiauthor2", "ISBN-222", 2023, 49.40);
			Book kirja3 = new Book("Testikirja3", "Testiauthor3", "ISBN-333", 2024, 69.40);
			
			repository.save(kirja1);
			repository.save(kirja2);
			repository.save(kirja3);
		};
	}

}

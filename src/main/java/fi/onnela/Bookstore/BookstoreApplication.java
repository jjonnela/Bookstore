package fi.onnela.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.onnela.Bookstore.domain.Book;
import fi.onnela.Bookstore.domain.BookRepository;
import fi.onnela.Bookstore.domain.Category;
import fi.onnela.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository, CategoryRepository catrepository) {
		return (args) -> {
			
			catrepository.save(new Category("Fantasy"));
			catrepository.save(new Category("Horror"));
			catrepository.save(new Category("Comic"));
			
			
			repository.save(new Book ("Testikirja1", "Testiauthor1", "ISBN-111", 2021, 19.40, catrepository.findByName("Fantasy").get(0)));
			repository.save(new Book ("Testikirja2", "Testiauthor2", "ISBN-222", 2022, 29.40, catrepository.findByName("Horror").get(0)));
			repository.save(new Book ("Testikirja3", "Testiauthor3", "ISBN-333", 2023, 39.40, catrepository.findByName("Comic").get(0)));
			
		};
	}

}

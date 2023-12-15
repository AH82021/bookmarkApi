package com.armancodeblock.bookmarkapi;

import com.armancodeblock.bookmarkapi.domain.Bookmark;
import com.armancodeblock.bookmarkapi.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication

public class BookmarkApiApplication implements CommandLineRunner {
private static final Log logger = LogFactory.getLog(BookmarkApiApplication.class);

private final BookmarkRepository bookmarkRepository;

	public BookmarkApiApplication(BookmarkRepository bookmarkRepository) {
		this.bookmarkRepository = bookmarkRepository;
	}

	public static void main(String[] args) {

		SpringApplication.run(BookmarkApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


			List<Bookmark> bookmarks = Arrays.asList(
					new Bookmark( "Google", "https://www.google.com", Instant.now()),
					new Bookmark( "GitHub", "https://www.github.com", Instant.now()),
					new Bookmark( "Stack Overflow", "https://stackoverflow.com", Instant.now()),
					new Bookmark( "Spring Framework", "https://spring.io", Instant.now()),
					new Bookmark( "Java Official Documentation", "https://docs.oracle.com/en/java/", Instant.now()),
					new Bookmark( "LinkedIn", "https://www.linkedin.com", Instant.now()),
					new Bookmark( "Twitter", "https://twitter.com", Instant.now()),
					new Bookmark( "Medium", "https://medium.com", Instant.now()),
					new Bookmark( "YouTube", "https://www.youtube.com", Instant.now()),
					new Bookmark( "Amazon", "https://www.amazon.com", Instant.now()),
					new Bookmark( "Netflix", "https://www.netflix.com", Instant.now()),
					new Bookmark( "Reddit", "https://www.reddit.com", Instant.now()),
					new Bookmark( "DZone", "https://dzone.com", Instant.now())
			);

		bookmarkRepository.saveAll(bookmarks);
		}
	}


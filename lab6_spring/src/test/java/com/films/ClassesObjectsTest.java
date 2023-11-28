package com.films;

import com.films.classes.Films;
import com.films.classes.AnimeDecorator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ClassesObjectsTest {

	@Test
	void equalsObjects() {
		AnimeDecorator uniqueANIME1 = AnimeDecorator.getInstance();
		AnimeDecorator uniqueANIME2 = AnimeDecorator.getInstance();
		assertEquals(uniqueANIME1, uniqueANIME2);

		Films films1 = new Films("name", "title", "director", "year", "descr");
		String selfWritedTitle = "title";
		String title1 = films1.getTitle();
		assertEquals(title1, selfWritedTitle);

	}

}

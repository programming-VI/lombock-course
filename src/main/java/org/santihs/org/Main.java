package org.santihs.org;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.santihs.org.models.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;

@Slf4j
public class Main {

  @SneakyThrows(value = {IOException.class, FileNotFoundException.class})
  public static void main(String[] args) {
    Person p = new Person(12L, "hello", "", "", 12, 23, LocalDate.now());
    System.out.println(p);

    log.error(p.toString());

    Person person = Person.builder()
            .id(12L)
            .age(13)
            .email("santihs@test.com")
            .build();
    System.out.println(person);

    @Cleanup
    InputStream inputStream = new FileInputStream("file.txt");
  }
}
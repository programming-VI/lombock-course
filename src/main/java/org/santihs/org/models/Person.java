package org.santihs.org.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

//@Setter(value = AccessLevel.PACKAGE)
//@Getter(value = AccessLevel.PUBLIC) // ? By default all the methods are public
//@NoArgsConstructor
//@ToString()
//@EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //? Modify the attributes on the class
@Builder
public class Person {
  //  @Setter
  Long id;
  public String name; // ! if it has a kind, lombock ignores it
  String lastName;
  String email;
  Integer age;
  Integer phone;
  LocalDate dateOfBirth;
}

package org.santihs.org.models;

import lombok.Cleanup;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.time.LocalDate;

@Value
@RequiredArgsConstructor
public class PersonDTO {
  //  @Setter
  Long id;
  @NonNull
  public String name;
  String lastName;
  String email;
  Integer age;
  Integer phone;
  LocalDate dateOfBirth;
}

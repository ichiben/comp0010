/**
 * 
 */
package uk.ac.ucl.comp0010.model;

import java.util.List;

/**
 * 
 */
public class Student {
  private Long id;
  private String firstName;
  private String lastName;
  private String username;
  private String email;
  private List<Grade> grades;

  /**
   * @return the grades
   */
  public List<Grade> getGrades() {
    return grades;
  }

  /**
   * @param grades the grades to set
   */
  public void setGrades(List<Grade> grades) {
    this.grades = grades;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Float computeAverage() {
    return null;
  }

  public void addGrade(Grade g) {

  }

  public Grade getGrade(Module m) {
    return null;

  }

  public void registerModule(Module m) {

  }

}

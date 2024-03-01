package com.betrybe.alexandria.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_details")
public class BookDetail {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String sumary;
  @Column(name = "page_count" )
  private Integer pageCount;
  private String year;

  private String isbn;

  public BookDetail(){

  }


  public BookDetail(long id, String sumary, Integer pageCount, String year, String isbn) {
    this.id = id;
    this.sumary = sumary;
    this.pageCount = pageCount;
    this.year = year;
    this.isbn = isbn;
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getSumary() {
    return sumary;
  }

  public void setSumary(String sumary) {
    this.sumary = sumary;
  }

  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}

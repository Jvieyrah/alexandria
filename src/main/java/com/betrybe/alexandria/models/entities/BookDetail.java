package com.betrybe.alexandria.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_details")
public class BookDetail {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String summary;
  @Column(name = "page_count" )
  private Integer pageCount;
  private String year;

  private String isbn;

  @OneToOne()
  @JoinColumn(name = "book_id")
  @JsonIgnore
  private Book book;

  public BookDetail(){

  }


  public BookDetail(long id, String summary, Integer pageCount, String year, String isbn, Book book) {
    this.id = id;
    this.summary = summary;
    this.pageCount = pageCount;
    this.year = year;
    this.isbn = isbn;
    this.book = book;
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
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

  // getters e setters
  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }
}

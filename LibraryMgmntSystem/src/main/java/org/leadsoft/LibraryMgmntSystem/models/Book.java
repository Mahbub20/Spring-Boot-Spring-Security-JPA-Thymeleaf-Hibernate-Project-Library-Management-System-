package org.leadsoft.LibraryMgmntSystem.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name ="book_title")
	@NotNull
	private String bookTitle;
	@Column(name ="isbin")
	@NotNull
	private String isbin;
	@Column(name ="authors")
	@NotNull
	private String authors;
	@Column(name ="publish_date")
	@NotNull
	private Date publishDate;
	@Column(name ="publisher")
	@NotNull
	private String publisher;
	@Column(name ="price")
	@NotNull
	private double price;
	@Column(name ="stock")
	@NotNull
	private Integer stock;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getIsbin() {
		return isbin;
	}
	public void setIsbin(String isbin) {
		this.isbin = isbin;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	

}

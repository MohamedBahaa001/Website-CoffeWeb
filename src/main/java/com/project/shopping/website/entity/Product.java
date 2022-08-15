package com.project.shopping.website.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "products")
public class Product {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "prod_id")
   private Integer id;
   @Column(name = "prod_name", nullable = false)
   private String name;
   @Column(name = "prod_imageUrl", nullable = false)
   private String imageUrl;
   @Column(name = "prod_price", nullable = false)
   private double price;
   @Column(name = "prod_description", nullable = false)
   private String description;

   @JoinColumn(name = "category_id")
   @ManyToOne
   private Category category;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getImageUrl() {
	return imageUrl;
}

public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Category getCategory() {
	return category;
}

public void setCategory(Category category) {
	this.category = category;
}

public Product(Integer id, String name, String imageUrl, double price, String description, Category category) {
	super();
	this.id = id;
	this.name = name;
	this.imageUrl = imageUrl;
	this.price = price;
	this.description = description;
	this.category = category;
}

public Product() {
	super();
}
   
}

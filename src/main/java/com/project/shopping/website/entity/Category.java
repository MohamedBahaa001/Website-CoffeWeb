package com.project.shopping.website.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "category")
public class Category {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "category_id", nullable = false)
   private Integer id;
   @Column(name = "category_name", nullable = false)
   private String categoryName;
   @Column(name = "description", nullable = false)
   private String description;
   @Column(name = "image_url", nullable = false)
   private String imageUrl;
public Category() {
	super();
}
public Category(Integer id, String categoryName, String description, String imageUrl) {
	super();
	this.id = id;
	this.categoryName = categoryName;
	this.description = description;
	this.imageUrl = imageUrl;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getImageUrl() {
	return imageUrl;
}
public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}


}

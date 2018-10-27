package com.gyf.domain;

public class Book {
	private String id;
	private String name;//书名
	private double price;//价格
	private int pnum;//数量
	private String category;//分类
	private String description;//描述
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", pnum=" + pnum + ", category=" + category
				+ ", description=" + description + "]";
	}
	public Book(String id, String name, double price, int pnum, String category, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.pnum = pnum;
		this.category = category;
		this.description = description;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
}

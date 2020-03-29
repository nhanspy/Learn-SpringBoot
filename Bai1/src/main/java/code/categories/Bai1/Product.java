package code.categories.Bai1;

import java.util.Locale.Category;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	private int id;
	private String name;
	private int quantity;
	private float price;
	private String description;
	public Product() {
		super();
	}
	public Product(int id, String name, int quantity, float price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
//	@ManyToOne
//	@JoinColumn(name = "CatID")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "catID") 
	private Categories category; 
//	private int catid;
	
	
	
}

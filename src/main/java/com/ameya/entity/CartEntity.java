package com.ameya.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class CartEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Cart_ID")
	int Cart_ID;
	
	@Column(name="Users_ID")
	int Users_ID;
	
	@Column(name="Product_Name")
	String Product_Name;
	
	@Column(name="Product_Category")
	String Product_Category;
	
	@Column(name="Amount")
	int Amount;
	
	@Column(name="Quantity")
	int Quantity;
	
	@Column(name="Created_Date")
	Date Created_Date;
	
	@Column(name="Updated_Date")
	Date Updated_Date;
	
	@Column(name="Users_Name")
	String Users_Name;
	
	@Column(name="ProdID")
	int ProdID;
	
	@Column(name="CatID")
	int CatID;
	
	
	public CartEntity(int cart_ID, int users_ID, String product_Name, String product_Category, int amount, int quantity,
			Date created_Date, Date updated_Date, String Users_Name, int prodID, int catID) {
		Cart_ID = cart_ID;
		Users_ID = users_ID;
		Product_Name = product_Name;
		Product_Category = product_Category;
		Amount = amount;
		Quantity = quantity;
		Created_Date = created_Date;
		Updated_Date = updated_Date;
		Users_Name = Users_Name;
		ProdID = prodID;
		CatID = catID;
	}

	public int getCart_ID() {
		return Cart_ID;
	}

	public void setCart_ID(int cart_ID) {
		Cart_ID = cart_ID;
	}

	public int getUsers_ID() {
		return Users_ID;
	}

	public void setUsers_ID(int users_ID) {
		Users_ID = users_ID;
	}

	public String getProduct_Name() {
		return Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public String getProduct_Category() {
		return Product_Category;
	}

	public void setProduct_Category(String product_Category) {
		Product_Category = product_Category;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public Date getCreated_Date() {
		return Created_Date;
	}

	public void setCreated_Date(Date created_Date) {
		Created_Date = created_Date;
	}

	public Date getUpdated_Date() {
		return Updated_Date;
	}

	public void setUpdated_Date(Date updated_Date) {
		Updated_Date = updated_Date;
	}

	public String getUpdated_By() {
		return Users_Name;
	}

	public void setUpdated_By(String Users_Name) {
		Users_Name = Users_Name;
	}

	public int getProdID() {
		return ProdID;
	}

	public void setProdID(int prodID) {
		ProdID = prodID;
	}

	public int getCatID() {
		return CatID;
	}

	public void setCatID(int catID) {
		CatID = catID;
	}
	
}

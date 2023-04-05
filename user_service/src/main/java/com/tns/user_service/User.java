package com.tns.user_service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
private Integer UserId;
private String UserName;
private Integer phn_no;
private String location;
private String Product_name;
private Integer Quantity;
private Integer Total_amt;
private Integer Transaction;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(Integer userId, String userName, Integer phn_no, String location, String product_name, Integer quantity,
		Integer total_amt, Integer transaction) {
	super();
	UserId = userId;
	UserName = userName;
	this.phn_no = phn_no;
	this.location = location;
	Product_name = product_name;
	Quantity = quantity;
	Total_amt = total_amt;
	Transaction = transaction;
}
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
public Integer getUserId() {
	return UserId;
}
public void setUserId(Integer userId) {
	UserId = userId;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public Integer getPhn_no() {
	return phn_no;
}
public void setPhn_no(Integer phn_no) {
	this.phn_no = phn_no;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getProduct_name() {
	return Product_name;
}
public void setProduct_name(String product_name) {
	Product_name = product_name;
}
public Integer getQuantity() {
	return Quantity;
}
public void setQuantity(Integer quantity) {
	Quantity = quantity;
}
public Integer getTotal_amt() {
	return Total_amt;
}
public void setTotal_amt(Integer total_amt) {
	Total_amt = total_amt;
}
public Integer getTransaction() {
	return Transaction;
}
public void setTransaction(Integer transaction) {
	Transaction = transaction;
}
@Override
public String toString() {
	return "User [UserId=" + UserId + ", UserName=" + UserName + ", phn_no=" + phn_no + ", location=" + location
			+ ", Product_name=" + Product_name + ", Quantity=" + Quantity + ", Total_amt=" + Total_amt
			+ ", Transaction=" + Transaction + ", getUserId()=" + getUserId() + ", getUserName()=" + getUserName()
			+ ", getPhn_no()=" + getPhn_no() + ", getLocation()=" + getLocation() + ", getProduct_name()="
			+ getProduct_name() + ", getQuantity()=" + getQuantity() + ", getTotal_amt()=" + getTotal_amt()
			+ ", getTransaction()=" + getTransaction() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}

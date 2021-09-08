package com.example.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CustomerDetails {

	private String customerId;
	private String shareName;
	private int quantity;
	private double unitPrice;
	private double totalValuation;
	private String shareType;
	
	public CustomerDetails(){}
	
	public CustomerDetails(String customerId, String shareName, int quantity, double unitPrice, double totalValuation,
			String shareType) {
		super();
		this.customerId = customerId;
		this.shareName = shareName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalValuation = totalValuation;
		this.shareType = shareType;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getShareName() {
		return shareName;
	}
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getTotalValuation() {
		return totalValuation;
	}
	public void setTotalValuation(double totalValuation) {
		this.totalValuation = totalValuation;
	}
	public String getShareType() {
		return shareType;
	}
	public void setShareType(String shareType) {
		this.shareType = shareType;
	}
	
	
}


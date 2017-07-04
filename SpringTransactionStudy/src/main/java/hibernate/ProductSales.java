package hibernate;

import java.util.Date;

public class ProductSales implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	public ProductSales() {
	}

	public ProductSales(int saleId, Date saleBeginDate, int quantity) {
		this.saleId = saleId;
		this.saleBeginDate = saleBeginDate;
		this.quantity = quantity;
	}

	private int saleId;

	public int getSaleId() {
		return this.saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	private Product product;

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	private Date saleBeginDate;

	public Date getSaleBeginDate() {
		return this.saleBeginDate;
	}

	public void setSaleBeginDate(Date saleBeginDate) {
		this.saleBeginDate = saleBeginDate;
	}

	private int quantity;

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
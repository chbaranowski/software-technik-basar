package basar.domain;

import java.util.Date;


public class Position {
	
	private Date createTime;

	private String description;

	/** 
	 * @uml.property name="positionKey"
	 * @uml.associationEnd multiplicity="(1 1)" aggregation="composite" inverse="position:basar.domain.PositionKey"
	 */
	private PositionKey positionKey = new basar.domain.PositionKey();

	/** 
	 * @uml.property name="positionType"
	 * @uml.associationEnd multiplicity="(1 1)" aggregation="composite" inverse="position:basar.domain.PositionType"
	 */
	private PositionType positionType = PositionType.SALE;

	/** 
	 * @uml.property name="seller"
	 * @uml.associationEnd inverse="position:basar.domain.Seller"
	 */
	private Seller seller;

	public Date getCreateTime() {
		return createTime;
	}

	public String getDescription() {
		return description;
	}

	/** 
	 * Getter of the property <tt>positionKey</tt>
	 * @return  Returns the positionKey.
	 * @uml.property  name="positionKey"
	 */
	public PositionKey getPositionKey() {
		return positionKey;
	}

	/** 
	 * Getter of the property <tt>positionType</tt>
	 * @return  Returns the positionType.
	 * @uml.property  name="positionType"
	 */
	public PositionType getPositionType() {
		return positionType;
	}

	/** 
	 * Getter of the property <tt>seller</tt>
	 * @return  Returns the seller.
	 * @uml.property  name="seller"
	 */
	public Seller getSeller() {
		return seller;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/** 
	 * Setter of the property <tt>positionKey</tt>
	 * @param positionKey  The positionKey to set.
	 * @uml.property  name="positionKey"
	 */
	public void setPositionKey(PositionKey positionKey) {
		this.positionKey = positionKey;
	}

	/** 
	 * Setter of the property <tt>positionType</tt>
	 * @param positionType  The positionType to set.
	 * @uml.property  name="positionType"
	 */
	public void setPositionType(PositionType positionType) {
		this.positionType = positionType;
	}

	/** 
	 * Setter of the property <tt>seller</tt>
	 * @param seller  The seller to set.
	 * @uml.property  name="seller"
	 */
	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	/**
	 * @uml.property  name="price"
	 * @uml.associationEnd  aggregation="shared" inverse="position:basar.domain.Money"
	 */
	private Money price;

	/**
	 * Getter of the property <tt>price</tt>
	 * @return  Returns the price.
	 * @uml.property  name="price"
	 */
	public Money getPrice() {
		return price;
	}

	/**
	 * Setter of the property <tt>price</tt>
	 * @param price  The price to set.
	 * @uml.property  name="price"
	 */
	public void setPrice(Money price) {
		this.price = price;
	}

}

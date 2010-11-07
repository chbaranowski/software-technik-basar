package basar.domain;

import java.util.Collection;


public class Seller {

	private Long basarNumber;

	private String name;
	
	/** 
	 * @uml.property name="position"
	 * @uml.associationEnd multiplicity="(0 -1)" aggregation="shared" inverse="seller:basar.domain.Position"
	 */
	private Collection<Position> position;

	/** 
	 * Getter of the property <tt>position</tt>
	 * @return  Returns the position.
	 * @uml.property  name="position"
	 */
	public Collection<Position> getPosition() {
		return position;
	}

	/** 
	 * Setter of the property <tt>position</tt>
	 * @param position  The position to set.
	 * @uml.property  name="position"
	 */
	public void setPosition(Collection<Position> position) {
		this.position = position;
	}

	public void setBasarNumber(Long basarNumber) {
		this.basarNumber = basarNumber;
	}

	public Long getBasarNumber() {
		return basarNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

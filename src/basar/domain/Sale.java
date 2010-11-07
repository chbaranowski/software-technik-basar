package basar.domain;

import java.util.Collection;


public class Sale {

	/** 
	 * @uml.property name="position"
	 * @uml.associationEnd multiplicity="(0 -1)" aggregation="shared" inverse="sale:basar.domain.Position"
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
	
	public void addPosition(Position position){
	}

	public void removePosition(Position position){
	}

	public Money getSumme(){
		return null;
	}

}

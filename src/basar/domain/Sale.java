package basar.domain;

import java.util.Collection;


public class Sale {

	private Collection<Position> position;

	public Collection<Position> getPosition() {
		return position;
	}

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

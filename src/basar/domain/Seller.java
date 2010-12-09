package basar.domain;

import java.io.Serializable;
import java.util.Collection;


public class Seller implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long basarNumber;

	private String name;
	
	private String firstname;
	
	private Collection<Position> position;

	public Collection<Position> getPosition() {
		return position;
	}

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

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname() {
		return firstname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((basarNumber == null) ? 0 : basarNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (basarNumber == null) {
			if (other.basarNumber != null)
				return false;
		} else if (!basarNumber.equals(other.basarNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [basarNumber=" + basarNumber + ", name=" + name
				+ ", firstname=" + firstname + ", position=" + position + "]";
	}
	
}

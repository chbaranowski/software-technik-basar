package basar.domain;

import java.util.List;


public interface BasarFacade {
	
	boolean isValideBasarNumber(long number);

	void purchase(Sale sale);

	void storno(Sale sale);
	
	Position getPosition(PositionKey positionKey);

	void insertPosition(Position position);

	void updatePosition(Position position);

	void deletePosition(Position position);

	List<Position> getPositionList();
	
	Seller getSeller(long basarNumber);

	void insertSeller(Seller seller);

	void updateSeller(Seller seller);

	void deleteSeller(Seller seller);

	List<Seller> getSellerList();

}

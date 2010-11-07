package basar.domain;

import java.util.List;

interface PositionRepository {
	
	Position getPosition(PositionKey positionKey);

	void insertPosition(Position position);

	void updatePosition(Position position);

	void deletePosition(Position position);

	List<Position> getPositionList();

}

package basar.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class SellerRepositoryImpl implements SellerRepository {

	private final Map<Long, Seller> sellers = new HashMap<Long, Seller>();
	
	public void deleteSeller(Seller seller) {
		sellers.remove(seller.getBasarNumber());
	}

	public Seller getSeller(long basarNumber) {
		return sellers.get(basarNumber);
	}

	public Collection<Seller> getSellerList() {
		return sellers.values();
	}

	public void insertSeller(Seller seller) {
		sellers.put(seller.getBasarNumber(), seller);
	}

	public void updateSeller(Seller seller) {
	}

}

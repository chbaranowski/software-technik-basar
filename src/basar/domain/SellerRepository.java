package basar.domain;

import java.util.List;


interface SellerRepository {
	
	Seller getSeller(long basarNumber);

	void insertSeller(Seller seller);

	void updateSeller(Seller seller);

	void deleteSeller(Seller seller);

	List<Seller> getSellerList();

}

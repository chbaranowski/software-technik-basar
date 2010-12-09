package basar.domain;

import java.util.Collection;


class BasarFacadeImpl implements BasarFacade {

	private PositionRepository positionRepository = 
		DomainBasarFactory.instance.createPositionRepository();
	
	private SaleService saleService = 
		DomainBasarFactory.instance.createSaleService();
	
	private SellerRepository sellerRepository = 
		DomainBasarFactory.instance.createSellerRepository();
	

	public boolean isValideBasarNumber(long number) {
		return saleService.isValideBasarNumber(number);
	}

	public void purchase(Sale sale) {
		saleService.purchase(sale);
	}

	public void storno(Sale sale) {
		saleService.storno(sale);
	}

	public Seller getSeller(long basarNumber) {
		return sellerRepository.getSeller(basarNumber);
	}

	public void insertSeller(Seller seller) {
		sellerRepository.insertSeller(seller);
	}

	public void updateSeller(Seller seller) {
		sellerRepository.updateSeller(seller);
	}

	public void deleteSeller(Seller seller) {
		sellerRepository.deleteSeller(seller);
	}

	public Collection<Seller> getSellerList() {
		return sellerRepository.getSellerList();
	}

	public Position getPosition(PositionKey positionKey) {
		return positionRepository.getPosition(positionKey);
	}

	public void insertPosition(Position position) {
		positionRepository.insertPosition(position);
	}

	public void updatePosition(Position position) {
		positionRepository.updatePosition(position);
	}

	public void deletePosition(Position position) {
		positionRepository.deletePosition(position);
	}

	public Collection<Position> getPositionList() {
		return positionRepository.getPositionList();
	}

}

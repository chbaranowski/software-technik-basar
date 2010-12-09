package basar.domain;

class SaleServiceImpl implements SaleService {
	
	private PositionRepository positionRepository = 
		DomainBasarFactory.instance.createPositionRepository();

	private SellerRepository sellerRepository = 
		DomainBasarFactory.instance.createSellerRepository();

	public PositionRepository getPositionRepository() {
		return positionRepository;
	}

	public SellerRepository getSellerRepository() {
		return sellerRepository;
	}

	public boolean isValideBasarNumber(long number) {
		return false;
	}

	public void purchase(Sale sale) {
	}

	public void setPositionRepository(PositionRepository positionRepository) {
		this.positionRepository = positionRepository;
	}

	public void setSellerRepository(SellerRepository sellerRepository) {
		this.sellerRepository = sellerRepository;
	}

	public void storno(Sale sale) {
	}


}

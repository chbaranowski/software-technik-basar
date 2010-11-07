package basar.domain;


class DomainBasarFactoryImpl implements DomainBasarFactory {

	public PositionRepository createPositionRepository() {
		return new PositionRepositoryImpl();
	}

	public SaleService createSaleService() {
		return new SaleServiceImpl();
	}

	public SellerRepository createSellerRepository() {
		return new SellerRepositoryImpl();
	}

}

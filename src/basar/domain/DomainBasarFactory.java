package basar.domain;


interface DomainBasarFactory {
	
	static DomainBasarFactory instance = new DomainBasarFactoryImpl();
	
	PositionRepository createPositionRepository();
	
	SellerRepository createSellerRepository();
	
	SaleService createSaleService();

}

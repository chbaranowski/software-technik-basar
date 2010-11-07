package basar.domain;

import java.util.List;


class BasarFacadeImpl implements BasarFacade {

	/** 
	 * @uml.property name="positionRepository"
	 * @uml.associationEnd multiplicity="(1 1)" aggregation="shared" inverse="basarFacadeImpl:basar.domain.PositionRepository"
	 */
	private PositionRepository positionRepository = DomainBasarFactory.instance.createPositionRepository();

	/** 
	 * @uml.property name="saleService"
	 * @uml.associationEnd multiplicity="(1 1)" aggregation="shared" inverse="basarFacadeImpl:basar.domain.SaleService"
	 */
	private SaleService saleService = DomainBasarFactory.instance.createSaleService();

	/** 
	 * @uml.property name="sellerRepository"
	 * @uml.associationEnd multiplicity="(1 1)" aggregation="shared" inverse="basarFacadeImpl:basar.domain.SellerRepository"
	 */
	private SellerRepository sellerRepository = DomainBasarFactory.instance.createSellerRepository();

	public void deletePosition(Position position) {
	}
	

	public void deleteSeller(Seller seller) {
	}

	public Position getPosition(PositionKey positionKey) {
		return null;
	}

	public List<Position> getPositionList() {
		return null;
	}

	/** 
	 * Getter of the property <tt>positionRepository</tt>
	 * @return  Returns the positionRepository.
	 * @uml.property  name="positionRepository"
	 */
	public PositionRepository getPositionRepository() {
		return positionRepository;
	}

	/** 
	 * Getter of the property <tt>saleService</tt>
	 * @return  Returns the saleService.
	 * @uml.property  name="saleService"
	 */
	public SaleService getSaleService() {
		return saleService;
	}

	public Seller getSeller(long basarNumber) {
		return null;
	}

	public List<Seller> getSellerList() {
		return null;
	}

	/** 
	 * Getter of the property <tt>sellerRepository</tt>
	 * @return  Returns the sellerRepository.
	 * @uml.property  name="sellerRepository"
	 */
	public SellerRepository getSellerRepository() {
		return sellerRepository;
	}

	public void insertPosition(Position position) {
	}

	public void insertSeller(Seller seller) {
	}

	public boolean isValideBasarNumber(long number) {
		return false;
	}

	public void purchase(Sale sale) {
	}

	/** 
	 * Setter of the property <tt>positionRepository</tt>
	 * @param positionRepository  The positionRepository to set.
	 * @uml.property  name="positionRepository"
	 */
	public void setPositionRepository(PositionRepository positionRepository) {
		this.positionRepository = positionRepository;
	}

	/** 
	 * Setter of the property <tt>saleService</tt>
	 * @param saleService  The saleService to set.
	 * @uml.property  name="saleService"
	 */
	public void setSaleService(SaleService saleService) {
		this.saleService = saleService;
	}

	/** 
	 * Setter of the property <tt>sellerRepository</tt>
	 * @param sellerRepository  The sellerRepository to set.
	 * @uml.property  name="sellerRepository"
	 */
	public void setSellerRepository(SellerRepository sellerRepository) {
		this.sellerRepository = sellerRepository;
	}

	public void storno(Sale sale) {
	}

	public void updatePosition(Position position) {
	}

	public void updateSeller(Seller seller) {
	}

}

package basar.domain;


interface SaleService {
	
	boolean isValideBasarNumber(long number);

	void purchase(Sale sale);

	void storno(Sale sale);

}

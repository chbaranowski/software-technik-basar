package basar.domain;


public interface BasarFactory {
	
	static BasarFacade instance = new BasarFacadeImpl();
	
	BasarFacade createBasarFacade();

}

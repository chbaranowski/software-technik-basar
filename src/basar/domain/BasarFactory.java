package basar.domain;


public interface BasarFactory {
	
	static BasarFactory instance = new BasarFactoryImpl();
	
	BasarFacade createBasarFacade();

}

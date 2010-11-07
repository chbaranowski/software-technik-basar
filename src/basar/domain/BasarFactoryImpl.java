package basar.domain;


class BasarFactoryImpl implements BasarFactory {

	public BasarFacade createBasarFacade() {
		return new BasarFacadeImpl();
	}

}

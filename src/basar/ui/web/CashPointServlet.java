package basar.ui.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import basar.domain.BasarFacade;
import basar.domain.BasarFactory;

public class CashPointServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	BasarFacade basar = BasarFactory.instance.createBasarFacade();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO
	}

}

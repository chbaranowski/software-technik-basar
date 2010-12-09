package basar.ui.web;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import basar.domain.BasarFacade;
import basar.domain.BasarFactory;
import basar.domain.Seller;

public class CashPointServlet extends HttpServlet {

	private static final String DELETE_CUSTOMER_ACTION = "/deleteCustomer";

	private static final String CUSTOMERS_ACTION = "/customers";

	private static final String SAVE_CUSTOMER_ACTION = "/saveCustomer";

	private static final long serialVersionUID = 1L;

	private BasarFacade basar;

	@Override
	public void init() throws ServletException {
		basar = BasarFactory.instance.createBasarFacade();
	}

	@Override
	public void destroy() {
		basar = null;
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String path = req.getPathInfo();
		if (path.equals(SAVE_CUSTOMER_ACTION)) {
			saveCustomerAction(req, resp);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String path = req.getPathInfo();
		if (path.equals(CUSTOMERS_ACTION)) {
			getCustomersAction(req, resp);
		} 
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String path = req.getPathInfo();
		if (path.equals(DELETE_CUSTOMER_ACTION)) {
			deleteCustomerAction(req, resp);
		}
	}

	protected void deleteCustomerAction(HttpServletRequest req,
			HttpServletResponse resp) {
		Long basarNumber = Long.valueOf(req.getParameter("basarNumber"));
		Seller seller = basar.getSeller(basarNumber);
		if (seller != null) {
			basar.deleteSeller(seller);
		}
	}

	protected void saveCustomerAction(HttpServletRequest req,
			HttpServletResponse resp) throws IOException {
		Long basarNumber = Long.valueOf(req.getParameter("basarNumber"));
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		Seller seller = basar.getSeller(basarNumber);
		boolean isNewSeller = false;
		if (seller == null) {
			seller = new Seller();
			seller.setBasarNumber(basarNumber);
			isNewSeller = true;
		}
		seller.setName(lastName);
		seller.setFirstname(firstName);
		if (isNewSeller) {
			basar.insertSeller(seller);
		} else {
			basar.updateSeller(seller);
		}
		resp.sendRedirect("../customer-overview.html");
	}

	protected void getCustomersAction(HttpServletRequest req,
			HttpServletResponse resp) throws IOException {
		Collection<Seller> sellerList = basar.getSellerList();
		Gson gson = new Gson();
		String json = gson.toJson(sellerList);
		resp.getWriter().append(json);
	}

}

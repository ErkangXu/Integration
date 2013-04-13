package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import model.Car;

import com.google.gson.Gson;

import dao.CarDao;

//@WebServlet(urlPatterns={"/AjaxServlet"})
public class AjaxServlet extends HttpServlet implements HttpRequestHandler{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CarDao carDao;

	/* protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String model = request.getParameter("model");
		String mileage = request.getParameter("mileage");
		StringBuffer query = new StringBuffer();
		query.append("select * from car");
		
		if (model != null) {
			query.append("where model=\'").append(model).append("\'");
			if (mileage != null) query.append("and mileage =\'").append(mileage).append("\'");
		}
		else if (mileage != null) query.append("where mileage < \'").append(mileage).append("\'");
		
		String editedQuery = query.toString();
		
		CarDaoImpl carDao = new CarDaoImpl();
		
        List<Car> cars = carDao.searchCar(editedQuery);
		String json = new Gson().toJson(cars);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
   }
*/

	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String model = request.getParameter("model");
			String mileage = request.getParameter("mileage");
			StringBuffer query = new StringBuffer();
			query.append("from Car");
			
			System.out.print(model);
			
			if (model != "") {
				query.append(" where model=\'").append(model).append("\'");
				if (mileage != "") query.append(" and mileage <\'").append(mileage).append("\'");
			}
			else if (mileage != "") query.append(" where mileage < \'").append(mileage).append("\'");
			
			String editedQuery = query.toString();
			
	        List<Car> cars = carDao.searchCar(editedQuery);
			String json = new Gson().toJson(cars);
	        response.setContentType("application/json");
	        response.setCharacterEncoding("UTF-8");
	        response.getWriter().write(json);
		
	}
}

package dao;

import java.util.List;

import model.Car;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class CarDaoImpl extends HibernateDaoSupport implements CarDao {
	
	@Override
	public void addCar(Car car) {
		getHibernateTemplate().save(car);
	}

	@Override
	public List<Car> searchCar(String query) {
		return (List<Car>) getHibernateTemplate().find(query);
		
	}

}

package bo;

import model.Car;

import dao.CarDao;

public class CarBoImpl implements CarBo{
	
	CarDao carDao;
	
	//DI via Spring
	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}

	@Override
	public void addCar(Car car) {
		carDao.addCar(car);
	}

}

package dao;

import java.util.List;

import model.Car;

public interface CarDao {
	void addCar(Car car);
	
	List<Car> searchCar(String criterion);

}

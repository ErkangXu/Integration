package action;


import model.Car;

import bo.CarBo;

import com.opensymphony.xwork2.ModelDriven;

public class CarAction implements ModelDriven{
    Car car = new Car();
    
	CarBo carBo;
    
	public void setCarBo(CarBo carBo) {
		this.carBo = carBo;
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return car;
	}

	
	public String addCar() throws Exception{
 
		//save it
		
		carBo.addCar(car);
 		return "success";
 
	}
	
}

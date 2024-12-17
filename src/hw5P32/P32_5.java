package hw5P32;

import hw5P31.Car;

public class P32_5 {
	public static void main(String[] args)throws CarException {
		Car car1;
        car1 = new Car();
        
        car1.setCar(1234,-10.0);
        
        car1.show();
	}
}

package com.sahin.spring_config.multiple_packages;

import com.sahin.another_package.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private Car car;

    public void setBrandName(String brand) {
        car.setBrandName(brand);
    }

    public String getBrandName() {
        return car.getBrandName();
    }
}

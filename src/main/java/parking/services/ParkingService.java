package src.main.java.parking.services;

import org.springframework.stereotype.Service;

@Service
public class ParkingService {

    public String getParkingAvailability(){
        return "List of available parkings";
    }

}

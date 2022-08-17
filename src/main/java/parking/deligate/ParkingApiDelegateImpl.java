package src.main.java.parking.deligate;

import com.main.services.parking.api.ParkingApiDelegate;
import com.main.services.parking.model.ServiceDataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import src.main.java.parking.services.ParkingService;

@Service
public class ParkingApiDelegateImpl implements ParkingApiDelegate {

    @Autowired
    private ParkingService parkingService;

    @Override
    public ResponseEntity<ServiceDataResponse> parkingGet() {
        return ResponseEntity.ok().build();
    }
}

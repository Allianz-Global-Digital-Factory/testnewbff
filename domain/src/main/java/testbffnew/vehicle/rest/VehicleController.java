package testbffnew.vehicle.rest;

import testbffnew.api.VehicleSearchApi;
import testbffnew.api.model.DataOptionList;

import testbffnew.vehicle.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class VehicleController implements VehicleSearchApi {

  private final VehicleService vehicleService;


  @Override
  public ResponseEntity<DataOptionList> vehicleBrands() {
    DataOptionList brands = vehicleService.vehicleBrands();
    return ResponseEntity
        .ok()
        .body(brands);
  }
}

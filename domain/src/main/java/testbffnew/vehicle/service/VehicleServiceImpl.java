package testbffnew.vehicle.service;

import testbffnew.api.model.DataOptionList;
import testbffnew.vehicle.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {

  private final VehicleRepository vehicleRepository;


  @Override
  public DataOptionList vehicleBrands() {
    return vehicleRepository.vehicleBrands();
  }

}

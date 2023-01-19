package testbffnew.vehicle.repository;

import testbffnew.api.model.DataOption;
import testbffnew.api.model.DataOptionList;
import org.springframework.stereotype.Component;

@Component
public class MockVehicleRepository implements VehicleRepository {

  @Override
  public DataOptionList vehicleBrands() {
    return new DataOptionList()
        .addValuesItem(
            new DataOption()
                .label("BMW")
                .value("BMW")
                .additionalText("")
        );
  }

}

package testbffnew.vehicle.repository;

import testbffnew.api.model.DataOption;
import testbffnew.api.model.DataOptionList;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(value = "oeSuffix", havingValue = "-oe")
public class MockVehicleRepositoryOE implements VehicleRepository {

  @Override
  public DataOptionList vehicleBrands() {
    return new DataOptionList()
        .addValuesItem(
            new DataOption()
                .label("Porsche")
                .value("Porsche")
                .additionalText("")
        );
  }

}

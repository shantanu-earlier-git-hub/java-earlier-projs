package bootjpa.practise1.shared.onetomany;

import bootjpa.practise1.entities.onetomany.Dealer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VehicleData {

    private Long id;

    private String brand;

    private String model;

    private Dealer dealer;

}

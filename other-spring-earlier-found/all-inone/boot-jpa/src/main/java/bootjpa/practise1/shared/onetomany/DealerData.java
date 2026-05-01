package bootjpa.practise1.shared.onetomany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DealerData {
    private Long id;
    private String dealerName;
    private String location;
}

package problems;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonModel {

    private Integer id;

    private String name;

    private Integer age;

    private String address;

}

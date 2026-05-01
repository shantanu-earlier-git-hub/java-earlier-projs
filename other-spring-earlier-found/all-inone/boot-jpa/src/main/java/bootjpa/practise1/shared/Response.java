package bootjpa.practise1.shared;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class Response {

    private Object data;
    private String message;
}

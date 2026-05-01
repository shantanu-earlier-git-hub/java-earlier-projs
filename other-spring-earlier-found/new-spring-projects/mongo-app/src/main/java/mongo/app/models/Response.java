package mongo.app.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Response {

    private Object returnObject;

    private int status;

    private String message;

    private Error error;

}

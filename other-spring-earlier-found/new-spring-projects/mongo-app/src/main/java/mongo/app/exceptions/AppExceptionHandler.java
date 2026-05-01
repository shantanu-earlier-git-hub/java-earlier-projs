package mongo.app.exceptions;


import mongo.app.models.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;
import reactor.core.publisher.Mono;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(Exception.class)
    public Mono<ResponseEntity<Response>> handleException(){
        return Mono.just(
                new ResponseEntity<Response>(new
                        Response(null,
                        HttpStatus.INTERNAL_SERVER_ERROR.value(),
                        "some message" ,
                        new Error()), HttpStatus.INTERNAL_SERVER_ERROR)
        );
    }


}

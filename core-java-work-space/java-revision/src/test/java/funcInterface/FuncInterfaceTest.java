package funcInterface;

import basics.streams.lambda.funcInterface.FuncInterface;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncInterfaceTest {

    @Test
    private void checkFuncInterface() {
        FuncInterface func = new FuncInterface() {
            @Override
            public String returnString() {
                return "calling ";
            }
        };

        assertEquals("calling", func.returnString());
    }


}
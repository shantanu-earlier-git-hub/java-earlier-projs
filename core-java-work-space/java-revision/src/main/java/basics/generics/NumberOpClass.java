package basics.generics;

import lombok.Data;

@Data
public class NumberOpClass<N extends Number> {

    N value;

    NumberOpClass(N val) {
        this.value = val;
    }

    public void doSomething(N num) {
        System.out.printf("number passed as param %s", num);
    }
}

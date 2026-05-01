package basic.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TaDestructurer {


    public static void main(String[] args) {

        try {
            Class<?> loadedClass = ClassLoader
                    .getSystemClassLoader().loadClass("basic.annotations.TestAnnotationImpl");

            TestAnnotations testAnnotations = loadedClass.getAnnotation(TestAnnotations.class);
            Method[] methods = loadedClass.getMethods();
            Field[] fields = loadedClass.getFields();


            Arrays.stream(methods).forEach(method ->{
                System.out.println("method = " + method.getName());
            });

            Arrays.stream(fields).forEach(field ->{
                System.out.println("field = " + field.getName());
            });
            
        } catch (ClassNotFoundException cne) {
            System.out.println("cne = " + cne);
        }


    }


}

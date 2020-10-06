package by.it.fedorinhyk.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {
    public static void main(String[] args) {
        Class<String> structclass=String.class;
        Method [] methods=structclass.getDeclaredMethods();
        for (Method method : methods){
            if ((method.getModifiers() & Modifier.STATIC) != Modifier.STATIC) {
                StringBuilder print = new StringBuilder();
                Class<?> returnType = method.getReturnType();
                print.append(method.getName());
                System.out.println(print);
            }
        }
    }
}

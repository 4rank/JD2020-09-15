package by.it.frolova.jd01_13;

import java.util.HashMap;

public class TaskA {
    public static void main(String[] args) {
        try {
            if (Math.random() > 0.5)
                new HashMap<String, String>(null);
            else
                Integer.parseInt("привет");
        } catch (NumberFormatException | NullPointerException e) {
            Class<?> aClass = e.getClass();
            String exceptionName = aClass.getName();
            StackTraceElement[] stackTrace = e.getStackTrace();
            printInfoAboutException(exceptionName, stackTrace);
        }
    }

    private static void printInfoAboutException(String exceptionName, StackTraceElement[] stackTrace) {
        for (StackTraceElement traceElement : stackTrace) {
            String methodName = traceElement.getMethodName();
            if (methodName.equals("main")) {
                String className = traceElement.getClassName();
                int lineNumber = traceElement.getLineNumber();
                System.out.printf(" name: %s\n class: %s\n line: %d\n", exceptionName, className, lineNumber);
                break;
            }
        }
    }
}

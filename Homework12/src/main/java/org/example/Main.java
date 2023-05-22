package org.example;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Messages messages = new Messages();
        Class<?> messagesClass = messages.getClass();

        Paint classAnnotation = messagesClass.getAnnotation(Paint.class);
        String classStyle = (classAnnotation != null) ? classAnnotation.style() : "";
        String classColor = (classAnnotation != null) ? classAnnotation.color() : "";

        Method[] methods = messagesClass.getDeclaredMethods();
        for (Method method : methods) {
            Paint methodAnnotation = method.getAnnotation(Paint.class);
            String methodStyle = (methodAnnotation != null) ? methodAnnotation.style() : "";
            String methodColor = (methodAnnotation != null) ? methodAnnotation.color() : "";

            String message = "";
            try {
                message = (String) method.invoke(messages);
            } catch (Exception e) {
                System.err.println("Error invoking method: " + method.getName());
                e.printStackTrace();
            }

            if (!methodStyle.isEmpty()) {
                message = style(message, methodStyle, methodColor);
            } else if (!classStyle.isEmpty()) {
                message = style(message, classStyle, classColor);
            }

            System.out.println(message);
        }


    }

    private static String style(String message, String style, String color) {
        String before = "";
        String after = Paint.RESET;

        switch (style) {
            case "!":
                before = "!-!-!-!";
                after = "!-!-!-!";
                break;
            case "-":
                before = "-_-_-_-";
                after = "-_-_-_-";
                break;
            case "^":
                before = "^-^-^-^";
                after = "^-^-^-^";
                break;
            case "*":
                before = "*-*-*-*";
                after = "*-*-*-*";
                break;
            default:
                before = "";
                after = Paint.RESET;
                break;
        }

        return color + before + message + after + Paint.RESET;
    }
}

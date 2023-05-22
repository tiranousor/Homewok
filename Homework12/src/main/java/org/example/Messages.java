package org.example;

@Paint(style = "^", color = Paint.BLACK)
public class Messages {
    @Paint(style = "!", color = Paint.YELLOW)
    public String customMessage1() { return "Hello, world!";}

    @Paint(style = "-", color = Paint.GREEN)
    public String customMessage2() { return "Goodbye, see you later!";}

    @Paint(style = "^", color = Paint.WHITE )
    public String customMessage3() { return "My name is Kate, nice to meet you.";}

    @Paint(style = "*", color = Paint.PURPLE)
    public String customMessage4() {return  "You look great today!";}
}


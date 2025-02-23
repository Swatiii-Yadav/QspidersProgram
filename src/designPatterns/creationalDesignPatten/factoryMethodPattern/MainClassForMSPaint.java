package designPatterns.creationalDesignPatten.factoryMethodPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClassForMSPaint {
    public static void main(String[] args) {
        List<String> shapeList=new ArrayList<>();
        shapeList.add("Circle");
        shapeList.add("Square");
        shapeList.add("Hexagon");
        shapeList.add("Pentagon");
        Scanner sc=new Scanner(System.in);
        System.out.println("Which shape you want to draw().");
        String shape=sc.nextLine();
        if (shapeList.contains(shape)){
            System.out.println("Drawing "+shape);
        }
        else {
            System.out.println(shape+" Not found");
        }

    }
}

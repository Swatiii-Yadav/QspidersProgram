package designPatterns.creationalDesignPatten.factoryMethodPattern;

import java.util.Scanner;

public class MainClassForDocument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter documents type PDF/Word/Excel : ");
        String fileType = scanner.nextLine();

        System.out.print("Enter File Name: ");
        String fileName = scanner.nextLine();
        DocumentReaders reader = DocumentReaderFactory.getReader(fileType);

        reader.read(fileName);
    }
}

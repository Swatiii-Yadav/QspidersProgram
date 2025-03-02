package exceptionHandling.march2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InValidDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter travel date : dd/MM/yyyy");
        String selectDate=sc.nextLine();
        try {
            Date travelDate = date.parse(selectDate);
            System.out.println("Bus ticlet bookl for:"+travelDate);
        } catch (ParseException e) {
            System.out.println("Invalid date .Please enter in dd/MM/yyyy.");
        }
    }
}

package oopsPracticeQuestions.february10;

import java.awt.print.Book;

public class EcommerceProductInfo {
    void printInfo(Ecommerce product){
            if (product!=null){
                if (product instanceof Electronics){
                    Electronics ec=(Electronics) product;
                    ec.displayInfo();
                }
                else if (product instanceof Clothing){
                  Clothing   c=(Clothing) product;
                    c.displayInfo();
                }

                else if (product instanceof Books){
                    Books b=(Books) product;
                    b.displayInfo();
                }

            }
        }

}

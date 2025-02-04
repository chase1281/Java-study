package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {
    public int discount(Grade Grade, int price){
        int discountPercent = 0;

        if(Grade == BASIC){
            discountPercent = 10;
        }else if(Grade == GOLD){
            discountPercent = 20;
        }else if(Grade == DIAMOND){
            discountPercent = 30;
        }else{
            System.out.println("할인X");
        }
        return price *discountPercent / 100;
    }
}

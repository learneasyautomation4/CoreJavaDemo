package JavaConcepts.collections.set;

import java.util.EnumSet;
import java.util.Set;

enum month {jan, feb, mar};
public class EnumSetExample {
    public static void main(String[] args) {
        Set<month> eSet;
        eSet = EnumSet.of(month.jan, month.feb, month.mar);
        System.out.println(eSet);


    }
}

import java.util.*;
class Loan {
    double amoount;
    Loan(double amt) {
        this.amoount = amt;
    }
    public String toString() {
        return "Your loan amount is " + amoount;
    }
}

class Circle {
    double radius;
    Circle(double r) {
        this.radius = r;
    }
    public String toString() {
        return "Circle radius is " + radius;
    }
}

public class prc_14 {
    public static void main(String[] args) {
        ArrayList<Object> ary_list = new ArrayList<Object>();
        ary_list.add(new Loan(100000));
        ary_list.add(new Date());
        ary_list.add(new String("Currently we are runnng practical number 14"));
        ary_list.add(new Circle(4.5));

        for (int i = 0; i < ary_list.size(); i++) {
            System.out.println((ary_list.get(i)).toString());
        }

    }
}

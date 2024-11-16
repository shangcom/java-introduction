package cond;

public class Switch1 {
    public static void main(String[] args) {

        int grade = 10;
        int coupon;

        if (grade == 1) {
            coupon = 1000;
            System.out.println("발급받은 쿠폰 " + coupon);
        } else if (grade == 2) {
            coupon = 2000;
            System.out.println("발급받은 쿠폰 " + coupon);
        } else if (grade == 3) {
            coupon = 3000;
            System.out.println("발급받은 쿠폰 " + coupon);
        } else {
            coupon = 500;
            System.out.println("발급받은 쿠폰 " + coupon);
        }

    }
}

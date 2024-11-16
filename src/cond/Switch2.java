package cond;

public class Switch2 {
    public static void main(String[] args) {

        int grade = 3;
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break; // 조건을 만족하면 식을 실행하고 switch문을 빠져나감.
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);


        switch (grade) {
            case 1 -> {
                coupon = 1000;
            }
            case 2 -> {
                coupon = 2000;
            }
            case 3 -> {
                coupon = 3000;
            }
            default -> {
                coupon = 500;
            }
        }
        System.out.println("발급받은 쿠폰 " + coupon);

    }
}


package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {

        int distance = 150;
        String ride;

        if (distance <= 1) {
            ride = "도보";
        } else if (distance <= 10) {
            ride = "자전거";
        } else if (distance <= 100) {
            ride = "자동차";
        } else {
            ride = "비행기";
        }
        System.out.println("거리 = " + distance + ", 운송 수단 = " + ride);
    }
}

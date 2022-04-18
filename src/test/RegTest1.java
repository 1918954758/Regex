package test;

public class RegTest1 {
    public static void main(String[] args) {
        String s = "A,,B;C ,D";
        String sNew=s.replaceAll("[,;\\s]+", ","); // "A,B,C,D"
        System.out.println(sNew);
    }
}

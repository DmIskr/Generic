public class Main {
    public static void main(String[] args) {
        Generic<Integer, String, Double> threegenObj = new Generic<Integer, String, Double>(77, "abc", 2.5);
        int num1 = threegenObj.getOb1();
        String str2 = threegenObj.getOb2();
        double num3 = threegenObj.getOb3();

        System.out.println(threegenObj);
    }
}


public class Main {
    public static void main(String[] args) {
        Generic<Integer, String, Double> twogenObj = new Generic<Integer, String, Double>(77, "abc", 2.5);
        int num1 = twogenObj.getOb1();
        String str2 = twogenObj.getOb2();
        double num3 = twogenObj.getOb3();

        System.out.println("Значение T: " + num1);
        System.out.println("Значение V: " + str2);
        System.out.println("Значение K " + num3);
    }
}
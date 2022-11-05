public class BTLop1 {
    public static void main(String[] args) {
        int a = 13;
        int x2 = 4;

        int x3 = x1*x2;
        int x4 = x1/x2;

        System.out.println("Kết quả của "+x1+" * "+x2+" = "+x3);
        System.out.println("Kết quả của "+x1+" / "+x2+" = "+x3);

        float y1 = 13.24f;
        double y2 = 42.1d;
        double y3 = y1*y2;
        double y4 = y1/y2;
        System.out.println("Kết quả của "+y1+" * "+y2+" = "+y3);
        System.out.println("Kết quả của "+y1+" / "+y2+" = "+y4);

        double z = x1/y1;
        System.out.println("Kết quả của "+x1+" / "+y1+" = "+z);
    }
}

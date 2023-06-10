


public class question4 {
    static void area4(int s1, int s2, int s3) {
        double s = (double) (s1 + s2 + s3) / 2;
        double areasqr = (s * ((s - (double) s1) * (s - (double) s2) * (s - (double) s3)));
        System.out.println("The area of the triangle is : " + Math.sqrt(areasqr));
    }

    static void perimeter(int s1, int s2, int s3) {

        System.out.println("The perimeter of the triangle is : " + (s1 + s2 + s3));
    }

    public static void main(String[] args) {
        area4(3, 4, 5);
        perimeter(3, 4, 5);
    }

}
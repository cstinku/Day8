package java1;

public class MaxMin {

        public static void main(String[] args) {



          int a =2 ,b =3,c=4;


            double result1 = a + b * c;
            double result2 = c + a / b;
            double result3 = a % b + c;
            double result4 = a * b + c;


            double max = result1;
            if (result2 > max) {
                max = result2;
            }
            if (result3 > max) {
                max = result3;
            }
            if (result4 > max) {
                max = result4;
            }


            double min = result1;
            if (result2 < min) {
                min = result2;
            }
            if (result3 < min) {
                min = result3;
            }
            if (result4 < min) {
                min = result4;
            }


            System.out.println("Results:");
            System.out.println("a + b * c = " + result1);
            System.out.println("c + a / b = " + result2);
            System.out.println("a % b + c = " + result3);
            System.out.println("a * b + c = " + result4);
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);


        }


}

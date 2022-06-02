public class ForceCovert {
    public static void main(String[] args) {
        int intVal = 99;
        long longVal = 19999;
        intVal = (int) longVal;
        System.out.println(intVal);

        float floatVal = 11.32F;
        double doubleVal = 3344556.789;
        floatVal = (float) doubleVal;
        System.out.println(floatVal);

        int a = 65 + 10;
        char c = (char) a;
        System.out.println("b\nc");

        String str = "a的值是";/**/
        System.out.println(str + a);

        int div = 77;
        int divser = 9;
        System.out.println(div + "可以整除" + divser + "吗？" + (div % divser == 0));

        char ch = 'A';
        int chA = (int) ch;
        System.out.println(chA);


    }
}

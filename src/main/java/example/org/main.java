public class main {

    public static void main(String[] args) {
        String message = "Hello, World!";
        System.out.println(message);

        int a = (int) (Integer.MAX_VALUE);
        System.out.println(a);
        int b = 1;
        System.out.println(a + b);

        double c = (double) (Double.MIN_VALUE);
        System.out.println(c);
        double d = 1.111;
        System.out.println(c - d);

        int e = 100;
        int f = 30;
        int h = 65;
        int k = 87;

        System.out.println(e % f);
        System.out.println("e * f = " + (e * f));
        System.out.println("e / f = " + (e / f));
        System.out.println("e ++ = " + (e++));
        System.out.println("++ e = " + (++ e));


        if ((e > f ) && (((k / h) > (f / e)))) {
            System.out.println("Выражение верное");
        }
        else {
            System.out.println("Выражение неверное");
        }

        if (((h - e) < 0) || ((k - e) > 0)) {
            System.out.println("Одно из вырежаний верно");
        }

        int j = e;

        if (e > j) {
            System.out.println("Первое число больше");
        }
        else if (e < j) {
            System.out.println("Второе число больше");
        }
        else {
            System.out.println("Числа равны");
        }

        switch (k) {
            case 80:
                System.out.println("Переменная к равна 80");
                break;
            case 70:
                System.out.println("Переменная к равна 70");
                break;
            case 87:
                System.out.println("Переменная к равна 87");
                break;
            default:
                System.out.println("Переменная к не равна 80, 70, 87");
        }

        boolean n = ((6 < 8) || (6 >= 7));
        System.out.println(n);
        boolean m = !(2 >= 3);
        System.out.println(m);
        boolean l = (2 >= 3);
        System.out.println(l);

    }

}
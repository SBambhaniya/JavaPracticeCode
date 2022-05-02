package sangeeta;

public class MathsClass {

    int a = 11;
    int b = 12;
    static int x = 5;
    static int y = 4;
    int c = a+b;
    int d = a-b;
    int e = a*b;
    int f = b/a;
    int m = b%a;


    static float g = 10.25f;
    static boolean h = true;
    static long j = 774844013;


    public static void main(String[] args) {
        MathsClass obj = new MathsClass();

        System.out.println(obj.c);
        System.out.println(obj.d);
        System.out.println(obj.e);
        System.out.println(obj.f);
        System.out.println(x);
        System.out.println(y);
        System.out.println(x+y);
        System.out.println(obj.b%obj.a);


        System.out.println(g);
        System.out.println(h);
        System.out.println(j);
        System.out.println(g+x);
        System.out.println(j+y);
        System.out.println(g*y);
        System.out.println(g+j);




    }

}

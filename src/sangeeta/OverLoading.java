package sangeeta;

public class OverLoading {
    public static void main(String[] args) {
        abc();
        abc(123);
        abc("My name is JAVA");

    }

    public static void abc(){
        System.out.println("Sangita");
    }
    public static void abc(int a){
        System.out.println(a);
    }
    public static void abc(String b){
        System.out.println(b);
    }
}


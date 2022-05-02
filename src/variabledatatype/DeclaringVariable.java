package variabledatatype;

public class DeclaringVariable {

//    variable declared inside class but outside main method or define method is called global or instance variable
    int d = 90;
//    variable declared with static key word is called static variable
//    we can not declare static variable inside user define method
    static int e = 20;


    public static void main(String[] args) {
        int myAge;
//        declaration of variables
        myAge = 36;
//        assignment of value of variables
        int a = 5;
        a = 100;
        int b = 10;
        b = 200;
        int c = 11;
        c = 300;
        String myName = "Calculator";
        myName = "Digital cal";


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(myName);
        addition();

    }

    public static void addition(){
// variable declare inside user define method its called local variable
        int x = 5;
        int y = 6;
        int z = x+y;
        System.out.println(z);

    }
}

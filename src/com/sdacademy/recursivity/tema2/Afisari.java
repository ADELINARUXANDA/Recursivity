
//Tipăriți „Hello Recursion” de 10 ori folosind recursivitatea.
public class Afisari {

    public static void afisare(String a,int  i) {
        if( i >= 10){
            return;
        }
        System.out.println(a);
        afisare(a, i++);
    }

    public static void main(String[] args) {

            afisare(" Hello Recursion" , 0 );

    }
}
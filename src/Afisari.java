
//Tipăriți „Hello Recursion” de 10 ori folosind recursivitatea.
public class Afisari {

    public void afisare (String a){
        System.out.println(a);
        //afisare(a);
    }

    public static void main(String[] args) {
        int i = 0;
        while (i < 10 )
        afisare (" Hello Recursion");
                i++;
    }
}


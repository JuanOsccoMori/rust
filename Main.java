public class Main {
    public static void main(String[] args){
        //Write code here!!
        addition(30,60, 80);

        Coche misCoches = new Coche();
        misCoches.addingCoches();
        misCoches.addingCoches();
        misCoches.addingCoches();
        misCoches.addingCoches();
        misCoches.addingCoches();
        System.out.println(misCoches.coches);
    }

    public static void addition(int a, int b, int c){
        int result;
        result = a + b + c;
        System.out.println(result);
    }
}

class Coche {
    //Mis coches
    public int coches = 0;

    //Agregar coches
    public void addingCoches(){
        this.coches++;
    }
}
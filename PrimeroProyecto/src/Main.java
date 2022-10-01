public class Main {
    public static void main(String[] args) {

        System.out.println("La Suma de los Numeros es: "+suma(5,5,5));


        Coche miCoche = new Coche();
        miCoche.UpPuertas();
        System.out.println("El numero de puertas es: "+miCoche.puertas);


    }

    //Primera Parte
    public static int suma(int a, int b, int c){

       return a+b+c;

    }

//Segunda parte
    public static class Coche{
        int puertas;

        public void UpPuertas(){
             this.puertas++;
        }
    }



    }

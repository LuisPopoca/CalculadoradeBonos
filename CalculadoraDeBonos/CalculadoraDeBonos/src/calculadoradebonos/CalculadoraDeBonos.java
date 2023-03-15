package calculadoradebonos;


public class CalculadoraDeBonos {
    int salario; // salario de una persona
        String mensajeDeBono;
    
    public void Bono(){
        salario= 50000;
                mensajeDeBono = "Bono = $" + (.02 * salario);
        System.out.println(mensajeDeBono);
        
    }

    public static void main(String[] args) {

         // especifica el bono de trabajo
        CalculadoraDeBonos bono = new CalculadoraDeBonos();
        bono.Bono();


    }

}



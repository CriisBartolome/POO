package FormaPatronTemplateMethodJava8;

public class Main {
    
    public static void main(String[] args) {
        Clase1Par clasePar = new Clase1Par();
        clasePar.metodoEsqueleto(2, 4);
        clasePar.metodoEsqueleto(3, 7);
        
        Clase2Impar claseimpar = new Clase2Impar();
        claseimpar.metodoEsqueleto(3, 7);
        claseimpar.metodoEsqueleto(2, 4);
    }

}

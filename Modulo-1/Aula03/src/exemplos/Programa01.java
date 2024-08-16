
public class Programa01 {

    public static void main(String[] args) {

        double altura = 3.0;
        double largura = 5.0;
        if (altura >= 0) {
            double area = altura * largura;

            System.out.println("Area: " + area);
        } else {
            System.out.println("Altura inválida");
        }

        System.out.println("Programa encerrado");

    }
}

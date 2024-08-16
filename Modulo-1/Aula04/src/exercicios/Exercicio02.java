package Testando;

public class Exercicio02 {

public static void main(String[] args) {
    
    int[] numbers = {1,2,4,8,9};
    boolean tentativa = false;

    for (int i = 0; i < numbers.length; i++) {     
        int x = i;   
        int j = i++;

        if (numbers[x] > numbers[j]) {
            System.out.println("Sua array não esta em ordem");
            break;            
        } else if (numbers[x] == numbers.length - 1) {
            tentativa = true;            
        }
    }

    if (tentativa) {
        System.out.println("Sua array esta em ordem");
    }
    
    
}


}

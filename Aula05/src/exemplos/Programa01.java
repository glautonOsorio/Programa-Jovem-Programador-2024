public class Programa01 {
    public static void main(String[] args) {

        int number = 46;
        int number2 = 64;

        int res = Add(number, number2);

        System.out.println(res);

    }

    public static int Add(int num1, int num2) {

        int result = num1 + num2;

        return result;
    }

    public static void Greetings(String name) {
        System.out.println("Bem vindo " + name);
    }

    public static double ArrayAverege(double[] nums) {

        double add = 0;

        for (int i = 0; i < nums.length; i++) {

            soma += nums[i];

        }

        double avarege = add/nums.length;

        return avarege;
    }

}

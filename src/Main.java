public class Main {
    public static void main(String[] args) {
        //DZ 1.5.1
        int[] numbers = new int [3];
        numbers [0] = 1;
        numbers [1] = 2;
        numbers [2] = 3;
        double[] fraction = {1.57, 7.654, 9.986};
        int[] weights = {90, 91, 93};

        //DZ 1.5.2
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers [i]);
            if (i != numbers.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("");

        for (int i = 0; i < fraction.length; i++) {
            System.out.print(fraction[i]);
            if (i != fraction.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");

        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (i != weights.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");

        //DZ 1.5.3
        for (int i = numbers.length - 1; i >=0; i--) {
            System.out.print(numbers [i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println("");

        for (int i = fraction.length - 1; i >= 0; i--) {
            System.out.print(fraction[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");

        for (int i = weights.length - 1; i >= 0 ; i--) {
            System.out.print(weights[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");

        //DZ 1.5.4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {//если элемент массива нечетный
                numbers [i]++;
            }
            System.out.print(numbers [i]);
            if (i != numbers.length - 1){
                System.out.print(", ");
            }
        }

    }
}
public class Main {
    public static void main(String[] args) {
        //DZ 1.5.1
        int [] numbers = new int []{1, 2, 3};// массив вес, состоит из 3-х элементов и внутри числа 1,2,3; первый элемент идет за индексом - 0
        float [] fraction = {1.57f, 7.654f, 9.986f};
        int [] weights = {90, 91, 93};

        //DZ 1.5.2
        System.out.print(numbers [0]);
        System.out.print(", " + numbers [1]);
        System.out.print(", " + numbers [2]);
        System.out.println("");
        System.out.print(fraction[0] + ", " + fraction[1] + ", " + fraction[2]);
        System.out.println("");
        System.out.print(weights [0] + ", " + weights [1] + ", " + weights [2]);
        System.out.println("");

        //DZ 1.5.3
        System.out.print(numbers [2] + ", " + numbers [1] + ", " + numbers [0]);
        System.out.println("");
        System.out.print(fraction [2] + ", " + fraction[1] + ", " + fraction[0]);
        System.out.println("");
        System.out.print(weights [2] + ", " + weights [1] + ", " + weights [0]);
        System.out.println("");

        //DZ 1.5.4
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i]%2 !=0) {
                System.out.print(numbers [i] + 1 + " ");

            }
        }

    }
}
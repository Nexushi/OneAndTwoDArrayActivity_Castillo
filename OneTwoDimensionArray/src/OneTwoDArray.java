public class OneTwoDArray {
    public static void main(String[] args) {
        String[] names = {"Nex", "Mark", "Matt", "Zach", "Terrence", "Ryan", "Rachael", "Zia", "Isabel", "Ergio"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int[] numbers = {5, 10, 3, 7, 12, 9, 15, 4, 6, 8, 11, 2, 13, 1, 14, 0, 16, 17, 18, 19};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of Numbers: " + sum);

        int[][] TwoDNumbers = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                {9, 10, 11}
        };

        for (int i = 0; i < TwoDNumbers.length; i++) {
            for (int j = 0; j < TwoDNumbers[i].length; j++) {
                System.out.print(TwoDNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
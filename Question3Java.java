public class Question3Java {
    public static void main(String[] args) {
        int[] arrayNumbers = {4,34,23,12,6,43,78,54,76,43};


        int nextValue;
        int maximumValue = arrayNumbers[0];
        for (int i = 0; i < (arrayNumbers.length - 1); ++i) {
            nextValue = arrayNumbers[i + 1];

            if (nextValue > maximumValue) {
                maximumValue = nextValue;
            }
        }

        System.out.print(maximumValue);
    }
}
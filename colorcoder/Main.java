package colorcoder;

public class Main {
    public static void main(String[] args) {
        // Test mapping from colors to number
        int pairNumber = ColorCodeMapper.getPairNumberFromColors(MajorColor.RED, MinorColor.GREEN);
        System.out.println("RED - GREEN Pair Number: " + pairNumber);

        // Test mapping from number to colors
        ColorPair pair = ColorCodeMapper.getColorsFromPairNumber(12);
        System.out.println("Pair Number 12 is: " + pair);
    }
}

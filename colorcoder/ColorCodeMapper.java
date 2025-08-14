package colorcoder;

public class ColorCodeMapper {

    public static int getPairNumberFromColors(IndexProvider major, IndexProvider minor) {
        return major.getIndex() * MinorColor.values().length + minor.getIndex() + 1;
    }

    public static ColorPair getColorsFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        int majorIndex = zeroBasedPairNumber / MinorColor.values().length;
        int minorIndex = zeroBasedPairNumber % MinorColor.values().length;

        return new ColorPair(
            MajorColor.fromIndex(majorIndex),
            MinorColor.fromIndex(minorIndex)
        );
    }
}

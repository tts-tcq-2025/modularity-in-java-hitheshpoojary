package colorcoder;

public enum MinorColor  implements IndexProvider{
    BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);

    private final int index;

    MinorColor(int index) {
        this.index = index;
    }

    @Override
    public int getIndex() {
        return index;
    }

    public static MinorColor fromIndex(int index) {
        for (MinorColor color : MinorColor.values()) {
            if (color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
}

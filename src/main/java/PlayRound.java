public class PlayRound {
    private static String name;


    public PlayRound(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        PlayRound.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

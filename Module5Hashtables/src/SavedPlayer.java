public class SavedPlayer {
    private String key;
    private Player value;

    public SavedPlayer(Player value, String key) {
        this.value = value;
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public Player getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "SavedPlayer{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}

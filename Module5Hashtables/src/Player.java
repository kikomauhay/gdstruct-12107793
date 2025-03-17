import java.util.Objects;

public class Player {
    private int id;
    private String Username;
    private int level;

    public Player(int id, String Username, int level) {
        this.id = id;
        this.Username = Username;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", Username='" + Username + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && level == player.level && Objects.equals(Username, player.Username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Username, level);
    }
}

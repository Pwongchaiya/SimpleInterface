public class Player implements Character{

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String username(String name) {
        return name+" is being displayed.";
    }

    @Override
    public String getCharacterHighScore() {
        return "Highest kills: 10000";
    }

    @Override
    public void openCharacterHistory() {
        System.out.println(username(name)+
                "\n"+getCharacterHighScore());
    }
}

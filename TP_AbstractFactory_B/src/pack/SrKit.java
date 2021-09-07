package pack;

public class SrKit implements PersistKit{
    @Override
    public HighScore makeKit() {
        return new HighScoreSr();
    }
}

package pack;

public class JdbcKit implements PersistKit{
    @Override
    public HighScore makeKit() {
        return new HighScoreJdbc();
    }
}

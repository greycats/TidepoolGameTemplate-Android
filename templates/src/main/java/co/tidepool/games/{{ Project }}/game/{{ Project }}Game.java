package co.tidepool.games.{{ Project }}.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import co.tidepool.game.TidePoolGame;
import co.tidepool.game.logic.GameProgress;
import co.tidepool.games.{{ Project }}.screen.{{ Project }}Screen;

/**
 * Created by huangzunjian on 9/10/14.
 */
public class {{ Project }}Game extends TidePoolGame {
    private {{ Project }}Screen mGameScreen;

    public {{ Project }}Game(GameProgress gameProgress) {
        super(gameProgress);
    }

    // used by all screens
    public SpriteBatch batcher;

    @Override
    public void create () {
        mGameScreen = new {{ Project }}Screen(this);
        setScreen(mGameScreen);
        startGame();
    }

    public void startGame() {

    }

    public void pauseGame() {
        mGameScreen.pauseGame();
    }

}

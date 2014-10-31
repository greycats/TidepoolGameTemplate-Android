package co.tidepool.games.{{ Project }}.screen;

import android.util.Log;
import com.badlogic.gdx.Gdx;
import javax.microedition.khronos.opengles.GL10;
import co.tidepool.games.{{ Project }}.game.{{ Project }}Game;
import co.tidepool.screen.GameScreen;

/**
 * Created by huangzunjian on 9/10/14.
 */
public class {{ Project }}Screen extends GameScreen {

    private static final String TAG = "{{ Project }}Screen";

    public {{ Project }}Screen({{ Project }}Game game) {
        super(game);
    }

    public void startGame() {
        super.startGame();
    }

    public void pauseGame() {
        mState = GAME_PAUSED;
    }

    public void onBackPressed() {
        Log.d(TAG, "onBackPressed");
    }

    public void draw(float delta) {
        Gdx.gl.glClearColor(0.24f, 0.36f, 0.44f, 1.00f);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        mStage.act(delta);
        mStage.draw();
        mGuiCam.update();
    }

    public void update(float delta) {
    }
}

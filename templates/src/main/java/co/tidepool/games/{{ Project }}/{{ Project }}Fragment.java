package co.tidepool.games.{{ Project }};

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.android.AndroidFragmentApplication;

import co.tidepool.game.GameLifecycle;
import co.tidepool.game.logic.GameProgress;
import co.tidepool.games.{{ Project }}.game.{{ Project }}Game;

/**
 * Created by huangzunjian on 9/10/14.
 */
public class {{ Project }}Fragment extends AndroidFragmentApplication implements GameLifecycle {
    private {{ Project }}Game mGame;
    private GameProgress gameProgress;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mGame == null) {
            mGame = new {{ Project }}Game(gameProgress);
        }

        return initializeForView(mGame);
    }

    public void onStartGame() {
        if (mGame != null) {
            mGame.startGame();
        }
    }

    public void onPauseGame() {
        mGame.pause();
    }

    public void onStopGame() {
        mGame.stopGame();
        Gdx.app.exit();
    }

    public void onResumeGame() {
        mGame.resume();
    }

    public GameProgress getGameProgress() {
        return gameProgress;
    }

    public void setGameProgress(GameProgress gameProgress) {
        this.gameProgress = gameProgress;
    }

}

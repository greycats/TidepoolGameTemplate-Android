package co.tidepool.games.{{ Project }}.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by huangzunjian on 9/15/14.
 */
public class {{ Project }}Assets {

    public static Texture loadTexture (String file) {
        return new Texture(Gdx.files.internal(file));
    }

    public static void loadAllAssets() {

    }
}

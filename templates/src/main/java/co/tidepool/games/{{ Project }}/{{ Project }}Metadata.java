package co.tidepool.games.{{ Project }};

import java.util.ArrayList;

import co.tidepool.game.GameInstruction;
import co.tidepool.game.GameMetadata;
import co.tidepool.science.cognition.CognitivePercentages;

/**
 * Created by huangzunjian on 9/10/14.
 */
public class {{ Project }}Metadata implements GameMetadata {

    private static final String canonicalName = "Defuse";

    public String getCanonicalName() {
        return canonicalName;
    }
    public int getDisplayName() {
        return R.string.{{ Project }}_display_name;
    }
    public int getShortDescription() {
        return R.string.{{ Project }}_short_desc;
    }
    public int getLongDescription() {
        return R.string.{{ Project }}_long_desc;
    }
    public String getKey() {
        return "focus";
    }

    public CognitivePercentages getCognitivePercentages() {
        CognitivePercentages percentages = new CognitivePercentages();
        percentages.adaptability = 0.0;
        percentages.focus = 0;
        percentages.memory = 1;
        percentages.reasoning = 0;
        percentages.speed = 0.0;

        return percentages;
    }

    public int getImage() {
        return R.drawable.{{ Project }}bg_blur;
    }

    public ArrayList<GameInstruction> getInstructions() {
        ArrayList<GameInstruction> list = new ArrayList<GameInstruction>(2);
        list.add(new GameInstruction(R.string.{{ Project }}_instruction_1,
                R.drawable.howtoplay_{{ Project }}1));

        list.add(new GameInstruction(R.string.{{ Project }}_instruction_2,
                R.drawable.howtoplay_{{ Project }}2));
        return list;
    }
}

package vizdoom;

import java.util.ArrayList;
import java.util.List;
import vizdoom.*;

public class GameState{
    public int number;
    public int[] gameVariables;

    public byte[] screenBuffer;
    public byte[] depthBuffer;
    public byte[] labelsBuffer;
    public byte[] automapBuffer;

    public Label[] labels;

    GameState(int number,
        int[] gameVariables,
        byte[] screenBuffer,
        byte[] depthBuffer,
        byte[] labelsBuffer,
        byte[] automapBuffer,
        Label[] labels){

        this.number = number;
        this.gameVariables = gameVariables;
        this.screenBuffer = screenBuffer;
        this.depthBuffer = depthBuffer;
        this.labelsBuffer = labelsBuffer;
        this.automapBuffer = automapBuffer;
        this.labels = labels;
    }
}

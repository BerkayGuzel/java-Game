package project.planettrade;

import project.gameengine.TurnBasedGameEngine;
import project.gameengine.base.GameContext;
import project.gameengine.base.Player;

import java.util.ArrayList;

public class GameInfo implements GameContext {
    public GameInfo() {
    }




    public void showPlayerInfo(BasePlayer player) {
        System.out.println(player.toString());
    }


}

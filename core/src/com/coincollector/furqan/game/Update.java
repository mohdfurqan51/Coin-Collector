package com.coincollector.furqan.game;

import com.badlogic.gdx.utils.viewport.Viewport;

public class Update {

    Constants.Difficulty difficulty;
    Viewport viewport;

    public Update(Viewport viewport, Constants.Difficulty difficulty) {
        this.difficulty = difficulty;
        this.viewport = viewport;
    }

    public void update() {
        if (difficulty.label.equals("Easy")) {
            Constants.gravity = 0.4f;
            Constants.velocity = 0;
            Constants.coinSpeed = 4;
            Constants.bombSpeed = 8;
        } else if (difficulty.label.equals("Medium")) {
            Constants.gravity = 0.8f;
            Constants.velocity = 0;
            Constants.coinSpeed = 8;
            Constants.bombSpeed = 16;
        } else {
            Constants.gravity = 1.2f;
            Constants.velocity = 0;
            Constants.coinSpeed = 16;
            Constants.bombSpeed = 32;
        }
    }
}

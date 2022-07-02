package com.coincollector.furqan.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;

public class Constants {

    public static final float WORLD_SIZE = 10.0f;
    public static final Color BACKGROUND_COLOR = Color.BLUE;

    public static final String EASY_LABEL = "Easiest";
    public static final String MEDIUM_LABEL = "Medium";
    public static final String HARD_LABEL = "Hard";


    public static int coinSpeed = 0;
    public static int bombSpeed = 0;
    public static float velocity = 0;
    public static float gravity = 0;

    // TODO: Add constants for the color of each difficulty select circle
    public static final Color EASY_COLOR = new Color(0.2f, 0.2f, 1, 1);
    public static final Color MEDIUM_COLOR = new Color(0.5f, 0.5f, 1, 1);
    public static final Color HARD_COLOR = new Color(0.7f, 0.7f, 1, 1);
    public static final float DIFFICULTY_WORLD_SIZE = 480.0f;

    // TODO: Add constant for the radius of the difficulty select "buttons"
    public static final float DIFFICULTY_BUBBLE_RADIUS = DIFFICULTY_WORLD_SIZE / 9;

    // TODO: Add constant for the scale of the difficulty labels (1.5 works well)
    public static final float DIFFICULTY_LABEL_SCALE = 1.5f;

    // TODO: Add Vector2 constants for the centers of the difficulty select buttons
    public static final Vector2 EASY_CENTER = new Vector2(DIFFICULTY_WORLD_SIZE / 4, DIFFICULTY_WORLD_SIZE / 2);
    public static final Vector2 MEDIUM_CENTER = new Vector2(DIFFICULTY_WORLD_SIZE / 2, DIFFICULTY_WORLD_SIZE / 2);
    public static final Vector2 HARD_CENTER = new Vector2(DIFFICULTY_WORLD_SIZE * 3 / 4, DIFFICULTY_WORLD_SIZE / 2);

    public enum Difficulty {
        EASY(Constants.gravity = 0.4f,
                Constants.velocity = 0,
                Constants.bombSpeed = 8,
                Constants.coinSpeed = 4, EASY_LABEL),
        MEDIUM(Constants.gravity = 0.8f,
                Constants.velocity = 0,
                Constants.bombSpeed = 16,
                Constants.coinSpeed = 8, MEDIUM_LABEL),
        HARD(Constants.gravity = 1.2f,
                Constants.velocity = 0,
                Constants.bombSpeed = 32,
                Constants.coinSpeed = 16, HARD_LABEL);

        float gravity;
        float velocity;
        int bombSpeed;
        int coinSpeed;
        String label;
        Difficulty(float gravity, float velocity, int bombSpeed, int coinSpeed, String label) {
            this.gravity = gravity;
            this.velocity = velocity;
            this.bombSpeed = bombSpeed;
            this.coinSpeed = coinSpeed;
            this.label = label;
        }
    }
}

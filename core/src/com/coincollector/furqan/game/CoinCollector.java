package com.coincollector.furqan.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.coincollector.furqan.game.screens.DifficultyScreen;
import com.coincollector.furqan.game.screens.GameScreen;

public class CoinCollector extends Game {
	public SpriteBatch batch;

	@Override
	public void create() {
		showDifficultyScreen();
	}

	public void showDifficultyScreen() {
		setScreen(new DifficultyScreen(this));
	}

	public void showGameScreen(Constants.Difficulty difficulty) {
		setScreen(new GameScreen(this, difficulty));
	}
}



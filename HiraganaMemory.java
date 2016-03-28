package com.anime_sekai;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HiraganaMemory extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture backgroundImage;
	private Texture tile_chi;
	private Texture[] tiles;
	private TilePosition[] positions;

	@Override
	public void create() {
		batch = new SpriteBatch();
		backgroundImage = new Texture("background.png");

		tiles = new Texture[20];
		positions = new TilePosition[20];

		tiles[0] = new Texture("tiles/chi-hiragana.png");
		positions[0].setPositionX(20);
		positions[0].setPositionY(480);
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(backgroundImage, 0, 0);
		batch.draw(tiles[0], positions[0].getPositionX(), positions[0].getPositionY());
		batch.end();
	}
}

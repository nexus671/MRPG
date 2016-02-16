package com.truth.neogames;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.truth.neogames.Adam.Items.Generators.GearGenerator;
import com.truth.neogames.Ahmane.Entities.SubTypes.Player;
import com.truth.neogames.Ahmane.Professions.Profession;
import com.truth.neogames.Enums.Race;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	public static void main(String[] args) {
		Player p = new Player("Adam", Race.HUMAN, "Male", new Profession(), new Sprite());
		GearGenerator generator = new GearGenerator();

		for (int i = 0; i < 10; i++)
			System.out.println(generator.getRandom());
	}

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}

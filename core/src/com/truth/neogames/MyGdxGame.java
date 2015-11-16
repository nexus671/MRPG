package com.truth.neogames;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.truth.neogames.Ahmane_the_scrub.Entities.SubTypes.Player;
import com.truth.neogames.Enums.Race;
import com.truth.neogames.Adam.Items.Consumables.SubTypes.Food;
import com.truth.neogames.Adam.Items.Item;
import com.truth.neogames.Ahmane_the_scrub.Professions.Profession;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	public static void main(String[] args) {
		Player p = new Player("Adam", Race.HUMAN, "Male", new Profession(), new Sprite());
		p.getInventory().add(new Food(50));
		System.out.println(p.getInventory().getInv()[0]);
		Item food = p.getInventory().getInv()[0];
		Food f = (Food) food;
		p.consume(f);
		System.out.println(p.getInventory().getInv()[0]);

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

package com.truth.neogames;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.truth.neogames.Adam.Items.GearPackage.Wearables.Jewelry;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.MonsterStatsPackage.MonsterStats;
import com.truth.neogames.Ahmane_the_scrub.Entities.SubTypes.Monster;
import com.truth.neogames.Ahmane_the_scrub.Entities.SubTypes.Player;
import com.truth.neogames.Ahmane_the_scrub.Professions.Profession;
import com.truth.neogames.Enums.Affixes.JewelryGem;
import com.truth.neogames.Enums.Affixes.JewelryMetal;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.Race;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	public static void main(String[] args) {
		Player p = new Player("Adam", Race.HUMAN, "Male", new Profession(), new Sprite());
		Monster m = new Monster(true, new MonsterStats(1, 10));

		//Create equipment
        System.out.println(p.getStats());
        p.equip(new Jewelry(JewelryMetal.GOLD, JewelryGem.DIAMOND, EntityStatName.STRENGTH));
        System.out.println(p.getStats());
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

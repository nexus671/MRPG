package com.truth.neogames;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.truth.neogames.Adam.HoldingSystems.Inventory;
import com.truth.neogames.Adam.HoldingSystems.WornGear;
import com.truth.neogames.Adam.Items.GearPackage.Weapons.Weapon;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.MonsterStatsPackage.MonsterStats;
import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WeaponStatsPackage.WeaponStat;
import com.truth.neogames.Adam.StatsPackage.GearStatsPackage.WeaponStatsPackage.WeaponStats;
import com.truth.neogames.Ahmane_the_scrub.Entities.SubTypes.Monster;
import com.truth.neogames.Ahmane_the_scrub.Entities.SubTypes.Player;
import com.truth.neogames.Ahmane_the_scrub.EnvironmentPackage.BattleGrid;
import com.truth.neogames.Enums.Race;
import com.truth.neogames.Ahmane_the_scrub.Professions.Profession;
import com.truth.neogames.Enums.WeaponStatName;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	public static void main(String[] args) {
		Player p = new Player("Adam", Race.HUMAN, "Male", new Profession(), new Sprite());
		Monster m = new Monster(true, new MonsterStats(1, 10));

		//Create equipment
		Weapon sword;
        WeaponStats stats;

        p.setWornGear(new WornGear());
        p.setInventory(new Inventory());

		m.setName("Skeleton");
		m.setDescription("A bony menace!");
		m.setRace(Race.UNDEAD);
		m.setSex("Male");
		m.setPos(10, 10);
		p.setPos(9, 10);
		p.setDescription("It's you!");

        BattleGrid b = new BattleGrid();
        b.addEntity(p);
        b.addEntity(m);

        p.moveForward(b);
        m.moveLeft(b);

        System.out.println(p.getxPos() + " " + p.getyPos());
        System.out.println(m.getxPos() + " " + m.getyPos());

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

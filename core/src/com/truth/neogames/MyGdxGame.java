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
import com.truth.neogames.Ahmane_the_scrub.Entities.SubTypes.Monster;
import com.truth.neogames.Ahmane_the_scrub.Entities.SubTypes.Player;
import com.truth.neogames.Ahmane_the_scrub.EnvironmentPackage.BattleGrid;
import com.truth.neogames.Ahmane_the_scrub.Professions.Profession;
import com.truth.neogames.Enums.Affixes.Material;
import com.truth.neogames.Enums.Affixes.WeaponSuffix;
import com.truth.neogames.Enums.Race;
import com.truth.neogames.Enums.WeaponType;

import java.util.Scanner;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	public static void main(String[] args) {
		Player p = new Player("Adam", Race.HUMAN, "Male", new Profession(), new Sprite());
		Monster m = new Monster(true, new MonsterStats(1, 10));

		//Create equipment
        Weapon sword = new Weapon(Material.BRONZE, WeaponSuffix.NONE, WeaponType.SWORD);

        p.setWornGear(new WornGear());
        p.setInventory(new Inventory());
        p.equip(sword);

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

		int choice = 1;
		Scanner sc = new Scanner(System.in);
		while (choice != 0) {
            b.showGrid();
            System.out.println("What would you like to do? Move(1) Attack(2) Inspect(3) Quit(0)");
            choice = sc.nextInt();
			if (choice == 1) {
                int x, y;
                System.out.println("What X Cord?");
				x = sc.nextInt();
				System.out.println("What Y Cord?");
				y = sc.nextInt();
				p.move(b, x, y);
			}
		}
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

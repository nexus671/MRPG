package com.truth.neogames;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.truth.neogames.Adam.Items.Generators.GearGenerator;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStat;
import com.truth.neogames.Adam.StatsPackage.EntityStatsPackage.EntityStats;
import com.truth.neogames.Ahmane.Battle.Battle;
import com.truth.neogames.Ahmane.Battle.TempUI;
import com.truth.neogames.Ahmane.Entities.SubTypes.Monster;
import com.truth.neogames.Ahmane.Entities.SubTypes.Player;
import com.truth.neogames.Ahmane.EnvironmentPackage.BattleGrid;
import com.truth.neogames.Ahmane.Professions.Barbarian;
import com.truth.neogames.Ahmane.Professions.Profession;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.RaceName;
import com.truth.neogames.Enums.WornSlot;

import java.util.ArrayList;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	public static void main(String[] args) {
        ArrayList<EntityStat> stats = new ArrayList<EntityStat>();
        stats.add(new EntityStat(EntityStatName.STRENGTH, 20));


         Player p = new Player("Adam", RaceName.HUMAN, "Male", new Profession(), new Sprite());
        p.setProfession(new Barbarian(p));
        Monster m = new Monster(true, new EntityStats(1));
        m.setName("Skeleton");
        m.setDescription("A bony menace!");
        p.setPos(0, 0);
        m.setPos(1, 0);
        Monster[] monsters = {m};
        GearGenerator generator = new GearGenerator();
         WornSlot[] slots = {WornSlot.HEAD, WornSlot.NECK, WornSlot.CHEST, WornSlot.MAINHAND, WornSlot.OFFHAND, WornSlot.GLOVES, WornSlot.RING, WornSlot.LEGS, WornSlot.FEET};
        for (WornSlot slot : slots) {
            p.equip(generator.getRandom(1, slot));
        }
        System.out.println(p.getWornGear());
        BattleGrid grid = new BattleGrid();
        grid.addEntity(p);
        grid.addEntity(m);
        Battle b = new Battle(p, monsters, grid);
        System.out.println("Skeleton Health: " + m.getStats().getHealth().getCurrent());
        new TempUI(b);
            grid.showGrid();
        System.out.println("Skeleton Health: " + m.getStats().getHealth().getCurrent());

    }

	@Override
	public void create() {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}

package com.truth.neogames;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.truth.neogames.Battle.Battle;
import com.truth.neogames.Battle.TempUI;
import com.truth.neogames.Entities.SubTypes.Monster;
import com.truth.neogames.Entities.SubTypes.Player;
import com.truth.neogames.Enums.EntityStatName;
import com.truth.neogames.Enums.RaceName;
import com.truth.neogames.Enums.WornSlot;
import com.truth.neogames.EnvironmentPackage.BattleGrid;
import com.truth.neogames.Items.Generators.GearGenerator;
import com.truth.neogames.Professions.Barbarian;
import com.truth.neogames.Professions.Profession;
import com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStat;
import com.truth.neogames.StatsPackage.EntityStatsPackage.EntityStats;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The type My gdx game.
 */
public class MyGdxGame extends ApplicationAdapter {
    /**
     * The Batch.
     */
    SpriteBatch batch;
    /**
     * The Img.
     */
    Texture img;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Collection<EntityStat> stats = new ArrayList<EntityStat>();
        stats.add(new EntityStat(EntityStatName.STRENGTH, 20.0));


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
        //System.out.println(p.getWornGear());
        System.out.println(p.getWornGear().getFromSlot(WornSlot.CHEST).getDescription());
        BattleGrid grid = new BattleGrid();
        grid.addEntity(p);
        grid.addEntity(m);
        Battle b = new Battle(p, monsters, grid);
        System.out.println("Skeleton Health: " + m.getStats().getHealth().getCurrent());
        new TempUI(b);
        System.out.println("Skeleton Health: " + m.getStats().getHealth().getCurrent());

    }

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1.0F, 0.0F, 0.0F, 1.0F);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0.0F, 0.0F);
        batch.end();
    }

    @Override
    public String toString() {
        return "MyGdxGame{" +
                "batch=" + batch +
                ", img=" + img +
                '}';
    }
}

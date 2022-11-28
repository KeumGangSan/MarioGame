package com.s409022mg.mario.tile;

import java.awt.Color;
import java.awt.Graphics;

import com.s409022mg.mario.Game;
import com.s409022mg.mario.Handler;
import com.s409022mg.mario.Id;

public class Wall extends Tile {
	public Wall(int x, int y, int width, int height, boolean solid, Id id, Handler handler) {
		super(x, y, width, height, solid, id, handler);
	}

	public void render(Graphics g) {
		g.drawImage(Game.grass.getBufferedImage(), x, y, width, height, null);
	}

	public void tick() {
		
	}
}

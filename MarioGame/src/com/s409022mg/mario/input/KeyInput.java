package com.s409022mg.mario.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.s409022mg.mario.Game;
import com.s409022mg.mario.entity.Entity;

public class KeyInput implements KeyListener {

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		for (Entity en:Game.handler.entity) {
			switch (key) {
			case KeyEvent.VK_W:
				if (!en.jumping) {
					en.jumping = true;
					en.gravity = 10.0;
				}
				break;
			case KeyEvent.VK_A:
				en.setVelX(-5);
				break;
			case KeyEvent.VK_D:
				en.setVelX(5);
				break;
			}
		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		for (Entity en:Game.handler.entity) {
			switch (key) {
			case KeyEvent.VK_W:
				en.setVelY(0);
				break;
			case KeyEvent.VK_S:
				en.setVelY(0);
				break;
			case KeyEvent.VK_A:
				en.setVelX(0);
				break;
			case KeyEvent.VK_D:
				en.setVelX(0);
				break;
			}
		}
	}
	
	public void keyTyped(KeyEvent e) {

	}
}

package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Texto {
    private BitmapFont font;

    public Texto() {
        font = new BitmapFont();
        font.setColor(1, 0, 0, 1);
        font.getData().setScale(2); 
        
    }

    public void mostrarTexto(SpriteBatch batch, String texto, float x, float y) {
        font.draw(batch, texto, x, y);
    }

    public void dispose() {
        font.dispose();
    }
}
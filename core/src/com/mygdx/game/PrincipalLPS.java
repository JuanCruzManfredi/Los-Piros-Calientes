package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class PrincipalLPS extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Sprite LPS;
	Menu menu;
	Texto texto;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("yoreboludo.jpg");
		LPS = new Sprite(img);
		menu = new Menu();
		texto = new Texto();
		
	}

	@Override
	public void render() {
	    ScreenUtils.clear(0f, 1, 1, 1);
	    batch.begin();
	    batch.draw(LPS, Gdx.graphics.getWidth() / 2 - LPS.getWidth() / 2, Gdx.graphics.getHeight() / 2 - LPS.getHeight() / 2);

	    System.out.println("X es: " + Gdx.graphics.getWidth() + " Y es :" + Gdx.graphics.getHeight()) ;
	    
	    texto.mostrarTexto(batch, "AHI SE LO MANDAMOS GRACIAS PRODUCCIONES", 0, 450); 
	    texto.mostrarTexto(batch, "QUE RICO", 0, 250); 


	    batch.end();
	    
	    menu.mostrarOpciones();
        int opcionSeleccionada = menu.obtenerOpcionSeleccionada();

        if (opcionSeleccionada == 1) {
        	
        } else if (opcionSeleccionada == 2) {
        	
        } else if (opcionSeleccionada == 3) {

        }
    }
	    

	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
        texto.dispose();
	}
	
	
}



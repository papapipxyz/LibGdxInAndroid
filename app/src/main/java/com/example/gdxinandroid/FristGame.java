package com.example.gdxinandroid;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import javax.microedition.khronos.opengles.GL10;

public class FristGame extends Game {

    private SpriteBatch batch;
    private BitmapFont font;
    private int centerWidth = 0;
    private int centerHeight = 0;

    @Override
    public void create() {
        centerWidth = Gdx.graphics.getWidth() / 2;
        centerHeight = Gdx.graphics.getHeight() / 2;
        batch = new SpriteBatch();
        font = new BitmapFont();
        font.setColor(Color.RED);
        font.getData().setScale(2);
    }

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();
        font.dispose();
    }

    @Override
    public void render() {
        super.render();
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

        batch.begin();
        font.draw(batch, "Test LibGdx Android", centerWidth, centerHeight);
        batch.end();
    }
}
package com.flappybird.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class flappyBird extends ApplicationAdapter {
    SpriteBatch batch;
    Background bg;
    Bird bird;
    Obstacles obstacles;

    @Override
    public void create() {
        batch = new SpriteBatch();
        bg = new Background();
        bird = new Bird();
        obstacles = new Obstacles();
    }

    @Override
    public void render() {
        update();
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        bg.render(batch);
        bird.render(batch);
        obstacles.render(batch);
        batch.end();
    }

    public void update() {
        bg.update();
        bird.update();
        obstacles.update();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}

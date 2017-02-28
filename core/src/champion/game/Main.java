package champion.Game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Main extends ApplicationAdapter {
	
	Animation<TextureRegion> walkAnimation;
	Texture walkSheet;
	SpriteBatch spriteBatch;
	
	float stateTime;
	
	@Override
	public void create () {
		
		walkSheet = new Texture(Gdx.files.internal("sprites/champions/male1Walk.png"));
		
		TextureRegion [][] tmp = TextureRegion.split(walkSheet, 200, 200);
		
		TextureRegion [] walkFrames = new TextureRegion[7];
		int index = 0;
		for (int i = 0; i < 1; i++){
			for(int j = 0; j < 7; j++){
				walkFrames[index++] = tmp[i][j];
			}
		}
		
		walkAnimation = new Animation<TextureRegion>(0.1f, walkFrames);
		
		spriteBatch = new SpriteBatch();
		stateTime = 0f;
		
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stateTime += Gdx.graphics.getDeltaTime();
		
		TextureRegion currentFrame = walkAnimation.getKeyFrame(stateTime, true);
		spriteBatch.begin();
		spriteBatch.draw(currentFrame, 50, 50);
		spriteBatch.end();
	}
	
	@Override
	public void dispose () {
		spriteBatch.dispose();
		walkSheet.dispose();
	}
}

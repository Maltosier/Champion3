package champion.Objects;


public class Champion {
	
	private String name;
	private int hp;
	private int stam;
	private int maxstam;
	private int maxhp;
	private int radius;
	private int x;
	private int y;
	private float facingDir;
	private boolean invincible;
	
	//private SpriteSheet spriteSheet;
	//private Animation anim;
	
	public Champion (/*SpriteSheet spriteSheet*/){
		
		this.hp = 100;
		this.maxhp = 100;
		this.stam = 100;
		this.maxstam = 100;
		this.x = 0;
		this.y = 0;
		this.facingDir = 0;
		this.invincible = false;
		//this.spriteSheet = spriteSheet;
		//this.anim = new Animation(spriteSheet, 100);
		//this.radius = this.anim.getHeight()/2;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public float getFacingDir() {
		return facingDir;
	}

	public void setFacingDir(float facingDir) {
		this.facingDir = facingDir;
	}

	public void setStam(int stam) {
		this.stam = stam;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setInvincible(boolean invincible) {
		this.invincible = invincible;
	}
/*
	public void setSpriteSheet(SpriteSheet spriteSheet) {
		this.spriteSheet = spriteSheet;
	}

	public void setAnim(Animation anim) {
		this.anim = anim;
	}
*/
	public int getStam(){
		return this.stam;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public float getDir(){
		return this.facingDir;
	}
	
	public boolean isInvincible(){
		return this.invincible;
	}
/*	
	public SpriteSheet getSpriteSheet(){
		return this.spriteSheet;
	}
	
	public Animation getAnim(){
		return this.anim;
	}
*/	
	
	public int getMaxstam() {
		return maxstam;
	}


	public void setMaxstam(int maxstam) {
		this.maxstam = maxstam;
	}


	public int getMaxhp() {
		return maxhp;
	}


	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	public void damageBy(int amount){
		this.hp-=amount;
	}
	
	public void healBy(int amount){
		this.hp+=amount;
	}
	
	public void shiftX(int a){
		this.x = this.x+a;
	}
	
	public void shiftY(int a){
		this.y = this.y+a;
	}
	/*	
	public void draw(Graphics g){
		g.drawAnimation(this.anim, this.x-this.radius, this.y-this.radius);
	}
	
	public void showHitbox(Graphics g){
		g.drawOval(this.x-this.radius, this.y-this.radius, this.radius*2, this.radius*2);	
	}
*/	
}

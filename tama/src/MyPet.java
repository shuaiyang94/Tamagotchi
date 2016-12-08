
public class MyPet {
	private String name;
	private String gender;
	private int age;
	private int hunger;
	private int energy;
	private int health;
	private String period;
	/*private boolean isDirty;
	private boolean isSleepy;
	private boolean isSick;
	private boolean isDead;*/
	
	public MyPet() {
		this.age=1;
		this.hunger=100;
		this.energy=100;
		this.health=100;
		this.period="enfant";
	}
	
	// setters
	public void setName(String name) {
		this.name=name;
	}
	
	public void setPeriod(String period) {
		this.period=period;
	}
	
	public void setGender(String gender) {
		this.gender=gender;		
	}
	
	public void setAge(int age) {
		this.age=age;		
	}
	
	public void setEnergy(int energy) {
		this.energy=energy;		
	}
	
	public void setHealth(int health) {
		this.health=health;		
	}
	
	//getters
	public String getName() {
		return this.name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getPeriod() {
		return this.period;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getHunger() {
		return this.hunger;
	}
	
	public int getEnergy() {
		return this.energy;
	}
	
	public int getHealth() {
		return this.health;
	}
	
}

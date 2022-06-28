package mod007;

public abstract class Animal {
	public String type; //포유류, 조류, 양서류, 파충류
	public boolean eatable;  // 먹을 수 있는가 true/false
	
	public abstract void makeSound();
}


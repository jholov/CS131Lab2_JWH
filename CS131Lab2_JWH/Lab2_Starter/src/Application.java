
public class Application {

	public static void main(String[] args) {
		
		//testing empty-argument constructor
		Wizard Harry = new Wizard();
		System.out.println(Harry);
		
		//testing preferred constructor and setter for name
		Wizard Gandalf = new Wizard("The Gray");
		System.out.println(Gandalf);
		
		//testing getName
		System.out.println(Gandalf.getName());
		
		//testing setters and getters for Health
		Gandalf.setHealth(50);
		System.out.println(Gandalf.getHealth());
		
		//testing setKey and getKey when if statement is met
		Gandalf.setKey(2);
		System.out.println(Gandalf.getKey());
		
		//testing setKey and getKey when if statement is not met
		Gandalf.setKey(3);
		System.out.println(Gandalf.getKey());
		
		//testing setters and getters for locked
		Gandalf.setLocked(true);
		System.out.println(Gandalf.isLocked());
		
		//testing lock method when if statement is met
		Gandalf.lock(2);
		System.out.println(Gandalf.isLocked());
		
		//testing lock method when if statement is not met
		Gandalf.lock(3);
		System.out.println(Gandalf.isLocked());
		
		//testing unlock method when if statement is met
		Gandalf.unlock(2);
		System.out.println(Gandalf.isLocked());
		
		//testing unlock method when if statement is not met
		Gandalf.unlock(3);
		System.out.println(Gandalf.toString());
		
		//testing takeDamage method if no damage taken
		Gandalf.takeDamage(30);
		System.out.println(Gandalf.toString());		
		
		//testing takeDamage method if damage taken
		Gandalf.setLocked(false);
		Gandalf.takeDamage(25);
		System.out.println(Gandalf.toString());
		
	}//end main

}//end class

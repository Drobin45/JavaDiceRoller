import DiceRoller.Die;

public class DiceRoller {

	public static void main(String[] args) {
		Die d12 = new Die(12);
		Die d6 = new Die(6);
		/*
		System.out.println(d6.roll());
		System.out.println(d12.roll());
		
		System.out.println(d6.getValue());
		
		d6.setSides(100);
		System.out.println(d6.getSides());
		System.out.println(d6.roll());
		*/
		
		System.out.printf("Rolling a %d die. You rolled a %d! \n", d6.getSides(), d6.roll());
		System.out.printf("Rolling a %d die. You rolled a %d!", d12.getSides(), d12.roll());
	}

}

package certif;
class Bird {

	static {
		System.out.println("Bird bloco static");
	}
	{
		System.out.println("Bird bloco");
	}

	Bird() {
		System.out.println("Bird construtor");
	}
}

class Raptor extends Bird {

	public static int NUMERO = 3;

	static {
		System.out.println("Raptor bloco static");
	}
	{
		System.out.println("Raptor bloco");
	}

	Raptor() {
		System.out.println("Raptor construtor");
	}

}

public class Hawk extends Raptor {

	static {
		System.out.println("Hawk bloco static");
	}
	{
		System.out.println("Hawk bloco");
	}

	Hawk() {
		System.out.println("Hawk construtor");
	}

	public static void main(String[] args) {

		//		System.out.println(Raptor.NUMERO);
		new Hawk();
		new Hawk();
	}
}

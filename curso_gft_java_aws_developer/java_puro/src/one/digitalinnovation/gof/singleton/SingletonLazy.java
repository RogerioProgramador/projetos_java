package one.digitalinnovation.gof.singleton;

/**
 *  Singleton "preguiçoso"
 * @author rsiqueir
 *
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getIntencia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}

package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

/**
 * 
 * @author rsiqueir
 *
 */
public class Test {

	public static void main(String[] args) {
//		Testes relacionados ao Design Pattern Singleton.
		SingletonLazy lazy = SingletonLazy.getIntencia();
		System.out.println(lazy);
		lazy = SingletonLazy.getIntencia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
//		Testes relacionados ao Design Pattern Strategy.
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento normal = new ComportamentoNormal();
		
		Robo robo = new Robo();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		
//		Testes relacionados ao Design Pattern Facade.
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "11700444");
		
	}
}

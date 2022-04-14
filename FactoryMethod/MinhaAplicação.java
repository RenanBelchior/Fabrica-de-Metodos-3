package FactoryMethod;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinhaAplica��o {

	public static void main(String[] args) {
		Empresa ABClocal = new EmpresaOnibusUrbano();
		Empresa ABCinter = new EmpresaOnibusInterUrbano();
		
		Passagem passUrbano = ABClocal.emitePassagem("Niter�i","Petr�polis", new GregorianCalendar(2022, Calendar.MARCH, 10,11,0));
		Passagem passInterUrb = ABCinter.emitePassagem("Rio de Janeiro","S�o Paulo", new GregorianCalendar(2022, Calendar.MARCH, 10,11,0));		

		passUrbano.exibirDetalhes();
		passInterUrb.exibirDetalhes();
	}

}

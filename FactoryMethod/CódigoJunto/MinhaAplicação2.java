package FactoryMethod.CódigoJunto;

import java.util.Calendar;
import java.util.GregorianCalendar;

import FactoryMethod.Empresa;
import FactoryMethod.EmpresaOnibusInterUrbano;
import FactoryMethod.EmpresaOnibusUrbano;
import FactoryMethod.Passagem;

public class MinhaAplicação2 {

	public static void main(String[] args) {
		Empresa ABClocal = new EmpresaOnibusUrbano();
		Empresa ABCinter = new EmpresaOnibusInterUrbano();
		
		Passagem passUrbano = ABClocal.emitePassagem("Niterói","Petrópolis", new GregorianCalendar(2022, Calendar.MARCH, 10,11,0));
		Passagem passInterUrb = ABCinter.emitePassagem("Rio de Janeiro","São Paulo", new GregorianCalendar(2022, Calendar.MARCH, 10,11,0));		

		passUrbano.exibirDetalhes();
		passInterUrb.exibirDetalhes();
	}
 }

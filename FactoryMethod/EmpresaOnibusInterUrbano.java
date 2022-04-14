package FactoryMethod;

import java.util.Calendar;

public class EmpresaOnibusInterUrbano extends Empresa {
	 public Passagem emitePassagem(String origem, String destino, Calendar DataHoraSaida) {
		  return new PassBusInterUrbano(origem, destino, DataHoraSaida);	
 }
}


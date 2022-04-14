package FactoryMethod;

import java.util.Calendar;

public class EmpresaOnibusUrbano extends Empresa {
  public Passagem emitePassagem(String origem, String destino, Calendar DataHoraSaida) {
	  return new PassBusUrbano(origem, destino, DataHoraSaida);
  }
 }

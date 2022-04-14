package FactoryMethod;

import java.util.Calendar;

public class PassBusUrbano extends Passagem {
	public PassBusUrbano(String origem, String destino, Calendar DataHoraSaida) {
		super(origem, destino, DataHoraSaida);
	}
	public void exibirDetalhes() {
		System.out.println("Passagem de ônibus urbano -> " + this.getOrigem() + " para " + this.getDestino() + ", Data e Hora: " + super.data.format(this.getDataHoraSaida().getTime()));
	}

}

package FactoryMethod;

import java.util.Calendar;

public class PassBusInterUrbano extends  Passagem {
	public PassBusInterUrbano(String origem, String destino, Calendar DataHoraSaida) {
		super(origem, destino, DataHoraSaida);
	}
	public void exibirDetalhes() {
		System.out.println("Passagem de ônibus Interurbano -> " + this.getOrigem() + " para " + this.getDestino() + ", Data e Hora: " + super.data.format(this.getDataHoraSaida().getTime()));
	} 
}
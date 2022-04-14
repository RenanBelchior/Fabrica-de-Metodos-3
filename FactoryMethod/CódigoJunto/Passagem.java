package FactoryMethod.CódigoJunto;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Passagem {
	private String origem;
	private String destino;
	private Calendar DataHoraSaida;
	
	protected SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyy HH:mm");
	
	public Passagem(String origem, String destino, Calendar DataHoraSaida) {
		this.setOrigem(origem);
		this.setDestino(destino);
		this.setDataHoraSaida(DataHoraSaida);
	}
	public abstract void exibirDetalhes();
	
	
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public Calendar getDataHoraSaida() {
		return DataHoraSaida;
	}
	public void setDataHoraSaida(Calendar dataHoraSaida) {
		this.DataHoraSaida = dataHoraSaida;
	}
	
	public abstract class Empresa {
	    public abstract Passagem emitePassagem(String origem, String destino, Calendar DataHoraSaida);
	    
	    public class EmpresaOnibusUrbano extends Empresa {
	   	 public Passagem emitePassagem(String origem, String destino, Calendar DataHoraSaida) {
	   		  return new PassBusUrbano(origem, destino, DataHoraSaida);	
	    }
	   	public class EmpresaOnibusInterurbano extends Empresa {
	   	  public Passagem emitePassagem(String origem, String destino, Calendar DataHoraSaida){
	   		  return new PassBusInterurbano(origem, destino, DataHoraSaida);
	   	  }
	   	 }
	    }
	   }
	public class PassBusUrbano extends Passagem {
		public PassBusUrbano(String origem, String destino, Calendar DataHoraSaida) {
			super(origem, destino, DataHoraSaida);
		}
		public void exibirDetalhes() {
			System.out.println("Passagem do Vôo Nacional para -> " + this.getOrigem() + " para " + this.getDestino() + ", Data e Hora: " + super.data.format(this.getDataHoraSaida().getTime()));
		}
       }
	
	public class PassBusInterurbano extends  Passagem {
		public PassBusInterurbano(String origem, String destino, Calendar DataHoraSaida) {
			super(origem, destino, DataHoraSaida);
		}
		public void exibirDetalhes() {
			System.out.println("Passagem do Vôo Internacional -> " + this.getOrigem() + " para " + this.getDestino() + ", Data e Hora: " + super.data.format(this.getDataHoraSaida().getTime()));
		} 
	   }
      }

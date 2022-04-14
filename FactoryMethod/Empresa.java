package FactoryMethod;

import java.util.Calendar;

public abstract class Empresa {
    public abstract Passagem emitePassagem(String origem, String destino, Calendar DataHoraSaida);
}

package model.ListaDeMovimientos;

import java.util.ArrayList;
import java.util.List;

public class Consumos {
    private List<Consumo> consumo = new ArrayList<Consumo>();
    public List<Consumo> getConsumo() {
        return consumo;
    }
    public void setConsumo(List<Consumo> consumo) {
        this.consumo = consumo;
    }
}
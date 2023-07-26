package Modelo;

public class guardaReferencias {
    Object[] referencia = new Object[10];
    int indice = 0;
    public void adicionar(Object cc) {
        referencia[indice] = cc;
        indice++;
    }
    public Object obtener(int indice) {
        return referencia[indice];
    }
}

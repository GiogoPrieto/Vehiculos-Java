import java.util.ArrayList;
public class CentroControl {

    private ArrayList<Vehiculo>lista;

    public CentroControl(){
        this.lista=new ArrayList<>();
    }

    public void registrarUnidad(Vehiculo v){
        lista.add(v);
    }

    public void monitorearFlota(){
        for(int i=0;i< lista.size();i++){
            lista.get(i).patronMovimiento();
        }
    }
}

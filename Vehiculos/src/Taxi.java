public class Taxi extends Vehiculo implements IConectable {
    public Taxi(int id){
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("El taxi sube pasajeros y recorre la ciudad");
    }

    @Override
    public void sincronizarGPS() {
        System.out.println("El gps del taxi está sincronizado");
    }
}
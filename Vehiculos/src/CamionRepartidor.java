public class CamionRepartidor extends Vehiculo {

    public CamionRepartidor(int id){
        super(id);
    }

    @Override
    public void patronMovimiento() {
        System.out.println("El camión recorre los destinos y deja mercaderia en cada uno de ellos");
    }
}

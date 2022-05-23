public class Cotizacion{
    private int numCotizacion;
    private String descripcionAuto;
    private double precio;
    private int porcentajeInicial;
    private int plazo;

    public Cotizacion(){

    }
    public Cotizaicon(int numCotizacion, String descripcionAuto, double precio, int porcentajeInicial, int plazo){
        this.numCotizaicon=numCotizacion;
        this.descripcionAuto=descripcionAuto;
        this.precio=precio;
        this.porcentajeInicial=porcentajeInicial;
        this.plazo=plazo;
    }
    public Cotizacion(Cotizacion cotizacion){
        System.out.println("Numero de cotizacion: "+this.numCotizacion);
        System.out.println("Descripcion del auto: "+this.descripcionAuto);
        System.out.println("Precio: "+this.precio)
        System.out.println("Porcentaje inicial: "+this.porcentajeInicial);
        System.out.println("Plazo: "+this.plazo+" meses")
    }

    public int calculoInicial(){
        return this.precio*this.porcentajeInicial/100;
    }
    public int totalFinanciar(){
        return this.precio-calculoInicial();
    }
    public int pagoMensual(){
        return totalFinanciar()/this.plazo;
    }
}
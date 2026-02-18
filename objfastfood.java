public class objfastfood {
    private int Tipo;
    private int Tamano;
    private int Cantidad;
    private double Precio;
    private doble Total;

    public objfastfood() {
    }

    public objfastfood(int Cantidad, double Precio, int Tamano, int Tipo, doble Total) {
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Tamano = Tamano;
        this.Tipo = Tipo;
        this.Total = Total;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int Tamano) {
        this.Tamano = Tamano;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public doble getTotal() {
        return Total;
    }

    public void setTotal(doble Total) {
        this.Total = Total;
    }


}

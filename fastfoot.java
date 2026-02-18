public class fastfoot {
    private int TipoComida;
    private int Tamano;
    private Doble Precio;
    private String Descripcion;
    private int Cantidad;
    private Doble Total;
    private string Notas;
    

  

    public fastfoot() {
    }

    
    public fastfoot(int Cantidad, String Descripcion, string Notas, Doble Precio, int Tamano, int TipoComida, Doble Total) {
        this.Cantidad = Cantidad;
        this.Descripcion = Descripcion;
        this.Notas = Notas;
        this.Precio = Precio;
        this.Tamano = Tamano;
        this.TipoComida = TipoComida;
        this.Total = Total;
    }

    public int getTipoComida() {
        return TipoComida;
    }

    public void setTipoComida(int TipoComida) {
        this.TipoComida = TipoComida;
    }

    public int getTamano() {
        return Tamano;
    }

    public void setTamano(int Tamano) {
        this.Tamano = Tamano;
    }

    public doble getPrecio() {
        return Precio;
    }

    public void setPrecio(doble Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Doble getTotal() {
        return Total;
    }

    public void setTotal(Doble Total) {
        this.Total = Total;
    }


    public void setPrecio(Doble precio) {
        Precio = precio;
    }


    public string getNotas() {
        return Notas;
    }


    public void setNotas(string notas) {
        Notas = notas;
    }


}

import java.util.Scanner;

public class metodo {

    public objfastfood[][] Pedidos (int n, scanner sc) {
        objfastfood[][] m = new objfastfood[n][n];
         metodos M = new metodos();
         int Tipo = 0; opt=0;
         int Tamano = 0;
         int Cantidad = 0;
         double Precio = 0.0;
         double Total = 0.0;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    System.out.println("BIENVENIDO A FASTFOOD");
                    System.out.println("Seleccione el tipo de comida: ");
                    System.out.println("1) Perro");
                    System.out.println("2) Perra");
                    System.out.println("3) Salchipapa");
                    System.out.println("4) Hamburguesa");
                    Tipo = M.validarentero(sc);

                    System.out.println("Ingrese tamaño: ");
                    System.out.println("1) Pequeño");
                    System.out.println("2) Mediano");
                    System.out.println("3) Grande");
                    Tamano = M.validarentero(sc);

                    System.out.println("Ingrese cantidad: ");
                    Cantidad = sc;
                    System.out.println("Ingrese precio: ");
                    Precio = sc.nextDouble();
                    Total = Cantidad*Precio;
                    objfastfood o = new objfastfood(Cantidad, Precio, Tamano, Tipo, Total);
                    m[i][j] = o;

             
                }
            }
    
        return m;
    }
    public int validarentero(Scanner sc) {
        while (!sc.hasNext()) {
            System.out.println("Por favor, ingrese un número valido.");
            } 
        }
        return sc.nextInt();
    }    

}

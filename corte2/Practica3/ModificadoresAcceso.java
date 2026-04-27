package modificadoresacceso;

public class SistemaBanco {
        
    public static void main(String[] args) {
        
       CuentaUsuario usuario1 = new CuentaUsuario("Carlos", 200000.0);
       usuario1.mostrarDatos();
       
       usuario1.ingresarDinero(50000.0);
       usuario1.sacarDinero(30000.0);
       
       System.out.print("\nDespués de movimientos:");
       usuario1.mostrarDatos();
       
       System.out.print("\nConsulta con getter:");
       System.out.print("\nBalance actual = " + usuario1.getBalance());
       
       
       CuentaUsuario usuario2 = new CuentaUsuario("Andrea", 80000.0); 
       usuario2.mostrarDatos();
       
       usuario2.setBalance(120000);
       
       System.out.print("\nNuevo balance de Andrea: " + usuario2.getBalance());
    }
}

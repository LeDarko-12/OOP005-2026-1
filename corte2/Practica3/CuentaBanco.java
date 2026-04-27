package modificadoresacceso;

public class CuentaUsuario {
    private String nombreCliente;
    private double balance;

    public CuentaUsuario(String nombreCliente, double balance) {
        this.nombreCliente = nombreCliente;
        this.balance = balance;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getBalance() {
        return balance;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void ingresarDinero(double cantidad){
        if (cantidad > 0){
            balance += cantidad;
        }
    }
    
    public void sacarDinero(double cantidad){
        if (cantidad > 0 && cantidad <= balance){
            balance -= cantidad;
        }
    }
    
    public void mostrarDatos(){
        System.out.println("\nCliente = " + nombreCliente);
        System.out.println("Balance = " + balance);
    }
}

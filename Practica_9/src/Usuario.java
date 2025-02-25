
import javax.swing.*;

public class Usuario {
    private String ID;
    private String Nombre;
    private int edad;
    private double saldo;

    // Constructor
    public Usuario(String ID, String Nombre, int edad) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.edad = edad;
        this.saldo = 0; // Se inicia en 0
    }

    // Getters y Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos para operar con saldo
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            JOptionPane.showMessageDialog(null, "Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "El monto debe ser mayor a 0.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente o monto inválido.");
        }
    }

    public void consultar_saldo() {
        JOptionPane.showMessageDialog(null, "Saldo actual: $" + saldo);
    }

    // Nuevo método para depositar a otra cuenta
    public void depositarOtraCuenta(String IDDestino, double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            JOptionPane.showMessageDialog(null, "Depósito exitoso de $" + monto + " a la cuenta con ID: " + IDDestino +
                    "\nTu nuevo saldo es: $" + saldo);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente o monto inválido.");
        }
    }
}


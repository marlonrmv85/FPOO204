
import javax.swing.*;

public class Usuario {
    String ID;
    String Nombre;
    int edad;
    double saldo;


    public Usuario(String ID, String Nombre, int edad) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.edad = edad;
        this.saldo = 0; // Se inicia en 0
    }

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
    public void Depositar_otracuenta () {
        JOptionPane.showMessageDialog(null,"ingresa el ID del beneficiario"+ID+ " Ingresa su nombre "+Nombre );

    }
}


import javax.swing.*;
import java.util.ArrayList;


class Administrativo extends Empleado {
    private String departamento;

    public Administrativo(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nID: " + id + "\nSalario: " + salario + "\nDepartamento: " + departamento);
    }
}

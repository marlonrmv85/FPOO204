import javax.swing.JOptionPane;

class Vehiculo {
    private String placa;
    private String modelo;
    private double capacidadCarga;
    private Conductor conductor;

    public Vehiculo() {
        this.placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        this.modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        this.capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo:"));
    }

    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public double getCapacidadCarga() { return capacidadCarga; }
    public Conductor getConductor() { return conductor; }

    public void asignarConductor(Conductor conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
        } else {
            JOptionPane.showMessageDialog(null, "El vehículo ya tiene un conductor asignado.");
        }
    }
}
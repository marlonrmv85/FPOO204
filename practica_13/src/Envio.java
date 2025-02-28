
class Envio {
    private String codigoEnvio;
    private String destino;
    private double peso;

    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
    }

    public Envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public static Envio crearEnvio() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del envío:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino del envío:");
        String respuesta = JOptionPane.showInputDialog("¿Desea ingresar el peso del envío? (Sí/No)");
        if (respuesta.equalsIgnoreCase("Sí")) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del envío:"));
            return new Envio(codigo, destino, peso);
        } else {
            return new Envio(codigo, destino);
        }
    }
}
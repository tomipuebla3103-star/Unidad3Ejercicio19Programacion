public class Contacto {
    private String nombre;
    private String telefono;
    private String correoElectronico;

    public Contacto(String nombre, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.telefono = "";
        this.correoElectronico = "";

        setTelefono(telefono);
        setCorreoElectronico(correoElectronico);
    }

    public void setTelefono(String telefono) {
        if (telefono.matches("[0-9+() -]+") && telefono.matches(".*[0-9].*")) {
            this.telefono = telefono;
            System.out.println("Teléfono actualizado correctamente.");
        } else {
            System.out.println("Error: el teléfono no puede contener letras.");
        }
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico.contains("@")) {
            this.correoElectronico = correoElectronico;
            System.out.println("Correo actualizado correctamente.");
        } else {
            System.out.println("Error: el correo debe contener @.");
        }
    }

    public String getContacto() {
        return "Nombre: " + nombre
                + "\nTeléfono: " + telefono
                + "\nCorreo: " + correoElectronico;
    }
}

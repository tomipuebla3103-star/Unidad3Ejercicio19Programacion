//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Contacto contacto = new Contacto(
            "Juan",
            "2611234567",
            "juan@gmail.com"
    );

    System.out.println("\nDatos iniciales:");
    System.out.println(contacto.getContacto());

    System.out.println("\nProbando valores incorrectos:");
    contacto.setTelefono("261ABC123");
    contacto.setCorreoElectronico("juangmail.com");

    System.out.println("\nProbando valores correctos:");
    contacto.setTelefono("2615551234");
    contacto.setCorreoElectronico("juan@hotmail.com");

    System.out.println("\nDatos finales:");
    System.out.println(contacto.getContacto());
}

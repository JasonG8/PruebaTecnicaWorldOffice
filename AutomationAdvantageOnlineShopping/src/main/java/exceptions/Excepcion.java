package exceptions;

public enum Excepcion {

    NO_CREO_USUARIO("No se creo el usuario");

    String mensaje;

    Excepcion(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
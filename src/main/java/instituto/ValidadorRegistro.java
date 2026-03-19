package instituto;

public class ValidadorRegistro {
    public boolean validarNombre(String name) {
        if (name.length() > 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contrasena8(String contra) {
        if (contra.length() >= 8) {
            return true;
        } else {
            return false;
        }
    }

    public boolean contrasena5(String contra) {
        if(contra.length() <=5){
            return false;
        }else{
            return true;
        }
    }

    public boolean emailfalso (String email){
        if (email.contains("@")){
            return true;
        }else{
            return false;
        }
    }

    public boolean EdadMinima (int edad){
        if (edad>=16){
            return true;
        }else{
            return false;
        }
    }
}

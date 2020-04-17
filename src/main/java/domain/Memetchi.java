package domain;

public class Memetchi extends Mascota {
    private Integer hambre;
    private boolean hambrienta;

    public Memetchi(String nombre) {
        super(nombre);
        this.hambre = 0;
        this.hambrienta = false;
    }

    @Override
    public void caminarHacia(Punto unPunto) {
        super.caminarHacia(unPunto);
        this.hambre += 5;
        if(this.hambre > 25){
            this.hambrienta = true;
        }
    }
}

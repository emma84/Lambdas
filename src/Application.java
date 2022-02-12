public class Application implements ApplicationImpl{

    private String nombre;
    private String apellido;

    public Application() {
        nombre = "Emmanuel";
        apellido = "Olmedo";
    }

    @Override
    public void consumidoras() {
  
    }

    public static void main(String[] args) {
        Application app = new Application();
        System.out.println(app.nombre +" "+app.apellido);
    }


}

public  class Trabajador{

    //ATRIBUTOS

    private String nombre;
    private int id;
    private double sueldo;
    
    //CONSTRUCTOR
    
    public Trabajador(String nombre, int id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //METODOS
    @Override
    public String toString() {
        
        return this.nombre+""+this.id+" "+this.sueldo;
    }

    
    

}
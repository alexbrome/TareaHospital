public class Nomedico extends Trabajador{
   
    //ATRIBUTO
    Tipo clase;
    String area_trabajo;


    //CONSTRUCTOR
    public Nomedico(String nombre, int id, double sueldo, Tipo clase, String area_trabajo) {
        super(nombre, id, sueldo);
        this.clase = clase;
        this.area_trabajo = area_trabajo;
    }
    //GETTERS Y SETTERS
    public Tipo getClase() {
        return clase;
    }
    public void setClase(Tipo clase) {
        this.clase = clase;
    }
    public String getArea_trabajo() {
        return area_trabajo;
    }
    public void setArea_trabajo(String area_trabajo) {
        this.area_trabajo = area_trabajo;
    }

    //METODOS
    @Override
    public String toString() {
        
        return super.toString()+this.area_trabajo+" "+this.clase;
    }

    




}

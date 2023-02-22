public class Medico extends Trabajador{
    

    //ATRIBUTOS
  private Especialidad especial;
  private int id_colegiado;
  private int pac_atendidos;

  //CONSTRUCTOR
public Medico(String nombre, int id, double sueldo, Especialidad especial, int id_colegiado, int pac_atendidos) {
    super(nombre, id, sueldo);
    this.especial = especial;
    this.id_colegiado = id_colegiado;
    this.pac_atendidos = pac_atendidos;
}
public Especialidad getEspecial() {
    return especial;
}
public void setEspecial(Especialidad especial) {
    this.especial = especial;
}
public int getId_colegiado() {
    return id_colegiado;
}
public void setId_colegiado(int id_colegiado) {
    this.id_colegiado = id_colegiado;
}
public int getPac_atendidos() {
    return pac_atendidos;
}
public void setPac_atendidos(int pac_atendidos) {
    this.pac_atendidos = pac_atendidos;
}

//METODOS

@Override
public String toString() {
    
    return super.toString()+" "+this.id_colegiado+" "+this.pac_atendidos+" "+this.especial;
}






}

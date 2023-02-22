public class Test {
    public static void main(String[] args) {
        Medico m1=new Medico("juan", 23, 1200, Especialidad.CIRUJANO, 256, 200);
        Nomedico nm1=new Nomedico("Pedro", 4556, 2300, Tipo.RECEPCIONISTA, "Recepcion");
        System.out.println(m1.toString());
        System.out.println(nm1.toString());
    }
}

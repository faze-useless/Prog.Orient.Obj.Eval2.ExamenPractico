package exa_ord_prac_2da_presencial;

public class EXA_ORD_PRAC_2DA_PRESENCIAL {

    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadosDeTiempoCompleto woody = new EmpleadosDeTiempoCompleto("Woody", 9000);
        EmpleadosPorHoras buzz = new EmpleadosPorHoras("Buzz", 80);
        EmpleadosPorContrato rex = new EmpleadosPorContrato("Rex", 7000);
        
        imprimirDatos(woody);
        imprimirDatos(buzz);
        imprimirDatos(rex);
        
    }
    
    public static void imprimirDatos(Empleado empleado){
        //imprimir empleado
        System.out.println("Nombre: "+empleado.getNombre());
        System.out.println("Salario Anual: "+empleado.calcSalarioAnual());
        
        if (empleado instanceof EmpleadosDeTiempoCompleto) {
            EmpleadosDeTiempoCompleto empleadnuevo = (EmpleadosDeTiempoCompleto)empleado;
        } else if (empleado instanceof EmpleadosPorHoras) {
            EmpleadosPorHoras empleadonuevo = (EmpleadosPorHoras)empleado;
        } else if (empleado instanceof EmpleadosPorContrato) {
            EmpleadosPorContrato empleadonuevo = (EmpleadosPorContrato)empleado;
        }
    }
    
}

package exa_ord_prac_2da_presencial;

public class EmpleadosDeTiempoCompleto extends Empleado {

    public EmpleadosDeTiempoCompleto() {
        super();
    }

    public EmpleadosDeTiempoCompleto(String nombre, double salario_base) {
        super(nombre, salario_base);
    }
    
    @Override
    public double calcSalarioAnual() {
        //salario anual
        return (getSalario_base()*12)+(getSalario_base()*12*0.10);
    }
    
}

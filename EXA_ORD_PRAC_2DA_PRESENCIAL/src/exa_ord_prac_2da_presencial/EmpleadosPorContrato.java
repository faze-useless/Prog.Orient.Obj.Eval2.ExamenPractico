package exa_ord_prac_2da_presencial;

public class EmpleadosPorContrato extends Empleado {

    public EmpleadosPorContrato() {
        super();
    }

    public EmpleadosPorContrato(String nombre, double salario_base) {
        super(nombre, salario_base);
    }
    
    @Override
    public double calcSalarioAnual() {
        return getSalario_base()*12;
    }
    
}

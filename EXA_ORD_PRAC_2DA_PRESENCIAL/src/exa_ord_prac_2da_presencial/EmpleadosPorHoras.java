package exa_ord_prac_2da_presencial;

public class EmpleadosPorHoras extends Empleado {

    public EmpleadosPorHoras() {
        super();
    }

    public EmpleadosPorHoras(String nombre, double salario_base) {
        super(nombre, salario_base);
    }
    
    public double calcSalario(int horas) {
        // deben ser menos de 24
        if (horas > 24) {
            return getSalario_base()*24;
        } else {
            return getSalario_base()*horas;  
        }
    }

    @Override
    public double calcSalarioAnual() {
        return calcSalario(8)*365;
    }
    
}

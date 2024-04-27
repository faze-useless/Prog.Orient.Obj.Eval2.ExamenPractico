package exa_ord_prac_2da_presencial;

/**
 *
 * @author DELL
 */
public abstract class Empleado {
    private String nombre;
    private double salario_base;
    
    public Empleado() {
        this.nombre = "&";
        this.salario_base = 0;
    }

    public Empleado(String nombre, double salario_base) {
        this.nombre = nombre;
        this.salario_base = salario_base;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario_base() {
        return salario_base;
    }
    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }
    
    
    public abstract double calcSalarioAnual();
}

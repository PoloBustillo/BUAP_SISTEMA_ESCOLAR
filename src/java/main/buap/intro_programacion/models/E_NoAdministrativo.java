package buap.intro_programacion.models;

public class E_NoAdministrativo extends Empleado {
    private String turno;
    private String area;


    public E_NoAdministrativo(Empleado empleadoGenerico, String turno, String area) {
        super(empleadoGenerico.getNombre(),
                empleadoGenerico.getDireccion(),
                empleadoGenerico.getRFC(),
                empleadoGenerico.getCuenta(),
                empleadoGenerico.getSueldo());
        this.turno = turno;
        this.area = area;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    //TODO: FALTAN DATOS IMPORTANTES Nombre - ID - indexCursos no se imprime es variable interna
    @Override
    public String toString() {
        return "E_NoAdministrativo『" +
                " | Turno Asigando: " + turno +
                " | Area: " + area +
                '』';
    }


    //TODO: USAR GETS PARA IMPRIMIR
    public String imprimeDatos() {
        return "No administrativo{" +
                "Id=" + getIdEmpleado() +
                ", Dirección='" + getDireccion() + '\'' +
                ", Nombre='" + getNombre() + '\'' +
                ", RFC='" + getRFC() + '\'' +
                ", # de cuenta='" + getCuenta() + '\'' +
                ", Sueldo= $'" + getSueldo() + '\'' +
                ", Turno Asignado='" + getTurno() + '\'' +
                ", Area='" + getArea() + '\'' +
                '}';
    }
}

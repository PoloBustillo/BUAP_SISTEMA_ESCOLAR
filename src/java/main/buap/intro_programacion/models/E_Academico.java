package buap.intro_programacion.models;

import buap.intro_programacion.Utils;

import java.util.Arrays;

public class E_Academico extends Empleado {
    private Curso[] cursos = new Curso[Utils.MAX_OBJETOS];
    private String materia;
    private String turno;
    private int indexCursos = 0;

    public E_Academico(Curso[] cursos) {
        super();
        this.cursos = cursos;
    }

    public E_Academico(String materia) {
        super();
        this.materia = materia;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void asignarCurso(Curso curso) {
        cursos[indexCursos] = curso;
        indexCursos = indexCursos + 1;
    }

    @Override
    public String toString() {
        return "E_Academico『" +
                " |# De Cursos: " + Arrays.toString(cursos) +
                " | Materia: " + materia  +
                " | Turno Asignado: " + turno  +
                " | Index Cursos: " + indexCursos +
                '』';
    }
    public String imprimeDatos() {
        return "Académico{" +
                "id=" + idEmpleado +
                ", Dirección='" + direccion + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", RFC='" + RFC + '\'' +
                ", # de cuenta='" + cuenta + '\'' +
                ", Sueldo= $'" + sueldo + '\'' +
                ", # de Cursos='" + Arrays.toString(cursos) + '\'' +
                ", Materia='" + materia + '\'' +
                ", Turo Asignado='" + turno + '\'' +
                ", Index Cursos='" + indexCursos + '\'' +
                '}';
    }
}
import dominio.Curso;
import dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(); //instanciando o objeto que segue a estrutura da classe Curso
        curso1.setTitulo("Ciência da Computação"); //usando o set para settar dados no objeto curso1 desse jeito pois sua estrutura está encapsulada na classe Curso
        curso1.setDescricao("Curso presencial - segunda à sexta");
        curso1.setCargaHoraria(3200);

        Curso curso2 = new Curso(); //instanciando o objeto curso2 que segue a estrutura da classe Curso
        curso2.setTitulo("Cybersecurity"); //usando o set para settar dados no objeto curso2 desse jeito pois sua estrutura está encapsulada tb na classe Curso
        curso2.setDescricao("Curso presencial - segunda à sexta");
        curso2.setCargaHoraria(1600);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java Encapsulamento");
        mentoria1.setDescricao("Mentoria online - quartas e quintas");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
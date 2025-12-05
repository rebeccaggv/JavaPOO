import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
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

        Conteudo conteudo = new Curso(); //isso é polimorfismo! Chamamos da classe conteúdo e criamos com o filho Curso

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java Encapsulamento");
        mentoria1.setDescricao("Mentoria online - quartas e quintas");
        mentoria1.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Esse bootcamp apresenta conceitos de POO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRebecca = new Dev();
        devRebecca.setNome("Rebecca");
        devRebecca.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devRebecca.getConteudoInscritos());
        devRebecca.progredir();
        System.out.println("progrediu...");
        System.out.println("Conteúdos Inscritos" + devRebecca.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos" + devRebecca.getConteudosConcluidos());
        System.out.println("XP=" + devRebecca.calcularTotalXp());

        System.out.println("---------------------------");

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devFulano.getConteudoInscritos());
        devFulano.progredir();
        devFulano.progredir();
        System.out.println("progrediu...");
        System.out.println("Conteúdos Inscritos" + devFulano.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos" + devFulano.getConteudosConcluidos());
        System.out.println("XP=" + devFulano.calcularTotalXp());

    }
}
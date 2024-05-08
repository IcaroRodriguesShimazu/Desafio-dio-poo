package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.dominio.BootCamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Js");
        curso2.setDescricao("Curso de Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria descrição Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);
        
        BootCamp bootCamp= new BootCamp();
        bootCamp.setNome("Java");
        bootCamp.setDescricao("BootCam de Java");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devIcaro = new Dev();
        devIcaro.setNome("Icaro");
        devIcaro.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos inscritos "+ devIcaro.getConteudosInscritos());
        devIcaro.progredir();
        System.out.println("Conteúdos inscritos "+ devIcaro.getConteudosInscritos());

        System.out.println("Conteúdos concluídos "+ devIcaro.getConteudosConcluidos());
        System.out.println("XP: "+devIcaro.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos inscridos "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos inscridos "+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularTotalXp());



    }

}

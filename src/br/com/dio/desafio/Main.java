package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Curso de Java do Básico ao Avançado");
        cursoJava.setCargaHoraria(10);

        Curso cursoHtml = new Curso();
        cursoHtml.setTitulo("Curso HTML");
        cursoHtml.setDescricao("Curso de HTML do Básico ao Avançado");
        cursoHtml.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria WEB Developer");
        mentoria.setDescricao("Mentoria de Java e HTML para WEB");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao(("Descricao"));
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoHtml);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Neymar");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println(dev1.getConteudosConcluidos());

        Dev dev2 = new Dev();
        dev2.setNome("Messi");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println(dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println(dev2.getConteudosConcluidos());

        //System.out.println(cursoJava);
        //System.out.println(cursoHtml);
        //System.out.println(mentoria);

    }
}
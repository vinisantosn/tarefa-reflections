package edu.ebac.reflections;

import edu.ebac.annotations.BancoDeDados;
import edu.ebac.annotations.Tabela;

import java.lang.reflect.Method;

public class AppReflections {
    public static void main(String[] args) {
        readAnnotations();
    }

    private static void readAnnotations() {
        BancoDeDados db = new BancoDeDados();
        Method[] methods = db.getClass().getMethods();

        for (Method method : methods) {
            Tabela annotation = method.getAnnotation(Tabela.class);
            if (annotation != null) {
                System.out.println("Annotation name: " + annotation);
                System.out.println("Annotation name value: " + annotation.nome());

            }
        }
    }
}

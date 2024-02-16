# Programa de Exercício de Reflections e Annotations

Este programa Java, desenvolvido como parte de um exercício para praticar conceitos de reflections e annotations, permite ler e utilizar annotations definidas em métodos de uma classe.

## Funcionalidades

O programa consiste em uma classe principal `AppReflections`, juntamente com duas outras classes: `BancoDeDados` e `Tabela`. Aqui estão as funcionalidades principais:

1. **Leitura de Annotations:**
   - O programa faz uso da API de Reflections do Java para obter as informações das annotations definidas nos métodos da classe `BancoDeDados`.

2. **Exibição de Informações:**
   - As informações das annotations são exibidas no console, incluindo o nome da annotation e seu valor associado.

## Como Utilizar

Para utilizar este programa, siga estas etapas:

1. **Compile os Arquivos:**
   - Compile todos os arquivos fonte presentes no pacote `edu.ebac.reflections` utilizando sua IDE ou ferramenta de linha de comando.

2. **Execute a Classe Principal:**
   - Execute a classe `AppReflections` para iniciar o programa.

3. **Verifique a Saída:**
   - O programa exibirá no console as informações das annotations encontradas nos métodos da classe `BancoDeDados`.

## Estrutura do Código Fonte

Aqui está uma visão geral da estrutura do código fonte do programa:

- **`AppReflections.java`:**
  - Contém a classe principal do programa.
  - Implementa a funcionalidade principal de ler e exibir informações das annotations.

- **`BancoDeDados.java`:**
  - Define a classe `BancoDeDados`.
  - Contém métodos marcados com a annotation `Tabela`.

- **`Tabela.java`:**
  - Define a annotation `Tabela`.
  - Pode ser aplicada a métodos para fornecer informações sobre as tabelas do banco de dados.

## Requisitos

- JDK (Java Development Kit) instalado em seu sistema.
- IDE Java ou um compilador Java configurado em seu sistema.

## Exemplo de Uso

Aqui está um exemplo de utilização do programa:

```java
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
                System.out.println("Nome da Annotation: " + annotation);
                System.out.println("Valor do Nome da Annotation: " + annotation.nome());
            }
        }
    }
}
```


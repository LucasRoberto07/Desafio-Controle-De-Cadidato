# Desafio - Controle de Candidatos

Este é um projeto de console em Java que simula as etapas de um processo seletivo para uma vaga de emprego. O sistema avalia candidatos com base em suas pretensões salariais e, em seguida, tenta entrar em contato com os selecionados.

## Funcionalidades

O projeto é dividido nas seguintes etapas:

1.  **Seleção de Candidatos (`selecaoCandidatos`)**:
    *   Analisa uma lista pré-definida de candidatos.
    *   Para cada candidato, um valor de salário pretendido é gerado aleatoriamente.
    *   Se a pretensão for menor que o salário base, o candidato é selecionado.
    *   Se a pretensão for igual ou maior, o sistema sugere ações como "fazer contraproposta" ou "aguardar demais candidatos".

2.  **Tentativa de Contato (`entrandoEmContato`)**:
    *   Para cada candidato que foi selecionado, o sistema simula uma tentativa de contato telefônico.
    *   São realizadas no máximo 3 tentativas.
    *   O sucesso ou falha de cada ligação é determinado aleatoriamente.
    *   Ao final, o sistema informa se conseguiu ou não contato com o candidato.

## Como Executar

Para executar o projeto, você precisa ter o **JDK (Java Development Kit)** instalado em sua máquina.

1.  Abra um terminal ou prompt de comando.
2.  Navegue até a pasta `src` do projeto.
3.  Compile o arquivo Java com o seguinte comando:
    ```sh
    javac candidatura/ProcessoSeletivo.java
    ```
4.  Execute o programa compilado:
    ```sh
    java candidatura.ProcessoSeletivo
    ```

A cada execução, os salários pretendidos e os resultados das ligações serão diferentes, mostrando um novo cenário do processo seletivo.

---
*Este projeto foi desenvolvido como parte de um desafio de programação para praticar conceitos fundamentais de Java.*

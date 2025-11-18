package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo iniciado!");
        String[] selecionados = selecaoCandidatos();
        
        System.out.println("\n=====================================");
        System.out.println("Candidatos Selecionados:");
        System.out.println("---------------------------------------");
        for(String candidato : selecionados) {
            System.out.println(candidato);
            entrandoEmContato(candidato);
        }
        System.out.println("=====================================");
        
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
            tentativasRealizadas++;
            }else{
            }
        }while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.err.println("Conseguimos contato com o candidato"); 
            System.out.println("---------------------------------------");
        }else{
            System.err.println("Não conseguimos contato com o candidato");
            System.out.println("---------------------------------------");
        }

    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static String[] selecaoCandidatos() {
        double salarioBase = 2000.0;
        String[] candidatos = {"Rodrigo Luiz","Paulo Ricardo","Rafael Barbosa","Rebeca Guimarães","Renata Assis","Roberta Paiva ","Roberto Ferreira"};
        final int MAX_SELECIONADOS = 5;
        
        String[] candidatosSelecionados = new String[MAX_SELECIONADOS];
        int totalSelecionados = 0;
        int candidatoAtual = 0;

        while (totalSelecionados < MAX_SELECIONADOS && candidatoAtual < candidatos.length) {
            System.out.println("=====================================");
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("Candidato: %s - Salário Pretendido: R$ %.2f%n", candidato, salarioPretendido);

            if (salarioBase > salarioPretendido) {
                System.out.println("-> Candidato " + candidato + " SELECIONADO para a vaga!");
                String selecionado = String.format("%s --> Salário Pretendido: R$ %.2f", candidato, salarioPretendido);
                candidatosSelecionados[totalSelecionados] = selecionado;
                totalSelecionados++;
            } else if (salarioBase == salarioPretendido) {
                analisarCandidato(salarioBase, salarioPretendido); 
            } else {
                analisarCandidato(salarioBase, salarioPretendido); 
            }
            candidatoAtual++;
        }
        
        String[] resultadoFinal = new String[totalSelecionados];
        System.arraycopy(candidatosSelecionados, 0, resultadoFinal, 0, totalSelecionados);
        
        return resultadoFinal;
    }

    static double valorPretendido(){
        double valor = ThreadLocalRandom.current().nextDouble(1800, 2200);
        // Arredonda o valor para 2 casas decimais antes de retornar
        return Math.round(valor * 100.0) / 100.0;
    }

    static void analisarCandidato(double salarioBase, double salarioPretendido) {
       
        if (salarioBase >= salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido) {    
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }

}

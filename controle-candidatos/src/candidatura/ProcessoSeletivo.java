package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Levi", "Rafael", "Lucas", "Pedro", "Laura", "Renata"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Levi", "Rafael", "Lucas", "Pedro", "Nartan", "Flavio", "Laura", "Renata", "Andrea"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            double salarioBase = 2000.0;

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    static double valorPretendido(){
        double valor = ThreadLocalRandom.current().nextDouble(1800, 2200);
        return Math.round(valor * 100.0) / 100.0;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuaTentando = !atendeu;

            if (continuaTentando){
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso");
            }
        }while (continuaTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        }else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO DE TEMTATIVAS "
                    + tentativasRealizadas + "REALIZADAS");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

}

import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatosSelecionados = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirella","Daniela","Jorge"};
        for(String candidato: candidatosSelecionados) {
            ligarCandidatos(candidato);
        }
    }

    //case 4
    static void ligarCandidatos(String candidato) {
        int tentativa = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativa++;
            else
                System.out.println("Contato realizado com sucesso")
        } while(continuarTentando && tentativa <3);

        if (atendeu){
            System.out.println("Conseguimos contato com "+ candidato +" na "+ tentativa + " tentativa";)
        }else{
            System.out.println("Não conseguimos contato com "+candidato);       
        }}
       
    static boolean atender() {
            return new Random().nextInt(3)==1;
        }
    
    //case 3
    static void impressaoSelecionados() {
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirella","Daniela","Jorge"};
        System.out.println("Lista de Candidatos com índice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número "+(indice+1)+" é: "+candidatos[indice]);
        }
    }

    //case 2
    static void selecionarCandidatos () {
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirella","Daniela","Jorge"};

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+candidato+" solicitou o salário: "+salarioPretendido);
            
            if(salarioBase >= salarioPretendido) {
            System.out.println("O candidato "+candidato+" foi selecionado!");

            candidatosSelecionados++;
            } else {
                System.out.println("O candidato "+candidato+" não foi selecionado!");
            }
         candidatosAtual++;
        }
    }
    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //case 1
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        }
        else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o Candidato com Contra-Proposta");
            else {
                System.out.println("Aguardando o Resultado dos Demais Candidatos");
            }
    } 
}

public class Queue {
    public static void main(String[] args) {
        /*
         * Queue
         *
         * Queue é uma estrutura de dados que segue o princípio FIFO (First In, First Out).
         * - Elementos são adicionados no final e removidos do início.
         * - Ideal para cenários onde a ordem de processamento é importante, como filas de atendimento.
         * Exemplo de uso: fila de impressão, fila de tarefas em um sistema.
         */
        java.util.Queue<String> fila = new java.util.LinkedList<>();
        fila.add("Tarefa 1");
        fila.add("Tarefa 2");
        fila.add("Tarefa 3");

        System.out.println("Fila inicial: " + fila);

        String primeiraTarefa = fila.poll(); // Remove e retorna o primeiro elemento
        System.out.println("Removido da fila: " + primeiraTarefa);

        System.out.println("Fila após remoção: " + fila);

        /*
         * PriorityQueue
         *
         * PriorityQueue é uma implementação de fila que ordena os elementos com base em sua prioridade.
         * - Elementos são removidos na ordem de prioridade, não necessariamente na ordem de inserção.
         * - Ideal para cenários onde é necessário processar elementos com diferentes prioridades.
         * Exemplo de uso: sistema de gerenciamento de tarefas com prioridades, fila de atendimento médico.
         */
        java.util.Queue<String> filaPrioridade = new java.util.PriorityQueue<>();
        filaPrioridade.add("Tarefa de alta prioridade");
        filaPrioridade.add("Tarefa de baixa prioridade");
        filaPrioridade.add("Tarefa de média prioridade");
        System.out.println("Fila de prioridade inicial: " + filaPrioridade);
        String tarefaPrioritaria = filaPrioridade.poll(); // Remove e retorna o elemento com maior prioridade
        System.out.println("Removido da fila de prioridade: " + tarefaPrioritaria);
        System.out.println("Fila de prioridade após remoção: " + filaPrioridade);
    }
}

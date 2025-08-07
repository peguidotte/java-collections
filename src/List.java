import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {

        /*
         * ArrayList
         *
         * ArrayList é uma lista baseada em array dinâmico.
         * - Permite acesso rápido aos elementos por índice.
         * - Inserções e remoções no meio da lista são mais lentas, pois exigem deslocamento dos elementos.
         * - Ideal para cenários onde o acesso por posição é frequente e as inserções/remoções são raras.
         * Exemplo de uso: lista de nomes de usuários para exibição.
         */
        java.util.List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Evando");
        listaArrayList.add("Heloysa");
        listaArrayList.add("Juan");
        listaArrayList.add("Pedro");
        System.out.println(listaArrayList);

        /*
         * LinkedList
         *
         * LinkedList é uma lista duplamente ligada.
         * - Inserções e remoções no início ou meio da lista são rápidas.
         * - O acesso por índice é mais lento, pois é necessário percorrer a lista.
         * - Ideal para cenários onde há muitas inserções/remoções e pouco acesso por posição.
         * Exemplo de uso: fila de tarefas ou histórico de operações.
         */
        java.util.List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Evando");
        listaLinkedList.add("Heloysa");
        listaLinkedList.add("Juan");
        listaLinkedList.add("Pedro");
        System.out.println(listaLinkedList);
    }
}

public class Set {
    public static void main(String[] args) {
        /*
         * HashSet
         *
         * HashSet é uma implementação de conjunto baseada em tabela hash.
         * - Não permite elementos duplicados.
         * - Não garante ordem dos elementos; pode vir desordenada.
         * - Ideal para cenários onde a ordem não importa e é necessário garantir unicidade.
         * Exemplo de uso: lista de IDs únicos, controle de presença.
         */
        java.util.Set<Integer> listaInt = new java.util.HashSet<>();
        listaInt.add(1);
        listaInt.add(2);
        listaInt.add(3);
        listaInt.add(1);
        System.out.println(listaInt.size());
        System.out.println(listaInt);

        /*
         * LinkedHashSet
         *
         * LinkedHashSet é uma implementação de conjunto baseada em tabela hash e lista duplamente ligada.
         * - Não permite elementos duplicados.
         * - Mantém a ordem de inserção dos elementos.
         * - Ideal para cenários onde é necessário garantir unicidade e preservar a ordem de inserção.
         * Exemplo de uso: histórico de navegação sem repetições, lista de tarefas únicas na ordem de chegada.
         */
        java.util.Set<Integer> listaIntLinked = new java.util.LinkedHashSet<>();
        listaIntLinked.add(1);
        listaIntLinked.add(2);
        listaIntLinked.add(3);
        listaIntLinked.add(1);
        System.out.println(listaIntLinked.size());
        System.out.println(listaIntLinked);

        /*
         * TreeSet
         *
         * TreeSet é uma implementação de conjunto baseada em árvore binária balanceada (Red-Black Tree).
         * - Não permite elementos duplicados.
         * - Mantém os elementos ordenados de acordo com a ordem natural ou um comparador fornecido.
         * - Ideal para cenários onde é necessário garantir unicidade e manter os elementos ordenados.
         * Exemplo de uso: lista de nomes únicos ordenados, controle de estoque ordenado por ID.
         */
        java.util.Set<Integer> listaIntTree = new java.util.TreeSet<>();
        listaIntTree.add(3);
        listaIntTree.add(1);
        listaIntTree.add(2);
        listaIntTree.add(1);
        System.out.println(listaIntTree.size());
        System.out.println(listaIntTree);
    }
}

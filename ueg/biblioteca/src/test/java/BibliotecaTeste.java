public class BibliotecaTeste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        // Teste adicionar livro
        biblioteca.adicionarLivro("Dom Quixote");
        biblioteca.adicionarLivro("1984");
        biblioteca.adicionarLivro("O Senhor dos Anéis");
        System.out.println("Após adicionar livros:");
        System.out.println(biblioteca.listarLivros()); // Deve mostrar os 3 livros
        // Teste remover livro existente
        boolean removido = biblioteca.removerLivro("1984");
        System.out.println("Remover '1984': " + removido); // true
        // Teste remover livro que não existe
        boolean removidoInexistente = biblioteca.removerLivro("Harry Potter");
        System.out.println("Remover 'Harry Potter': " + removidoInexistente); // false
        System.out.println("Após remoções:");
        System.out.println(biblioteca.listarLivros()); // Deve mostrar "Dom Quixote" e "O Senhor dos Anéis"
        // Teste imutabilidade da lista retornada
        List<String> livros = biblioteca.listarLivros();
        try {
            livros.add("Novo Livro");
        } catch (UnsupportedOperationException e) {
            System.out.println("Não é possível modificar a lista retornada (imutabilidade garantida).");
        }
    }
}
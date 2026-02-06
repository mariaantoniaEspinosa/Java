public class Main{
    public static void main(String[] agrs){
        Aluno a = new Aluno("Maria", 8.0, 6.5);

        System.out.println("Nome: " + a.getNome());
        System.out.println("Media: " + a.media());
        System.out.println("Situcaçao: " + a.situacao());

    }
}

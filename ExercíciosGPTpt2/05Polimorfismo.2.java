class AlunoGraduacao extends Aluno{
    AlunoGraduacao(String nome, double nota1, double nota2){
        super(nome, nota1, nota2);
    }
    double media(){
        return super.media();
    }
}

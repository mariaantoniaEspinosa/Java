public class ProdutoTestar {
    public static void main(String [] args){

        //construtor padrão
        Produto p1 = new Produto();
        p1.nome = "caneta preta";
        p1.marca = "bic";
        p1.valor = 1.50f;

        //construtor de dois parametros;
        Produto p2 = new Produto("caneta vermelha", "Faber");
        p2.valor = 1.70f;

        //construtor de tres parametros;
        Produto p3 = new Produto("Borracha", "Mercur", 1.98f);

        //objeto p1
        System.out.println("Nome: " + p1.nome + " Marca: " + p1.marca + " Valor: " + p1.valor);

        //objeto p2
        System.out.println("Nome: " + p2.nome + " Marca: " + p2.marca + " Valor: " + p2.valor);

        //objeto p3
        System.out.println("Nome: " + p3.nome + " Marca: " + p3.marca + " Valor: " + p3.valor);
    }

}

public class Parte02 {

    public static void main (String[] args) {
        carro meucarro = new carro("fusca");
        carro meucarro2 = new carro("bmw");
        carro meucarro3 = new carro("ferrari");

         String result = meucarro.acelerar();
        meucarro2.acelerar();
        meucarro3.acelerar();

        System.out.println(result);
    }
}

//construtores

class carro{

    String modelo;
    public carro(String modelo){
        this.modelo = modelo;

    }
    // metodos
    public String acelerar(){
        System.out.println("Acelerando o carro " + this.modelo);
        return "oi";
    }
}

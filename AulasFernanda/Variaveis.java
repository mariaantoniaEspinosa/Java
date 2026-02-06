       //ARRAYS LIST

        ArrayList<String> Lista = new ArrayList<>();
        Lista.add("Maria"); //adiciono quantos eu quero
        Lista.add("Ste");//era o indice 1 e virou o 0
        Lista.add("Maria");

        Lista.remove(0);//remove o que ta ocupando o indice zero

        System.out.println(Lista.get(0));

        //LOOPINGS

        for(int i = 0; i < Lista.size(); i++){
            System.out.println(Lista.get(i));
        }

        int contador = 0;
        while(contador<10){
            System.out.println("Estou no while");
            contador++;
        }

        //CASTING
        //conversao de um tipo de dado pro outro

        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meudouble = meuInt;

        String meustring = "10";
        int meuInt2 = Integer.parseInt(meustring);

        String minhastring = String.valueOf(meuInt2);

    }
}

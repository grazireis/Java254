package Classes;

 class elefante extends animal {
    public elefante(String nome){
        super(nome);
    }
    @Override
    public void emitirSom(){
            System.out.println(nome + "bramir: funn uuuuh");
    }
    
}

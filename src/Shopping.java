public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

        public Shopping(String nome, Endereco endereco, int quantidadeLojas){
            this.nome = nome;
            this.endereco = endereco;
            this.lojas = new Loja[quantidadeLojas];

        }


        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome= nome;
        }

        public Endereco getEndereco(){
            return endereco;
        }

        public void setEndereco(Endereco endereco){
            this.endereco = endereco;
        }

        public Loja[] getLojas(){
            return lojas;
        }

        public void setLojas(Loja[] lojas){
            this.lojas = lojas;
        }


            //insereLoja
            public boolean insereLoja(Loja novaLoja){
                for (int i = 0; i < lojas.length; i++) {
                    if (lojas[i] == null) {
                        lojas[i] = novaLoja;
                        return true;
                    }
                }
                return false;
            }
    

            //removeLoja
            public boolean removeLoja(String nomeLoja){
                for(int i =0; i <lojas.length; i++){
                    Loja loja = lojas[i];
                    if (loja != null && loja.getNome().equalsIgnoreCase(nomeLoja)){
                        return true;
                    }
                }
                return false;
            }  


            //qtdeLojasPorTipo
            public int quantidadeLojasPorTipo(String tipoLoja) {
                int quantidadeCosmetico = 0;
                int quantidadeVestuario = 0;
                int quantidadeBijuteria = 0;
                int quantidadeAlimentacao = 0;
                int quantidadeInformatica = 0;
                for (Loja loja : lojas) {
                    if (loja instanceof Cosmetico && tipoLoja.equals("Cosmético")) {
                        quantidadeCosmetico++;
                    } else if (loja instanceof Vestuario && tipoLoja.equals("Vestuário")) {
                        quantidadeVestuario++;
                    } else if (loja instanceof Bijuteria && tipoLoja.equals("Bijuteria")) {
                        quantidadeBijuteria++;
                    } else if (loja instanceof Alimentacao && tipoLoja.equals("Alimentação")) {
                        quantidadeAlimentacao++;
                    } else if (loja instanceof Informatica && tipoLoja.equals("Informática")) {
                        quantidadeInformatica++;
                    }
                }
                                    
                if (quantidade > 0) {
                    return quantidade;
                } else {
                    return -1;
                }
            }

                     public int quantidadeLojasPorTipo(String tipoLoja) {
                            int quantidade = 0;
                                for (Loja loja : lojas) {
                                    if (loja instanceof Cosmetico && tipoLoja.equals("Cosmético")) {
                                        quantidadeCosmetico++;

                            }
                    
                if (quantidade > 0) {
                    return quantidade;
                } else {
                    return -1;
                }
            }

             //lojaSeguroMaisCaro  
             public Informatica lojaSeguroMaisCaro() {
                Informatica lojaMaisCara = null;
                double maiorValorSeguro = 0;
        
                for (int i = 0; i < lojas.length; i++) {
                    if(lojas[i] != null && lojas[i] instanceof Informatica){
                        Informatica informatica = (Informatica) lojas[i];
                        if (informatica.getSeguroEletronicos() > maiorValorSeguro){
                            maiorValorSeguro = informatica.getSeguroEletronicos();
                                lojaMaisCara = (Informatica) lojas[i];
                        }
                        
                    }   
        }return lojaMaisCara;

        
            }
}







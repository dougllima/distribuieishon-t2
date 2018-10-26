public class cliente {
    //minimo 10 operacoes
    //minimo 5 processos ao msm tempo
    //deve adicionar seu ID ao arquivo
    //conhece apenas o caminho para o proximo

    //inicia eleicao

    int id;
    int proximo;
    boolean embaixador; //mestre

    public void executa(){
        //while
        verificaSeguinte();
        if(embaixador == true)
        {
            //mandaBala
        }
    }

    public void verificaSeguinte() {
        //se ok
        //dalhe pro seguinte
        //se nao
        iniciaEleicao();
        //dalhe pro seguinte

        //percebeu que o oseguinte nao respondeu/caiu manda isso
        //CENTRALIZADA
        //cria string e adiciona seu id e envia para o proximo seguinte
        //recebe e adiciona seu id e envia ate retornar para este cliente
        //qnd retorna pega o maior id(mais novo) e torna ele o mestre

        //nessa classe so chama o eleicao do SharedR...
    }

    public void iniciaEleicao(){
        //chama a eleição e salva o resultado no proximo;
        //proximo = eleicao(id);
    }

    public String participaEleicao(String jubileu){
        //cria string bota seu id continua
        String josias = jubileu += (" " + id);
        //add seu id
        return josias;
    }
    public void dalheProSeguinte(){
        //escreveu ja

        //troca embaixador pra false
        //manda o seguinte virar embaixador
    }
    public void mandaBala(){
        //usa shared manda escrever
    }

}

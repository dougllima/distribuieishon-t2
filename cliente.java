import java.io.IOException;

public class cliente {
    //minimo 10 operacoes
    //minimo 5 processos ao msm tempo
    //deve adicionar seu ID ao arquivo
    //conhece apenas o caminho para o proximo

    //inicia eleicao

    int id;
    int proximo;
    boolean embaixador; //mestre
    int balas =10;

    public void executa(){
        while(true){
    //TEM Q USAR O LOCK E UNLOCK EM VEZ DE BOOLEAN TA NO LINK DO TODO DO DRIVE
            // no capitulo 15 ali ta separado certinho
        verificaSeguinte();
        if(embaixador == true && balas >0)
        {
            mandaBala();
            dalheProSeguinte();
            balas--;
        }
        if(balas==0){
            encerra();
        }

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
        try {
            float number = SharedResourceExample.read();
            System.out.println("Processo " + id + " leu valor " + number);
            number = number + id;
            SharedResourceExample.write(number);
        } catch (IOException condessa) {
            condessa.printStackTrace();
        }
    }

}

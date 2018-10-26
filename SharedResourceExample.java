
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class SharedResourceExample {

    private static final String FILENAME = "./file.txt";

    private String jubileu= ""; //palavrapraeleicao
   
    private float read() throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(FILENAME));
        String last, line;

		last = null;
        while ((line = input.readLine()) != null) { 
            last = line;
        }
        
        return Float.parseFloat(last);
	}

    private void write(float number) throws IOException {
        Writer output;
        output = new BufferedWriter(new FileWriter(FILENAME, true));
        String line = String.valueOf(number) + "\n";
        output.append(line);
        output.close();
    }

    public static void main(String[] args) throws IOException {
        int id = Integer.parseInt(args[0]);
        SharedResourceExample resource = new SharedResourceExample();
        float number = resource.read();
        System.out.println("Processo " + id + " leu valor " + number);
        number = number + id;
        resource.write(number);
        System.out.println("Processo " + id + " escreveu valor " + number);

    }
    //eleicao
    //centralizado
    public static int Eleicao(int idIni){
        //alguem inicia eleicao vem pra ca
        //zerar a string jubileu
        //e amanda todos os clientes executar iniciaEle por ordem apartir do idIni
        //le a string jubileu e ve qual o maior id
        //chama Elege(com maior id)josias


    }
    public static void Elege(int id){
        //seta id pra ser
        //pega id troca boolean duque
    }

    //


}



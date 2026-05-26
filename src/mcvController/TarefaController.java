
package mcvController;
import mcvModel.TarefaModel;
import java.util.ArrayList;
public class TarefaController {
    
    //Lista Tarefas
    private ArrayList <TarefaModel> lista = new ArrayList<>();
    
    //Adicionar 
    public void adicionar (String nome){
        
        TarefaModel tarefa = new TarefaModel(nome);
        lista.add(tarefa);
        
    }
    
    //Listar
    public ArrayList<TarefaModel> listar(){
        return lista;
        
    }

}

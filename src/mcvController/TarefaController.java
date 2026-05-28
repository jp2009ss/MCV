
package mcvController;
import mcvModel.TarefaModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class TarefaController {
    
    //Lista Tarefas
    private ArrayList <TarefaModel> lista = new ArrayList<>();
    
   public void adicionar(String nome) {

    // 1. Verificar se está vazio
    if (nome == null || nome.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Digite um nome para a tarefa!");
        return;
    }

    // 2. Verificar se já existe (ANTES de adicionar)
    for (TarefaModel t : lista) {
        if (t.getTarefa().equalsIgnoreCase(nome.trim())) {
            JOptionPane.showMessageDialog(null, "Tarefa já existente!");
            return;
        }
    }

    // 3. Só adiciona se passou nas verificações acima
    TarefaModel tarefa = new TarefaModel(nome.trim());
    lista.add(tarefa);
    JOptionPane.showMessageDialog(null, "Tarefa cadastrada!");
}
    
    //Listar
    public ArrayList<TarefaModel> listar(){
        return lista;
        
    }
    
    //Concluir
    public void concluir (int indice){
        
       if(indice >= 0 && indice < lista.size()){
           lista.get(indice).setConcluida(true);
       }
        
    }

    //Remover
    public void remover(int indice){
        
        if(indice >= 0 && indice < lista.size()){
             lista.remove(indice);
        
    }
        
    }
    
    //Quantida
    public int quantidade(){
        return lista.size();
    }
}


package mcvController;
import mcvModel.TarefaModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class TarefaController {
    
    //Lista Tarefas
    private ArrayList <TarefaModel> lista = new ArrayList<>();
    
    //Adicionar 
    public void adicionar (String nome){
        
        TarefaModel tarefa = new TarefaModel(nome); 
       
        try{
            for(TarefaModel t: lista){

                if(lista.get(0).toString()==nome){
                    JOptionPane.showMessageDialog(null, "Tarefa ja Existente");

                }else{
            lista.add(tarefa);
            JOptionPane.showMessageDialog(null, "Tarefa Cadastrada");
        } 
            }
        }catch(Error e){
        
        JOptionPane.showMessageDialog(null,"BOA NOITE");
        }
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

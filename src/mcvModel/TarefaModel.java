
package mcvModel;
public class TarefaModel {
    
    //atributos
    private String tarefa;
    private boolean concluida;

    //Construtor
    public TarefaModel(String tarefa) {
        this.tarefa = tarefa;
        this.concluida = concluida = false;
    }
    
    // Get & Set
    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "TarefaModel{" + "tarefa=" + tarefa + ", concluida=" + concluida + '}';
    }

}

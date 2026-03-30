package ExercicioPilhas;

public class Metodos {
    final static int N=6;

    int[] dados = new int[N];
    int topo;

    public void init() {
        topo = 0;
    }

    //Insere
    public void push(int valor){
        if (!isFull()){
            dados[topo]= valor;
            topo++;
        } else {
            System.out.println("Pilha cheia");
        }
    }

    // Retira
    public int pop(){
        topo--;
        return dados[topo];

    }

    // Leiturado valor do topo
    public void top(){
        System.out.println(dados[topo-1]);
    }

    // Verifica se está cheio
    public boolean isFull(){
        return (topo == N);
    }

    // Verifica se está vazio
    public boolean isEmpty(){
        return (topo == 0);
    }
}

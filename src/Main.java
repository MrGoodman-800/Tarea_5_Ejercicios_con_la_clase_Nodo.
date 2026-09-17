//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Nodo<String> head = new Nodo<>();
        head.setDato("Al");
        head.setSiguiente(new Nodo<>("B"));
        head.getSiguiente().setSiguiente(new Nodo<>("C"));
        head.getSiguiente().getSiguiente().setSiguiente(new Nodo<>("De"));
        head.getSiguiente().getSiguiente().getSiguiente().setSiguiente(new Nodo<>("Mc"));
        head.getSiguiente().getSiguiente().getSiguiente().getSiguiente().setSiguiente(new Nodo<>("Zi"));
        //1 Imprime el estado inicial completo de la lista
        System.out.println("Estado unicial");
        System.out.println(head);
        //2 Imprime únicamente el dato almacenado en el primer nodo de la lista.
        System.out.println("primer nodo");
        System.out.printf(head.getDato());
        //3 Imprime el estado completo del nodo ubicado en la última posición de la lista.
        System.out.println();
        System.out.println("nodo en la ultima posicion");
        System.out.println(head.getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente());
        //4 Inserta un nuevo nodo con el valor "Fe" entre los nodos que contienen "De" y "Mc".
        Nodo tme=new Nodo<>("Fe");
        tme.setSiguiente(head.getSiguiente().getSiguiente().getSiguiente().getSiguiente());
        head.getSiguiente().getSiguiente().getSiguiente().setSiguiente(tme);
        // 5 Imprime el nuevo estado de la lista.
        System.out.println();
        System.out.println("nuevo estado");
        System.out.println(head);
        //6 Inserta un nuevo nodo con el valor "Zz" al final de la lista.
        Nodo zef= new Nodo<>("Zz");
        head.getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().getSiguiente().setSiguiente(zef);
        //7 Imprime el nuevo estado de la lista.
        System.out.println();
        System.out.println("nuevo estado");
        System.out.println(head);
        //8 Inserta un nuevo nodo con el valor "Aa" al inicio de la lista, de modo que se convierta en el primer nodo.
        Nodo jisus = new Nodo<>("Aa");
        jisus.setSiguiente(head);
        head = jisus;
        // 9 Imprime el nuevo estado de la lista.
        System.out.println();
        System.out.println("nuevo estado");
        System.out.println(head);




    }
}
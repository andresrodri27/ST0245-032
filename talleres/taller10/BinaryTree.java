/**
 * La clase BinaryTree intenta dar un conocimiento a los
 * estudiantes acerca del manejo de un arbol binario de enteros.  
 * Aquí se espera crear una estrcutura concreta del árbol binario,
 * cabe aclarar que esta estrucutra ya esta implementada.
 * @see <a href="https://docs.oracle.com/javase/9/docs/api/jdk/nashorn/api/tree/BinaryTree.html"> Árbol Binario</a>
 * @author Mauricio Toro, Andres Paez
 *
 */

public class BinaryTree {

    // Sirve como raíz del árbol
    public Node root;

    /**
     * @param n el dato del nodo que se busca buscar
     * Metodo auxiliar de insetarAux.
     *
     */
    public void insertar(int n) {
        insertarAux(root, n);   
    }

    /**
     * @param node es la raíz del arbol
     * @param n el data del nodo que se busca insertar
     * nota: metodo recursivo.
     * Inserta un dato respetando claro las desigualdades en el árbol
     */
    private Node insertarAux(Node root, int n) {
        if (root == null) {
            return new Node(n);
        }
        if (n < root.n) {
            root.left = insertarAux(root.left, n);
        } else if (n > root.n) {
            root.right = insertarAux(root.right, n);
        } else {
            return root;
        }
        return root;
    }



}
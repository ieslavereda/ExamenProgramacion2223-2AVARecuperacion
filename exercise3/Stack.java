
package exercise3;

/**
 * Solution of exercise 3
 *
 * @author joaalsai
 *
 */
public class Stack<E>{

    /**
     *
     */
    private Nodo<E> peak;

    public Stack() {
        peak = null;
    }

    /**
     * Place the element on top of the stack
     *
     * @param q
     *            the element to push
     */
    public void push(E q) {
        Nodo<E> nodo = new Nodo<E>(q);

        if (peak == null)
            peak = nodo;
        else {
            nodo.setNext(peak);
            peak.setPrevious(nodo);
            peak = nodo;
        }
    }

    /**
     * Get the element on top of the stack
     *
     * @return the element
     */
    public E pop() {

        E aux = null;
        if (peak != null) {
            aux = peak.getElement();
            peak = peak.getNext();
            if (peak != null)
                peak.setPrevious(null);
        }
        return aux;

    }

    public String toString() {
        Nodo<E> aux = peak;
        String salida = "";
        while (aux != null) {
            salida = salida + aux.toString();
            aux = aux.getNext();
        }
        return salida;
    }

    /**
     * @author joaalsai
     * @param <E>	Element to store in the stack
     */
    public class Nodo<E>{

        private E element;
        private Nodo<E> next;
        private Nodo<E> previous;

        public Nodo(E elemento){
            this.element = elemento;
        }

        /**
         * @return the element
         */
        public E getElement() {
            return element;
        }

        /**
         * @return the next
         */
        public Nodo<E> getNext() {
            return next;
        }


        /**
         * @param next the next to set
         */
        public void setNext(Nodo<E> next) {
            this.next = next;
        }

        /**
         * @param previous the previous to set
         */
        public void setPrevious(Nodo<E> previous) {
            this.previous = previous;
        }

        @Override
        public String toString() {
            return element.toString() ;
        }

    }

}
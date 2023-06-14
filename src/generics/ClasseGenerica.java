package generics;

class ClasseGenerica<T> {
    private T valor;

    public ClasseGenerica(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}

class ClasseFilha extends ClasseGenerica<String> {
    public ClasseFilha(String valor) {
        super(valor);
    }

    public void imprimirValor() {
        System.out.println("Valor: " + getValor());
    }
    public static void main(String[] args) {
        ClasseFilha obj = new ClasseFilha("Exemplo");
        obj.imprimirValor();
    }
}



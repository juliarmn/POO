package aulaheranca.Lista.ExerciciosExtras.exercicio5;

public class Principal {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
//        funcionarios[0] = new Gerente(" Maria ", 5000, 1000);
//        funcionarios[1] = new Vendedor("Jo ̃ao", 3000, 500);
//        funcionarios[2] = new Vendedor(" Lucas ", 2500, 400);
//        funcionarios[3] = new Funcionario(" Lucas ", 2500, 400);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(" Nome : " + funcionario.getNome());
//            System.out.println(" Area : " + funcionario.getArea()); NÃO TEM METODO getArea
            System.out.println(" Bonus : " + funcionario.calcularBonus());
        }
    }
}

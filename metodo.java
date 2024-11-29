public class metodo {
    public static void main(String[] args) {
        //CHAMEI A CLASSE
        Funcionario fun = new Funcionario(); 

        //SET MODIFICA O VALOR DO ATRIBUTO PRIVADO (altera)
        fun.setNome("Isabelly Moraes"); 
        fun.setCargo("Desenvolvedora");
        fun.setSalario(5000.00);

        //GET OBTER O VALOR DE ATRIBUTO PRIVADO (retorna)
        System.out.println("Nome: " + fun.getNome());
        System.out.println("Cargo: " + fun.getCargo());
        System.out.println("Salário: " + fun.getSalario());

        //CHAMA O METODO P/ AUMENTAR O SALARIO
        fun.aumentarSalario(10);

        //NOVO SALARIO DPD DO AUMENTO
        System.out.println("\nAumento de 10%:");
        System.out.println("Salário Atualizado: " + fun.getSalario());
        System.out.println("Novo Salário: " + (fun.getSalario() + (fun.getSalario() * 0.10)));
    }
}

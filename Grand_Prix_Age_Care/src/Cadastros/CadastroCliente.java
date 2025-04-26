package Cadastros;


public class CadastroCliente extends Cadastro {


    protected String responsavel;
    protected String contatoResponsavel;
    protected String condicoesMedicas;
    protected String necessidadesEspeciais;
    protected Double preferenciasHorario;


    public CadastroCliente(String nome, String dataNascimento, String cpf, String endereco, String telefone, String email, String senha,
                           String responsavel) {
        super(nome, dataNascimento, cpf, endereco, telefone, email, senha);
        this.responsavel = responsavel;
        this.contatoResponsavel = contatoResponsavel;
        this.condicoesMedicas = condicoesMedicas;
        this.necessidadesEspeciais = necessidadesEspeciais;
        this.preferenciasHorario = preferenciasHorario;
    }


    public CadastroCliente(String nome, String dataNascimento, String cpf, String endereco, String telefone, String email, String senha) {
        super(nome, dataNascimento, cpf, endereco, telefone, email, senha);
        this.responsavel = responsavel;
        this.contatoResponsavel = contatoResponsavel;
        this.condicoesMedicas = condicoesMedicas;
        this.necessidadesEspeciais = necessidadesEspeciais;
        this.preferenciasHorario = preferenciasHorario;
    }


    public void exibirFichaMedica(){
        super.exibirFichaMedica();
        System.out.println("Responsável: " + responsavel);
        System.out.println("Contato do Responsável: " + contatoResponsavel);
        System.out.println("Condições Médicas: " + condicoesMedicas);
        System.out.println("Necessidades especiais: " + necessidadesEspeciais);
        System.out.println("Preferências de Horario: " + preferenciasHorario);
    }


}

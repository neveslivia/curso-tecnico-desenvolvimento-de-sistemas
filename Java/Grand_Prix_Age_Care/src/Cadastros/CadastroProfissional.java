package Cadastros;

public class CadastroProfissional extends Cadastro {
    protected String registroProfissional;
    protected String especialidade;
    protected int experiencia;
    protected Disponibilidade_Profissional disponibilidade;
    protected Double valorHora;

    public CadastroProfissional(String nome, String dataNascimento, String cpf, String endereco, String telefone, String email, String senha,
                                String registroProfissional, String especialidade, int experiencia, String disponibilidade, double valorHora) {
        super(nome, dataNascimento, cpf, endereco, telefone, email, senha);
        this.registroProfissional = registroProfissional;
        this.especialidade = especialidade;
        this.experiencia = experiencia;
        this.disponibilidade = Disponibilidade_Profissional.valueOf(disponibilidade.toUpperCase());
        this.valorHora = valorHora;
    }

    public void exibirPerfil() {
        super.exibirDados();
        System.out.println("Registro Profissional: " + registroProfissional);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Experiência: " + experiencia + " anos");
        System.out.println("Disponibilidade: " + disponibilidade);
        System.out.println("Valor por Hora: R$ " + valorHora);
    }
}

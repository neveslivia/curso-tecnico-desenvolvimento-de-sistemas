package Cadastros;
import java.util.Random;
import Validador.Validador;

public class Cadastro {
    protected String nome;
    protected String dataNascimento;
    protected String cpf;
    protected String endereco;
    protected String telefone;
    protected String email;
    protected String senha;
    protected int id;

    public Cadastro(String nome, String dataNascimento, String cpf, String endereco, String telefone, String email, String senha) {
        this.id = new Random().nextInt(100000); // Gera um ID aleatório até 99999
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = Validador.validarCPF(cpf).toString(); // Valida o CPF corretamente
        this.endereco = endereco;
        this.telefone = Validador.validarTelefone(telefone); // Valida telefone
        this.email = Validador.validarEmail(email); // Valida email
        this.senha = senha;
    }

    public Cadastro(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }


    public void exibirDados() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }

    public void exibirFichaMedica() {

    }
}
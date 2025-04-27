package Cadastros;

import BancoDeDadosProfisisonais.BancoDadosProfissionais;

public class Program {
    public static void main(String[] args) {
        BancoDadosProfissionais banco = getDadosProfissionais();

        // Criando clientes e passando atributos por parâmetro para o construtor
        CadastroCliente cliente1 = new CadastroCliente("Roberto Almeida", "22/10/1950", "99753267890", // CPF corrigido
                "Rua Flor, 77", "(58) 79611-2552", "roberto@email.com", "roberto123", "Luiza Almeida"
        );

        CadastroCliente cliente2 = new CadastroCliente("Joana Oliveira", "12/01/1960", "92478563288", // CPF corrigido
                "Rua Alegria, 45", "(25) 11879-6845", "Joana@email.com", "Joana902", "Karla"
        );

        // Listando todos os profissionais cadastrados
        System.out.println("\nLISTA DE TODOS OS PROFISSIONAIS");
        banco.listarTodosProfissionais();
    }

    private static BancoDadosProfissionais getDadosProfissionais() {
        BancoDadosProfissionais banco = new BancoDadosProfissionais();

        // Criando profissionais
        CadastroProfissional profissional1 = new CadastroProfissional(
                "Dr. João Silva", "15/04/1980", "12345678901", "Rua A, 123",
                "(11) 12347-2507", "joao@email.com", "senha123",
                "CRM-12345", "Geriatria", 15, "DISPONIVEL", 200.0
        );

        CadastroProfissional profissional2 = new CadastroProfissional(
                "Dra. Ana Costa", "10/11/1975", "55566677789", "Rua C, 789",
                "(11) 95555-4444", "ana@email.com", "senha456",
                "CRM-67890", "Fisioterapia", 20, "INDISPONIVEL", 180.0
        );

        // Adicionando ao banco de dados
        banco.adicionarProfissional(profissional1);
        banco.adicionarProfissional(profissional2);
        return banco;
    }

}
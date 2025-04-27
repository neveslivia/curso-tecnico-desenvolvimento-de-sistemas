package Agendamento_reservas;

import java.util.Scanner;
import java.util.List;
import BancoDeDadosProfisisonais.BancoDadosProfissionais;
import Cadastros.CadastroProfissional;

public class SistemaAgendamento {
    private final Scanner scanner;
    private final AgendamentoService agendamentoService;
    private final BancoDadosProfissionais bancoProfissionais;

    public SistemaAgendamento(BancoDadosProfissionais bancoProfissionais) {
        this.scanner = new Scanner(System.in);
        this.agendamentoService = new AgendamentoService(bancoProfissionais);
        this.bancoProfissionais = bancoProfissionais;
    }

    public void iniciar() {
        while (true) {
            System.out.println("\n1. Agendar Atendimento\n2. Listar Agendamentos\n3. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Data do atendimento (YYYY-MM-DD): ");
                    String data = scanner.nextLine();

                    List<CadastroProfissional> profissionais = bancoProfissionais.getProfissionais();
                    if (profissionais.isEmpty()) {
                        System.out.println("Nenhum profissional cadastrado.");
                        break;
                    }

                    System.out.println("Escolha o profissional:");
                    for (int i = 0; i < profissionais.size(); i++) {
                        System.out.println((i + 1) + " - " + profissionais.get(i).getNome());
                    }

                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    if (escolha < 1 || escolha > profissionais.size()) {
                        System.out.println("Opção inválida!");
                        break;
                    }

                    CadastroProfissional profissionalSelecionado = profissionais.get(escolha - 1);
                    agendamentoService.agendarAtendimento(data, profissionalSelecionado.getId());
                    break;

                case 2:
                    agendamentoService.listarAgendamentos();
                    break;

                case 3:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
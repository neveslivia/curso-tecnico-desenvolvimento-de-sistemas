/*package Entities;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Chamado_Suporte {
    private  String idChamado;
    private Cadastro id;
    private String titulo;
    private String descricao;
    private Status_Chamado status;
    private Prioridade_Chamado prioridadeChamado;
    private LocalDateTime dataSolicitacao;
    private LocalDateTime dataConclusao;

    public Chamado_Suporte(Cadastro id, String titulo, String descricao, Status_Chamado status, Prioridade_Chamado prioridadeChamado, LocalDateTime dataSolicitacao, LocalDateTime dataConclusao) {
        this.idChamado = UUID.randomUUID().toString();
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = status;
        this.prioridadeChamado = prioridadeChamado;
        this.dataSolicitacao = dataSolicitacao;
        this.dataConclusao = dataConclusao;
    }


    public Chamado_Suporte() {
    }

    public String getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(String idChamado) {
        this.idChamado = idChamado;
    }

    public Cadastro getId() {
        return id;
    }

    public void setId(Cadastro id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status_Chamado getStatus() {
        return status;
    }

    public void setStatus(Status_Chamado status) {
        this.status = status;
    }

    public Prioridade_Chamado getPrioridadeChamado() {
        return prioridadeChamado;
    }

    public void setPrioridadeChamado(Prioridade_Chamado prioridadeChamado) {
        this.prioridadeChamado = prioridadeChamado;
    }

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDateTime dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    private static final Map<String, String> respostas = new HashMap<>();

    static {
        respostas.put("senha", "Para redefinir sua senha, vá até Configurações > Segurança > Redefinir Senha.");
        respostas.put("esquecer senha", "Para redefinir sua senha, vá até Configurações > Segurança > Redefinir Senha.");
        respostas.put("recuperar senha", "Para redefinir sua senha, vá até Configurações > Segurança > Redefinir Senha.");
        respostas.put("erro", "Tente reiniciar o aplicativo. Se o erro persistir, envie um chamado detalhando o problema.");
        respostas.put("bug", "Tente reiniciar o aplicativo. Se o erro persistir, envie um chamado detalhando o problema.");
        respostas.put("falha", "Tente reiniciar o aplicativo. Se o erro persistir, envie um chamado detalhando o problema.");
        respostas.put("login", "Verifique se o e-mail e a senha estão corretos. Caso tenha esquecido sua senha, utilize a opção de recuperação.");
        respostas.put("entrar", "Verifique se o e-mail e a senha estão corretos. Caso tenha esquecido sua senha, utilize a opção de recuperação.");
        respostas.put("bloqueado", "Verifique se o e-mail e a senha estão corretos. Caso tenha esquecido sua senha, utilize a opção de recuperação.");
        respostas.put("atualizar", "Verifique se há atualizações disponíveis na Play Store/App Store e mantenha seu aplicativo atualizado.");
        respostas.put("nova versão", "Verifique se há atualizações disponíveis na Play Store/App Store e mantenha seu aplicativo atualizado.");
        respostas.put("versão antiga", "Verifique se há atualizações disponíveis na Play Store/App Store e mantenha seu aplicativo atualizado.");
        respostas.put("demora", "Pode ser um problema de conexão. Tente reiniciar o aplicativo e verificar sua internet.");
        respostas.put("carregamento", "Pode ser um problema de conexão. Tente reiniciar o aplicativo e verificar sua internet.");
        respostas.put("lento", "Pode ser um problema de conexão. Tente reiniciar o aplicativo e verificar sua internet.");
        respostas.put("travando", "Pode ser um problema de conexão. Tente reiniciar o aplicativo e verificar sua internet.");
        respostas.put("pagamento", "Os pagamentos podem levar até 24 horas para serem processados. Se o problema persistir, entre em contato com nosso suporte financeiro.");
        respostas.put("cobrança", "Os pagamentos podem levar até 24 horas para serem processados. Se o problema persistir, entre em contato com nosso suporte financeiro.");
        respostas.put("cartão", "Os pagamentos podem levar até 24 horas para serem processados. Se o problema persistir, entre em contato com nosso suporte financeiro.");
        respostas.put("boleto", "Os pagamentos podem levar até 24 horas para serem processados. Se o problema persistir, entre em contato com nosso suporte financeiro.");
        respostas.put("suporte", "Nosso suporte funciona de segunda a sexta, das 8h às 18h. Você pode abrir um chamado ou enviar um e-mail para suporte@hcare.com.");
        respostas.put("atendimento", "Nosso suporte funciona de segunda a sexta, das 8h às 18h. Você pode abrir um chamado ou enviar um e-mail para suporte@hcare.com.");
        respostas.put("contato", "Nosso suporte funciona de segunda a sexta, das 8h às 18h. Você pode abrir um chamado ou enviar um e-mail para suporte@hcare.com.");
        respostas.put("cadastro", "Para criar uma conta, basta acessar a tela inicial e clicar em 'Cadastrar-se'.");
        respostas.put("conta", "Para criar uma conta, basta acessar a tela inicial e clicar em 'Cadastrar-se'.");
        respostas.put("registrar", "Para criar uma conta, basta acessar a tela inicial e clicar em 'Cadastrar-se'.");
        respostas.put("excluir conta", "Para excluir sua conta, vá até Configurações > Privacidade e siga as instruções.");
        respostas.put("apagar dados", "Para excluir sua conta, vá até Configurações > Privacidade e siga as instruções.");
        respostas.put("notificações", "Verifique se as notificações do aplicativo estão ativadas nas configurações do seu celular.");
        respostas.put("alerta", "Verifique se as notificações do aplicativo estão ativadas nas configurações do seu celular.");
        respostas.put("aviso", "Verifique se as notificações do aplicativo estão ativadas nas configurações do seu celular.");
        respostas.put("horário", "Você pode configurar lembretes dentro do aplicativo para receber avisos sobre medicamentos e consultas.");
        respostas.put("lembrete", "Você pode configurar lembretes dentro do aplicativo para receber avisos sobre medicamentos e consultas.");
        respostas.put("agendamento", "Você pode configurar lembretes dentro do aplicativo para receber avisos sobre medicamentos e consultas.");
        respostas.put("segurança", "Seus dados são protegidos conforme nossa Política de Privacidade. Para mais informações, acesse nossas configurações.");
        respostas.put("privacidade", "Seus dados são protegidos conforme nossa Política de Privacidade. Para mais informações, acesse nossas configurações.");
        respostas.put("dados pessoais", "Seus dados são protegidos conforme nossa Política de Privacidade. Para mais informações, acesse nossas configurações.");
        respostas.put("relatório", "Os relatórios de monitoramento podem ser acessados na aba 'Histórico' dentro do aplicativo.");
        respostas.put("histórico", "Os relatórios de monitoramento podem ser acessados na aba 'Histórico' dentro do aplicativo.");
        respostas.put("acompanhamento", "Os relatórios de monitoramento podem ser acessados na aba 'Histórico' dentro do aplicativo.");
    }
    public void atualizarStatus(){
        if (status == Status_Chamado.ABERTO) {
            status = Status_Chamado.EM_ANDAMENTO;
        } else if (status == Status_Chamado.EM_ANDAMENTO) {
            status = Status_Chamado.REALIZADO;
        }

    }

    public String gerarResposta(String pergunta) {
        String perguntaLower = pergunta.toLowerCase();
        for (Map.Entry<String, String> entry : respostas.entrySet()) {
            if (perguntaLower.contains(entry.getKey())) {
                return entry.getValue();
            }
        }
        return "Recebemos seu chamado e responderemos em breve.";
    }
}
*/
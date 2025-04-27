package entities;

import java.time.LocalDateTime;

public class Order {
    private Integer id;
    private LocalDateTime moment;
    private OrderStatusEntrega status_pedido;

    public Order(Integer id, LocalDateTime moment, OrderStatusEntrega status_pedido) {
        this.id = id;
        this.moment = moment;
        this.status_pedido = status_pedido;

    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatusEntrega getStatus_pedido() {
        return status_pedido;
    }

    public void setStatus_pedido(OrderStatusEntrega status_pedido) {
        this.status_pedido = status_pedido;
    }

    public void atualizacao() {
        switch (status_pedido) {
            case PAGAMENTO_PENDENTE:
                status_pedido = OrderStatusEntrega.PEDIDO_PROCESSADO;
                System.out.println("Status atualizado para: PEDIDO_PROCESSADO");
                break;
            case PEDIDO_PROCESSADO:
                status_pedido = OrderStatusEntrega.SAIU_PARA_ENTREGA;
                System.out.println("Status atualizado para: SAIU_PARA_ENTREGA");
                break;
            case SAIU_PARA_ENTREGA:
                status_pedido = OrderStatusEntrega.ENTREGUE;
                System.out.println("Status atualizado para: ENTREGUE");
                break;
            case ENTREGUE:
                System.out.println("O pedido já foi entregue, não há mais atualizações.");
                break;
            default:
                System.out.println("Status inválido!");
        }
    }

    @Override
    public String toString() {
        return String.format("Pedido ID: %d\nData:%s\nStatus: %s",
                id, moment, status_pedido);
    }
}

package app.Domain;

public class EncargadoCocina {

    public void prepararPedido(Pedido p) {
        p.cambiarEstado("En preparación");
    }

    public void notificarPedidoListo(Pedido p) {
        p.cambiarEstado("Listo");
    }
}
package br.ufpa.facomp.jsf.domain;
import br.ufpa.facomp.jsf.domain.enumeration.Pagamento;
import br.ufpa.facomp.jsf.domain.enumeration.*;
import java.util.Date;
import java.util.List;
import javax.persistence.*;


public class Pedido {
   private long numero;
   @Enumerated
   private StatusPedido status;
   private double total;
   private Pagamento tipoPagamento;
   @Temporal(TemporalType.DATE)
   private Date inicioPedido;
   @Temporal(TemporalType.DATE)
   private Date fimPedido;
   @Temporal(TemporalType.DATE)
   private Date entregaPedido;
   @OneToMany(mappedBy = "pedido")
    private List<Produto> produto;
  
}

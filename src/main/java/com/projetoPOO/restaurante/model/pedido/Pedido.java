package com.projetoPOO.restaurante.model.pedido;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.projetoPOO.restaurante.model.itemPedido.ItemPedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "cd_idpedido")
    private Long id;

    @Column(name = "nm_cliente")
    private String cliente;

    @Column(name = "ic_entregar")
    private boolean entregar;

    @Column(name = "ds_endereco")
    private String endereco;

    @Column(name = "ic_pronto")
    private boolean pronto;

    @OneToMany(mappedBy = "Pedido", fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    private List<ItemPedido> itens = new ArrayList<>();

    public List<ItemPedido> getItens() {
        return itens;
    }

    public Pedido(Long id, String cliente, boolean entregar, String endereco, boolean pronto) {
        this.id = id;
        this.cliente = cliente;
        this.entregar = entregar;
        this.endereco = endereco;
        this.pronto = pronto;
    }

    public Pedido(DadosCadastroPedido dados) {
        this.cliente = dados.cliente();
        this.entregar = dados.entregar();
        this.endereco = dados.endereco();
        this.pronto = false;
    }

    public BigDecimal getTotal() {
        Hibernate.initialize(itens);
        BigDecimal total = BigDecimal.ZERO;
        for (ItemPedido item : itens) {
            total = total.add(item.getItemCardapio()
                .getPreco().multiply(new BigDecimal(
                    item.getQuantidade()                
                )));
        }
        return total;
    }

    public Pedido() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public boolean isEntregar() {
        return entregar;
    }

    public void setEntregar(boolean entregar) {
        this.entregar = entregar;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isPronto() {
        return pronto;
    }

    public void setPronto(boolean pronto) {
        this.pronto = pronto;
    }
    
    
}

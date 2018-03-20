/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.MarketPlaceKonrad.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
/**
 *
 * @author Manuel S. Nino
 */
@Entity (name = "Producto")
public class ProductoEntity implements Serializable {
    private final static long serialVersionUID = 1L;
    
     /**
     * Codigo del producto  - llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="cod_producto" , nullable = false , unique = true)
    private Long codProducto;
    
     /**
     * Nombre del producto
     */
    @Column(name = "nom_producto" , nullable = false)
    private String nomProducto;
    
    /**
     * valor por producto
     */
    @Column(name = "valor_unitario" , nullable = false)
    private double valorUnitario;
    
    /**
     * Garantia del producto
     */
    @Column(name = "garantia" , nullable = false)
    private int garantia;
    
     /**
     * Stock de producto (Cantidades disponibles)
     */
    @Column(name = "stock_disponible" , nullable = false)
    private int stockDisponible;   
    
    /**
     * Relacion con Tipo de producto - Llave foranea
     */
    @ManyToOne
    @JoinColumn(name = "cod_tipo")
    private TipoProductoEntity tipoProducto;
    
    /**
     * Relacion con Marca - Llave foranea
     */
    @ManyToOne
    @JoinColumn(name = "cod_marca")
    private MarcaEntity marca;    
}

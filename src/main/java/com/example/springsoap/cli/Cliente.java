//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v3.0.0 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2024.09.30 às 02:50:01 PM BRT 
//


package com.example.springsoap.cli;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cliente complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nascimento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="profissao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sobrenome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="genero" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = {
    "nome",
    "endereco",
    "nascimento",
    "profissao",
    "sobrenome",
    "genero",
    "id"
})
public class Cliente {

    @XmlElement(required = true)
    protected String nome;
    @XmlElement(required = true)
    protected String endereco;
    @XmlElement(required = true)
    protected String nascimento;
    @XmlElement(required = true)
    protected String profissao;
    @XmlElement(required = true)
    protected String sobrenome;
    @XmlElement(required = true)
    protected String genero;
    @XmlElement(required = true)
    protected String id;

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade endereco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o valor da propriedade endereco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Obtém o valor da propriedade nascimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * Define o valor da propriedade nascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNascimento(String value) {
        this.nascimento = value;
    }

    /**
     * Obtém o valor da propriedade profissao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * Define o valor da propriedade profissao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfissao(String value) {
        this.profissao = value;
    }

    /**
     * Obtém o valor da propriedade sobrenome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Define o valor da propriedade sobrenome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobrenome(String value) {
        this.sobrenome = value;
    }

    /**
     * Obtém o valor da propriedade genero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define o valor da propriedade genero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenero(String value) {
        this.genero = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}

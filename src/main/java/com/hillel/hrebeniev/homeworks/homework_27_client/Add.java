package com.hillel.hrebeniev.homeworks.homework_27_client;

import com.hillel.hrebeniev.homeworks.homework_14.cofee.order.Order;

import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for add complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="add"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://service.hillel.edu/}order" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlType(name = "add", propOrder = {
        "arg0"
})
public class Add {

    protected Order arg0;

    /**
     * Gets the value of the arg0 property.
     *
     * @return
     *     possible object is
     *     {@link Order }
     *
     */
    public Order getArg0() {
        return arg0;
    }
    /**
     * Sets the value of the arg0 property.
     *
     * @param value
     *     allowed object is
     *     {@link Order }
     *
     */
    public void setArg0(Order value) {
        this.arg0 = value;
    }

}
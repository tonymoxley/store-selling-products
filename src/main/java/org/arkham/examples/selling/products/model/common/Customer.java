package org.arkham.examples.selling.products.model.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Ing. Jose Antonio Hedz Cortes
 * @version 1.0
 * @since 12/jun./2023, 22:49
 **/
@Data
public class Customer extends Person implements Serializable {

    private User user;

    private static final long serialVersionUID = 215889003326456373L;

}

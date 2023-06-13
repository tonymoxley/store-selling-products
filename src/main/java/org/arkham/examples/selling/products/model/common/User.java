package org.arkham.examples.selling.products.model.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Ing. Jose Antonio Hedz Cortes
 * @version 1.0
 * @since 12/jun./2023, 22:46
 **/
@Data
public class User implements Serializable {

    private Long id;

    private String username;

    private String email;

    private String password;

    private static final long serialVersionUID = 110202819833833744L;

}

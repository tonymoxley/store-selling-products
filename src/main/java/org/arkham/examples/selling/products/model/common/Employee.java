package org.arkham.examples.selling.products.model.common;

import lombok.Data;

/**
 * @author Ing. Jose Antonio Hedz Cortes
 * @version 1.0
 * @since 12/jun./2023, 22:48
 **/
@Data
public class Employee extends Person {

    private Long id;

    private String employeeId;

    private String rfc;

}

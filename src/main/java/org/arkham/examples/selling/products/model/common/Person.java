package org.arkham.examples.selling.products.model.common;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author Ing. Jose Antonio Hedz Cortes
 * @version 1.0
 * @since 12/jun./2023, 22:47
 **/
@Data
public class Person implements Serializable {

    private String name;

    private String lastName;

    private int age;

    private LocalDate dateOfBirth;

    private static final long serialVersionUID = 4566222945235668256L;

}

package org.arkham.examples.selling.products.repository;

import org.arkham.examples.selling.products.model.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ing. Jose Antonio Hedz Cortes
 * @version 1.0
 * @since 12/jun./2023, 22:52
 **/
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}

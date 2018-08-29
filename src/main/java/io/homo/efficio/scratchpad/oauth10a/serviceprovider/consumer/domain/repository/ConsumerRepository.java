package io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.domain.repository;

import io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.domain.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author homo.efficio@gmail.com
 * Created on 2018-08-30.
 */
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {
}

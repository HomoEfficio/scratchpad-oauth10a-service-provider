package io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.service;

import io.homo.efficio.scratchpad.oauth10a.serviceprovider.common.util.CryptoUtil;
import io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.domain.Consumer;
import io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.domain.repository.ConsumerRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

/**
 * @author homo.efficio@gmail.com
 * Created on 2018-08-30.
 */
@Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ConsumerService {

    @NonNull
    private ConsumerRepository repository;

    public Consumer save(Consumer consumer) {
        final String consumerKey = CryptoUtil.generateConsumerKey();
        final String consumerSecret = CryptoUtil.generateConsumerSecret();
        consumer.setConsumerKey(consumerKey);
        consumer.setConsumerSecret(consumerSecret);

        return this.repository.save(consumer);
    }

    public Consumer findById(Long id) {
        return this.repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Consumer not found exception"));
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}

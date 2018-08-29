package io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.service;

import io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.domain.Consumer;
import io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.domain.repository.ConsumerRepository;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author homo.efficio@gmail.com
 * Created on 2018-08-30.
 */
@RunWith(SpringRunner.class)
public class ConsumerServiceTest {

    @MockBean
    private ConsumerRepository repository;

    private ConsumerService service;


    @Before
    public void setup() {
        this.service = new ConsumerService(this.repository);
    }

    @Test
    public void whenCreate__thenReturnConsumer() {
        // given
        final Consumer consumer = new Consumer(
                1L,
                "$ HomoEfficio Consumer App $",
                "OAuth 1.0a consumer app",
                "http://oauth10a.consumer.homoefficio.io/callback"
        );
        Mockito.when(this.repository.save(consumer))
                .thenReturn(consumer);
        Mockito.when(this.repository.findById(1L))
                .thenReturn(Optional.of(consumer));


        // when
        this.repository.save(consumer);
        final Consumer dbConsumer = this.repository.findById(1L).orElseThrow(() -> new RuntimeException());


        // then
        assertThat(dbConsumer.getCallbackUrl()).isEqualTo("http://oauth10a.consumer.homoefficio.io/callback");
    }
}

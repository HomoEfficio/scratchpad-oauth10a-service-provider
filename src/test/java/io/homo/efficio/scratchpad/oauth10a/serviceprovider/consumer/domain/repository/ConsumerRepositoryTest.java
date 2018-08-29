package io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.domain.repository;

import io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.domain.Consumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author homo.efficio@gmail.com
 * Created on 2018-08-30.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class ConsumerRepositoryTest {

    @Autowired
    private ConsumerRepository repository;

    @Test
    public void jpaTest() {}

    @Test
    public void whenSave__thenSave() {
        // given
        final Consumer consumer = new Consumer(
                "$ HomoEfficio Consumer App $",
                "OAuth 1.0a consumer app",
                "http://oauth10a.consumer.homoefficio.io/callback"
        );


        // when
        final Consumer dbConsumer = this.repository.saveAndFlush(consumer);


        // then
        assertThat(dbConsumer.getName()).isEqualTo("$ HomoEfficio Consumer App $");
    }
}

package io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.domain;

import io.homo.efficio.scratchpad.oauth10a.serviceprovider.common.domain.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author homo.efficio@gmail.com
 * Created on 2018-08-29.
 */
@Entity
@Table(name = "consumer")
@Data
public class Consumer extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "consumer_id")
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private String callbackUrl;

    private String consumerKey;

    private String consumerSecret;

    public Consumer(@NotNull String name, @NotNull String description, @NotNull String callbackUrl) {
        this.name = name;
        this.description = description;
        this.callbackUrl = callbackUrl;
    }
}

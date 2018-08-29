package io.homo.efficio.scratchpad.oauth10a.serviceprovider.consumer.domain;

import io.homo.efficio.scratchpad.oauth10a.serviceprovider.common.domain.BaseEntity;
import lombok.Data;
import lombok.NonNull;

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

    public Consumer(@NonNull String name, @NonNull String description, @NonNull String callbackUrl) {
        this.name = name;
        this.description = description;
        this.callbackUrl = callbackUrl;
    }

    public Consumer(@NonNull Long id, @NonNull String name, @NonNull String description, @NonNull String callbackUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.callbackUrl = callbackUrl;
    }
}

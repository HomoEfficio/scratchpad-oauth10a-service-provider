package io.homo.efficio.scratchpad.oauth10a.serviceprovider.common.util;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Base64;
import java.util.UUID;

/**
 * @author homo.efficio@gmail.com
 * Created on 2018-09-02.
 */
public class CryptoUtil {

    public static String generateConsumerKey() {
        return Base64.getEncoder().encodeToString(UUID.randomUUID().toString().getBytes());
    }

    public static String generateConsumerSecret() {
        return Base64.getEncoder().encodeToString(DigestUtils.sha256Hex(UUID.randomUUID().toString().getBytes()).getBytes());
    }
}

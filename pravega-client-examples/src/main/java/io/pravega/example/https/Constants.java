/*
 * Copyright (c) 2019 Dell Inc., or its subsidiaries. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 */
package io.pravega.example.https;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.UUID;

/**
 * Defines a handful of constants shared by classes in this package.
 *
 */
public class Constants {
    static final String SCOPE = "examples";
    static final String STREAM_NAME = "httpsStream";
    static final URI CONTROLLER_URI = URI.create("tls://localhost:9090");
    static final int NO_OF_SEGMENTS = 1;

    static final String ROUTING_KEY = "httpsRoutingKey";
    static final String MESSAGE = "hello https world!";

    static String READER_GROUP_NAME = null;

    static String TRUSTSTORE_PATH = null;

    static {
        READER_GROUP_NAME = UUID.randomUUID().toString().replace("-", "");
        try {
            TRUSTSTORE_PATH = Paths.get(Constants.class.getClassLoader().getResource("cert.pem").toURI())
                    .toAbsolutePath().toString();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}

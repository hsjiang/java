package com.riven_chris.repeating_annotations;

import java.lang.annotation.Repeatable;

@Repeatable(ContainerA.class)
public @interface ModelA {
    String value();
}

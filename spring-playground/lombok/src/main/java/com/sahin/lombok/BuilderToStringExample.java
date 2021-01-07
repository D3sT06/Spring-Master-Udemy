package com.sahin.lombok;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.Arrays;
import java.util.Set;

@Builder
@ToString(includeFieldNames = false)
class BuilderToStringExample {

    @Builder.Default
    @ToString.Exclude
    private long created = System.currentTimeMillis();

    private String name;
    private int age;

    @Singular
    private Set<String> occupations;


}

class TestBuilder {
    public static void main(String[] args) {

        BuilderToStringExample example = BuilderToStringExample
                .builder()
                .age(10)
                .name("John")
                //.occupation("Engineer")
                .occupations(Arrays.asList("Engineer", "Driver"))
                .build();

        System.out.println(example.toString());
    }
}

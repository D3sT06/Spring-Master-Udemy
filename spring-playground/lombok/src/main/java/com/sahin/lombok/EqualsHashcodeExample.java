package com.sahin.lombok;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class EqualsHashcodeExample {

    private transient int transientVar = 10;
    private String name;
    private double score;
    private String[] tags;

    @EqualsAndHashCode.Exclude
    private int id;

    @EqualsAndHashCode(callSuper = true)
    public static class DerivedClass extends EqualsHashcodeExample {

        private final int width, height;

        public DerivedClass(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}

package com.sahin.lombok;

import lombok.*;

@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class ConstructorExample<T> {

    private int x;
    private int y;

    @NonNull
    private T description;

    @NoArgsConstructor
    public static class NoArgsExample {
        private String field;
    }
}

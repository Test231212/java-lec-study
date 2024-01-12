package com.metacoding.myhttp;

import lombok.*;

@NoArgsConstructor // 파라미터가 없는 기본 생성자를 만듬
@AllArgsConstructor // 모든 필드값을 순서대로 파라미터로 받는 생성자
@Data // Getter+Setter 둘 다 들고있음
@Getter // JVM이 실행시 참조, 실행전에는 만들지 않음
@Setter

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
}


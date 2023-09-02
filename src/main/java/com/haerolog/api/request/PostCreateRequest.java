package com.haerolog.api.request;

import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@ToString
public class PostCreateRequest {

    @NotBlank(message = "타이틀을 입력해주세요.")
    public String title;

    @NotBlank(message = "콘텐츠를 입력해주세요.")
    public String content;

    private PostCreateRequest() {
    }

}

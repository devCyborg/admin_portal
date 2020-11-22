package com.portal.appusers.domain;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class HttpResponse {

    private Date timeStamp;
    private int httpStatusCode; // 200, 201, 400, 500
    private HttpStatus httpStatus;
    private String reason;
    private String message;

}

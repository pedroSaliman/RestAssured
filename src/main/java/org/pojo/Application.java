package org.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
//import lombok.Setter;


/**
 * Hello world!
 *
 */
@Getter
@Builder(setterPrefix = "set",buildMethodName = "perform")
@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder(value = {"name","job"})

public class Application

{
    public Application(){}
    private String name;
    private String job;



}

package com.isxcode.star.api.view.pojo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EchartSeries {

    private String name;

    private String type;

    private String radius;

    private List<Object> data;

    private EchartEmphasis emphasis;
}

package com.isxcode.star.api.form.pojos.res;

import com.isxcode.star.api.form.pojos.dto.FomComponentDto;
import com.isxcode.star.api.work.pojos.dto.SyncRule;
import lombok.Data;

import java.util.List;

@Data
public class FomGetFormRes {

	private String id;

	private String name;

	private String datasourceId;

	private String mainTable;

  private String createMode;

  private String insertSql;

  private String deleteSql;

  private String updateSql;

  private String selectSql;

	private List<FomComponentDto> components;
}

package com.yangk.springbootthymeleaf.excelexportpoi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description 表头
 * @Author yangkun
 * @Date 2019/10/8
 * @Version 1.0
 * @blame yangkun
 */
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class ExcelHeaderInfo {

    //标题的首行坐标
    private int firstRow;

    //标题的末行坐标
    private int lastRow;

    //标题的首列坐标
    private int firstCol;

    //标题的首行坐标
    private int lastCol;

    // 标题
    private String title;

}

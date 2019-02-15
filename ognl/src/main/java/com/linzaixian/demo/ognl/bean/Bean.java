/**
 * Copyright(c) Foresee Science & Technology Ltd.
 */
package com.linzaixian.demo.ognl.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre>
 * TODO。
 * </pre>
 *
 * @author linzaixian@foresee.com.cn
 * @date 2018年2月9日
 * @version 1.00.00
 *
 *          <pre>
 * 修改记录 
 *    修改后版本:     修改人：  修改日期:     修改内容:
 *          </pre>
 */

public class Bean {
    private static final Logger logger= LoggerFactory.getLogger(Bean.class);
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test() {
        logger.debug("---begin---");
        logger.debug(name);
        logger.debug("---end---");
    }

    public String test(String name) {
        logger.debug("---begin---");
        logger.debug(name);
        logger.debug("---end---");
        return name;
    }
}

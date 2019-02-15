/**
 * Copyright(c) Foresee Science & Technology Ltd. 
 */
package com.linzaixian.demo.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <pre>
 * 运行所有测试类
 * </pre>
 * @author linzaixian@foresee.com.cn
 * @date 2018年1月22日
 * @version 1.00.00
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ Main.class , SpringMain.class})
public class All {
}

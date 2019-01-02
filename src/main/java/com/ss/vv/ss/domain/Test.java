/** 
* 
* @author bingoWu 
* @data 2018年12月23日 00:03:48  
*/  

package com.ss.vv.ss.domain;
import java.math.BigDecimal;
import java.util.Date;
/** 
* 
* @author young 
* @data
*/  

	//映射数据库文件
	//写下getter/setter方法

	//2.mapper

	//接口
	//2.创建改testsice，接口
	//tablename

	//3.改mapper文件

	//4. controller
	//order排序

	//在usermapper里面添加接口

public class Test implements java.io.Serializable {
	private Integer testId; // 测试ID
	private String testName; // 测试名称
	private String info; // 测试名称
	private String other; // 测试名称


	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}

}


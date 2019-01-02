/*** 生成自 bingowu的 autoWeb 于 2018年01月22日 V2.0.0 版本  */
package com.ss.vv.common;

import org.springframework.stereotype.Component;

@Component("webResponse")
public class WebResponse {
	private String VERSION = Config.VERSION;
	private Integer statusCode;
	private String statusMsg;
	private String version;
	private String token;

	/**
	 * 结果
	 */
	private Object data;

	private WebResponse instance;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMsg() {
		return statusMsg;
	}

	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public WebResponse getWebResponse(Object data) {
		System.out.println("我是只含有一个形参的getWebResponse");
		String statusMsg = "";
		return getWebResponse(statusMsg, data);
	}

	public WebResponse getWebResponse(String statusMsg, Object data) {
		System.out.println("我是第一个getWebResponse");
		Integer statusCode = 200;
		return getWebResponse(statusCode, statusMsg, data);
	}

	public WebResponse getWebResponse(Integer statusCode, String statusMsg, Object data) {
		System.out.println("我是第二个getWebResponse");
		String token = "";
		return getWebResponse(statusCode, statusMsg, data, token);
	}

	public WebResponse getWebResponse(Integer statusCode, String statusMsg, Object data, String token) {
		System.out.println("我是第三个getWebResponse");
		instance = new WebResponse();
		instance.setStatusCode(statusCode);
		instance.setStatusMsg(statusMsg);
		instance.setData(data);
		instance.setToken(token);
		instance.setVersion(instance.VERSION);
		return instance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WebResponse [statusCode=");
		builder.append(statusCode);
		builder.append(", statusMsg=");
		builder.append(statusMsg);
		builder.append(", version=");
		builder.append(version);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		System.out.println("我是getWebResponse的tostring方法");
		return builder.toString();
	}

}


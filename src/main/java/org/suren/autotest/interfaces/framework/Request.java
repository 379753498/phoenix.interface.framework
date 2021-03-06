/**
 * http://surenpi.com
 */
package org.suren.autotest.interfaces.framework;

import java.util.List;
import java.util.Map;

/**
 * @author suren
 * @date Aug 13, 2016 7:25:05 PM
 */
public class Request
{
	private String url;
	private String type;
	private List<Param> paramList;
	private Map<String, String> bodyParam;
	private int loop;
	private boolean enable = true;
	private boolean jsonApp;
	public String getUrl()
	{
		return url;
	}
	public void setUrl(String url)
	{
		this.url = url;
	}
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public List<Param> getParamList()
	{
		return paramList;
	}
	public void setParamList(List<Param> paramList)
	{
		this.paramList = paramList;
	}
	public int getLoop() {
		return loop;
	}
	public void setLoop(int loop) {
		this.loop = loop;
	}
	/**
	 * @return the bodyParam
	 */
	public Map<String, String> getBodyParam()
	{
		return bodyParam;
	}
	/**
	 * @param bodyParam the bodyParam to set
	 */
	public void setBodyParam(Map<String, String> bodyParam)
	{
		this.bodyParam = bodyParam;
	}
	/**
	 * @return the enable
	 */
	public boolean isEnable()
	{
		return enable;
	}
	/**
	 * @param enable the enable to set
	 */
	public void setEnable(boolean enable)
	{
		this.enable = enable;
	}
	/**
	 * @return the jsonApp
	 */
	public boolean isJsonApp()
	{
		return jsonApp;
	}
	/**
	 * @param jsonApp the jsonApp to set
	 */
	public void setJsonApp(boolean jsonApp)
	{
		this.jsonApp = jsonApp;
	}
}

package org.swchalu.wxpay.bean;

/**
 * ����code��õ�token��bean
 * 
 * @author swc12
 *
 */
public class AccessToken {

	/**
	 * ��ҳ��Ȩ�ӿڵ���ƾ֤,ע�⣺��access_token�����֧�ֵ�access_token��ͬ
	 */
	private String access_token;
	/**
	 * access_token�ӿڵ���ƾ֤��ʱʱ�䣬��λ���룩
	 */
	private String expires_in;
	/**
	 * �û�ˢ��access_token
	 */
	private String refresh_token;
	/**
	 * �û�Ψһ��ʶ����ע�⣬��δ��ע���ں�ʱ���û����ʹ��ںŵ���ҳ��Ҳ�����һ���û��͹��ں�Ψһ��OpenID
	 */
	private String openid;
	/**
	 * �û���Ȩ��������ʹ�ö��ţ�,���ָ�
	 */
	private String scope;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}

	public String getRefresh_token() {
		return refresh_token;
	}

	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String toString() {
		StringBuffer out = new StringBuffer("");
		out.append("AccessToken : " + getAccess_token() + "\n");
		out.append("Expires_in : " + getExpires_in() + "\n");
		out.append("Openid : " + getOpenid() + "\n");
		out.append("Refresh_token : " + getRefresh_token() + "\n");
		out.append("Scope : " + getScope() + "\n");
		return out.toString();
	}
}
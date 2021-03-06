package com.tencent.component.network.module.base.inter;

public abstract interface IDownloadConfig
{
  public abstract boolean enableDns114();
  
  public abstract long getCurrentUin();
  
  public abstract int getOperator();
  
  public abstract String getQUA();
  
  public abstract String getRefer();
  
  public abstract int getReportPercent();
  
  public abstract String getTerminal();
  
  public abstract String getUserAgent();
  
  public abstract String getVersion();
  
  public abstract int photoDownloadKeepAliveConfig();
  
  public abstract int photoDownloadKeepAliveProxyConfig();
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\component\network\module\base\inter\IDownloadConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
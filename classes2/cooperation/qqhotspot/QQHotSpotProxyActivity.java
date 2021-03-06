package cooperation.qqhotspot;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pluginsdk.PluginProxyActivity;
import com.tencent.mobileqq.widget.QQProgressDialog;
import com.tencent.qphone.base.util.QLog;
import cooperation.plugin.IPluginManager;
import cooperation.plugin.IPluginManager.PluginParams;
import java.util.Iterator;
import java.util.List;

public class QQHotSpotProxyActivity
  extends PluginProxyActivity
{
  private static final String a = "QQHotSpotProxyActivity";
  
  public QQHotSpotProxyActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  private static Class a(Intent paramIntent, String paramString)
  {
    if ((paramIntent.getFlags() & 0x20000000) != 0) {
      return QQHotSpotProxyActivity.SingleTop.class;
    }
    return QQHotSpotProxyActivity.class;
  }
  
  public static void a(Activity paramActivity, String paramString1, Intent paramIntent, String paramString2, int paramInt, QQProgressDialog paramQQProgressDialog)
  {
    paramIntent.putExtra("userQqResources", 1);
    IPluginManager.PluginParams localPluginParams = new IPluginManager.PluginParams(0);
    localPluginParams.jdField_b_of_type_JavaLangString = "qqhotspot_plugin.apk";
    localPluginParams.d = "QQ商家Wi-Fi";
    localPluginParams.jdField_a_of_type_JavaLangString = paramString1;
    localPluginParams.e = paramString2;
    localPluginParams.jdField_a_of_type_JavaLangClass = a(paramIntent, paramString2);
    localPluginParams.jdField_a_of_type_AndroidContentIntent = paramIntent;
    localPluginParams.jdField_b_of_type_Int = paramInt;
    localPluginParams.jdField_a_of_type_AndroidAppDialog = paramQQProgressDialog;
    localPluginParams.c = 10000;
    localPluginParams.f = null;
    IPluginManager.a(paramActivity, localPluginParams);
  }
  
  public static boolean a(Context paramContext)
  {
    if (paramContext == null) {
      return false;
    }
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (paramContext == null) {
      return false;
    }
    paramContext = paramContext.iterator();
    while (paramContext.hasNext()) {
      if ("com.tencent.mobileqq:qqhotspot".compareTo(((ActivityManager.RunningAppProcessInfo)paramContext.next()).processName) == 0) {
        return true;
      }
    }
    return false;
  }
  
  public String getPluginID()
  {
    return "qqhotspot_plugin.apk";
  }
  
  protected Class getProxyActivity(String paramString)
  {
    return super.getProxyActivity(paramString);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!TextUtils.isEmpty(this.mCreateErrorInfo)) {
      if (paramBundle == null) {
        break label71;
      }
    }
    for (;;)
    {
      paramBundle = paramBundle.getString("pluginsdk_launchActivity");
      StringBuffer localStringBuffer = new StringBuffer("[插件Activity启动] ");
      localStringBuffer.append(paramBundle).append(" ").append(this.mCreateErrorInfo);
      if (QLog.isColorLevel()) {
        QLog.e("QQHotSpotProxyActivity", 2, localStringBuffer.toString());
      }
      return;
      label71:
      paramBundle = getIntent().getExtras();
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\qqhotspot\QQHotSpotProxyActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
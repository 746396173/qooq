import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.biz.troop.TroopMemberApiClient.Callback;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.jsp.MediaApiPlugin;
import com.tencent.mobileqq.jsp.TroopApiPlugin;
import com.tencent.mobileqq.webview.swift.WebViewPlugin.PluginRuntime;
import com.tencent.qphone.base.util.QLog;
import java.io.File;
import org.json.JSONObject;

public class syd
  implements TroopMemberApiClient.Callback
{
  public syd(TroopApiPlugin paramTroopApiPlugin, long paramLong1, long paramLong2, String paramString)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(Bundle paramBundle)
  {
    boolean bool = true;
    paramBundle = paramBundle.getString("videoPath");
    Object localObject;
    if (!TextUtils.isEmpty(paramBundle))
    {
      localObject = new File(paramBundle);
      if ((!((File)localObject).exists()) || (!((File)localObject).isFile())) {}
    }
    for (;;)
    {
      if (QLog.isColorLevel()) {
        QLog.d("TroopApiPlugin", 2, "previewRewardVideo: videoPath=" + paramBundle + ", " + bool);
      }
      try
      {
        localObject = new JSONObject();
        if (bool)
        {
          MediaApiPlugin.a(this.jdField_a_of_type_ComTencentMobileqqJspTroopApiPlugin.mRuntime.a(), paramBundle, this.jdField_a_of_type_Long, this.b);
          ((JSONObject)localObject).put("ret", 0);
          ((JSONObject)localObject).put("errMsg", "");
        }
        for (;;)
        {
          this.jdField_a_of_type_ComTencentMobileqqJspTroopApiPlugin.callJs(this.jdField_a_of_type_JavaLangString, new String[] { ((JSONObject)localObject).toString() });
          return;
          ((JSONObject)localObject).put("ret", -2);
          ((JSONObject)localObject).put("errMsg", "文件不存在");
        }
        QLog.w("TroopApiPlugin", 2, "previewRewardVideo exp", paramBundle);
      }
      catch (Exception paramBundle)
      {
        if (!QLog.isColorLevel()) {
          break;
        }
      }
      return;
      bool = false;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\syd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
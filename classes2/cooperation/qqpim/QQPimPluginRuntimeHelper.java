package cooperation.qqpim;

import com.qq.jce.wup.BasicClassTypeUtil;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pluginsdk.PluginStatic;
import com.tencent.qphone.base.util.QLog;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import mqq.app.AppRuntime;

public class QQPimPluginRuntimeHelper
{
  private static final String a = "com.qqpim.application.QQPimPluginRuntime";
  
  public QQPimPluginRuntimeHelper()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public static AppRuntime a(BaseApplicationImpl paramBaseApplicationImpl, String paramString)
  {
    if ((paramBaseApplicationImpl == null) || (paramString == null))
    {
      if (QLog.isColorLevel()) {
        QLog.d(QQPimDefineList.a, 2, "createQQPimRuntime() application == null || processName == null");
      }
      return null;
    }
    try
    {
      Class localClass1 = Class.forName("com.qqpim.application.QQPimPluginRuntime");
      if (localClass1 != null) {}
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        try
        {
          if (!QLog.isColorLevel()) {
            break;
          }
          QLog.d(QQPimDefineList.a, 2, "createQQPimRuntime() cls == null");
        }
        catch (ClassNotFoundException paramBaseApplicationImpl)
        {
          ClassLoader localClassLoader;
          paramBaseApplicationImpl.printStackTrace();
        }
        localClassNotFoundException = localClassNotFoundException;
        localClassLoader = PluginStatic.getOrCreateClassLoader(paramBaseApplicationImpl, "qqpim_plugin.apk");
        Class localClass2 = localClassLoader.loadClass("com.qqpim.application.QQPimPluginRuntime");
        BasicClassTypeUtil.setClassLoader(true, localClassLoader);
        continue;
        do
        {
          return null;
          if (QLog.isColorLevel()) {
            QLog.d(QQPimDefineList.a, 2, "createQQPimRuntime() 1 ");
          }
          paramBaseApplicationImpl = localClass2.getDeclaredConstructor(new Class[] { BaseApplicationImpl.class, String.class }).newInstance(new Object[] { paramBaseApplicationImpl, paramString });
        } while ((paramBaseApplicationImpl == null) || (!(paramBaseApplicationImpl instanceof AppRuntime)));
        if (QLog.isColorLevel()) {
          QLog.d(QQPimDefineList.a, 2, "createQQPimRuntime() succ");
        }
        paramBaseApplicationImpl = (AppRuntime)paramBaseApplicationImpl;
        return paramBaseApplicationImpl;
      }
    }
    catch (IllegalArgumentException paramBaseApplicationImpl)
    {
      for (;;)
      {
        paramBaseApplicationImpl.printStackTrace();
      }
    }
    catch (IllegalAccessException paramBaseApplicationImpl)
    {
      for (;;)
      {
        paramBaseApplicationImpl.printStackTrace();
      }
    }
    catch (InstantiationException paramBaseApplicationImpl)
    {
      for (;;)
      {
        paramBaseApplicationImpl.printStackTrace();
      }
    }
    catch (InvocationTargetException paramBaseApplicationImpl)
    {
      for (;;)
      {
        paramBaseApplicationImpl.printStackTrace();
      }
    }
    catch (NoSuchMethodException paramBaseApplicationImpl)
    {
      for (;;)
      {
        paramBaseApplicationImpl.printStackTrace();
      }
    }
    catch (Exception paramBaseApplicationImpl)
    {
      for (;;)
      {
        paramBaseApplicationImpl.printStackTrace();
      }
    }
    return null;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\cooperation\qqpim\QQPimPluginRuntimeHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
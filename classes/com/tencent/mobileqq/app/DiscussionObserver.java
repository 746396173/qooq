package com.tencent.mobileqq.app;

import QQService.RespAddDiscussMember;
import QQService.RespGetDiscussInfo;
import android.util.Pair;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.PBStringField;
import com.tencent.mobileqq.pb.PBUInt32Field;
import com.tencent.protofile.discuss.FlyTicket.DiscussGetUrlResponse;
import com.tencent.protofile.discuss.FlyTicket.DiscussSigDecodeResponse;
import com.tencent.protofile.discuss.FlyTicket.RetInfo;
import com.tencent.qphone.base.util.QLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DiscussionObserver
  implements BusinessObserver
{
  public DiscussionObserver()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  protected void a() {}
  
  public void a(int paramInt, boolean paramBoolean, Object paramObject)
  {
    if (QLog.isColorLevel()) {
      QLog.d("Discussion", 2, "Discussion DiscussObserver onUpdate type" + paramInt);
    }
    switch (paramInt)
    {
    }
    do
    {
      Object localObject1;
      do
      {
        do
        {
          return;
          a(paramBoolean);
          return;
          a(paramBoolean, (Object[])paramObject);
          return;
          paramObject = (Object[])paramObject;
        } while (!(paramObject[1] instanceof Integer));
        paramInt = ((Integer)paramObject[1]).intValue();
        if (paramBoolean)
        {
          paramObject = (RespAddDiscussMember)paramObject[2];
          localObject1 = ((RespAddDiscussMember)paramObject).AddResult;
          Object localObject3 = ((Map)localObject1).keySet();
          localObject2 = new ArrayList();
          localObject3 = ((Set)localObject3).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            Long localLong = (Long)((Iterator)localObject3).next();
            if (((Integer)((Map)localObject1).get(localLong)).intValue() == 0) {
              ((ArrayList)localObject2).add(String.valueOf(localLong));
            }
          }
          a(true, paramInt, ((RespAddDiscussMember)paramObject).DiscussUin, (ArrayList)localObject2);
          return;
        }
        a(false, paramInt, Long.valueOf((String)paramObject[0]).longValue(), null);
        return;
        a(paramBoolean, (String)paramObject);
        return;
        paramObject = (Object[])paramObject;
      } while ((paramObject == null) || (paramObject.length != 3));
      paramInt = ((Integer)paramObject[2]).intValue();
      if (paramObject[0] == null) {}
      for (long l = 0L;; l = ((Long)paramObject[0]).longValue())
      {
        a(paramBoolean, paramInt, l, (String)paramObject[1]);
        return;
      }
      b(paramBoolean, (String)paramObject);
      return;
      d(paramBoolean, (String)paramObject);
      return;
      paramObject = (Pair)paramObject;
      a(paramBoolean, ((Boolean)((Pair)paramObject).first).booleanValue(), (String)((Pair)paramObject).second);
      return;
      a((Object[])paramObject);
      return;
      a();
      return;
      b();
      return;
      a(paramBoolean, ((Long)paramObject).longValue());
      return;
      paramObject = (Object[])paramObject;
      paramInt = Integer.parseInt((String)paramObject[0]);
      Object localObject2 = (FlyTicket.DiscussGetUrlResponse)paramObject[1];
      l = ((Long)paramObject[2]).longValue();
      if ((localObject2 != null) && (paramInt == 0))
      {
        localObject1 = ((FlyTicket.DiscussGetUrlResponse)localObject2).url.get();
        paramObject = localObject1;
        if (localObject1 != null)
        {
          paramObject = localObject1;
          if (!((FlyTicket.DiscussGetUrlResponse)localObject2).url.get().endsWith("#flyticket"))
          {
            paramObject = localObject1;
            if (!((String)localObject1).endsWith(((FlyTicket.DiscussGetUrlResponse)localObject2).sig.get())) {
              paramObject = (String)localObject1 + ((FlyTicket.DiscussGetUrlResponse)localObject2).sig.get();
            }
          }
        }
        localObject1 = "";
        if (((FlyTicket.DiscussGetUrlResponse)localObject2).short_url.get() != null) {
          localObject1 = ((FlyTicket.DiscussGetUrlResponse)localObject2).short_url.get();
        }
        a(paramBoolean, paramInt, ((FlyTicket.DiscussGetUrlResponse)localObject2).v_time.get(), (String)paramObject, (String)localObject1, l);
        return;
      }
      a(false, paramInt, 0L, null, "", l);
      return;
      paramObject = (FlyTicket.DiscussSigDecodeResponse)paramObject;
      if ((paramObject != null) && (((FlyTicket.RetInfo)((FlyTicket.DiscussSigDecodeResponse)paramObject).ret_info.get()).ret_code.get() == 0))
      {
        c(paramBoolean, ((FlyTicket.DiscussSigDecodeResponse)paramObject).sig.get());
        return;
      }
      c(false, null);
      return;
      paramObject = (Object[])paramObject;
      a(paramBoolean, Integer.parseInt((String)paramObject[0]), (RespGetDiscussInfo)paramObject[1]);
      return;
      paramObject = (Long[])paramObject;
      a(paramBoolean, paramObject[1].longValue(), paramObject[0].intValue());
      return;
      paramObject = (long[])paramObject;
      a(paramBoolean, Long.valueOf(paramObject[0]), Long.valueOf(paramObject[1]));
      return;
      b(paramBoolean, (Long)paramObject);
      return;
      a(paramBoolean, (Long)paramObject);
      return;
    } while (!(paramObject instanceof Object[]));
    paramObject = (Object[])paramObject;
    a(paramBoolean, (String)paramObject[0], ((Boolean)paramObject[1]).booleanValue(), ((Integer)paramObject[2]).intValue(), ((Integer)paramObject[3]).intValue());
  }
  
  protected void a(boolean paramBoolean) {}
  
  protected void a(boolean paramBoolean, int paramInt, long paramLong, String paramString) {}
  
  protected void a(boolean paramBoolean, int paramInt, long paramLong1, String paramString1, String paramString2, long paramLong2) {}
  
  protected void a(boolean paramBoolean, int paramInt, long paramLong, ArrayList paramArrayList) {}
  
  protected void a(boolean paramBoolean, int paramInt, RespGetDiscussInfo paramRespGetDiscussInfo) {}
  
  protected void a(boolean paramBoolean, long paramLong) {}
  
  protected void a(boolean paramBoolean, long paramLong, int paramInt) {}
  
  protected void a(boolean paramBoolean, Long paramLong) {}
  
  protected void a(boolean paramBoolean, Long paramLong1, Long paramLong2) {}
  
  protected void a(boolean paramBoolean, String paramString) {}
  
  protected void a(boolean paramBoolean1, String paramString, boolean paramBoolean2, int paramInt1, int paramInt2) {}
  
  protected void a(boolean paramBoolean1, boolean paramBoolean2, String paramString) {}
  
  protected void a(boolean paramBoolean, Object[] paramArrayOfObject) {}
  
  protected void a(Object[] paramArrayOfObject) {}
  
  protected void b() {}
  
  protected void b(boolean paramBoolean, Long paramLong) {}
  
  protected void b(boolean paramBoolean, String paramString) {}
  
  protected void c(boolean paramBoolean, String paramString) {}
  
  protected void d(boolean paramBoolean, String paramString) {}
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\app\DiscussionObserver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
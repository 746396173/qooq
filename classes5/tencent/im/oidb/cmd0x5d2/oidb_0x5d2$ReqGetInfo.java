package tencent.im.oidb.cmd0x5d2;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class oidb_0x5d2$ReqGetInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "uin_list" }, new Object[] { Long.valueOf(0L) }, ReqGetInfo.class);
  public final PBRepeatField uin_list = PBField.initRepeat(PBUInt64Field.__repeatHelper__);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x5d2\oidb_0x5d2$ReqGetInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
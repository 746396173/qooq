package tencent.im.oidb.cmd0x508;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt64Field;

public final class oidb_0x508$ReqBody
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "rpt_uint64_update_seq" }, new Object[] { Long.valueOf(0L) }, ReqBody.class);
  public final PBUInt64Field rpt_uint64_update_seq = PBField.initUInt64(0L);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\oidb\cmd0x508\oidb_0x508$ReqBody.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package tencent.im.msg;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class im_msg_body$FSJMessageElem
  extends MessageMicro
{
  public static final int ETypeHotChatFlashPic = 1;
  public static final int ETypeNormal = 0;
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8 }, new String[] { "uint32_msg_type" }, new Object[] { Integer.valueOf(0) }, FSJMessageElem.class);
  public final PBUInt32Field uint32_msg_type = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\msg\im_msg_body$FSJMessageElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
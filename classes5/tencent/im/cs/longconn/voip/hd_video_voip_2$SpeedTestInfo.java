package tencent.im.cs.longconn.voip;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBUInt32Field;

public final class hd_video_voip_2$SpeedTestInfo
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 8, 16, 24, 32, 40, 48 }, new String[] { "uint32_total_pkg", "uint32_real_recv_pkg", "uint32_delay", "uint32_jitter", "uint32_loss_continue", "uint32_estimate_bandwidth" }, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) }, SpeedTestInfo.class);
  public final PBUInt32Field uint32_delay = PBField.initUInt32(0);
  public final PBUInt32Field uint32_estimate_bandwidth = PBField.initUInt32(0);
  public final PBUInt32Field uint32_jitter = PBField.initUInt32(0);
  public final PBUInt32Field uint32_loss_continue = PBField.initUInt32(0);
  public final PBUInt32Field uint32_real_recv_pkg = PBField.initUInt32(0);
  public final PBUInt32Field uint32_total_pkg = PBField.initUInt32(0);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tencent\im\cs\longconn\voip\hd_video_voip_2$SpeedTestInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
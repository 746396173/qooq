package msf.msgsvc;

import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.mobileqq.pb.MessageMicro.FieldMap;
import com.tencent.mobileqq.pb.PBField;
import com.tencent.mobileqq.pb.PBRepeatMessageField;

public final class msg_svc$PbMsgReadedReportReq
  extends MessageMicro
{
  static final MessageMicro.FieldMap __fieldMap__ = MessageMicro.initFieldMap(new int[] { 10, 18, 26, 34 }, new String[] { "grp_read_report", "dis_read_report", "c2c_read_report", "bind_uin_read_report" }, new Object[] { null, null, null, null }, PbMsgReadedReportReq.class);
  public msg_svc.PbBindUinMsgReadedConfirmReq bind_uin_read_report = new msg_svc.PbBindUinMsgReadedConfirmReq();
  public msg_svc.PbC2CReadedReportReq c2c_read_report = new msg_svc.PbC2CReadedReportReq();
  public final PBRepeatMessageField dis_read_report = PBField.initRepeatMessage(msg_svc.PbDiscussReadedReportReq.class);
  public final PBRepeatMessageField grp_read_report = PBField.initRepeatMessage(msg_svc.PbGroupReadedReportReq.class);
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\msf\msgsvc\msg_svc$PbMsgReadedReportReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package QQService;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class strupbuff
  extends JceStruct
{
  static Map cache_logstring;
  public byte encoding;
  public Map logstring;
  public String prefix;
  public int seqno;
  
  public strupbuff()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.prefix = "";
  }
  
  public strupbuff(Map paramMap, String paramString, byte paramByte, int paramInt)
  {
    this.prefix = "";
    this.logstring = paramMap;
    this.prefix = paramString;
    this.encoding = paramByte;
    this.seqno = paramInt;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    if (cache_logstring == null)
    {
      cache_logstring = new HashMap();
      ArrayList localArrayList = new ArrayList();
      byte[] arrayOfByte = (byte[])new byte[1];
      ((byte[])arrayOfByte)[0] = 0;
      localArrayList.add(arrayOfByte);
      cache_logstring.put("", localArrayList);
    }
    this.logstring = ((Map)paramJceInputStream.read(cache_logstring, 0, true));
    this.prefix = paramJceInputStream.readString(1, false);
    this.encoding = paramJceInputStream.read(this.encoding, 2, false);
    this.seqno = paramJceInputStream.read(this.seqno, 3, false);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.logstring, 0);
    if (this.prefix != null) {
      paramJceOutputStream.write(this.prefix, 1);
    }
    paramJceOutputStream.write(this.encoding, 2);
    paramJceOutputStream.write(this.seqno, 3);
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\QQService\strupbuff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
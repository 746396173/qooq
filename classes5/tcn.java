import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.tencent.mobileqq.adapter.PeopleAroundAdapter.ViewHolder;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.maproam.activity.VipMapRoamActivity;
import com.tencent.mobileqq.util.IIconDecoder.IIconListener;
import com.tencent.widget.XListView;

public class tcn
  implements IIconDecoder.IIconListener
{
  public tcn(VipMapRoamActivity paramVipMapRoamActivity)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public void a(int paramInt1, String paramString, int paramInt2, Bitmap paramBitmap)
  {
    if ((paramInt1 != 1) || (TextUtils.isEmpty(paramString))) {}
    for (;;)
    {
      return;
      if ((paramBitmap != null) && (paramInt2 == 200))
      {
        paramInt2 = this.a.a.getChildCount();
        paramInt1 = 0;
        while (paramInt1 < paramInt2)
        {
          Object localObject = this.a.a.getChildAt(paramInt1).getTag();
          if ((localObject != null) && ((localObject instanceof PeopleAroundAdapter.ViewHolder)))
          {
            localObject = (PeopleAroundAdapter.ViewHolder)localObject;
            if ((paramString.equals(String.valueOf(((PeopleAroundAdapter.ViewHolder)localObject).c))) && (((PeopleAroundAdapter.ViewHolder)localObject).b != null)) {
              this.a.a(((PeopleAroundAdapter.ViewHolder)localObject).b, ((PeopleAroundAdapter.ViewHolder)localObject).c, paramBitmap);
            }
          }
          paramInt1 += 1;
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\tcn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
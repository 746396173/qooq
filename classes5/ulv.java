import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.search.model.IContactSearchModel;
import com.tencent.mobileqq.search.searchengine.ContactSearchEngine;
import java.util.Comparator;

public final class ulv
  implements Comparator
{
  public ulv()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public int a(IContactSearchModel paramIContactSearchModel1, IContactSearchModel paramIContactSearchModel2)
  {
    int j = Long.signum(paramIContactSearchModel2.b() - paramIContactSearchModel1.b());
    int i = j;
    if (j == 0) {
      i = Long.signum(paramIContactSearchModel2.a() - paramIContactSearchModel1.a());
    }
    j = i;
    if (i == 0) {
      j = ContactSearchEngine.a(paramIContactSearchModel1, paramIContactSearchModel2);
    }
    return j;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\ulv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
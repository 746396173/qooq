import android.view.View;
import com.tencent.image.URLDrawable;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.troop.activity.TroopAvatarWallPreviewActivity;
import com.tencent.mobileqq.troop.utils.AvatarTroopUtil;
import com.tencent.mobileqq.troop.widget.AvatarWallAdapter.AvatarInfo;
import com.tencent.mobileqq.troop.widget.TroopAvatarBigPhotoAdapter;
import com.tencent.widget.ActionSheet;
import com.tencent.widget.ActionSheet.OnButtonClickListener;

public class vhf
  implements ActionSheet.OnButtonClickListener
{
  String jdField_a_of_type_JavaLangString;
  
  public vhf(TroopAvatarWallPreviewActivity paramTroopAvatarWallPreviewActivity, ActionSheet paramActionSheet, URLDrawable paramURLDrawable)
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaLangString = this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.jdField_a_of_type_ComTencentMobileqqTroopWidgetTroopAvatarBigPhotoAdapter.a(this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.jdField_a_of_type_Int);
  }
  
  public void OnClick(View paramView, int paramInt)
  {
    int i;
    if (!AvatarTroopUtil.b(this.jdField_a_of_type_JavaLangString))
    {
      i = 1;
      if (i == 0) {
        break label74;
      }
      paramView = this.jdField_a_of_type_JavaLangString;
      paramView = this.jdField_a_of_type_ComTencentWidgetActionSheet.a(paramInt);
      if (!this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.getString(2131370093).equals(paramView)) {
        break label130;
      }
      this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.a(this.jdField_a_of_type_ComTencentImageURLDrawable, this.jdField_a_of_type_JavaLangString);
    }
    for (;;)
    {
      this.jdField_a_of_type_ComTencentWidgetActionSheet.dismiss();
      return;
      i = 0;
      break;
      label74:
      if (this.jdField_a_of_type_JavaLangString.equals(AvatarWallAdapter.AvatarInfo.jdField_a_of_type_JavaLangString)) {}
      for (paramView = AvatarTroopUtil.a(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.m, 0);; paramView = AvatarTroopUtil.a(this.jdField_a_of_type_JavaLangString, this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.m, 1))
      {
        AvatarTroopUtil.a(paramView);
        break;
      }
      label130:
      if (this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.getString(2131370099).equals(paramView)) {
        this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.a(this.jdField_a_of_type_ComTencentImageURLDrawable);
      } else if (this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.getString(2131370096).equals(paramView)) {
        this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.a(this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.o);
      } else if (this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.getString(2131364683).equals(paramView)) {
        this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.c(this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.jdField_a_of_type_Int);
      } else if (this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.getString(2131370107).equals(paramView)) {
        if ((this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.jdField_a_of_type_Boolean) && (this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.a(this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.jdField_a_of_type_Int))) {
          this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.b(this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.jdField_a_of_type_Int);
        } else {
          this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.c(this.jdField_a_of_type_ComTencentMobileqqTroopActivityTroopAvatarWallPreviewActivity.jdField_a_of_type_Int);
        }
      }
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\vhf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
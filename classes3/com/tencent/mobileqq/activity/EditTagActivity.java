package com.tencent.mobileqq.activity;

import QQService.TagInfo;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mobileqq.app.CardHandler;
import com.tencent.mobileqq.app.CardObserver;
import com.tencent.mobileqq.app.FriendsManager;
import com.tencent.mobileqq.app.IphoneTitleBarActivity;
import com.tencent.mobileqq.app.QQAppInterface;
import com.tencent.mobileqq.data.Card;
import com.tencent.mobileqq.data.TagArrayByType;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.utils.DialogUtil;
import com.tencent.mobileqq.utils.QQCustomDialog;
import com.tencent.mobileqq.widget.QQToast;
import com.tencent.mobileqq.widget.Workspace;
import com.tencent.mobileqq.widget.Workspace.OnScreenChangeListener;
import java.util.ArrayList;
import lhp;
import lhq;
import lhr;
import lhs;
import lht;
import lhu;
import lhv;
import lhx;

public class EditTagActivity
  extends IphoneTitleBarActivity
  implements Workspace.OnScreenChangeListener
{
  static final int jdField_a_of_type_Int = 1000;
  static final int jdField_b_of_type_Int = 0;
  public float a;
  public Handler a;
  private View jdField_a_of_type_AndroidViewView;
  private GridView jdField_a_of_type_AndroidWidgetGridView;
  private LinearLayout jdField_a_of_type_AndroidWidgetLinearLayout;
  private TextView jdField_a_of_type_AndroidWidgetTextView;
  private CardHandler jdField_a_of_type_ComTencentMobileqqAppCardHandler;
  private CardObserver jdField_a_of_type_ComTencentMobileqqAppCardObserver;
  private Card jdField_a_of_type_ComTencentMobileqqDataCard;
  private QQToast jdField_a_of_type_ComTencentMobileqqWidgetQQToast;
  public Workspace a;
  public ArrayList a;
  public lhx a;
  public boolean a;
  private TextView jdField_b_of_type_AndroidWidgetTextView;
  private ArrayList jdField_b_of_type_JavaUtilArrayList;
  private TextView c;
  
  public EditTagActivity()
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_JavaUtilArrayList = new ArrayList();
    this.jdField_a_of_type_ComTencentMobileqqAppCardObserver = new lhp(this);
    this.jdField_a_of_type_AndroidOsHandler = new lhs(this);
  }
  
  private void a(String paramString)
  {
    Object localObject = findViewById(2131297139);
    if ((localObject != null) && ((localObject instanceof TextView))) {
      ((TextView)localObject).setText(paramString);
    }
    TextView localTextView = (TextView)findViewById(2131297083);
    localObject = getIntent().getExtras().getString("leftViewText");
    paramString = (String)localObject;
    if (localObject == null) {
      paramString = getString(2131367975);
    }
    if (localTextView != null)
    {
      localTextView.setText(paramString);
      localTextView.setOnClickListener(new lht(this));
    }
    setRightHighlightButton(2131368753, new lhu(this));
    enableRightHighlight(true);
  }
  
  private void b()
  {
    super.setContentView(2130903330);
    a(getString(2131369175));
    this.jdField_a_of_type_AndroidViewView = findViewById(2131298146);
    this.jdField_a_of_type_AndroidWidgetTextView = ((TextView)this.jdField_a_of_type_AndroidViewView.findViewById(2131298147));
    this.jdField_a_of_type_AndroidWidgetGridView = ((GridView)this.jdField_a_of_type_AndroidViewView.findViewById(2131298148));
    this.jdField_a_of_type_ComTencentMobileqqWidgetWorkspace = ((Workspace)this.jdField_a_of_type_AndroidViewView.findViewById(16908305));
    this.jdField_a_of_type_ComTencentMobileqqWidgetWorkspace.setFocusable(false);
    this.jdField_a_of_type_ComTencentMobileqqWidgetWorkspace.setFocusableInTouchMode(false);
    this.jdField_a_of_type_ComTencentMobileqqWidgetWorkspace.setOnScreenChangeListener(this);
    this.jdField_b_of_type_AndroidWidgetTextView = ((TextView)this.jdField_a_of_type_AndroidViewView.findViewById(2131298150));
    this.c = ((TextView)this.jdField_a_of_type_AndroidViewView.findViewById(2131298151));
    this.jdField_a_of_type_AndroidWidgetLinearLayout = ((LinearLayout)this.jdField_a_of_type_AndroidViewView.findViewById(2131298152));
  }
  
  private void c()
  {
    Object localObject = (FriendsManager)this.app.getManager(50);
    if (localObject != null) {}
    for (localObject = ((FriendsManager)localObject).a(this.app.a());; localObject = null)
    {
      this.jdField_a_of_type_ComTencentMobileqqDataCard = ((Card)localObject);
      if (this.jdField_a_of_type_ComTencentMobileqqDataCard != null) {
        this.jdField_b_of_type_JavaUtilArrayList = this.jdField_a_of_type_ComTencentMobileqqDataCard.getTagInfoArray();
      }
      if (this.jdField_b_of_type_JavaUtilArrayList != null)
      {
        a(this.jdField_b_of_type_JavaUtilArrayList.size());
        this.jdField_a_of_type_JavaUtilArrayList = ((ArrayList)this.jdField_b_of_type_JavaUtilArrayList.clone());
        this.jdField_a_of_type_Lhx = new lhx(this, this.jdField_a_of_type_JavaUtilArrayList);
        this.jdField_a_of_type_AndroidWidgetGridView.setAdapter(this.jdField_a_of_type_Lhx);
      }
      d();
      return;
    }
  }
  
  private void d()
  {
    if (this.app.jdField_a_of_type_JavaUtilArrayList != null)
    {
      this.jdField_a_of_type_ComTencentMobileqqWidgetWorkspace.removeAllViews();
      this.jdField_a_of_type_AndroidWidgetLinearLayout.removeAllViews();
      int i = 0;
      Object localObject;
      while (i < this.app.jdField_a_of_type_JavaUtilArrayList.size())
      {
        localObject = new GridView(this);
        ((GridView)localObject).setPadding((int)(this.jdField_a_of_type_Float * 10.0F), 0, (int)(this.jdField_a_of_type_Float * 10.0F), 0);
        ((GridView)localObject).setNumColumns(4);
        ((GridView)localObject).setHorizontalSpacing((int)(this.jdField_a_of_type_Float * 4.0F));
        ((GridView)localObject).setVerticalSpacing((int)(this.jdField_a_of_type_Float * 4.0F));
        this.jdField_a_of_type_ComTencentMobileqqWidgetWorkspace.addView((View)localObject);
        ((GridView)localObject).setAdapter(new lhv(this, ((TagArrayByType)this.app.jdField_a_of_type_JavaUtilArrayList.get(i)).mTags));
        localObject = new ImageView(this);
        ((ImageView)localObject).setPadding((int)(this.jdField_a_of_type_Float * 4.0F), 0, (int)(this.jdField_a_of_type_Float * 4.0F), 0);
        ((ImageView)localObject).setImageResource(2130838481);
        this.jdField_a_of_type_AndroidWidgetLinearLayout.addView((View)localObject);
        i += 1;
      }
      if (this.app.jdField_a_of_type_JavaUtilArrayList.size() > 0)
      {
        localObject = ((TagArrayByType)this.app.jdField_a_of_type_JavaUtilArrayList.get(0)).mTypeText;
        String str = ((TagArrayByType)this.app.jdField_a_of_type_JavaUtilArrayList.get(0)).mInfo;
        this.jdField_b_of_type_AndroidWidgetTextView.setText((CharSequence)localObject);
        this.c.setText(str);
        ((ImageView)this.jdField_a_of_type_AndroidWidgetLinearLayout.getChildAt(0)).setImageResource(2130838480);
      }
    }
  }
  
  public void a()
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    if ((this.jdField_b_of_type_JavaUtilArrayList != null) && (this.jdField_a_of_type_JavaUtilArrayList != null))
    {
      int i = 0;
      while (i < this.jdField_a_of_type_JavaUtilArrayList.size())
      {
        if (!a((TagInfo)this.jdField_a_of_type_JavaUtilArrayList.get(i), this.jdField_b_of_type_JavaUtilArrayList)) {
          localArrayList2.add(this.jdField_a_of_type_JavaUtilArrayList.get(i));
        }
        i += 1;
      }
      i = 0;
      while (i < this.jdField_b_of_type_JavaUtilArrayList.size())
      {
        if (!a((TagInfo)this.jdField_b_of_type_JavaUtilArrayList.get(i), this.jdField_a_of_type_JavaUtilArrayList)) {
          localArrayList1.add(this.jdField_b_of_type_JavaUtilArrayList.get(i));
        }
        i += 1;
      }
    }
    if ((localArrayList1.size() != 0) || (localArrayList2.size() != 0))
    {
      if (this.jdField_a_of_type_Boolean)
      {
        d(2131369176);
        return;
      }
      this.jdField_a_of_type_Boolean = true;
      this.jdField_a_of_type_ComTencentMobileqqAppCardHandler.a(this.app.a(), 1, (byte)0, this.jdField_a_of_type_JavaUtilArrayList, null, localArrayList1, localArrayList2, null);
      return;
    }
    setResult(-1);
    finish();
  }
  
  public void a(int paramInt)
  {
    this.jdField_a_of_type_AndroidWidgetTextView.setText(getString(2131369173) + " (" + paramInt + "/" + this.app.cn + ")");
  }
  
  public boolean a(TagInfo paramTagInfo, ArrayList paramArrayList)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i;
    if (paramArrayList != null) {
      i = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i < paramArrayList.size())
      {
        if (paramTagInfo.iTagId == ((TagInfo)paramArrayList.get(i)).iTagId) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public void b(int paramInt) {}
  
  public void c(int paramInt)
  {
    if (this.app.jdField_a_of_type_JavaUtilArrayList != null)
    {
      localObject = ((TagArrayByType)this.app.jdField_a_of_type_JavaUtilArrayList.get(paramInt)).mTypeText;
      String str = ((TagArrayByType)this.app.jdField_a_of_type_JavaUtilArrayList.get(paramInt)).mInfo;
      this.jdField_b_of_type_AndroidWidgetTextView.setText((CharSequence)localObject);
      this.c.setText(str);
    }
    int i = 0;
    while (i < this.jdField_a_of_type_AndroidWidgetLinearLayout.getChildCount())
    {
      ((ImageView)this.jdField_a_of_type_AndroidWidgetLinearLayout.getChildAt(i)).setImageResource(2130838481);
      i += 1;
    }
    Object localObject = (ImageView)this.jdField_a_of_type_AndroidWidgetLinearLayout.getChildAt(paramInt);
    if (localObject != null) {
      ((ImageView)localObject).setImageResource(2130838480);
    }
  }
  
  public void d(int paramInt)
  {
    if (this.jdField_a_of_type_ComTencentMobileqqWidgetQQToast == null) {
      this.jdField_a_of_type_ComTencentMobileqqWidgetQQToast = new QQToast(this);
    }
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQToast.b(paramInt);
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQToast.c(0);
    this.jdField_a_of_type_ComTencentMobileqqWidgetQQToast.b(getTitleBarHeight());
  }
  
  protected boolean onBackEvent()
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    if ((this.jdField_b_of_type_JavaUtilArrayList != null) && (this.jdField_a_of_type_JavaUtilArrayList != null))
    {
      int i = 0;
      while (i < this.jdField_a_of_type_JavaUtilArrayList.size())
      {
        if (!a((TagInfo)this.jdField_a_of_type_JavaUtilArrayList.get(i), this.jdField_b_of_type_JavaUtilArrayList)) {
          localArrayList2.add(this.jdField_a_of_type_JavaUtilArrayList.get(i));
        }
        i += 1;
      }
      i = 0;
      while (i < this.jdField_b_of_type_JavaUtilArrayList.size())
      {
        if (!a((TagInfo)this.jdField_b_of_type_JavaUtilArrayList.get(i), this.jdField_a_of_type_JavaUtilArrayList)) {
          localArrayList1.add(this.jdField_b_of_type_JavaUtilArrayList.get(i));
        }
        i += 1;
      }
    }
    if ((localArrayList1.size() != 0) || (localArrayList2.size() != 0))
    {
      DialogUtil.a(this, 230).setMessage(getString(2131369184)).setPositiveButton(2131367258, new lhr(this)).setNegativeButton(2131367259, new lhq(this)).show();
      return true;
    }
    finish();
    return false;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.app.a(this.jdField_a_of_type_ComTencentMobileqqAppCardObserver);
    this.jdField_a_of_type_ComTencentMobileqqAppCardHandler = ((CardHandler)this.app.a(2));
    setRequestedOrientation(1);
    this.jdField_a_of_type_Float = getResources().getDisplayMetrics().density;
    this.jdField_a_of_type_Boolean = false;
    b();
    c();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.app.b(this.jdField_a_of_type_ComTencentMobileqqAppCardObserver);
  }
  
  protected void onResume()
  {
    super.onResume();
    setRequestedOrientation(1);
  }
  
  protected String setLastActivityName()
  {
    return getString(2131369175);
  }
}


/* Location:              E:\apk\QQ_91\classes3-dex2jar.jar!\com\tencent\mobileqq\activity\EditTagActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
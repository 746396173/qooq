package com.tencent.mobileqq.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class FormMutiItem
  extends FormSimpleItem
{
  protected LinearLayout a;
  protected TextView a;
  protected CharSequence a;
  protected TextView b;
  protected CharSequence b;
  protected int i;
  protected int j;
  protected int k;
  protected int l;
  
  public FormMutiItem(Context paramContext)
  {
    super(paramContext);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.i = 0;
    this.j = 2;
    a();
  }
  
  public FormMutiItem(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.i = 0;
    this.j = 2;
    a();
  }
  
  protected void a()
  {
    super.a();
    this.jdField_a_of_type_AndroidWidgetLinearLayout = new LinearLayout(getContext());
    this.jdField_a_of_type_AndroidWidgetLinearLayout.setOrientation(1);
    this.jdField_a_of_type_AndroidWidgetTextView = new TextView(getContext());
    this.jdField_a_of_type_AndroidWidgetTextView.setSingleLine(true);
    this.jdField_a_of_type_AndroidWidgetTextView.setTextColor(a(getResources(), this.i));
    this.jdField_a_of_type_AndroidWidgetTextView.setTextSize(2, 16.0F);
    this.jdField_a_of_type_AndroidWidgetTextView.setGravity(19);
    this.jdField_a_of_type_AndroidWidgetTextView.setEllipsize(TextUtils.TruncateAt.END);
    this.jdField_a_of_type_AndroidWidgetTextView.setDuplicateParentStateEnabled(true);
    this.jdField_b_of_type_AndroidWidgetTextView = new TextView(getContext());
    this.jdField_b_of_type_AndroidWidgetTextView.setSingleLine(true);
    this.jdField_b_of_type_AndroidWidgetTextView.setTextColor(a(getResources(), this.j));
    this.jdField_b_of_type_AndroidWidgetTextView.setTextSize(2, 14.0F);
    this.jdField_b_of_type_AndroidWidgetTextView.setGravity(19);
    this.jdField_b_of_type_AndroidWidgetTextView.setEllipsize(TextUtils.TruncateAt.END);
    this.jdField_b_of_type_AndroidWidgetTextView.setDuplicateParentStateEnabled(true);
    Object localObject = new LinearLayout.LayoutParams(-2, -2);
    this.jdField_a_of_type_AndroidWidgetLinearLayout.addView(this.jdField_a_of_type_AndroidWidgetTextView, (ViewGroup.LayoutParams)localObject);
    localObject = new LinearLayout.LayoutParams(-2, -2);
    this.jdField_a_of_type_AndroidWidgetLinearLayout.addView(this.jdField_b_of_type_AndroidWidgetTextView, (ViewGroup.LayoutParams)localObject);
    localObject = new RelativeLayout.LayoutParams(-2, -2);
    ((RelativeLayout.LayoutParams)localObject).addRule(1, 2131296464);
    ((RelativeLayout.LayoutParams)localObject).addRule(0, 2131296465);
    ((RelativeLayout.LayoutParams)localObject).addRule(15);
    addView(this.jdField_a_of_type_AndroidWidgetLinearLayout, (ViewGroup.LayoutParams)localObject);
    setCustomHeight(getResources().getDimensionPixelSize(2131493324));
  }
  
  public void setFirstLineText(int paramInt)
  {
    this.jdField_a_of_type_JavaLangCharSequence = getResources().getString(paramInt);
    this.jdField_a_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_JavaLangCharSequence);
  }
  
  public void setFirstLineText(CharSequence paramCharSequence)
  {
    this.jdField_a_of_type_JavaLangCharSequence = paramCharSequence;
    this.jdField_a_of_type_AndroidWidgetTextView.setText(this.jdField_a_of_type_JavaLangCharSequence);
  }
  
  public void setFirstLineTextColor(int paramInt)
  {
    this.jdField_a_of_type_AndroidWidgetTextView.setTextColor(this.i);
  }
  
  public void setFirstLineTextSize(int paramInt)
  {
    this.k = paramInt;
    this.jdField_a_of_type_AndroidWidgetTextView.setTextSize(this.k);
  }
  
  public void setSecondLineText(int paramInt)
  {
    this.jdField_b_of_type_JavaLangCharSequence = getResources().getString(paramInt);
    this.jdField_b_of_type_AndroidWidgetTextView.setText(this.jdField_b_of_type_JavaLangCharSequence);
  }
  
  public void setSecondLineText(CharSequence paramCharSequence)
  {
    this.jdField_b_of_type_JavaLangCharSequence = paramCharSequence;
    this.jdField_b_of_type_AndroidWidgetTextView.setText(this.jdField_b_of_type_JavaLangCharSequence);
  }
  
  public void setSecondLineTextColor(int paramInt)
  {
    this.jdField_b_of_type_AndroidWidgetTextView.setTextColor(this.j);
  }
  
  public void setSecondLineTextSize(int paramInt)
  {
    this.jdField_b_of_type_AndroidWidgetTextView.setTextSize(this.l);
  }
  
  public void setSecondLineVisible(boolean paramBoolean)
  {
    boolean bool2 = false;
    if (this.jdField_b_of_type_AndroidWidgetTextView.getVisibility() == 0)
    {
      boolean bool1 = true;
      if ((bool1 ^ paramBoolean))
      {
        TextView localTextView = this.jdField_b_of_type_AndroidWidgetTextView;
        if (!paramBoolean) {
          break label63;
        }
        bool1 = bool2;
        label33:
        localTextView.setVisibility(bool1);
        if (!paramBoolean) {
          break label69;
        }
      }
    }
    label63:
    label69:
    for (int m = getResources().getDimensionPixelSize(2131493324);; m = getResources().getDimensionPixelSize(2131493322))
    {
      setCustomHeight(m);
      return;
      m = 0;
      break;
      m = 8;
      break label33;
    }
  }
}


/* Location:              E:\apk\QQ_91\classes2-dex2jar.jar!\com\tencent\mobileqq\widget\FormMutiItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
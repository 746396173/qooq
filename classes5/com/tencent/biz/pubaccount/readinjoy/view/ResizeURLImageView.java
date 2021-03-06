package com.tencent.biz.pubaccount.readinjoy.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.tencent.image.URLImageView;
import com.tencent.mobileqq.R.styleable;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;

public class ResizeURLImageView
  extends URLImageView
{
  private float jdField_a_of_type_Float;
  private Context jdField_a_of_type_AndroidContentContext;
  private boolean jdField_a_of_type_Boolean;
  private float b;
  
  public ResizeURLImageView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ResizeURLImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ResizeURLImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
    this.jdField_a_of_type_Float = 1.0F;
    this.b = 1.0F;
    this.jdField_a_of_type_AndroidContentContext = paramContext;
    a(paramAttributeSet);
  }
  
  private void a(AttributeSet paramAttributeSet)
  {
    paramAttributeSet = this.jdField_a_of_type_AndroidContentContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ae);
    this.jdField_a_of_type_Float = paramAttributeSet.getFloat(0, 1.0F);
    this.b = paramAttributeSet.getFloat(1, 1.0F);
    paramAttributeSet.recycle();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if ((this.jdField_a_of_type_Float == 1.0F) && (this.b != 1.0F)) {
      setMeasuredDimension(paramInt1, (int)(paramInt1 * this.b));
    }
    while ((this.jdField_a_of_type_Float == 1.0F) || (this.b != 1.0F)) {
      return;
    }
    setMeasuredDimension((int)(paramInt2 * this.jdField_a_of_type_Float), paramInt2);
  }
  
  public void requestLayout()
  {
    if (!this.jdField_a_of_type_Boolean) {
      super.requestLayout();
    }
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    this.jdField_a_of_type_Boolean = true;
    super.setImageDrawable(null);
    super.setImageDrawable(paramDrawable);
    this.jdField_a_of_type_Boolean = false;
  }
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\tencent\biz\pubaccount\readinjoy\view\ResizeURLImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
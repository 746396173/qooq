package com.tencent.mobileqq.activity.aio.photo;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.common.app.BaseApplicationImpl;
import com.tencent.common.config.AppSetting;
import com.tencent.common.galleryactivity.AbstractImageAdapter;
import com.tencent.image.URLDrawable;
import com.tencent.image.URLDrawable.URLDrawableOptions;
import com.tencent.image.URLImageView;
import com.tencent.mobileqq.activity.aio.AIOUtils;
import com.tencent.mobileqq.app.ThreadManager;
import com.tencent.mobileqq.filemanager.data.FileManagerEntity;
import com.tencent.mobileqq.hotpatch.NotVerifyClass;
import com.tencent.mobileqq.shortvideo.ShortVideoUtils;
import com.tencent.mobileqq.transfile.URLDrawableHelper;
import com.tencent.qphone.base.util.QLog;
import com.tencent.util.WeakReferenceHandler;
import com.tencent.widget.AbsListView.LayoutParams;
import com.tencent.widget.GridView;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import nur;
import nus;
import nut;
import nuu;

public class AIOPhotoListAdapter
  extends AbstractImageAdapter
{
  static final int jdField_a_of_type_Int = 5;
  static final Object jdField_a_of_type_JavaLangObject = new Object();
  static final String jdField_a_of_type_JavaLangString = "AIOPhotoListAdapter";
  private Context jdField_a_of_type_AndroidContentContext;
  Drawable jdField_a_of_type_AndroidGraphicsDrawableDrawable;
  private LayoutInflater jdField_a_of_type_AndroidViewLayoutInflater;
  private AIOImageListModel jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOImageListModel;
  public IAIOImageProvider a;
  WeakReferenceHandler jdField_a_of_type_ComTencentUtilWeakReferenceHandler = new WeakReferenceHandler(ThreadManager.b(), null);
  private GridView jdField_a_of_type_ComTencentWidgetGridView;
  public boolean a;
  private int jdField_b_of_type_Int;
  private boolean jdField_b_of_type_Boolean;
  private int c;
  
  static
  {
    boolean bool = NotVerifyClass.DO_VERIFY_CLASS;
  }
  
  public AIOPhotoListAdapter(Activity paramActivity, int paramInt, AIOImageListModel paramAIOImageListModel, IAIOImageProvider paramIAIOImageProvider, GridView paramGridView)
  {
    this.jdField_a_of_type_AndroidContentContext = paramActivity;
    this.jdField_a_of_type_AndroidViewLayoutInflater = paramActivity.getLayoutInflater();
    this.jdField_b_of_type_Int = paramInt;
    this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOImageListModel = paramAIOImageListModel;
    paramAIOImageListModel.d(4);
    this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoIAIOImageProvider = paramIAIOImageProvider;
    this.jdField_a_of_type_ComTencentWidgetGridView = paramGridView;
    this.c = AIOUtils.a(30.0F, this.jdField_a_of_type_AndroidContentContext.getResources());
  }
  
  public void a(int paramInt, View paramView)
  {
    long l = SystemClock.uptimeMillis();
    localObject1 = (AIOPhotoListAdapter.ContentHolder)paramView.getTag();
    Object localObject2 = getItem(paramInt);
    if (!AIORichMediaInfo.class.isInstance(localObject2)) {
      return;
    }
    AIORichMediaInfo localAIORichMediaInfo = (AIORichMediaInfo)localObject2;
    URLImageView localURLImageView = ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_a_of_type_ComTencentImageURLImageView;
    ImageView localImageView1 = ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_a_of_type_AndroidWidgetImageView;
    ImageView localImageView2 = ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_b_of_type_AndroidWidgetImageView;
    Object localObject3 = ((AIOPhotoListAdapter.ContentHolder)localObject1).c;
    Object localObject4 = ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_a_of_type_AndroidWidgetTextView;
    Object localObject5 = ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_b_of_type_AndroidWidgetTextView;
    View localView = ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_a_of_type_AndroidViewView;
    localView.setVisibility(8);
    ((TextView)localObject5).setVisibility(8);
    localURLImageView.setBackgroundColor(0);
    localObject2 = null;
    if (AIOImageData.class.isInstance(localAIORichMediaInfo.a))
    {
      ((ImageView)localObject3).setVisibility(4);
      ((TextView)localObject4).setVisibility(4);
      localObject1 = (AIOImageData)localAIORichMediaInfo.a;
      localObject3 = ((AIOImageData)localObject1).a(1);
      if (localObject3 != null)
      {
        localObject1 = localURLImageView.getDrawable();
        localObject4 = URLDrawable.URLDrawableOptions.obtain();
        ((URLDrawable.URLDrawableOptions)localObject4).mRequestWidth = this.jdField_b_of_type_Int;
        ((URLDrawable.URLDrawableOptions)localObject4).mRequestHeight = this.jdField_b_of_type_Int;
        ((URLDrawable.URLDrawableOptions)localObject4).mLoadingDrawable = URLDrawableHelper.f;
        if ((localObject1 instanceof URLDrawable))
        {
          localObject5 = ((URLDrawable)localObject1).getURL().toString();
          localObject1 = "";
        }
      }
    }
    try
    {
      localObject2 = ((File)localObject3).toURI().toURL().toString();
      localObject1 = localObject2;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      for (;;)
      {
        label261:
        label271:
        int i;
        label581:
        label728:
        label743:
        continue;
        localObject1 = null;
      }
    }
    if (!((String)localObject1).equals(localObject5)) {
      localURLImageView.setImageDrawable(URLDrawable.getDrawable((File)localObject3, (URLDrawable.URLDrawableOptions)localObject4));
    }
    if (AppSetting.j)
    {
      localObject1 = "张图片";
      if (localObject1 != null)
      {
        i = paramInt / 4;
        paramView.setContentDescription("已选定第" + (i + 1) + "行第" + (paramInt % 4 + 1) + (String)localObject1);
      }
      if (this.jdField_a_of_type_Boolean) {
        switch (localAIORichMediaInfo.b())
        {
        default: 
          localImageView1.setVisibility(4);
          localImageView2.setVisibility(4);
        }
      }
      while (QLog.isColorLevel())
      {
        QLog.d("AIOPhotoListAdapter", 2, "[updateView] cost: " + (SystemClock.uptimeMillis() - l) + " data" + localAIORichMediaInfo.a);
        return;
        localURLImageView.setImageDrawable(URLDrawable.getDrawable((File)localObject3, (URLDrawable.URLDrawableOptions)localObject4));
        break label261;
        if (((AIOImageData)localObject1).jdField_a_of_type_Boolean)
        {
          if (this.jdField_a_of_type_AndroidGraphicsDrawableDrawable == null) {
            this.jdField_a_of_type_AndroidGraphicsDrawableDrawable = BaseApplicationImpl.a().getResources().getDrawable(2130837568);
          }
          localURLImageView.setImageDrawable(this.jdField_a_of_type_AndroidGraphicsDrawableDrawable);
          break label261;
        }
        localURLImageView.setImageDrawable(URLDrawableHelper.f);
        this.jdField_a_of_type_ComTencentUtilWeakReferenceHandler.post(new nur(this, (AIOImageData)localObject1));
        break label261;
        if (AIOShortVideoData.class.isInstance(localAIORichMediaInfo.a))
        {
          localView.setVisibility(0);
          localObject5 = (AIOShortVideoData)localAIORichMediaInfo.a;
          if (((AIOShortVideoData)localObject5).d == 0)
          {
            ((ImageView)localObject3).setImageResource(2130838368);
            ((TextView)localObject4).setText(ShortVideoUtils.a(((AIOShortVideoData)localObject5).c * 1000));
            ((TextView)localObject4).setVisibility(0);
            ((ImageView)localObject3).setVisibility(0);
            if (((AIOShortVideoData)localObject5).a(0) == null) {
              break label743;
            }
            localObject1 = ((AIOShortVideoData)localObject5).a(0);
            localObject3 = URLDrawable.URLDrawableOptions.obtain();
            localObject4 = localURLImageView.getDrawable();
            ((URLDrawable.URLDrawableOptions)localObject3).mRequestWidth = this.jdField_b_of_type_Int;
            ((URLDrawable.URLDrawableOptions)localObject3).mRequestHeight = this.jdField_b_of_type_Int;
            ((URLDrawable.URLDrawableOptions)localObject3).mLoadingDrawable = URLDrawableHelper.e;
            if (!(localObject4 instanceof URLDrawable)) {
              break label728;
            }
            localObject4 = ((URLDrawable)localObject4).getURL().toString();
            if ((localObject1 != null) && (!((String)localObject1).equals(localObject4))) {
              localURLImageView.setImageDrawable(URLDrawable.getDrawable((String)localObject1, (URLDrawable.URLDrawableOptions)localObject3));
            }
          }
          for (;;)
          {
            localObject1 = localObject2;
            if (!AppSetting.j) {
              break;
            }
            localObject1 = "个视频";
            break;
            ((ImageView)localObject3).setImageResource(2130838253);
            ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_a_of_type_AndroidWidgetTextView.setVisibility(4);
            break label581;
            localURLImageView.setImageDrawable(URLDrawable.getDrawable((String)localObject1, (URLDrawable.URLDrawableOptions)localObject3));
            continue;
            if (!((AIOShortVideoData)localObject5).jdField_a_of_type_Boolean)
            {
              localURLImageView.setImageDrawable(URLDrawableHelper.f);
              this.jdField_a_of_type_ComTencentUtilWeakReferenceHandler.post(new nus(this, (AIOShortVideoData)localObject5));
            }
          }
        }
        if (AIOFilePicData.class.isInstance(localAIORichMediaInfo.a))
        {
          ((ImageView)localObject3).setVisibility(4);
          ((TextView)localObject4).setVisibility(4);
          localObject1 = (AIOFilePicData)localAIORichMediaInfo.a;
          if (((AIOFilePicData)localObject1).a(16) != null)
          {
            localObject1 = ((AIOFilePicData)localObject1).a(16);
            localObject3 = localURLImageView.getDrawable();
            localObject4 = URLDrawable.URLDrawableOptions.obtain();
            ((URLDrawable.URLDrawableOptions)localObject4).mRequestWidth = this.jdField_b_of_type_Int;
            ((URLDrawable.URLDrawableOptions)localObject4).mRequestHeight = this.jdField_b_of_type_Int;
            ((URLDrawable.URLDrawableOptions)localObject4).mLoadingDrawable = URLDrawableHelper.f;
            if ((localObject3 instanceof URLDrawable)) {
              if (!((String)localObject1).equals(((URLDrawable)localObject3).getURL().toString())) {
                localURLImageView.setImageDrawable(URLDrawable.getDrawable((String)localObject1, (URLDrawable.URLDrawableOptions)localObject4));
              }
            }
          }
          for (;;)
          {
            localObject1 = localObject2;
            if (!AppSetting.j) {
              break;
            }
            localObject1 = "张图片";
            break;
            localURLImageView.setImageDrawable(URLDrawable.getDrawable((String)localObject1, (URLDrawable.URLDrawableOptions)localObject4));
            continue;
            if (((AIOFilePicData)localObject1).c)
            {
              if (this.jdField_a_of_type_AndroidGraphicsDrawableDrawable == null) {
                this.jdField_a_of_type_AndroidGraphicsDrawableDrawable = BaseApplicationImpl.a().getResources().getDrawable(2130837568);
              }
              localURLImageView.setImageDrawable(this.jdField_a_of_type_AndroidGraphicsDrawableDrawable);
            }
            else
            {
              localURLImageView.setImageDrawable(URLDrawableHelper.f);
              this.jdField_a_of_type_ComTencentUtilWeakReferenceHandler.post(new nut(this, (AIOFilePicData)localObject1));
            }
          }
        }
        localObject1 = localObject2;
        if (!AIOFileVideoData.class.isInstance(localAIORichMediaInfo.a)) {
          break label271;
        }
        localObject1 = (AIOFileVideoData)localAIORichMediaInfo.a;
        localView.setVisibility(0);
        ((ImageView)localObject3).setImageResource(2130838368);
        ((ImageView)localObject3).setVisibility(0);
        ((TextView)localObject4).setText(ShortVideoUtils.a(this.jdField_a_of_type_AndroidContentContext, ((AIOFileVideoData)localObject1).a.fileSize));
        ((TextView)localObject4).setVisibility(0);
        if (((AIOFileVideoData)localObject1).a != null)
        {
          float f1 = this.jdField_a_of_type_AndroidContentContext.getResources().getDisplayMetrics().density;
          float f2 = this.jdField_b_of_type_Int * 2;
          ((TextView)localObject5).setText((String)TextUtils.ellipsize(((AIOFileVideoData)localObject1).a.fileName, ((TextView)localObject5).getPaint(), f2 - f1 * 4.0F * 8.0F, TextUtils.TruncateAt.END));
          ((TextView)localObject5).setVisibility(0);
        }
        if (((AIOFileVideoData)localObject1).a(0) != null)
        {
          localObject1 = ((AIOFileVideoData)localObject1).a(16);
          localObject3 = localURLImageView.getDrawable();
          localObject4 = URLDrawable.URLDrawableOptions.obtain();
          ((URLDrawable.URLDrawableOptions)localObject4).mRequestWidth = this.jdField_b_of_type_Int;
          ((URLDrawable.URLDrawableOptions)localObject4).mRequestHeight = this.jdField_b_of_type_Int;
          ((URLDrawable.URLDrawableOptions)localObject4).mLoadingDrawable = URLDrawableHelper.f;
          if ((localObject3 instanceof URLDrawable)) {
            if (!((String)localObject1).equals(((URLDrawable)localObject3).getURL().toString())) {
              localURLImageView.setImageDrawable(URLDrawable.getDrawable((String)localObject1, (URLDrawable.URLDrawableOptions)localObject4));
            }
          }
        }
        for (;;)
        {
          localObject1 = localObject2;
          if (!AppSetting.j) {
            break;
          }
          localObject1 = "个视频";
          break;
          localURLImageView.setImageDrawable(URLDrawable.getDrawable((String)localObject1, (URLDrawable.URLDrawableOptions)localObject4));
          continue;
          localURLImageView.setImageDrawable(null);
          localURLImageView.setBackgroundColor(Color.parseColor("#D8DAE0"));
        }
        localImageView1.setVisibility(0);
        localImageView2.setImageResource(2130841002);
        localImageView2.setVisibility(0);
        continue;
        localImageView1.setVisibility(4);
        localImageView2.setImageResource(2130841000);
        localImageView2.setVisibility(0);
        continue;
        localImageView1.setVisibility(4);
        localImageView2.setVisibility(4);
      }
    }
  }
  
  public void a(View paramView, int paramInt) {}
  
  public boolean a(boolean paramBoolean)
  {
    if (paramBoolean != this.jdField_b_of_type_Boolean)
    {
      this.jdField_b_of_type_Boolean = paramBoolean;
      notifyDataSetChanged();
      return true;
    }
    return false;
  }
  
  public boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public int getCount()
  {
    int i = this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOImageListModel.f();
    int j = i;
    if (this.jdField_b_of_type_Boolean)
    {
      int k = i % 4;
      j = i;
      if (k > 0) {
        j = i + (4 - k);
      }
      j += 1;
    }
    return j;
  }
  
  public Object getItem(int paramInt)
  {
    if (!this.jdField_b_of_type_Boolean) {
      return this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOImageListModel.a(paramInt);
    }
    if (paramInt < this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOImageListModel.f()) {
      return this.jdField_a_of_type_ComTencentMobileqqActivityAioPhotoAIOImageListModel.a(paramInt);
    }
    if (paramInt == getCount() - 1) {
      return jdField_a_of_type_JavaLangObject;
    }
    return AIOImageListModel.b;
  }
  
  public int getItemViewType(int paramInt)
  {
    Object localObject = getItem(paramInt);
    if ((localObject instanceof AIORichMediaInfo)) {}
    do
    {
      return 0;
      if (AIOImageListModel.b.equals(localObject)) {
        return 1;
      }
      if ((localObject instanceof String)) {
        return 2;
      }
      if (AIOImageListModel.jdField_a_of_type_JavaLangObject.equals(localObject)) {
        return 3;
      }
    } while (!jdField_a_of_type_JavaLangObject.equals(localObject));
    return 4;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = getItemViewType(paramInt);
    if (paramView == null)
    {
      paramViewGroup = null;
      switch (i)
      {
      default: 
        label48:
        switch (i)
        {
        }
        break;
      }
    }
    Object localObject1;
    do
    {
      do
      {
        return paramView;
        paramViewGroup = paramView.getTag();
        break;
        if (AIOPhotoListAdapter.ContentHolder.class.isInstance(paramViewGroup)) {
          break label48;
        }
        if ((QLog.isColorLevel()) && (paramView != null))
        {
          paramView = (AbsListView.LayoutParams)paramView.getLayoutParams();
          QLog.d("AIOPhotoListAdapter", 2, "[getView] type 0 while convertView type " + paramView.a);
        }
        paramView = this.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130904283, null);
        paramView.setLayoutParams(new AbsListView.LayoutParams(this.jdField_b_of_type_Int, this.jdField_b_of_type_Int));
        localObject1 = new AIOPhotoListAdapter.ContentHolder(this);
        ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_a_of_type_ComTencentImageURLImageView = ((URLImageView)paramView.findViewById(2131302159));
        ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_a_of_type_ComTencentImageURLImageView.setAdjustViewBounds(false);
        ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_a_of_type_AndroidWidgetImageView = ((ImageView)paramView.findViewById(2131302161));
        ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_b_of_type_AndroidWidgetImageView = ((ImageView)paramView.findViewById(2131301237));
        ((AIOPhotoListAdapter.ContentHolder)localObject1).c = ((ImageView)paramView.findViewById(2131302162));
        ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_a_of_type_AndroidWidgetTextView = ((TextView)paramView.findViewById(2131302163));
        ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_b_of_type_AndroidWidgetTextView = ((TextView)paramView.findViewById(2131297881));
        ((AIOPhotoListAdapter.ContentHolder)localObject1).jdField_a_of_type_AndroidViewView = paramView.findViewById(2131302160);
        paramView.setTag(localObject1);
        break label48;
        if (AIOImageListModel.b.equals(paramViewGroup)) {
          break label48;
        }
        paramView = new View(this.jdField_a_of_type_AndroidContentContext);
        paramView.setLayoutParams(new AbsListView.LayoutParams(this.jdField_b_of_type_Int, this.jdField_b_of_type_Int));
        paramView.setTag(AIOImageListModel.b);
        break label48;
        if (AIOPhotoListAdapter.HeaderHolder.class.isInstance(paramViewGroup)) {
          break label48;
        }
        localObject1 = this.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130904279, null);
        paramViewGroup = new AIOPhotoListAdapter.HeaderHolder(this);
        paramViewGroup.jdField_a_of_type_AndroidWidgetTextView = ((TextView)((View)localObject1).findViewById(2131299604));
        paramView = new nuu(this, this.jdField_a_of_type_AndroidContentContext);
        Object localObject2 = ((View)localObject1).getLayoutParams();
        if (localObject2 != null)
        {
          ((View)localObject1).setLayoutParams(new FrameLayout.LayoutParams(((ViewGroup.LayoutParams)localObject2).width, ((ViewGroup.LayoutParams)localObject2).height));
          paramView.setLayoutParams(new AbsListView.LayoutParams(((ViewGroup.LayoutParams)localObject2).width, ((ViewGroup.LayoutParams)localObject2).height));
        }
        ((FrameLayout)paramView).addView((View)localObject1);
        paramView.setTag(paramViewGroup);
        break label48;
        if (AIOImageListModel.jdField_a_of_type_JavaLangObject.equals(paramViewGroup)) {
          break label48;
        }
        paramView = new View(this.jdField_a_of_type_AndroidContentContext);
        paramView.setMinimumHeight(this.c);
        paramView.setVisibility(4);
        paramView.setTag(AIOImageListModel.jdField_a_of_type_JavaLangObject);
        break label48;
        if (jdField_a_of_type_JavaLangObject.equals(paramViewGroup)) {
          break label48;
        }
        paramView = new nuu(this, this.jdField_a_of_type_AndroidContentContext);
        localObject1 = this.jdField_a_of_type_AndroidViewLayoutInflater.inflate(2130904278, null);
        localObject2 = new FrameLayout.LayoutParams(-2, -2);
        ((FrameLayout.LayoutParams)localObject2).gravity = 17;
        ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        paramView.addView((View)localObject1);
        paramView.setTag(jdField_a_of_type_JavaLangObject);
        break label48;
        a(paramInt, paramView);
        return paramView;
      } while (!AIOPhotoListAdapter.HeaderHolder.class.isInstance(paramViewGroup));
      paramViewGroup = (AIOPhotoListAdapter.HeaderHolder)paramViewGroup;
      localObject1 = (String)getItem(paramInt);
      paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setText((CharSequence)localObject1);
    } while (!AppSetting.j);
    paramInt /= 4;
    paramViewGroup.jdField_a_of_type_AndroidWidgetTextView.setContentDescription("第" + (paramInt + 1) + "行" + (String)localObject1);
    return paramView;
  }
  
  public int getViewTypeCount()
  {
    return 5;
  }
  
  public boolean isEnabled(int paramInt)
  {
    return getItemViewType(paramInt) == 0;
  }
}


/* Location:              E:\apk\QQ_91\classes-dex2jar.jar!\com\tencent\mobileqq\activity\aio\photo\AIOPhotoListAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
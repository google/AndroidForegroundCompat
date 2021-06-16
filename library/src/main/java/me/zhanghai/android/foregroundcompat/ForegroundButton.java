/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.zhanghai.android.foregroundcompat;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;

import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatButton;

public class ForegroundButton extends AppCompatButton implements ForegroundCompatView {

    private final ForegroundHelper mForegroundHelper = new ForegroundHelper(this);

    public ForegroundButton(@NonNull Context context) {
        super(context);

        mForegroundHelper.init(context, null, 0, 0);
    }

    public ForegroundButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        mForegroundHelper.init(context, attrs, 0, 0);
    }

    public ForegroundButton(@NonNull Context context, @Nullable AttributeSet attrs,
                            @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mForegroundHelper.init(context, attrs, defStyleAttr, 0);
    }

    @Override
    @RequiresApi(Build.VERSION_CODES.N)
    public void onVisibilityAggregated(boolean isVisible) {
        super.onVisibilityAggregated(isVisible);

        mForegroundHelper.onVisibilityAggregated(isVisible);
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);

        mForegroundHelper.draw(canvas);
    }

    @Override
    public void onRtlPropertiesChanged(int layoutDirection) {
        super.onRtlPropertiesChanged(layoutDirection);

        mForegroundHelper.onRtlPropertiesChanged(layoutDirection);
    }

    @Override
    public boolean verifyDrawable(@NonNull Drawable who) {
        return super.verifyDrawable(who) || mForegroundHelper.verifyDrawable(who);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();

        mForegroundHelper.drawableStateChanged();
    }

    @Override
    public void drawableHotspotChanged(float x, float y) {
        super.drawableHotspotChanged(x, y);

        mForegroundHelper.drawableHotspotChanged(x, y);
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();

        mForegroundHelper.jumpDrawablesToCurrentState();
    }

    @Nullable
    @Override
    @RestrictTo(RestrictTo.Scope.LIBRARY)
    public Drawable getSupportForeground() {
        return mForegroundHelper.getSupportForeground();
    }

    @Override
    @RestrictTo(RestrictTo.Scope.LIBRARY)
    public void setSupportForeground(@Nullable Drawable foreground) {
        mForegroundHelper.setSupportForeground(foreground);
    }

    @Override
    @RestrictTo(RestrictTo.Scope.LIBRARY)
    public int getSupportForegroundGravity() {
        return mForegroundHelper.getSupportForegroundGravity();
    }

    @Override
    @RestrictTo(RestrictTo.Scope.LIBRARY)
    public void setSupportForegroundGravity(int gravity) {
        mForegroundHelper.setSupportForegroundGravity(gravity);
    }

    @Override
    @RestrictTo(RestrictTo.Scope.LIBRARY)
    public void setSupportForegroundTintList(@Nullable ColorStateList tint) {
        mForegroundHelper.setSupportForegroundTintList(tint);
    }

    @Nullable
    @Override
    @RestrictTo(RestrictTo.Scope.LIBRARY)
    public ColorStateList getSupportForegroundTintList() {
        return mForegroundHelper.getSupportForegroundTintList();
    }

    @Override
    @RestrictTo(RestrictTo.Scope.LIBRARY)
    public void setSupportForegroundTintMode(@Nullable PorterDuff.Mode tintMode) {
        mForegroundHelper.setSupportForegroundTintMode(tintMode);
    }

    @Nullable
    @Override
    @RestrictTo(RestrictTo.Scope.LIBRARY)
    public PorterDuff.Mode getSupportForegroundTintMode() {
        return mForegroundHelper.getSupportForegroundTintMode();
    }
}

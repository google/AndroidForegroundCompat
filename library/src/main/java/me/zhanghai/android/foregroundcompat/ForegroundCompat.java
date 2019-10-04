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

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ForegroundCompat {

    private ForegroundCompat() {}

    @Nullable
    public static Drawable getForeground(@NonNull View view) {
        if (view instanceof FrameLayout) {
            //noinspection RedundantCast
            return ((FrameLayout) view).getForeground();
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && isTargetingMOrAbove(view)) {
            return view.getForeground();
        } else if (view instanceof ForegroundCompatView) {
            return ((ForegroundCompatView) view).getSupportForeground();
        } else {
            return null;
        }
    }

    public static void setForeground(@NonNull View view, @Nullable Drawable foreground) {
        if (view instanceof FrameLayout) {
            //noinspection RedundantCast
            ((FrameLayout) view).setForeground(foreground);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && isTargetingMOrAbove(view)) {
            view.setForeground(foreground);
        } else if (view instanceof ForegroundCompatView) {
            ((ForegroundCompatView) view).setSupportForeground(foreground);
        }
    }

    public static int getForegroundGravity(@NonNull View view) {
        if (view instanceof FrameLayout) {
            //noinspection RedundantCast
            return ((FrameLayout) view).getForegroundGravity();
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && isTargetingMOrAbove(view)) {
            return view.getForegroundGravity();
        } else if (view instanceof ForegroundCompatView) {
            return ((ForegroundCompatView) view).getSupportForegroundGravity();
        } else {
            return Gravity.START | Gravity.TOP;
        }
    }

    public static void setForegroundGravity(@NonNull View view, int gravity) {
        if (view instanceof FrameLayout) {
            //noinspection RedundantCast
            ((FrameLayout) view).setForegroundGravity(gravity);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && isTargetingMOrAbove(view)) {
            view.setForegroundGravity(gravity);
        } else if (view instanceof ForegroundCompatView) {
            ((ForegroundCompatView) view).setSupportForegroundGravity(gravity);
        }
    }

    public static void setForegroundTintList(@NonNull View view, @Nullable ColorStateList tint) {
        if (view instanceof FrameLayout) {
            //noinspection RedundantCast
            ((FrameLayout) view).setForegroundTintList(tint);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && isTargetingMOrAbove(view)) {
            view.setForegroundTintList(tint);
        } else if (view instanceof ForegroundCompatView) {
            ((ForegroundCompatView) view).setSupportForegroundTintList(tint);
        }
    }

    @Nullable
    public static ColorStateList getForegroundTintList(@NonNull View view) {
        if (view instanceof FrameLayout) {
            //noinspection RedundantCast
            return ((FrameLayout) view).getForegroundTintList();
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && isTargetingMOrAbove(view)) {
            return view.getForegroundTintList();
        } else if (view instanceof ForegroundCompatView) {
            return ((ForegroundCompatView) view).getSupportForegroundTintList();
        } else {
            return null;
        }
    }

    public static void setForegroundTintMode(@NonNull View view,
                                             @Nullable PorterDuff.Mode tintMode) {
        if (view instanceof FrameLayout) {
            //noinspection RedundantCast
            ((FrameLayout) view).setForegroundTintMode(tintMode);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && isTargetingMOrAbove(view)) {
            view.setForegroundTintMode(tintMode);
        } else if (view instanceof ForegroundCompatView) {
            ((ForegroundCompatView) view).setSupportForegroundTintMode(tintMode);
        }
    }

    @Nullable
    public static PorterDuff.Mode getForegroundTintMode(@NonNull View view) {
        if (view instanceof FrameLayout) {
            //noinspection RedundantCast
            return ((FrameLayout) view).getForegroundTintMode();
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && isTargetingMOrAbove(view)) {
            return view.getForegroundTintMode();
        } else if (view instanceof ForegroundCompatView) {
            return ((ForegroundCompatView) view).getSupportForegroundTintMode();
        } else {
            return null;
        }
    }

    private static boolean isTargetingMOrAbove(@NonNull View view) {
        return view.getContext().getApplicationInfo().targetSdkVersion >= Build.VERSION_CODES.M;
    }
}

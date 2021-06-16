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

import androidx.annotation.Nullable;

interface ForegroundCompatView {

    @Nullable
    Drawable getSupportForeground();

    void setSupportForeground(@Nullable Drawable foreground);

    int getSupportForegroundGravity();

    void setSupportForegroundGravity(int gravity);

    void setSupportForegroundTintList(@Nullable ColorStateList tint);

    @Nullable
    ColorStateList getSupportForegroundTintList();

    void setSupportForegroundTintMode(@Nullable PorterDuff.Mode tintMode);

    @Nullable
    PorterDuff.Mode getSupportForegroundTintMode();
}

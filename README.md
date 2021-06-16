# AndroidForegroundCompat

Backported view foreground support for Android 5.0+.

This is not an officially supported Google product.

## Why AndroidForegroundCompat?

`android:foreground` was only available on `FrameLayout` until API level 23 (Android 6.0), but sometimes having foreground support on any view can be really handy, for reducing nesting in view hierarchy or better readability.

This library takes the foreground implementation from `FrameLayout` and allows using it on other views. When running on API level 23 or above, framework foreground support will automatically be used instead.

## Integration

Gradle:

```gradle
implementation 'me.zhanghai.android.foregroundcompat:library:1.0.1'
```

## Usage

Just use one of the [supported views](library/src/main/java/me/zhanghai/android/foregroundcompat). The [ForegroundCompat](library/src/main/java/me/zhanghai/android/foregroundcompat/ForegroundCompat.java) class can also be used to access foreground related methods in a backward compatible fashion.

## License

    Copyright 2019 Google LLC

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        https://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

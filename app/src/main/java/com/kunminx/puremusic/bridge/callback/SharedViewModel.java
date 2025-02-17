/*
 * Copyright 2018-2019 KunMinX
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kunminx.puremusic.bridge.callback;

import androidx.lifecycle.ViewModel;

import com.kunminx.architecture.bridge.callback.UnPeekLiveData;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by KunMinX at 19/10/16
 */
public class SharedViewModel extends ViewModel {

    public final UnPeekLiveData<Boolean> timeToAddSlideListener = new UnPeekLiveData<>();

    public final UnPeekLiveData<Boolean> closeSlidePanelIfExpanded = new UnPeekLiveData<>();

    public final UnPeekLiveData<Boolean> activityCanBeClosedDirectly = new UnPeekLiveData<>();

    public final UnPeekLiveData<Boolean> openOrCloseDrawer = new UnPeekLiveData<>();

    public final UnPeekLiveData<Boolean> enableSwipeDrawer = new UnPeekLiveData<>();

    public static List<String> tagOfSecondaryPages = new ArrayList<>();

}

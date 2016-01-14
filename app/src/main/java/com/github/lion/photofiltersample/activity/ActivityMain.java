/*
 * Copyright (C) 2012 CyberAgent
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.lion.photofiltersample.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.github.lion.photofiltersample.R;

public class ActivityMain extends Activity implements OnClickListener {

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_gallery).setOnClickListener(this);
        findViewById(R.id.button_camera).setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {
        int i = v.getId();
        if (i == R.id.button_gallery) {
            startActivity(ActivityGallery.class);

        } else if (i == R.id.button_camera) {
            startActivity(ActivityCamera.class);

        } else {
        }
    }

    private void startActivity(final Class<?> activityClass) {
        startActivity(new Intent(this, activityClass));
    }
}

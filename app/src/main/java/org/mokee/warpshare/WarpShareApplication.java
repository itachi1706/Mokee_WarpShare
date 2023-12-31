/*
 * Copyright (C) 2019 The MoKee Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mokee.warpshare;

import android.app.Application;
import android.content.Context;

import org.mokee.warpshare.customcerts.CertificateManager;
//import com.mokee.warpshare.CertificateManager;

public class WarpShareApplication extends Application {

    private CertificateManager mCertificateManager;

    static WarpShareApplication from(Context context) {
        return (WarpShareApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mCertificateManager = new CertificateManager(this);
    }

    CertificateManager getCertificateManager() {
        return mCertificateManager;
    }

}

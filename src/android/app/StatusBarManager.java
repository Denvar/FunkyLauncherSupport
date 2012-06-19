/*
 * Copyright (C) 2007 The Android Open Source Project
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


package android.app;

import android.content.Context;

/**
 * Allows an app to control the status bar.
 *
 * @hide
 */
public class StatusBarManager {

    StatusBarManager(Context context) {
        throw new RuntimeException("Unimplemented");
    }

    /**
     * Disable some features in the status bar.  Pass the bitwise-or of the DISABLE_* flags.
     * To re-enable everything, pass {@link #DISABLE_NONE}.
     */
    public void disable(int what) {
        throw new RuntimeException("Unimplemented");
    }
    
    /**
     * Expand the status bar.
     */
    public void expand() {
        throw new RuntimeException("Unimplemented");
    }
    
    /**
     * Collapse the status bar.
     */
    public void collapse() {
        throw new RuntimeException("Unimplemented");
    }

    public void setIcon(String slot, int iconId, int iconLevel, String contentDescription) {
        throw new RuntimeException("Unimplemented");
    }

    public void removeIcon(String slot) {
        throw new RuntimeException("Unimplemented");
    }

    public void setIconVisibility(String slot, boolean visible) {
        throw new RuntimeException("Unimplemented");
    }
}

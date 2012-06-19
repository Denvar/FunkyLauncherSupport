/*
 * Copyright (C) 2006 The Android Open Source Project
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

package android.content.res;

import android.content.pm.ApplicationInfo;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

/**
 * CompatibilityInfo class keeps the information about compatibility mode that the application is
 * running under.
 * 
 *  {@hide} 
 */
public class CompatibilityInfo implements Parcelable {
    /**
     * Application's scale.
     */
    public float applicationScale;
	
    public CompatibilityInfo(ApplicationInfo appInfo, int screenLayout, int sw,
            boolean forceCompat) {
    	throw new RuntimeException("Not implemented");
    }

    /**
     * @return true if the scaling is required
     */
    public boolean isScalingRequired() {
    	throw new RuntimeException("Not implemented");
    }
    
    public boolean supportsScreen() {
    	throw new RuntimeException("Not implemented");
    }
    
    public boolean neverSupportsScreen() {
    	throw new RuntimeException("Not implemented");
    }

    public boolean alwaysSupportsScreen() {
    	throw new RuntimeException("Not implemented");
    }

    /**
     * Returns the translator which translates the coordinates in compatibility mode.
     * @param params the window's parameter
     */
    public Translator getTranslator() {
    	throw new RuntimeException("Not implemented");
    }

    /**
     * A helper object to translate the screen and window coordinates back and forth.
     * @hide
     */
    public class Translator {
        final public float applicationScale;
        final public float applicationInvertedScale;
        
        Translator(float applicationScale, float applicationInvertedScale) {
        	throw new RuntimeException("Not implemented");
        }

        Translator() {
        	throw new RuntimeException("Not implemented");
        }

        /**
         * Translate the screen rect to the application frame.
         */
        public void translateRectInScreenToAppWinFrame(Rect rect) {
        	throw new RuntimeException("Not implemented");
        }

        /**
         * Translate the region in window to screen. 
         */
        public void translateRegionInWindowToScreen(Region transparentRegion) {
        	throw new RuntimeException("Not implemented");
        }

        /**
         * Apply translation to the canvas that is necessary to draw the content.
         */
        public void translateCanvas(Canvas canvas) {
        	throw new RuntimeException("Not implemented");
        }

        /**
         * Translate the motion event captured on screen to the application's window.
         */
        public void translateEventInScreenToAppWindow(MotionEvent event) {
        	throw new RuntimeException("Not implemented");
        }

        /**
         * Translate the window's layout parameter, from application's view to
         * Screen's view.
         */
        public void translateWindowLayout(WindowManager.LayoutParams params) {
        	throw new RuntimeException("Not implemented");
        }
        
        /**
         * Translate a Rect in application's window to screen.
         */
        public void translateRectInAppWindowToScreen(Rect rect) {
        	throw new RuntimeException("Not implemented");
        }
 
        /**
         * Translate a Rect in screen coordinates into the app window's coordinates.
         */
        public void translateRectInScreenToAppWindow(Rect rect) {
        	throw new RuntimeException("Not implemented");
        }

        /**
         * Translate a Point in screen coordinates into the app window's coordinates.
         */
        public void translatePointInScreenToAppWindow(PointF point) {
        	throw new RuntimeException("Not implemented");
        }

        /**
         * Translate the location of the sub window.
         * @param params
         */
        public void translateLayoutParamsInAppWindowToScreen(LayoutParams params) {
        	throw new RuntimeException("Not implemented");
        }

        /**
         * Translate the content insets in application window to Screen. This uses
         * the internal buffer for content insets to avoid extra object allocation.
         */
        public Rect getTranslatedContentInsets(Rect contentInsets) {
        	throw new RuntimeException("Not implemented");
        }

        /**
         * Translate the visible insets in application window to Screen. This uses
         * the internal buffer for visible insets to avoid extra object allocation.
         */
        public Rect getTranslatedVisibleInsets(Rect visibleInsets) {
        	throw new RuntimeException("Not implemented");
        }

        /**
         * Translate the touchable area in application window to Screen. This uses
         * the internal buffer for touchable area to avoid extra object allocation.
         */
        public Region getTranslatedTouchableArea(Region touchableArea) {
        	throw new RuntimeException("Not implemented");
        }
    }

    public void applyToDisplayMetrics(DisplayMetrics inoutDm) {
    	throw new RuntimeException("Not implemented");
    }

    public void applyToConfiguration(Configuration inoutConfig) {
    	throw new RuntimeException("Not implemented");
    }

    /**
     * Compute the frame Rect for applications runs under compatibility mode.
     *
     * @param dm the display metrics used to compute the frame size.
     * @param orientation the orientation of the screen.
     * @param outRect the output parameter which will contain the result.
     * @return Returns the scaling factor for the window.
     */
    public static float computeCompatibleScaling(DisplayMetrics dm, DisplayMetrics outDm) {
    	throw new RuntimeException("Not implemented");
    }

    @Override
    public boolean equals(Object o) {
    	throw new RuntimeException("Not implemented");
    }

    @Override
    public String toString() {
    	throw new RuntimeException("Not implemented");
    }

    @Override
    public int hashCode() {
    	throw new RuntimeException("Not implemented");
    }

    @Override
    public int describeContents() {
    	throw new RuntimeException("Not implemented");
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    	throw new RuntimeException("Not implemented");
    }

    public static final Parcelable.Creator<CompatibilityInfo> CREATOR
            = new Parcelable.Creator<CompatibilityInfo>() {
        public CompatibilityInfo createFromParcel(Parcel source) {
            return new CompatibilityInfo(source);
        }

        public CompatibilityInfo[] newArray(int size) {
            return new CompatibilityInfo[size];
        }
    };

    private CompatibilityInfo(Parcel source) {
    	throw new RuntimeException("Not implemented");
    }
}

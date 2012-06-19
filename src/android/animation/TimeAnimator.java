package android.animation;

/**
 *  Dummy class to give access to a TimeAnimator
 */
public class TimeAnimator extends ValueAnimator {

    /**
     * Sets a listener that is sent update events throughout the life of
     * an animation.
     *
     * @param listener the listener to be set.
     */
    public void setTimeListener(TimeListener listener) {
		throw new RuntimeException("Not implemented");
    }

    /**
     * Implementors of this interface can set themselves as update listeners
     * to a <code>TimeAnimator</code> instance to receive callbacks on every animation
     * frame to receive the total time since the animator started and the delta time
     * since the last frame. The first time the listener is called, totalTime and
     * deltaTime should both be zero.
     *
     * @hide
     */
    public static interface TimeListener {
        /**
         * <p>Notifies listeners of the occurrence of another frame of the animation,
         * along with information about the elapsed time.</p>
         *
         * @param animation The animator sending out the notification.
         * @param totalTime The
         */
        void onTimeUpdate(TimeAnimator animation, long totalTime, long deltaTime);

    }
}

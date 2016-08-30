package org.jush.tipsandtricks;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.List;

@SuppressWarnings({ "unused", "StatementWithEmptyBody" })
public class EditorDemo {
    // Ubuntu? Unity Tweak Tool
    // Activate line numbers
    // Key promoter plug-in (https://github.com/athiele/key-promoter-fork)
    // AutoScroll from source
    // Ctrl + N (Go to class)
    // Ctrl + F12 (search 'hide' in FullscreenActivity.java)
    // Go to symbol (ctrl + shift + alt + n MILLIS)
    // Enable Git.
    // Limit git message

    public boolean completion(String first, String second) {
        // Use tab to replace instead of enter
        return first.contains(second);
    }

    public void completion1(boolean condition1) {
        // Use Ctrl + shit + enter to complete statement
    }

    public void completion2(Context context) {
        // Ctrl + space and Ctrl + shit + space
        Bitmap bitmap = null;
        Drawable drawable = null;
    }

    public void smartJoin() {
        final String description = "Multiple " +
            "line " +
            "text";
    }


    public String selection(String first, String second, String third, String fourth) {
        // Use Extend Selection, Shrink selection instead of mouse
        // And extract variable
        // CamelHump selection
        return first.substring(0, first.length() - 1) + second + third + fourth.replace('a', 'b');
    }


    public static class InitializerFields {
        // What can I do at the caret position?
        // Intentions
        InitializerFields(int first, boolean second, boolean third) {
        }
    }

    public void instanceOfCheck(Object parameter) {
        // Intention vs auto-complete
        if (parameter instanceof Context) {
        }
    }


    public int supressStatements() {
        // Supress warnings
        int result = 0;
        return result;
    }

    public void liveTemplate1(List<String> list) {
        // for (int k = 0; k < 100; k++) {...}
        // with postfix
        // nn
        // ctrl + j
    }


    // Manipulate Ifs with Intentions
    public void conditions(boolean a, boolean b, boolean c, boolean d) {
        if (!(!(c || d) || !(a || b))) {
        }
    }


    public int liveTemplates2(String p1, String p2) {
        // Logging: logt, logm, logr, logi

        int result = 0;
        result++;

        return result;
    }


    public void filterSearch() {
        // In Generate Action (Fn + alt + Enter)
        // In Popup menus - vec
        // In Refactor This
        // In Project view
        // Everywhere
    }

    public void structuralReplace() {
        // $statement$.setDuration($duration$)
        // Instead of regex
        // Open inspections in settings to flag sleep
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void replaceCalls(View view, Drawable drawable) {
        // Structurally replace with Expected type of expression

        view.findViewById(R.id.dummy_button).setBackgroundDrawable(drawable);

        TextView fullscreenContent = (TextView) view.findViewById(R.id.fullscreen_content);
        fullscreenContent.
            setBackgroundDrawable(drawable);

        this.setBackgroundDrawable(drawable);
    }

    private void setBackgroundDrawable(Drawable drawable) {

    }


    public void designTimeAttributes() {
        // Switch tho ST laps_fragment to use showIn
        // Switch to ST friends_fragment:
        /*
        if (isInEditMode()) {
            //Code only run in Android Studio design
        }

         */
    }

    /*
     Debugging (Plaid - FeedAdapter):
      - Attach to process
      - Debug mute
      - Debug condition (position )
      - Debug no suspend but log
      - Debug.waitForDebugger()
      - Debug mark (Plaid - HomeActivity 168)
     */

    /*
    Editor|Colors & Fonts|Android Logcat
    Assert:  #AA66CC
    Debug:   #33B5E5
    Error:   #FF4444
    Info:    #99CC00
    Verbose: #FFFFFF
    Warning: #FFBB33
     */
}

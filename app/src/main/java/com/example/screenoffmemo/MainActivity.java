package com.example.screenoffmemo;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        launchScreenOffMemo();
    }

    private void launchScreenOffMemo() {
        // Try Screen Off Memo directly first
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(
                "com.samsung.android.app.notes",
                "com.samsung.android.app.notes.screenOffMemo.ScreenOffMemoActivity"
            ));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
            return;
        } catch (Exception e1) {
            // fallthrough
        }

        // Try alternative Samsung Notes Screen Off Memo path
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(
                "com.samsung.android.app.notes",
                "com.samsung.android.app.notes.ui.lockscreen.ScreenOffMemoActivity"
            ));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
            return;
        } catch (Exception e2) {
            // fallthrough
        }

        // Fallback: open Samsung Notes
        try {
            Intent intent = getPackageManager().getLaunchIntentForPackage(
                "com.samsung.android.app.notes"
            );
            if (intent != null) {
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Samsung Notes not found", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e3) {
            Toast.makeText(this, "Could not open Samsung Notes", Toast.LENGTH_SHORT).show();
        }

        finish();
    }
}

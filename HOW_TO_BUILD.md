# Memo Shortcut App — Build Instructions

## What this app does
Opens Samsung Notes / Screen Off Memo instantly. Add it as a lock screen corner 
shortcut — swipe the icon to launch, no unlocking needed.

---

## Option A: Build with Android Studio (Recommended)

1. **Download Android Studio** from https://developer.android.com/studio
2. Open Android Studio → "Open an existing project" → select the `ScreenOffMemoApp` folder
3. Wait for Gradle sync to finish
4. Click **Build → Build Bundle(s)/APK(s) → Build APK(s)**
5. APK will be in: `app/build/outputs/apk/debug/app-debug.apk`

---

## Option B: Build online with Replit (No install needed)

1. Go to https://replit.com and create a free account
2. Create a new Repl → choose "Android (Java)"  
3. Copy all files from this project into Replit
4. Click Run — it will build and give you the APK

---

## Option C: Build online with GitHub Codespaces

1. Upload this project to GitHub
2. Open in Codespaces (free tier available)
3. Run: `./gradlew assembleDebug`
4. Download the APK from `app/build/outputs/apk/debug/`

---

## Installing on your Tab S6 Lite

1. **Enable Unknown Sources** on your tablet:
   Settings → Apps → Special access → Install unknown apps → 
   Allow from your file manager
   
2. Copy the APK to your tablet (USB, email, Google Drive)

3. Tap the APK file to install

4. **Add as lock screen shortcut:**
   - Settings → Lock screen → Edit lock screen
   - Tap one of the corner shortcut icons
   - Find "Memo Shortcut" in the app list → select it
   - Tap Done

5. **Use it:** Wake screen → swipe the corner icon → Screen Off Memo opens!

---

## Troubleshooting

If the app opens Samsung Notes instead of Screen Off Memo:
- Make sure Screen Off Memo is enabled: 
  Settings → Advanced Features → S Pen → Screen off memo → ON

The app tries 3 methods in order:
1. Direct Screen Off Memo Activity
2. Alternative Screen Off Memo path
3. Samsung Notes (fallback)

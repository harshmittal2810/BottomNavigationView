# BottomNavigationView
In Api version 25, new Design is introduced by Support Design Library

For Implment in your application you should add 

compile ‘com.android.support:design:25.0.0’

in build.gradle

Next simply add the Bottom Navigation View widget to your desired layout file.
We can add this view like so:

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:id="@+id/container"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:context="com.web2droid.bottomnavigationview.MainActivity">

    <FrameLayout
            android:id="@+id/content"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"/>

    <android.support.design.widget.BottomNavigationView
            android:id="@+id/navigation"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="bottom"
            app:itemBackground="@color/colorPrimary"
            app:itemIconTint="@drawable/nav_item_color_state"
            app:itemTextColor="@drawable/nav_item_color_state"
            android:background="?android:attr/windowBackground"
            app:menu="@menu/navigation"/>

</LinearLayout>


Attribute Which can used for setting value in XML: 

app:itemBackground — background color for bottom nav
app:itemIconTint — Tint Color for icon/Use Color State List(Selector)
app:itemTextColor — Tint color for Text of menu/Use Color State List(Selector)
app:menu — The menu resource to be used to display items in the bottom navigation menu

We can also set programatically like :

inflateMenu(int menuResource) — Inflate a menu for the bottom navigation view using a menu resource identifier.
setItemBackgroundResource(int backgroundResource) — The background to be used for the menu items.
setItemTextColor(ColorStateList colorStateList) — A ColorStateList used to color the text used for the menu items
setItemIconTintList(ColorStateList colorStateList) — A ColorStateList used to tint the icons used for the menu items

For Menu like previouslly we use side navigation menu:

<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item
            android:id="@+id/navigation_home"
            android:icon="@drawable/ic_home_black_24dp"
            android:title="@string/title_home"/>

    <item
            android:id="@+id/navigation_dashboard"
            android:icon="@drawable/ic_dashboard_black_24dp"
            android:title="@string/title_dashboard"/>

    <item
            android:id="@+id/navigation_notifications"
            android:icon="@drawable/ic_notifications_black_24dp"
            android:title="@string/title_notifications"/>

</menu>

